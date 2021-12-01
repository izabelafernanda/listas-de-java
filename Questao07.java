//Aluno: Izabela Fernanada Silva 
//Data: 26/11/2021

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Questao07 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de letras: "); // imprime na tela a quantidade de letras
        int quantidade = entrada.nextInt(); // recebe a quantidade de letras

        File atividade7 = new File("C:\\temp\\questao07.txt"); // cria um arquivo no diretório 
        FileWriter atividade7Escreve = new FileWriter(atividade7); // leitor para escrever no arquivo

        int contavogal = 0; // inicializa o contador de vogais

        for (int i = 0; i < quantidade; i++) { // percorre a quantidade de letras digitadas

            System.out.println("Digite uma letra: "); // imprime na tela a letra
            char nletras = entrada.next().charAt(0); // recebe a letra digitada

            atividade7Escreve.write(nletras); // escreve no arquivo a letra digitada
            if (nletras == 'a' || nletras == 'e' || nletras == 'i' || nletras == 'o' || nletras == 'u') { // verifica se a letra é uma vogal
                contavogal++; // incrementa o contador de vogais
                System.out.println("A quantidade de vogais: "+contavogal); // imprime na tela a quantidade de vogais
            }

        }
        atividade7Escreve.close(); // fecha o arquivo
        entrada.close();
    }
}
