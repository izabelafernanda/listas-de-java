// Aluno: Izabela Fernanada Silva
// Data: 26/11/2021

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Questao09 {
    public static void main(String[] args) throws IOException { // método main
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha a opção, 1 - cadastrar alunos ou opção 2 - listar alunos: "); // imprime na tela
        int opcao = entrada.nextInt(); // recebe a opção escolhida

        if (opcao == 1) { // se a opção for 1, irá cadastrar os alunos chamando o método cadastrarAluno
            cadastrodalunos(entrada);
        } else if (opcao == 2) { // se a opção for 2, irá listar os alunos chamando o método listarAlunos
            listaralunos(entrada);
        }
    }

    private static void listaralunos(Scanner entrada) throws IOException { // método listar alunos
        File dados = new File("C:\\temp\\questao09.txt"); // cria um arquivo no diretório 
        FileReader leitor = new FileReader(dados); // leitor para ler o arquivo
        BufferedReader leitorLinhas = new BufferedReader(leitor); // leitor de linhas para ler o arquivo
        String linha = leitorLinhas.readLine();// armazena a linha lida

        while (linha != null) { // laço de repetição para ler as linhas do arquivo, enquanto linha for diferente de null
            System.out.println(linha); // imprime a linha lida
            linha = leitorLinhas.readLine();  // armazena a linha lida
        }
        // fecha os leitores
        leitor.close();
        leitorLinhas.close();

    }

    private static void cadastrodalunos(Scanner entrada) throws IOException { // método cadastro de alunos
        System.out.println("Digite a quantidade de alunos: ");
        int qntalunos = entrada.nextInt(); // recebe a quantidade de alunos

        File dados = new File("C:\\temp\\questao09.txt"); // cria um arquivo no diretório
        FileWriter leitor = new FileWriter(dados); // leitor para escrever no arquivo

        for (int i = 0; i < qntalunos; i++) { // laço de repetição para cadastrar os alunos
            System.out.println("Digite a matrícula do aluno:  "); 
            int matricula = entrada.nextInt(); // recebe a matrícula do aluno
            leitor.write(matricula + " "); // escreve no arquivo a matrícula do aluno

            System.out.println("Digite o número de telefone do aluno: ");  
            int telefone = entrada.nextInt();
            leitor.write(telefone + " "); // escreve no arquivo o telefone do aluno

            leitor.write("\n"); // escreve no arquivo uma quebra de linha

        }
        leitor.close(); // fecha o arquivo
    }
}
