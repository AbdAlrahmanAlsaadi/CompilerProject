import SymbolTableStructure.SymbolTable2;
import Visitor.SemanticVisitor;
import CodeGeneration.CodeGenerator;

import expression.ASTNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("C:\\Users\\DELL\\IdeaProjects\\CompilerProject\\src\\test.dsl");

            // 🏗️ Lexer + Parser
            antlr.lexicalanalysis lexer = new antlr.lexicalanalysis(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            antlr.parseranalysis parser = new antlr.parseranalysis(tokens);

            // ✅ القاعدة العليا
            ParseTree tree = parser.componentFile();

            SymbolTable2 table = new SymbolTable2();
            CodeGenerator codeGen = new CodeGenerator();
            SemanticVisitor visitor = new SemanticVisitor(table, codeGen);

            ASTNode ast = visitor.visit(tree);
            ast.print("");

            // ✨ توليد الملفات (HTML + CSS + JS)
            codeGen.generateApp();

            System.out.println("✅ Code generation completed. Open output.html in your browser.");

        } catch (IOException e) {
            System.err.println("❌ خطأ في قراءة الملف: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("❌ خطأ أثناء التحليل أو بناء الشجرة: " + e.getMessage());
        }
    }
}
