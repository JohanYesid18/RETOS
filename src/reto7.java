import java.util.Scanner;

//creamos la clase publica 
public class reto7 {

    //creamos el metodo publico
    public static void main(String [] args) {

        //Se declaran las variables
        int numeroUsuario, vidaJugador = 3;
        String jugador;
        double Acumulado = 0;
        final double Apuesta = 100000;

        //Se instancia la clase
        Scanner lectura = new Scanner(System.in);
 
        //Se pide el nombre del jugador
        System.out.println("Nombre del Jugador: ");

        //se imprime un mensaje que diga
        System.out.print("Jugador: ");
         
        //llamamos a la variable jugador y la almacenamos en el objeto
        jugador = lectura.nextLine();
        
        //Bucle para repetir varias veces el juego
        while(vidaJugador  > 0){

        //Se mencionan los tipos de juego
        System.out.print("Opciones de Juego:");

        //Se ingresan los datos
        System.out.println("Piedra = 1, Papel = 2 y Tijeras = 3"); 

        //se llama a la varible y lo almacenamos en el objeto lectura con tipo int
        numeroUsuario = lectura.nextInt();
         
        int numeroRandom = (int)(Math.random() * 3) + 1;

        //Se usa el switch como condicional para crear varias situaciones
        switch ( numeroRandom ){

            //Se imprime la situacion de la computadora jugando con piedra
            case 1: 
            
            System.out.println("Piedra");

           
                
            //creamos el bucle Switch para el numero que digito el usuario
                switch ( numeroUsuario ) {

                //las opciones que ahi segun lo ingresado
                   case 1: 

                   System.out.println("Empataste"); 
                   
                   break;

                   case 2: 
                   System.out.println("Ganaste $10.000"); 
                    Acumulado = Apuesta + 10000; 
                    
                   break;

                   case 3: 
                   System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000;
                    vidaJugador = vidaJugador - 1;
                   
                   break;
                    
                }
                
                //creamos un break para cerrar el switch
                break;
                

            //Se imprime la situacion de la computadora jugando con papel
            case 2: 
            
            System.out.println("Papel");

            //creamos el bucle Switch para el numero que digito el usuario
                switch ( numeroUsuario ) {

                //las opciones que ahi segun lo ingresado
                case 1: 

                   System.out.println("Perdiste $10.000");     
                   Acumulado = Apuesta - 10000; 
                   vidaJugador = vidaJugador - 1;

                break;

                case 2: 

                   System.out.println("Empataste");

                break;

                case 3: 

                   System.out.println("Ganaste $10.000"); 
                   Acumulado = Apuesta + 10000;

                break;

                }
                //creamos un break para cerrar el switch
                break;

            //Se imprime la situacion de la computadora jugando con tijeras
            case 3: 
            
            System.out.println("Tijeras");

                //creamos el bucle Switch para el numero que digito el usuario
                switch ( numeroUsuario ) {

                //las opciones que ahi segun lo ingresado
                case 1: 

                   System.out.println("Ganaste $10.000"); 
                   Acumulado = Apuesta + 10000;

                break;

                case 2: 

                   System.out.println("Perdiste $10.000");     
                   Acumulado = Apuesta - 10000;
                   vidaJugador = vidaJugador - 1;

                break;

                case 3: 

                   System.out.println("Empataste"); 

                break;

                }

                

                //creamos un break para cerrar el switch
                break;
        }

    }
    //se imprime in mensaje sonde se muestra el nombre del jugador perdio sus vidas y el 
    //valor que acumulo jugando
    System.out.println("El jugador: "+jugador+" perdio todas sus vidas y Termino con: "+Acumulado);

    //por ultimo limpiamos el buffer para volver a jugar 
    lectura.close();
    }
}
