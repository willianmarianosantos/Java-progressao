// explorando o switch e case e usando scan para pegar captura do teclado
import java.util.Scanner;

public class cursojava3 {
    
    public static void main(String[] args){

                Scanner scan = new Scanner(System.in);
                    String nome =""; 
                    int posicao;


                    System.out.println("Digiteseu nome");
                    nome=scan.nextLine();

                    System.out.println("Digite um numeral");
                    posicao=scan.nextInt();


                    switch(posicao){
                        case 1: System.out.printf("%s Primeiro lugar", nome); break;
                        case 2: System.out.printf("%s Segundo lugar", nome);  break;
                        case 3: System.out.printf("%s Terceiro lugar", nome); break;
                        default:System.out.printf("%s Sorry Bro tomou gg", nome); break;
                    }
                    scan.close();


                 /* poderia usar o try apenas para sumir o erro do Scanner aberto que não é erro, ou usar o "nomeobjeto" .close(); */
            
    }

}
