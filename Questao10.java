// Aluno: Izabela Fernanada Silva
// Data: 27/11/2021

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Questao10 {
    public static void main(String[] args) throws IOException {

        File arquivos = new File("C:\\temp\\questao10.txt"); // lendo o arquivo criado
        FileReader leitor = new FileReader(arquivos); // lendo o arquivo criado
        BufferedReader leitorLinhas = new BufferedReader(leitor);

        String linha = leitorLinhas.readLine(); // armazena a linha lida

        // inicializando as variaveis
        float max = 0;
        float min = 0;
        int contador = 0;
        float soma = 0;

        while (linha != null) { // laço de repetição para ler as linhas do arquivo, enquanto linha for diferente de null
            float valor = Float.parseFloat(linha); // converte a linha para float
            linha = leitorLinhas.readLine(); // armazena a linha lida
            contador++; // incrementa a variável contador

            soma = soma + valor; // somando os valores

            if (contador == 1) { // se for a primeira linha
                max = valor; // armazena o valor na variavel max
                min = valor; // armazena o valor na variavel min
            } else { // se não for a primeira linha
                if (valor > max) { // se o valor for maior que o valor armazenado na variavel max
                    max = valor;
                }
                if (valor < min) { // se o valor for menor que o valor armazenado na variavel min
                    min = valor;
                }
            }
        }
        
        System.out.println("Valor máximo: " + max); // imprimindo o valor max 
        System.out.println("Valor minímo: " + min); // imprimindo o valor min 
        System.out.println("Valor médio: " + contador / soma); // imprime o calculo do valor médio

        leitorLinhas.close(); // fecha o arquivo

    }
}
