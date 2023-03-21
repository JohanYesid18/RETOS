import java.util.Scanner;

//creamos la clase publica
public class reto8{

    //se hace el metodo main
    public static void main (String[]args){

        //declarar variables
        //inicializar las variables para meterlas en un bucle
        int contador = 0; 
        int maquina = 0;
        int i=0;
        int j=0;
        int intento=0;

        //instanciar la clase Scanner
        Scanner lectura = new Scanner(System.in);

        //generar un numero al azar para adivinar
        maquina = (int) (Math.random()*100)+1;

        //se crea el ciclo para realizar los 10 intentos
        for (i=0; i<10; i++){

            //creamos el contador de los intentos
            contador = contador+1;

            //se pide el ingreso de un número al usuario
            System.out.println("Por favor ingrese un numero");

            //llamamos a la variable intento para que se guarde en el objeto
            j= lectura.nextInt();

            //se crea una condición si el usuario gana el juego
            if(maquina==j){
                System.out.println("!!!!Felicidades Adivinaste el número!!!!! en "+ contador + " intentos");
            //se pone el break para cerrar el ciclo y terminar el juego
                break;

            //se hace una condición si no se coloco el número correcto y se dice si es mayor
            }else if(maquina>j){
                System.out.println("Te equivocaste el número es mas mayor que " +intento);

            //se hace una condición si no se coloco el número correcto y se dice si es menor
            }else if(maquina<j){
                System.out.println("Te equivocaste el número es mas menor que " +intento);  
            }

            //al salir del bucle se crea un mensaje si se excede del número de intentos y si no se adivina el número
            if (contador == 10) {
            System.out.println("el número de intentos ha sido excedido"); 
            
            //por ultimo limiamos el buffer
            lectura.close();
            }
            
        }
       
    }
    
}
