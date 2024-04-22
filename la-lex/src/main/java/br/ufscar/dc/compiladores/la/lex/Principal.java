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

        while ((t = lex.nextToken()).getType() != Token.EOF) {
            String tokenName = lalex.VOCABULARY.getDisplayName(t.getType());

            // Caso em que o tipo é uma PC, então repetimos o nome 
            // Testa para erro de cadeia não fechada
            if (tokenName.equals("ERRO_CADEIA")){
                writer.write("Linha " + t.getLine() + ": cadeia literal nao fechada\n");
                break;
            }

            // Testa para erro de comentário não fechado
            else if (tokenName.equals("ERRO_COMENTARIO")){
                writer.write("Linha " + t.getLine() + ": comentario nao fechado\n");
                break;
            }

            // Testa para caracteres não reconhecidos
            else if (tokenName.equals("NAO_RECONHECIDO")){
                writer.write("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado\n");
                break;
            }
            
            else if (tokenName != "PALAVRA_CHAVE")
                writer.write("<'" + t.getText() + "'," + tokenName + ">\n");

            // Condicional para exibir tokens de palavra-chave
            else
                writer.write("<'" + t.getText() + "','" + t.getText() + "'>\n");
        }

        writer.close();
    }
}