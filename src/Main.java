import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner numeros = new Scanner( System.in );

        System.out.print( "Ingrese el primer número: " );
        n1 = numeros.nextInt();

        System.out.print( "Ingrese el segundo número: " );
        n2 = numeros.nextInt();

        System.out.print( "Ingrese el tercer número: " );
        n3 = numeros.nextInt();

        suma(n1, n2, n3);
    }
    public static void suma(int n1, int n2, int n3){

        System.out.println( n1 + n2 + n3);
    }
}