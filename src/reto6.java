import java.util.Scanner;
//creamos la clase publica
public class reto6 {
    //creamos el metodo main
    public static void main(String[] args) {

        //Se declaran variables
        int maquina,jugada;
        double Acumulado = 0;  
        String jugador;
        final double Apuesta = 100000;
           

        //Se instancia la clase 
        Scanner lectura = new Scanner(System.in);

        //Se pide el nombre del jugador
        System.out.println("Nombre del Jugador: "); 
        //Se llama la variable juagdor para que se guarde en el objeto lectura
        // de tipo string o aqui line
        jugador = lectura.nextLine();

        //opciones de Juego para el usuario
        System.out.println("Sello: 1, Cara: 2");
        
        //se imorime un mensaje para la jugada
        System.out.print("Jugada: "); 
        //se llama a la varible jugada para que se guarde en el objeto lectura como tipo int
        jugada = lectura.nextInt();

        //Jugada de la maquina
        maquina = (int) (Math.random() *2)+1;

        //Se usa una clase Switch para tener varias situaciones
        switch (jugada) {
            
            case 1: 
            //otro Switch para comparar la jugada anterior con la de la maquina
                switch (maquina){
                    case 1: System.out.println("Ganaste $10.000"); 
                    Acumulado = Apuesta + 10000; 
                    //cerramos el proceso
                    break;

                    case 2: System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000;
                    //cerramos el proceso
                    break;

                    default: System.out.println("Invalido");
                    //cerramos el proceso
                    break;
                        
                }
                //cerramos el switch
                break;

                //en caso de que el sea cara creamos este otro switch
                case 2:

                    switch (maquina){

                        case 1:  

                        System.out.println("Perdiste $10.000");     
                        Acumulado = Apuesta - 10000;
                        //cerramos el proceso
                        break;

                        case 2: 
                        System.out.println("Ganaste $10.000"); 
                        Acumulado = Apuesta + 10000; 
                        //cerramos el proceso
                        break; 
                        default: System.out.println("Invalido");
                        //cerramos el proceso
                        break;
                    }
                    //cerramos el switch
                    break;                    
        }
        //creamos un mensaje donde se muestre el nombre del jugador y lo que acumulo en la apuesta
        System.out.println("El jugador: "+jugador+" Termino con: "+Acumulado);

        //por ultimo limpiamos el buffer para volver a jugar
        lectura.close();

    }
}
