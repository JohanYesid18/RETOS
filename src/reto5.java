import java.util.Scanner;

//creamos la clase publica
public class reto5 {

    //creamos el metodo publico 
    public static void main(String[] args) {

        //instanciamos con el objeto lectura de la clase Scanner
        Scanner lectura=new Scanner(System.in);

        //declaramos la variable n tipo int y la inicializamos en 5
        int n=5;

        //declaramos la variable total tipo double y la inicializamos en 0
        double total=0; 
        
        //declaramos la variable precio y la inicializamos en o
        double precio=0;

        //creamos un bucle for donde se crea la variable i la cual se inicializa en 0
        //despues creamos la condicion y por ultimo se crea el contador 
        for(int i = 1; i <= n; i++){

            //se imprime un mensaje donde se le pedira al usuario que ingrese el 
            //precio del producto
            System.out.println("Ingrese el precio del producto #" +i+ " : ");

            //llamamos a la variable precio donde se llama al objeto lectura
            //por ultimo se usa el metodo para que lea la variable
            precio=lectura.nextDouble();

            //llamamos a la variable total y la sumamos a la variable precio
            total += precio;
        }
        //Se imprime un mensaje donde se dira el total de las compras que realizo
        //le el usuario 
        System.out.println("El total de la compra es " + total);

        //por ultimo limpiamos el buffer
        lectura.close();
    }
    
    
}
