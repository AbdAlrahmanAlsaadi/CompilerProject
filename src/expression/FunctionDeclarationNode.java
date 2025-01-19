//package expression;
//
//import java.util.List;
//
//public class FunctionDeclarationNode implements ASTNode {
//    private List<ASTNode> decorators;
//    private String accessModifier;
//    private String keyword;
//    private String identifier;
//    private ASTNode returnType;
//    private List<ASTNode> parameters;
//    private ASTNode block;
//
//    public FunctionDeclarationNode(List<ASTNode> decorators, String accessModifier, String keyword, String identifier, ASTNode returnType, List<ASTNode> parameters, ASTNode block) {
//        this.decorators = decorators;
//        this.accessModifier = accessModifier;
//        this.keyword = keyword;
//        this.identifier = identifier;
//        this.returnType = returnType;
//        this.parameters = parameters;
//        this.block = block;
//    }
//
//    // Getters
//    public List<ASTNode> getDecorators() {
//        return decorators;
//    }
//
//    public String getAccessModifier() {
//        return accessModifier;
//    }
//
//    public String getKeyword() {
//        return keyword;
//    }
//
//    public String getIdentifier() {
//        return identifier;
//    }
//
//    public ASTNode getReturnType() {
//        return returnType;
//    }
//
//    public List<ASTNode> getParameters() {
//        return parameters;
//    }
//
//    public ASTNode getBlock() {
//        return block;
//    }
//
//    @Override
//    public void prettyPrint(String indent) {
//        System.out.println(indent + "FunctionDeclaration:");
//        for (ASTNode decorator : decorators) {
//            decorator.prettyPrint(indent + "  ");
//        }
//        System.out.println(indent + "  Access Modifier: " + accessModifier);
//        System.out.println(indent + "  Keyword: " + keyword);
//        System.out.println(indent + "  Identifier: " + identifier);
//        if (returnType != null) {
//            returnType.prettyPrint(indent + "  ");
//        }
//        for (ASTNode parameter : parameters) {
//            parameter.prettyPrint(indent + "  ");
//        }
//        block.prettyPrint(indent + "  ");
//    }
//}
package expression;

import java.util.List;

public class FunctionDeclarationNode implements ASTNode {
    private List<ASTNode> decorators;
    private String accessModifier;
    private List<String> keywords; // قائمة keywords
    private List<String> identifiers; // قائمة identifiers
    private ASTNode returnType;
    private List<ASTNode> parameters;
    private ASTNode block;

    public FunctionDeclarationNode(List<ASTNode> decorators, String accessModifier, List<String> keywords, List<String> identifiers, ASTNode returnType, List<ASTNode> parameters, ASTNode block) {
        this.decorators = decorators;
        this.accessModifier = accessModifier;
        this.keywords = keywords;
        this.identifiers = identifiers;
        this.returnType = returnType;
        this.parameters = parameters;
        this.block = block;
    }

    // Getters
    public List<ASTNode> getDecorators() {
        return decorators;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public ASTNode getReturnType() {
        return returnType;
    }

    public List<ASTNode> getParameters() {
        return parameters;
    }

    public ASTNode getBlock() {
        return block;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "FunctionDeclaration:");
        for (ASTNode decorator : decorators) {
            decorator.prettyPrint(indent + "  ");
        }
        System.out.println(indent + "  Access Modifier: " + accessModifier);
        System.out.println(indent + "  Keywords: " + String.join(", ", keywords));
        System.out.println(indent + "  Identifiers: " + String.join(", ", identifiers));
        if (returnType != null) {
            returnType.prettyPrint(indent + "  ");
        }
        for (ASTNode parameter : parameters) {
            parameter.prettyPrint(indent + "  ");
        }
        block.prettyPrint(indent + "  ");
    }
}