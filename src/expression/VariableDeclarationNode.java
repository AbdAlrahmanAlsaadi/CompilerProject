/*package expression;

import java.util.List;

public class VariableDeclarationNode implements ASTNode {
    private List<ASTNode> decorators; // Optional decorators
    private String accessModifier; // Optional access modifier (e.g., public, private)
    private String keyword; // Optional keyword (e.g., let, const)
    private ParameterNode parameter; // The parameter being declared
    private ASTNode assignedValue; // The assigned value (can be an expression or tuple)
    private ASTNode expression; // For expressions with operators
    private List<ASTNode> additionalExpressions; // Optional additional expressions in case of chaining

    // Constructor for the first rule: with decorators, access modifiers, keywords, and assignment
    public VariableDeclarationNode(List<ASTNode> decorators, String accessModifier, String keyword, ParameterNode parameter, ASTNode assignedValue) {
        this.decorators = decorators;
        this.accessModifier = accessModifier;
        this.keyword = keyword;
        this.parameter = parameter;
        this.assignedValue = assignedValue;
        this.expression = null;
        this.additionalExpressions = null;
    }

    // Constructor for the second rule: expression operator expression*
    public VariableDeclarationNode(ASTNode expression, List<ASTNode> additionalExpressions) {
        this.decorators = null;
        this.accessModifier = null;
        this.keyword = null;
        this.parameter = null;
        this.assignedValue = null;
        this.expression = expression;
        this.additionalExpressions = additionalExpressions;
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
        if (assignedValue != null) {
            System.out.println(indent + "  Assigned Value:");
            assignedValue.prettyPrint(indent + "    ");
        }
        if (expression != null) {
            System.out.println(indent + "  Expression:");
            expression.prettyPrint(indent + "    ");
            if (additionalExpressions != null && !additionalExpressions.isEmpty()) {
                System.out.println(indent + "  Additional Expressions:");
                for (ASTNode additionalExpr : additionalExpressions) {
                    additionalExpr.prettyPrint(indent + "    ");
                }
            }
        }
    }

    // Getters and setters for each field can be added as needed.
}
*/
package expression;

import java.util.List;

public class VariableDeclarationNode implements ASTNode {
    private List<ASTNode> decorators;
    private String accessModifier;
    private String keyword;
    private ASTNode parameter;
    private ASTNode initialValue;

    public VariableDeclarationNode(List<ASTNode> decorators, String accessModifier, String keyword, ASTNode parameter, ASTNode initialValue) {
        this.decorators = decorators;
        this.accessModifier = accessModifier;
        this.keyword = keyword;
        this.parameter = parameter;
        this.initialValue = initialValue;
    }

    // Getters
    public List<ASTNode> getDecorators() { return decorators; }
    public String getAccessModifier() { return accessModifier; }
    public String getKeyword() { return keyword; }
    public ASTNode getParameter() { return parameter; }
    public ASTNode getInitialValue() { return initialValue; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "VariableDeclaration:");
        for (ASTNode decorator : decorators) {
            decorator.prettyPrint(indent + "  ");
        }
        System.out.println(indent + "  Access Modifier: " + accessModifier);
        System.out.println(indent + "  Keyword: " + keyword);
        parameter.prettyPrint(indent + "  ");
        if (initialValue != null) {
            initialValue.prettyPrint(indent + "  ");
        }
    }
}