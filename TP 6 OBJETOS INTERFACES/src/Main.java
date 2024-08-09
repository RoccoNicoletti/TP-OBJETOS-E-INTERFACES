import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ///EJERCICIO 1///
        double arr[]=new double[3];
        arr[0]=2.5;
        arr[1]=2.7;
        arr[2]=3.5;

        double min; double max; double suma;

        ArrayReales obj=new ArrayReales(arr);
        min=obj.minimo();
        max=obj.maximo();
        suma= obj.sumatoria();

        System.out.println("Minimo: " + min);
        System.out.println("Maximo: " + max);
        System.out.println("Suma: " + suma);

       ///EJERCICIO 2///
        double arrMate[]=new double[4];
        arrMate[0]=Math.random();
        arrMate[1]=Math.random();
        arrMate[2]=Math.random();
        arrMate[3]=Math.random();

        Matematicas lista=new Matematicas(arrMate);

        double inicio=lista.inicio();
        double fin=lista.fin();

        System.out.println("Inicio: " + inicio);
        System.out.println("Fin: " + fin);

        ///EJERCICIO 3

        Numero numero1=new Numero(4);
        Numero numero2=new Numero(6);
        Numero numero3=new Numero(4);

        System.out.println("Numero 1 es mayor que numero 2: " + numero1.esMayor(numero2));
        System.out.println("Numero 1 es menor que numero 2: " +numero1.esMenor(numero2));
        System.out.println("Numero 1 es igual que numero 3: " + numero1.esIgual(numero3));
        System.out.println("Numero 2 es menor que numero 3: " + numero2.esMenor(numero3));
        System.out.println("Numero 3 es menor a numero 2: " + numero3.esMenor(numero2));

       ///EJERCICIO 4

        Libro librito1=new Libro(232, "El gato naranja", 2022);
        Libro librito2=new Libro(233, "Diana Melo y sus aventuras", 2000);
        Revistas revista1=new Revistas(450, "Actualidad deportiva", 2023, 3);
        Revistas revista2=new Revistas(451, "El mundo y sus consecuencias", 2022, 4);

        Scanner teclado=new Scanner(System.in);

        int eleccion;
        do {
            System.out.println("Ingrese la 1 para tomar prestado, 2 para devolver un libro, 3 para ver las revistas disponibles y 0 para salir:");
             eleccion = teclado.nextInt();

             if(eleccion==1){

                 System.out.println("Ingrese el codigo del libro a tomar prestado:");
                 int eleccion1 = teclado.nextInt();


                 if(eleccion1==librito1.devolverCodigo()){

                     librito1.prestar();
                     System.out.println(librito1.toString());

                 }
                 else if(eleccion1 == librito2.devolverCodigo()){

                     librito2.prestar();
                     System.out.println(librito2.toString());


                 }
                 else{

                     System.out.println("No existe ningun libro con el codigo ingresado");
                 }

             }
             else if(eleccion==2){


                 System.out.println("Ingrese el codigo del libro a devolver:");
                 int eleccion2 = teclado.nextInt();

                 if(eleccion2==librito1.devolverCodigo()){

                     librito1.devolver();
                     System.out.println(librito1.toString());

                 }
                 else if(eleccion2 == librito2.devolverCodigo()){

                     librito2.devolver();
                     System.out.println(librito2.toString());


                 }
                 else{

                     System.out.println("No existe ningun libro con el codigo ingresado");
                 }



             }
             else if(eleccion==3){

                 System.out.println(revista1.toString());
                 System.out.println(revista2.toString());
             }


        } while(eleccion!=0);


        ///EJERCICIO 5
        ArrayList<Integer> arrayList= new ArrayList <Integer> (4);

        Pila pilita=new Pila(arrayList);
        pilita.añadir(6);
        pilita.añadir(4);
        pilita.añadir(3);
        pilita.añadir(7);
        pilita.añadir(8);


       boolean decision= pilita.estaVacia();

       if(decision==true){
           System.out.println("La pila esta vacia ");
       }
       else{
           System.out.println("La pila tiene elementos ");
       }


       int primer;

       if(pilita!=null){

           primer=pilita.extraer();
           System.out.println("El elemento uno a sido borrado y era el numero: " + primer);

       }
       else{

           System.out.println("La pila no tiene elementos para eliminar");
       }



        System.out.println("El primer elemento de la pila es (con el previamente borrado): " + pilita.primero());

        System.out.println("Ingrese un elemento a añadir en la pila:");
        int elemento=teclado.nextInt();

        pilita.añadir(elemento);

       ///MUESTRA
        for(Integer Pila: arrayList){

            System.out.println(Pila);

        }

        ///EJERCICIO 6

        ArrayList<Integer> arrayListita= new ArrayList <Integer> ();
         Pila pilota=new Pila(arrayListita);

         PruebaPila pilon=new PruebaPila();

         pilon.rellenar(pilota);
         pilon.imprimirYVaciar(pilota);

         ///EJERCICIO 7
         BarcoPasaje barquitoPasaje=new BarcoPasaje(70);
         Pesquero Barcopesca=new Pesquero("El pescador", 130, 40);
         PortaAvion Barcoavion=new PortaAvion(3,450);

        System.out.println("Ingrese 1 para acceder al sistema de emergencia del barco pasaje, 2 para el barco de pesca, 3 para el barco portaavion y 0 para salir de este sistema");
        int eleccionBarco= teclado.nextInt();

        if(eleccionBarco==1){

            System.out.println("Ingrese uno para activar el sistema de alerta y dos para el msge de socorro");
            int eleccion1= teclado.nextInt();

              if(eleccion1==1){
                  barquitoPasaje.alarma();

              }
              else{
                  barquitoPasaje.msgeSocorro();
              }
        }
        else if(eleccionBarco==2){
            System.out.println("Ingrese uno para activar el sistema de alerta y dos para el msge de socorro");
            int eleccion2= teclado.nextInt();
            if(eleccion2==1){
                Barcopesca.alarma();

            }
            else{
                Barcoavion.msgeSocorro();
            }
        }
        else if(eleccion==3){

            System.out.println("Ingrese uno para activar el sistema de alerta y dos para el msge de socorro");
            int eleccion3= teclado.nextInt();

            if(eleccion3==1){
                Barcoavion.alarma();

            }
            else{
                Barcoavion.msgeSocorro();
            }
        }

    }
}