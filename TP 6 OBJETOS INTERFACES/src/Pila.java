import java.util.ArrayList;

public class Pila implements  ColeccionInterfaz{



    private ArrayList<Integer> arregloLista;
    private int contadorObj;


    public Pila(){ ///CONSTRUCTORES


    }
    public Pila(ArrayList<Integer> arregloLista) {
        this.arregloLista = arregloLista;
        this.contadorObj=0;
    }

    @Override
    public boolean estaVacia() {

        if(arregloLista==null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int extraer() {

        if(arregloLista!=null){

            int primerPos=arregloLista.get(contadorObj-1);
            arregloLista.remove(contadorObj-1);
            contadorObj--;

            return primerPos;
        }
         return 0;
    }

    @Override
    public int primero() {
        if(arregloLista!=null) {
            return arregloLista.get(contadorObj - 1);
        }
        return 0;
    }

    @Override
   public boolean añadir(int objeto) {

        if(arregloLista!=null) {
            arregloLista.add(objeto);
            contadorObj++;

            return true;
        }
        return  false;
   }


    ///GETTERS Y SETTERS

    public int getContadorObj() {
        return contadorObj;
    }

    public void setContadorObj(int contadorObj) {
        this.contadorObj = contadorObj;
    }

    public ArrayList<Integer> getArregloLista() {
        return arregloLista;
    }

    public void setArregloLista(ArrayList<Integer> arregloLista) {
        this.arregloLista = arregloLista;
    }
}
