// Vendo if e else e operador ternario
public class cursojava2{
    public static void main(String[] args){

        int nota=80;
        int media=60;
        int faltas = 1;
        int maxfaltas =5;
        String res;


       /* Podemos resolver no IF ELSE ou usar o operador Ternario, exemplo 1 foi com ternarioe o exemplo2 com IF*/


        res=(nota >=media && faltas <= maxfaltas ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);



        /* 
        if(nota >= media && faltas <= maxfaltas){ System.out.println("passou"); }
        else if (nota >= 40){System.out.println("Recuperação");}
        else{System.out.println("reprovou");}

        System.out.println("fim do programa");
        */ 

    }
 
}











