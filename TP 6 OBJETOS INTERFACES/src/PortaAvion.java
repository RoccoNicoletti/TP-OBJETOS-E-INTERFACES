public class PortaAvion implements Barcos {


    private int cantAvion;
    private int cantTripu;


    public PortaAvion(){ ///CONSTRUCTORES

    }

    public PortaAvion(int cantAvion, int cantTripu){

        this.cantAvion=cantAvion;
        this.cantTripu=cantTripu;
    }




    //GETTERS Y SETTERS

    public int getCantAvion() {
        return cantAvion;
    }

    public void setCantAvion(int cantAvion) {
        this.cantAvion = cantAvion;
    }

    public int getCantTripu() {
        return cantTripu;
    }

    public void setCantTripu(int cantTripu) {
        this.cantTripu = cantTripu;
    }

    @Override
    public void msgeSocorro() {

        System.out.println("El msge de socorro ha sido activado en el Barco porta avion");

    }

    @Override
    public void alarma() {

        System.out.println("La alarma ha sido activada en el Barco porta avion");

    }
}
