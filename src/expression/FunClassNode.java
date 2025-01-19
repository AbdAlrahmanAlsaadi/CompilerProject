package expression;

import java.util.List;

public class FunClassNode implements ASTNode {
    private String identifier; // المعرف
    private List<ASTNode> arguments; // قائمة الوسائط
    private String returnType; // نوع الإرجاع
    private ASTNode block; // الكتلة

    public FunClassNode(String identifier, List<ASTNode> arguments, String returnType, ASTNode block) {
        this.identifier = identifier;
        this.arguments = arguments;
        this.returnType = returnType;
        this.block = block;
    }

    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    public String getReturnType() {
        return returnType;
    }

    public ASTNode getBlock() {
        return block;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "FunClass:");
        System.out.println(indent + "  Identifier: " + identifier);
        if (arguments != null && !arguments.isEmpty()) {
            System.out.println(indent + "  Arguments:");
            for (ASTNode arg : arguments) {
                arg.prettyPrint(indent + "    ");
            }
        }
        System.out.println(indent + "  Return Type: " + returnType);
        System.out.println(indent + "  Block:");
        block.prettyPrint(indent + "    ");
    }
}