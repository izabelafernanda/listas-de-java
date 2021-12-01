//Aluno: Izabela Fernanada Silva 
//Data: 25/11/2021

import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

public class Questao05 {
    public static void main(String[] args) throws IOException {

        File arquivo1 = new File("C:\\temp\\questao01.txt"); 
        File arquivo2 = new File("C:\\temp\\questao02.txt");
        File arquivo3 = new File("C:\\temp\\questao05.txt"); // criando arquivo para receber a concatenação dos arquivos

        FileReader arquivo1Leitor = new FileReader(arquivo1); // criando leitor do arquivo 1
        FileReader arquivo2Leitor = new FileReader(arquivo2); // criando leitor do arquivo 2

        FileWriter arquivo3Escritor = new FileWriter(arquivo3); // criando escritor do arquivo 3

        BufferedReader leitorLinhas = new BufferedReader(arquivo1Leitor); // criando leitor de linhas do arquivo 1
        BufferedReader leitorLinhas2 = new BufferedReader(arquivo2Leitor); // criando leitor de linhas do arquivo 2
        String linha = leitorLinhas.readLine(); // lendo linha do arquivo 1

        while (linha != null) { // enquanto linha for diferente de null
            arquivo3Escritor.write(linha + "\n"); // escrevendo linha no arquivo 3
            linha = leitorLinhas.readLine();  // lendo linha do arquivo 1
        } 

        linha = leitorLinhas2.readLine(); // lendo linha do arquivo 2

        while (linha != null) { // enquanto linha for diferente de null
            arquivo3Escritor.write(linha + "\n"); // escrevendo linha no arquivo 3
            linha = leitorLinhas2.readLine(); // lendo linha do arquivo 2
        }
        arquivo1Leitor.close();
        arquivo2Leitor.close();
        arquivo3Escritor.close();
        leitorLinhas.close();
        leitorLinhas2.close();

    }

    
}
