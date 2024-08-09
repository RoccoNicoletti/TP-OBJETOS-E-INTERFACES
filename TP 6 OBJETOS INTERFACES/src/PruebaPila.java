public class PruebaPila {


    public void rellenar(ColeccionInterfaz objeto){

        for(int i=1; i<=10; i++){///hace un i del 1 al 10
            objeto.añadir(i);
        }
    }

    public  void imprimirYVaciar (ColeccionInterfaz objeto){

      for(int i=1; i<=10; i++){


           System.out.println("Objeto extraido: " + objeto.extraer());

       }

    }
}
