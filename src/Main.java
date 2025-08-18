import SymbolTableStructure.SymbolTable2;
import Visitor.SemanticVisitor;
import antlr.lexicalanalysis;
import antlr.parseranalysis;


import expression.ASTNode;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("C:\\Users\\dell\\Desktop\\AngularCompilerProject\\src\\Erorr\\error2_invalid_type.txt");

            lexicalanalysis lexer = new lexicalanalysis(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parseranalysis parser = new parseranalysis(tokens);

            // ✅ استدعاء القاعدة العليا componentFile
            ParseTree tree = parser.componentFile();
            SymbolTable2 table = new SymbolTable2();
            SemanticVisitor visitor = new SemanticVisitor(table);

            ASTNode ast = visitor.visit(tree);

            ast.print("");

        } catch (IOException e) {
            System.err.println("❌ خطأ في قراءة الملف: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("❌ خطأ أثناء التحليل أو بناء الشجرة: " + e.getMessage());
        }
    }
}

