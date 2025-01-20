package expression;

import java.util.List;

public class VariableDeclarationNode implements ASTNode {
    private List<ASTNode> decorators;
    private String accessModifier;
    private String keyword;
    private ASTNode parameter;
    private ASTNode initialValue;
    private List<ASTNode> expressions;
    private List<OperatorNode> operators;

    // Constructor for declaration with decorators and parameter
    public VariableDeclarationNode(List<ASTNode> decorators, String accessModifier, String keyword, ASTNode parameter, ASTNode initialValue) {
        this.decorators = decorators;
        this.accessModifier = accessModifier;
        this.keyword = keyword;
        this.parameter = parameter;
        this.initialValue = initialValue;
    }

    // Constructor for expression-based declaration
    public VariableDeclarationNode(List<ASTNode> expressions, List<OperatorNode> operators) {
        this.expressions = expressions;
        this.operators = operators;
    }

    public List<ASTNode> getDecorators() {
        return decorators;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public String getKeyword() {
        return keyword;
    }

    public ASTNode getParameter() {
        return parameter;
    }

    public ASTNode getInitialValue() {
        return initialValue;
    }

    public List<ASTNode> getExpressions() {
        return expressions;
    }

    public List<OperatorNode> getOperators() {
        return operators;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Variable Declaration:");

        if (decorators != null) {
            System.out.println(indent + "  Decorators:");
            for (ASTNode decorator : decorators) {
                decorator.prettyPrint(indent + "    ");
            }
        }

        if (accessModifier != null) {
            System.out.println(indent + "  Access Modifier: " + accessModifier);
        }

        if (keyword != null) {
            System.out.println(indent + "  Keyword: " + keyword);
        }

        if (parameter != null) {
            System.out.println(indent + "  Parameter:");
            parameter.prettyPrint(indent + "    ");
        }

        if (initialValue != null) {
            System.out.println(indent + "  Initial Value:");
            initialValue.prettyPrint(indent + "    ");
        }

        if (expressions != null && operators != null) {
            System.out.println(indent + "  Expressions:");
            for (int i = 0; i < expressions.size(); i++) {
                expressions.get(i).prettyPrint(indent + "    ");
                if (i < operators.size()) {
                    System.out.println(indent + "    Operator: " + operators.get(i).getOperator());
                }
            }
        }
    }
}
