package analizador;

import java.io.File;
import java.io.StringReader;
import javax.swing.JOptionPane;

public class Flex {

    public static void main(String[] args) {
        try {
            String path = getWorkingDirectory() + "\\src\\analizador\\lexer.flex";
            generadorLexer(path);

//            String input = (JOptionPane.showInputDialog("Ingrese el identificador"));
//            AnalizadorJFlex analizador = new AnalizadorJFlex(new StringReader(input));
//
//            System.out.println("Expresion Regular=" + analizador.yylex());
            
        } catch (Exception ex) {
            System.out.println("ERROR LEXICO || " + ex);
        }

    }

    public static void generadorLexer(String path) {
        File file = new File(path);
        jflex.Main.generate(file);
    }

    public static String getWorkingDirectory() {
        String dir = System.getProperty("user.dir");
//        System.out.println("current dir = " + dir);
        return dir;
    }

}
