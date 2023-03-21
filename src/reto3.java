import java.util.Random;
import java.util.Scanner;

//creamos la clase
public class reto3{

    //creamos el metodo main
    public static void main(String[] args) {

        //declaramos variables
        int opcion;

        //instanciamos la clase scanner para que almacene lo que digita el usuario
        Scanner lectura = new Scanner(System.in);

        //creamos la clase random junto con el objeto
        Random alazar = new Random();

        //se le muestra al usuario un mensaje de bienvenida
        System.out.println("Bienvenido al juego de carisellazo");

        //creamos un mensaje para que el usuario elija su opcion favorita
        System.out.println("elije una opcion: 0 Sello; 1 Cara");

        //llamamos a la variable para almacenar lo que digita el usuario
        opcion = lectura.nextInt();

        //creamos una varianle i tipo int la cual llama al objeto para que salga 
        //un numero al azar entre 1 y 2
        int i = alazar.nextInt(2);

        //se imprime un mensaje al usuario donde de le mostrara que la moneda esta girando
        System.out.println("la moneda esta girando");

        //se crea la condicion si el numero al azar es 0
        if (i == opcion) {

        //se imprime un mensaje al usuario el cual dice que gano ya que el numero coincide con el numero al azar
        System.out.println ("GANASTE!!!");

        //se crean las condiciones si el numero al azar no coincide con el que digito el usuario
        } else if (i > opcion) {
        System.out.println ("PERDIO vuelva a intentar");
       
        } else if (i < opcion) {
        System.out.println ("PERDIO vuelva a intentar");
        } 
        //por ultimo limpiamos el buffer llamando a el objeto lectura y el metodo close
        lectura.close();
        }
    }
