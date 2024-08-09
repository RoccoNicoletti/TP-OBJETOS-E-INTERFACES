public class Numero implements Relaciones {

    private int num;








    ///CONSTRUCTORES
    public Numero (){

    }

    public Numero(int num) {
        this.num = num;
    }



    ///GETTERS Y SETTERS
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean esMayor(Object b) {

        Numero numero2=(Numero) b;

        return this.num>numero2.getNum();

    }

    @Override
    public boolean esMenor(Object b) {

        Numero numero2=(Numero) b;

        return this.num<numero2.getNum();

    }

    @Override
    public boolean esIgual(Object b) {

        Numero numero2=(Numero) b;

        return this.num==numero2.getNum();
    }
}
