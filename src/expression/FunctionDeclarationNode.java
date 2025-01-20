package expression;

import java.util.List;

public class FunctionDeclarationNode implements ASTNode {
    private List<DecoratorNode> decorators;
    private AccessModifiersNode accessModifiers;
    private String keyword;
    private String identifier;
    private String assignedKeyword;
    private List<ParameterNode> parameters;
    private TypeNode returnType;
    private BlockNode block;

    // Constructor
    public FunctionDeclarationNode(
            List<DecoratorNode> decorators,
            AccessModifiersNode accessModifiers,
            String keyword,
            String identifier,
            String assignedKeyword,
            List<ParameterNode> parameters,
            TypeNode returnType,
            BlockNode block
    ) {
        this.decorators = decorators;
        this.accessModifiers = accessModifiers;
        this.keyword = keyword;
        this.identifier = identifier;
        this.assignedKeyword = assignedKeyword;
        this.parameters = parameters;
        this.returnType = returnType;
        this.block = block;
    }

    // Getters
    public List<DecoratorNode> getDecorators() { return decorators; }
    public AccessModifiersNode getAccessModifiers() { return accessModifiers; }
    public String getKeyword() { return keyword; }
    public String getIdentifier() { return identifier; }
    public String getAssignedKeyword() { return assignedKeyword; }
    public List<ParameterNode> getParameters() { return parameters; }
    public TypeNode getReturnType() { return returnType; }
    public BlockNode getBlock() { return block; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "FunctionDeclaration:");
        if (decorators != null) {
            System.out.println(indent + "  Decorators:");
            for (DecoratorNode decorator : decorators) {
                decorator.prettyPrint(indent + "    ");
            }
        }
        if (accessModifiers != null) {
            System.out.println(indent + "  Access Modifiers:");
            accessModifiers.prettyPrint(indent + "    ");
        }
        if (keyword != null) {
            System.out.println(indent + "  Keyword: " + keyword);
        }
        if (identifier != null) {
            System.out.println(indent + "  Identifier: " + identifier);
        }
        if (assignedKeyword != null) {
            System.out.println(indent + "  Assigned Keyword: " + assignedKeyword);
        }
        if (parameters != null) {
            System.out.println(indent + "  Parameters:");
            for (ParameterNode parameter : parameters) {
                parameter.prettyPrint(indent + "    ");
            }
        }
        if (returnType != null) {
            System.out.println(indent + "  Return Type:");
            returnType.prettyPrint(indent + "    ");
        }
        if (block != null) {
            System.out.println(indent + "  Block:");
            block.prettyPrint(indent + "    ");
        }
    }
}
