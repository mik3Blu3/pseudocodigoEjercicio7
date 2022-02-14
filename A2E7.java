import java.util.Scanner;
import java.util.Random;
public class A2E7 {
    static Scanner entrada = new Scanner(System.in);
    static Random r = new Random();
    public static void main(String args[])
    {
        double numerosParesAux=0;
        double numerosImparesAux = 0;
        double numerosCerosAux = 0;
        int n = 15;
        int i = 1;
        while(i <= n)
        {
            int numAleatorio = r.nextInt(36);
            System.out.println("El aleatorio # "+i+ " generado fue: "+numAleatorio);
            System.out.println("");
            int aleatorioMod = (numAleatorio % 2);
            if((aleatorioMod == 0) && (numAleatorio !=0))
            {
                numerosParesAux = numerosParesAux +1;
            }
            if(aleatorioMod != 0)
            {
                numerosImparesAux = numerosImparesAux +1;
            }
            if(numAleatorio == 0)
            {
                numerosCerosAux = numerosCerosAux+1;
            }
            i++;
        }
        double porcentajesPares = (numerosParesAux/n)*100;
        double porcentajeImpares = (numerosImparesAux/n)*100;
        double porcentajeCeros = (numerosCerosAux/n)*100;
        System.out.println("Los porcentajes fueron:");
        System.out.println("Numeros aleatorios Pares "+porcentajesPares+ " %");
        System.out.println("Numeros aleatorios Impares "+porcentajeImpares+" %");
        System.out.println("Numeros aleatorios ceros "+porcentajeCeros+" %");

    }
}
