package expression;

import java.util.List;

public class ExportStatementNode implements ASTNode {
    private String exportType; // Type of export (e.g., "default", "named", etc.)
    private ASTNode exportValue; // Expression for default exports
    private List<ExportSpecifierNode> exportSpecifiers; // List of export specifiers

    public ExportStatementNode(String exportType, ASTNode exportValue, List<ExportSpecifierNode> exportSpecifiers) {
        this.exportType = exportType;
        this.exportValue = exportValue;
        this.exportSpecifiers = exportSpecifiers;
    }

    public String getExportType() {
        return exportType;
    }

    public ASTNode getExportValue() {
        return exportValue;
    }

    public List<ExportSpecifierNode> getExportSpecifiers() {
        return exportSpecifiers;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Export Statement:");
        System.out.println(indent + "  Export Type: " + exportType);

        if (exportValue != null) {
            System.out.println(indent + "  Export Value:");
            exportValue.prettyPrint(indent + "    ");
        }

        if (exportSpecifiers != null && !exportSpecifiers.isEmpty()) {
            System.out.println(indent + "  Export Specifiers:");
            for (ExportSpecifierNode specifier : exportSpecifiers) {
                specifier.prettyPrint(indent + "    ");
            }
        }
    }
}
