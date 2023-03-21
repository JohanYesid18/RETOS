import java.util.Scanner;

//creamos la clase publica
public class reto4 {

    //creamos el metodo main
    public static void main(String[] args) {

        //declaramos las variables necesarias 
        int opcion, random;

        //instanciamos lo que ingrese el usuario con el objeto lectura
        Scanner lectura=new Scanner(System.in);

        //Se imprime un mensaje al usuario para que eliga su opcion favorita
        System.out.println("elige tu opcion: piedra:1, papel:2, tijera:3");

        //llamamos a la variable para que se guarde en el objeto y siga a la otra linea
        opcion=lectura.nextInt();

        //llamamos a la variable random
        random=(int) (Math.random()*3)+1;

        //creamos una condicion por si en el numero random sale tijera
        if(random==1 && opcion==1){
            System.out.println("respuesta tijera");
            System.out.println("felicidades has ganado");
        }
        //si no se cumple la condicion anterior se hace esta
        else if(random==1 && opcion==2){
            System.out.println("respuesta tijera");
            System.out.println("has perdido");
        }
        //se crea una condicion por si el numero random es igual a tijera
        else if(random==3 && opcion==1){
            System.out.println("empate");
        }
        //por si no se cumplio ninguna de las anteriores
        //creamos una condicion por si en el numero random sale piedra
        else if(random==2 && opcion==2){
            System.out.println("respuesta piedra");
            System.out.println("has ganado");
        }
        //si no se cumple la condicion anterior se hace esta
        else if(random==3 && opcion==3){
            System.out.println("respuesta piedra");
            System.out.println("has perdido ");
        }
        //se crea una condicion por si el numero random es igual a piedra
        else if(random==3 && opcion==2){
            System.out.println("empate");
        }
        //por si no se cumplio ninguna de las anteriores
        //creamos una condicion por si en el numero random sale papel
        else if(random==2 && opcion==3){
            System.out.println("respuesta papel");
            System.out.println("felicidades has ganado");
        }
        //si no se cumple la condicion anterior se hace esta
        else if(random==2 && opcion==1){
            System.out.println("respuesta papel");
            System.out.println("has perdido");

        }
        //se crea una condicion por si el numero random es igual a piedra
        else if(random==1 && opcion==3){
            System.out.println("empate");
        }
        //por ultimo limpiamos el buffer llamando al objeto lectura
        lectura.close();
    }
}