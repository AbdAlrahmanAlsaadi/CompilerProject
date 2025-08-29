import SymbolTableStructure.SymbolTable2;
import Visitor.SemanticVisitor;
import CodeGeneration.CodeGenerator;

import expression.ASTNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("C:\\Users\\dell\\Downloads\\CompilerProject\\src\\Erorr\\error2_invalid_type.txt");

            antlr.lexicalanalysis lexer = new antlr.lexicalanalysis(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            antlr.parseranalysis parser = new antlr.parseranalysis(tokens);

            ParseTree tree = parser.componentFile();

            SymbolTable2 table = new SymbolTable2();
            CodeGenerator codeGen = new CodeGenerator();
            SemanticVisitor visitor = new SemanticVisitor(table, codeGen);

            ASTNode ast = visitor.visit(tree);
            codeGen.generateApp();
            System.out.println("✅ Code generation completed. Open output.html in your browser.");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nاضغط: 'a' لعرض AST، 's' لعرض Symbol Table، 'q' للخروج:");
                String inputChar = scanner.nextLine().trim().toLowerCase();

                if (inputChar.equals("a")) {
                    System.out.println("\n=== AST ===");
                    ast.print("");
                } else if (inputChar.equals("s")) {
                    System.out.println("\n=== Symbol Table ===");
                    System.out.println(table);
                } else if (inputChar.equals("q")) {
                    System.out.println("الخروج من البرنامج...");
                    break;
                } else {
                    System.out.println("أمر غير معروف، حاول مرة أخرى.");
                }
            }

        } catch (IOException e) {
            System.err.println("❌ خطأ في قراءة الملف: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("❌ خطأ أثناء التحليل أو بناء الشجرة: " + e.getMessage());
        }
    }
}
