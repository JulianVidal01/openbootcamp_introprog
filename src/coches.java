import java . io . *;

public class coches{

    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System . in));

        String prime;

        int incremnumPuer;

        incremnumPuer = 0;

        Coche miCoche = new Coche(incremnumPuer);

        do {

            do {

                System.out.print("Desea agregar una puerta al coche? (si/no): ");

                prime = bufEntrada.readLine();

                prime = prime.toLowerCase();

            } while (!(prime.equals("si") || prime.equals("no")));

            if (prime.equals("si")) {

                incremnumPuer=miCoche.puertas(incremnumPuer);

                System.out.println("Número de puertas: "+incremnumPuer);
            }
        } while (!prime.equals("no"));

        System.out.println("El Número de puertas del coche son:"+incremnumPuer);
    }
}

// clase Coche
class Coche {
    int puertas;
    Coche (int puerta) {
        puertas=puerta;
    }
    int puertas(int incremnumPuer){

        return incremnumPuer+1;
    }
}