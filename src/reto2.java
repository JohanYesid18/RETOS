import java.util.Scanner;

//creamos la clase
public class reto2 {

    //creamos el metodo main
    public static void main(String[] args) {

         //instanciamos el objeto lectura para capturar los datos que digita del usuario
        Scanner lectura = new Scanner(System.in);

        //declaramos las variables necesarias
        Double dosisvacuna,pesobebe,mesesbebe;

        //declaramos las variables pero con el un valor de inicio que nos pide el ejercicio
        int sum=10, multi=10, multi2 = 8;

        //imprimos un mensaje al usuario para que ingrese el peso de el bebe
        System.out.print("Ingrese el peso del bebe");

        //llamamos a la variable pesobebe y lo guardamos en el objeto 
        //lectura para que se guarde lo que digita el usuario
        pesobebe = Double.parseDouble(lectura.nextLine());

        //imprimos un mensaje al usuario para que ingrese los meses del bebe
        System.out.print("Ingrese los meses del bebe");

        //llamamos a la variable mesesbebe y lo guardamos en el objeto lectura para que se guarde lo que digita el usuario
        mesesbebe = Double.parseDouble(lectura.nextLine());

        //hacemos la operacion y lo guardamos en la variable dosisvacuna
        dosisvacuna = (pesobebe + sum)/(mesesbebe * multi)*multi2;

        //imprimimos un mensaje donde se le mostrara al usuario la dosis de vacuna que se le dara al bebe
        System.out.print("la dosis de vacuna es:" + dosisvacuna); 

        //por ultimo llamamos el objeto lectura y le agregamos el objeto close para limpiar el buffer
        lectura.close();
   }
}
