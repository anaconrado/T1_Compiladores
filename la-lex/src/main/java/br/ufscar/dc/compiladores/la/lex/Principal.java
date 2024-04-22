package br.ufscar.dc.compiladores.la.lex;

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

        while((t=lex.nextToken()).getType() != Token.EOF) {
            System.out.print("<"+ t.getType()+","+t.getText()+">");
        }
    }
}
