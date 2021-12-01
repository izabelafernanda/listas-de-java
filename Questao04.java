//Aluno: Izabela Fernanada Silva 
//Data: 25/11/2021

import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileReader;
import java.io.IOException; 

public class Questao04 {
    public static void main(String[] args) throws IOException { 

        File arquivo = new File("C:\\temp\\questao02.txt"); 
        FileReader leitor =  new FileReader(arquivo); // leitor para ler o arquivo do diretório 
        BufferedReader leitorLinhas = new BufferedReader(leitor); // leitor de linhas para ler o arquivo

        String linha = leitorLinhas.readLine(); // armazena a linha lida
        int conta = 0; // variável para contar as linhas

        while (linha != null) { // laço de repetição para ler as linhas do arquivo, enquanto linha for diferente de null
            System.out.println(linha); // imprime a linha lida
            linha = leitorLinhas.readLine(); // armazena a linha lida
            conta++; // incrementa a variável conta
        } System.out.println("A quantidade de linhas é "+conta);

        leitor.close(); 

}
    
}
