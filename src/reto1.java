import java.util.Scanner;


//creamos la clase
public class reto1{

    //creamos el metodo main
    public static void main(String[] args){

        //instanciamos el objeto lectura para capturar los datos que digita el usuario
        Scanner lectura = new Scanner(System.in);

        //declaramos las variables necesarias
        double fahrenheit, grados ;
        

        //declaramos las variables pero con el valor de inicio que nos pide el ejercicio
        double num=32, num2=1.8;

        //imprimos un mensaje al usuario
        System.out.print(" Ingrese la temperatura en grados: ");

        //llamamos a la variable grados y lo guardamos en el objeto lectura para 
        //que se guarde lo que digita el usuario
        grados = Double.parseDouble(lectura.nextLine());

        //hacemos la operacion y la guardamos en la variable fahrenheit
        fahrenheit = (grados-num)/num2;

        //mostramos un mensaje donde el usuario podra ver 
        //los grados centigrados pasados a Fahrenheit
        System.out.println(" Grados Fahrenheit: " + fahrenheit);

        //por ultimo llamamos el objeto lectura y le agregamos el objeto close para limpiar el buffer
        lectura.close();

    }
}
