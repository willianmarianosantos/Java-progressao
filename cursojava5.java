// EXPLORANDO ARRAY PARTE1

public class cursojava5 {
    public static void main(String[] args){

        // array
        int[] numeros=new int[5];

        numeros[0]=0;
        numeros[1]=10;
        numeros[2]=20;
        numeros[3]=30;
        numeros[4]=40;

        // tambem é possivel já criar um array ja adicionando valores no inicio colocando os valores entre chaves
        int[] numerosb={0,10,20,30,40};


        // %d para imprimir um numero inteiro
         System.out.printf("%d = ", numeros[1]);
         System.out.printf("%d = ", numerosb[2]);


        // podemos usar loop para mostrar todos os elementos de um array, por exemplo o for porque ja sabemos o numero maximo de elementos
        //neste caso o "i" faz referencia a posição do elemento dentro do array
        for(int i=0; i<numeros.length; i++ ){ System.out.printf(" %d - ",numeros[i]);}

        // podemos usar uma constante para definir um valor tambem, para criar uma consante podemos usar o seguinte codigo, final int "nome variavel=***;"
        // podemos tambem usar o nome da variavel.lenght que é a propriedade relacionado ao tamanho do array


    }
}
