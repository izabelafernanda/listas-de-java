//Aluno: Izabela Fernanada Silva 
//Data: 25/11/2021

import java.io.File; // importa a classe File
import java.io.FileWriter; // importa a classe FileWriter
import java.io.IOException; // importa a classe IOException

public class Questao01 {
    public static void main(String[] args) throws IOException { // throws IOException significa que o método pode lançar uma exceção de IO

        File arquivo = new File("C:\\temp\\questao01.txt"); // cria arquivo no diretório C:\temp\questao01.txt
        FileWriter leitor =  new FileWriter(arquivo); // leitor para escrever no arquivo

        for (int i = 1; i <= 10; i++) { // laço de repetição para escrever 10 linhas

            leitor.write("linha " + i + "\n"); // escreve no arquivo a linha i

        }
        leitor.close(); // fecha o arquivo
        }

}
