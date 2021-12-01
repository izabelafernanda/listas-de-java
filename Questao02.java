//Aluno: Izabela Fernanada Silva 
//Data: 25/11/2021

import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner; 

public class Questao02 {
    public static void main(String[] args) throws IOException { // throws IOException significa que o método pode lançar
                                                                // uma exceção de IO

        Scanner entrada = new Scanner(System.in); // cria um leitor de entrada

        System.out.println("Digite um texto: "); // imprime na tela
        String texto = entrada.nextLine(); // armazena o texto digitado

        File arquivo = new File("C:\\temp\\questao02.txt"); // cria um arquivo no diretório C:\temp\questao02.txt
        FileWriter leitor = new FileWriter(arquivo); // cria um leitor para escrever no arquivo

        leitor.write(texto); // escreve no arquivo o texto digitado pelo usuário

        leitor.close(); // fecha o arquivo
        entrada.close();
    }

}
