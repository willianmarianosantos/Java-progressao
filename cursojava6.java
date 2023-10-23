// EXPLORANDO ARRAY PARTE2

import java.util.Scanner;

public class cursojava6 {
    public static void main(String[] args){

        final int tamanho=5; // usei uma constante
        char[] gabarito={'a','a','b','b','c'}; // gabarito de prova
        char[] respostas=new char[tamanho]; // Tamanho ja definido na constante
        int nota=0; // não é preciso atribuir o 0, faço por costume


        Scanner scan=new Scanner(System.in); 
        for(int i=0; i<tamanho; i++){
            System.out.printf("Informe a resposta %d : ", i);
            respostas[i]=scan.nextLine().charAt(0); // respostas recebe a leitura do scan na posição 0 
            
        }
            scan.close();
        for(int i=0; i<tamanho;i++){
            if(respostas[i]==gabarito[i]){nota++;}  // adiciona o valor da nota caso o valor de respostas e gabarito seja igual na posição i

        }
        System.out.printf("Nota do aluno: %d",nota); // mostra a nota final do aluno

    }
}        