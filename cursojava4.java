// Explorando estrutura de repetição FOR, WHILE E DO WHILE


// import java.util.Scanner;
public class cursojava4 {

    public static void main(String[] args){
    
/* 

        // FOR contador basico, se souber quantas vezes precisar rodar usar o for
        for(int cont=0; cont <10 ; cont ++){System.out.println(cont + "funcionadno contador");}   
        


        int controle=0;
        // while com uma configuração diferente do, enquanto a condição não for satisfeita ele executa, o incremento ou decremento fica no final
        while(controle <5){ System.out.println(controle + "funcionadno contador");controle++;}

*/

/* 

        // LOOP com entrada de teclado
        Scanner scan=new Scanner(System.in);
        int max=scan.nextInt();
        int cont =0;
        while(cont < max){ System.out.println(cont +"Deu certo"); cont++;}
        scan.close();
*/

        // sendo DO while primeiro executa e depois testa
        int cont=0;
        do{ System.out.println(cont +" Deu certo"); cont++;}while(cont < 0); }
    
}