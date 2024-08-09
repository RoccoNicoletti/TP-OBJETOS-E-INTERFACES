public class BarcoPasaje implements Barcos{

private int CantCamas;

public BarcoPasaje(){///CONSTRUCTORES

}

public BarcoPasaje (int cantCamas){

    this.CantCamas=cantCamas;
}





    @Override
    public void msgeSocorro() {

        System.out.println("El msge de socorro ha sido activado en el Barco de pasaje");

    }

    @Override
    public void alarma() {

        System.out.println("La alarma ha sido activada en el Barco de pasaje");

    }


    ///GETTERS Y SETTERS


    public int getCantCamas() {
        return CantCamas;
    }

    public void setCantCamas(int cantCamas) {
        CantCamas = cantCamas;
    }
}
