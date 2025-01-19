import antlr.TypeScriptParserBaseVisitor;
import expression.ASTBuilderVisitor;
import expression.ASTNode;
import expression.ProgramNode;

import antlr.TypeScriptParser;
import antlr.TypeScriptLexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

//import org.antlr.v4.runtime.*;



//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//
//            String source = "file.txt";
//            CharStream cs = CharStreams.fromFileName(source);
//
//            TypeScriptLexer lexer = new TypeScriptLexer(cs);
//            CommonTokenStream token = new CommonTokenStream(lexer);
//            TypeScriptParser parser = new TypeScriptParser(token);
//
//            ParseTree tree = parser.program();
//            ProgramNode doc = (ProgramNode) new ASTBuilderVisitor().visit(tree);
//
//
//
//
//
//
//        } catch (IOException e) {
//            System.err.println("Error reading the file: " + e.getMessage());
//        } catch (Exception e) {
//            System.err.println("Error during parsing or AST generation: " + e.getMessage());
//        }
//    }
//
//    /**
//     * وظيفة لقراءة محتوى الملف وتحويله إلى String
//     */
////    private static String readFile(String filePath) throws IOException {
////        StringBuilder code = new StringBuilder();
////        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))) {
////            String line;
////            while ((line = reader.readLine()) != null) {
////                code.append(line).append("\n");
////            }
////        }
////        return code.toString();
////    }
//}


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // قراءة الكود من الملف
            String filePath = "C:\\Users\\USER\\IdeaProjects\\angularproject\\src\\file.txt";
            String code = readFile(filePath);

            // إنشاء الـ Lexer
            CharStream input = CharStreams.fromString(code);
            TypeScriptLexer lexer = new TypeScriptLexer(input);

            // تمرير الـ Tokens الناتجة إلى الـ Parser
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TypeScriptParser parser = new TypeScriptParser(tokens);

            // تحديد القاعدة العليا (start rule) لتحليل الكود
            ParseTree tree = parser.program();

            // استخدام الـ Visitor لبناء شجرة الـ AST
            ASTBuilderVisitor visitor = new ASTBuilderVisitor();
            ASTNode ast = visitor.visit(tree);

            // طباعة الـ AST باستخدام prettyPrint
            System.out.println("Generated AST:");
            ast.prettyPrint("");

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error during parsing or AST generation: " + e.getMessage());
        }
    }

    /**
     * وظيفة لقراءة محتوى الملف وتحويله إلى String
     */
    private static String readFile(String filePath) throws IOException {
        StringBuilder code = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                code.append(line).append("\n");
            }
        }
        return code.toString();
    }
}
