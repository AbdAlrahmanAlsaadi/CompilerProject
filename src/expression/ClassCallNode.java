package expression;

public class ClassCallNode implements ASTNode {
    private String className; // اسم الفئة
    private String instanceName; // اسم المثيل
    private String keyword; // الكلمة المفتاحية
    private String genericType; // النوع العام

    public ClassCallNode(String className, String instanceName, String keyword, String genericType) {
        this.className = className;
        this.instanceName = instanceName;
        this.keyword = keyword;
        this.genericType = genericType;
    }

    // Getters
    public String getClassName() {
        return className;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getGenericType() {
        return genericType;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ClassCall:");
        System.out.println(indent + "  Class Name: " + className);
        System.out.println(indent + "  Instance Name: " + instanceName);
        System.out.println(indent + "  Keyword: " + keyword);
        System.out.println(indent + "  Generic Type: " + genericType);
    }
}