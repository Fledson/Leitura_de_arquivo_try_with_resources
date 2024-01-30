package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        // instanciando o caminho do arquivo
        String path = "c:\\temp\\ina.txt";

        /*
          Usando try-with-resources
          É um bloco try que declara um ou mais recursos, e garante que esses
          recursos serão fechados ao final do bloco

          p.s -> instancia das streamers diretamente no bloco try
         */
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
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
            System.out.println("Error: " + e.getMessage());
        }
    }

}
