package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        // instanciando o caminho do arquivo
        String path = "c:\\temp\\in.txt";
        // carregando o fileReader
        FileReader fr = null;
        // carregando o bufferedReader
        BufferedReader br = null;

        // tentativa
        try {
            // instanciando o FileReader a partir do caminho do arquivo
            fr = new FileReader(path);
            // instanciando o BufferedReader a apartir do fileReader instanciado
            br = new BufferedReader(fr);

            // lendo a linha do arquivo, ao chegar no fim do arquivo ele retorna null então ...
            String line = br.readLine();

            // loop de leitura (enquando a linha não for nula)
            while (line != null) {
                // imprimindo a primeira linha
                System.out.println(line);
                // lendo a prox linha
                line = br.readLine();
            }

        } catch (IOException e) {
            // caso erro imprima o erro
            System.out.println("Error: " + e);
        } finally {
            // tentativa de fechar o fileReader e BufferedReader
            try {
                if (br != null) {
                    br.close();
                } if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                // caso n der certo, imprima a pilha de errors
                e.printStackTrace();
            }
        }
    }

}
