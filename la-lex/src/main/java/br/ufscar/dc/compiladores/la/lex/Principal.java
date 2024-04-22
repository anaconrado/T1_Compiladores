package br.ufscar.dc.compiladores.la.lex;

import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import br.ufscar.compiladores.la.lex.lalex;

public class Principal {
    public static void main(String args[]) throws IOException{
        // args[0] é o primeiro argumento da linha de comando
        CharStream cs = CharStreams.fromFileName(args[0]);
        lalex lex = new lalex(cs);

        Token t = null;

        // Colocando saída em arquivo do segundo argumento 
        String filename = args[1];
        FileWriter writer = new FileWriter(filename);

        while ((t=lex.nextToken()).getType() != Token.EOF) {
            writer.write("<'" + t.getText() + "','" + t.getText() + "'>\n");
        }

        writer.close();
    }
}
