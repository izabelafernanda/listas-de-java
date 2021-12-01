//Aluno: Izabela Fernanada Silva 
//Data: 27/11/2021

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Questao08 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in); 

        File arquivo = new File("C:\\temp\\resultado.txt"); // cria um arquivo no diretório 
        FileWriter leitor = new FileWriter(arquivo); // leitor para escrever no arquivo

        System.out.println("Digite a quantidade de veículos: "); // imprime na tela a quantidade de veículos
        int qntveiculo = entrada.nextInt(); // recebe a quantidade de veículos

        System.out.println("Digite o valor do aluguel: "); // imprime na tela o valor do aluguel
        double aluguel = entrada.nextInt(); // recebe o valor do aluguel

        // imprime os calculos com base na quantidade de veículos e o valor do aluguel inseridos
        System.out.println("Faturamento anual da locadora: " + ( qntveiculo / 3 * 12 * aluguel)); 
        System.out.println("Faturamento de multas no mês: " + (aluguel * 0.2 * qntveiculo /10));
        System.out.println("Faturamento manutenção anual: " + (qntveiculo * 0.02 * 12 * 600));

        // leitor.write escreve no arquivo 
        leitor.write("Faturamento anual da locadora: " + ( qntveiculo / 3 * 12 * aluguel) + "\n"); 
        leitor.write("Faturamento de multas no mês: " + (aluguel * 0.2 * qntveiculo /10) + "\n");
        leitor.write("Faturamento manutenção anual: " + (qntveiculo * 0.02 * 12 * 600) + "\n");

        // fecha os arquivos
        leitor.close();
        entrada.close();

    } 

    
}
