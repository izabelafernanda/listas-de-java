//Aluno: Izabela Fernanada Silva 
//Data: 26/11/2021

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Questao06 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in); 

        File atividade6 = new File("C:\\temp\\questao06.txt"); // cria arquivo no diretório C:\temp\questao01.txt
        FileWriter atividade6Escreve = new FileWriter(atividade6); // leitor para escrever no arquivo

        System.out.println("Digite um número: "); // imprime na tela
        int numero = entrada.nextInt(); // recebe o número digitado do tipo inteiro

        int soma = calcularDivisores(numero); // invoca o método calcularDivisores e armazena o resultado
        atividade6Escreve.write("A soma dos dividores é :" + soma); // escreve no arquivo a soma dos divisores

        atividade6Escreve.close(); // fecha o arquivo
        entrada.close();
    }

    static int calcularDivisores(int numero) { // método para calcular os divisores de um número
        int soma = 0; // variável para armazenar a soma dos divisores
        for (int i = 1; i <= numero; i++) { // laço de repetição para calcular os divisores
            if (numero % i == 0) { // se o resto da divisão for igual a zero
                soma = soma + i; // soma os divisores

                System.out.println("Os seus dividores são: " + i);
            }
        }
        return soma; // retorna a soma dos divisores
    }

}
