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

    // ===========================
    // Core file writing
    // ===========================
    private void writeToFile(String filename, String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ===========================
    // Logging methods
    // ===========================
    public void logError(String message, int line) {
        String formatted = "[ERROR] Line " + line + ": " + message;
        errorMessages.add(formatted);
        writeToFile(ERROR_LOG_FILE, formatted);

    }

    public void logSuccess(String message, int line) {
        String formatted = "[SUCCESS] Line " + line + ": " + message;
        successMessages.add(formatted);
        writeToFile(SUCCESS_LOG_FILE, formatted);

    }


    // ===========================
    // Semantic checks
    // ===========================
    public void checkDuplicateVariable(String name, String scope, int line) {
        if (symbolTable.contains(name, scope)) {
            logError("Duplicate variable '" + name + "' found in scope '" + scope + "'.", line);
        } else {
            logSuccess("Variable '" + name + "' declared successfully in scope '" + scope + "'.", line);
        }
    }

    public void checkVariableDefined(String name, String scope, int line) {
        if (!symbolTable.contains(name, scope)) {
            logError("Variable '" + name + "' used before declaration.", line);
        } else {
            logSuccess("Variable '" + name + "' is used correctly.", line);
        }
    }

    public void checkDuplicateMethod(String name, String scope, int line) {
        if (symbolTable.contains(name, scope)) {
            logError("Duplicate method '" + name + "' found in scope '" + scope + "'.", line);
        } else {
            logSuccess("Method '" + name + "' declared successfully in scope '" + scope + "'.", line);
        }
    }

    public void checkValidType(String dataType, String variableName, int line) {
        List<String> validTypes = List.of("string", "number", "boolean");
        if (!validTypes.contains(dataType.toLowerCase())) {
            logError("Unknown data type '" + dataType + "' for variable '" + variableName + "'.", line);
        } else {
            logSuccess("Data type '" + dataType + "' for variable '" + variableName + "' is valid.", line);
        }
    }

    public void checkArgumentCount(String functionName, int expected, int provided, int line) {
        if (expected != provided) {
            logError("Function '" + functionName + "' expects " + expected + " arguments, but " + provided + " was provided.", line);
        } else {
            logSuccess("Function '" + functionName + "' called with correct number of arguments.", line);
        }
    }

    // ===========================
    // Getters
    // ===========================
    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public List<String> getSuccessMessages() {
        return successMessages;
    }
}
