package expression;

import java.util.List;

public class ConstructorDeclarationNode implements ASTNode {
    private String name; // اسم المُنشئ
    private List<ASTNode> parameters; // قائمة المعاملات
    private List<ASTNode> body; // الجسم (thisAssignment أو statement)

    public ConstructorDeclarationNode(String name, List<ASTNode> parameters, List<ASTNode> body) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<ASTNode> getParameters() {
        return parameters;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ConstructorDeclaration:");
        System.out.println(indent + "  Name: " + name);
        if (parameters != null && !parameters.isEmpty()) {
            System.out.println(indent + "  Parameters:");
            for (ASTNode param : parameters) {
                param.prettyPrint(indent + "    ");
            }
        }
        System.out.println(indent + "  Body:");
        for (ASTNode statement : body) {
            statement.prettyPrint(indent + "    ");
        }
    }
}