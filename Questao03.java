//Aluno: Izabela Fernanada Silva 
//Data: 25/11/2021

import java.io.BufferedReader; // importa a classe BufferedReader
import java.io.File; 
import java.io.FileReader;
import java.io.IOException; 

public class Questao03 {
    public static void main(String[] args) throws IOException { 

        File arquivo = new File("C:\\temp\\questao02.txt"); 
        FileReader leitor = new FileReader(arquivo); // leitor para ler o arquivo do diretório 

        BufferedReader leitorLinhas = new BufferedReader(leitor); // leitor de linhas para ler o arquivo

        String linha = leitorLinhas.readLine(); // armazena a linha lida
        int conta = 0; // variável para contar as linhas

        while (linha != null) { // laço de repetição para ler as linhas do arquivo, enquanto linha for diferente de null 
            linha.trim(); // remove os espaços em branco
            if (!linha.equals("")) { // se a linha não for vazia, exclamação inverte o resultado para verdadeiro 
                String[] valores = linha.split(""); // divide a linha em um array de strings
                for (int i = 0; i < valores.length; i++) { // laço de repetição para percorrer o array 
                    String val = valores[i]; // armazena o valor do array na variável val
                    if (val.equals("a")) { // se o valor for igual ''a'' 
                        conta++; 
                    }

                }
            }
            linha = leitorLinhas.readLine();  // armazena a linha lida no arquivo no valor da variável linha
        }

        System.out.println("O número de caracteres a: " + conta); // imprime na tela o número de caracteres a 

        leitorLinhas.close(); // fecha o arquivo
        leitor.close(); 

    }
}
