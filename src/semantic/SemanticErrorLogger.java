package semantic;



import SymbolTableStructure.SymbolTable2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SemanticErrorLogger {
    private static final String ERROR_LOG_FILE = "semantic_errors.log";
    private static final String SUCCESS_LOG_FILE = "semantic_success.log";

    private final SymbolTable2 symbolTable;
    private final List<String> errorMessages;
    private final List<String> successMessages;

    public SemanticErrorLogger(SymbolTable2 table) {
        this.symbolTable = table;
        this.errorMessages = new ArrayList<>();
        this.successMessages = new ArrayList<>();
    }

    private void writeToFile(String filename, String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logError(String message) {
        errorMessages.add(message);
        writeToFile(ERROR_LOG_FILE, "[ERROR] " + message);
    }

    public void logSuccess(String message) {
        successMessages.add(message);
        writeToFile(SUCCESS_LOG_FILE, "[SUCCESS] " + message);
    }

    public void checkDuplicateVariable(String name, String scope) {
        if (symbolTable.contains(name, scope)) {
            logError("Duplicate variable '" + name + "' found in scope '" + scope + "'.");
        } else {
            logSuccess("Variable '" + name + "' declared successfully in scope '" + scope + "'.");
        }
    }

    public void checkVariableDefined(String name, String scope) {
        if (!symbolTable.contains(name, scope)) {
            logError("Variable '" + name + "' used before declaration.");
        } else {
            logSuccess("Variable '" + name + "' is used correctly.");
        }
    }

    public void checkDuplicateMethod(String name, String scope) {
        if (symbolTable.contains(name, scope)) {
            logError("Duplicate method '" + name + "' found in scope '" + scope + "'.");
        } else {
            logSuccess("Method '" + name + "' declared successfully in scope '" + scope + "'.");
        }
    }

    public void checkValidType(String dataType, String variableName) {
        List<String> validTypes = List.of("string", "number", "boolean");
        if (!validTypes.contains(dataType.toLowerCase())) {
            logError("Unknown data type '" + dataType + "' for variable '" + variableName + "'.");
        } else {
            logSuccess("Data type '" + dataType + "' for variable '" + variableName + "' is valid.");
        }
    }

    public void checkArgumentCount(String functionName, int expected, int provided) {
        if (expected != provided) {
            logError("Function '" + functionName + "' expects " + expected + " arguments, but " + provided + " was provided.");
        } else {
            logSuccess("Function '" + functionName + "' called with correct number of arguments.");
        }
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public List<String> getSuccessMessages() {
        return successMessages;
    }
}
