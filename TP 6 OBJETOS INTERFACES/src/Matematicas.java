public class Matematicas implements Extremos {

private double arr[];



public Matematicas(){///CONSTRUCTORES

}
    public Matematicas(double[] arr) {
        this.arr = arr;
    }

    @Override
    public double inicio() {

       return arr[0];

    }

    @Override
    public double fin() {

  double ultimoNum=0;

    for (int i=0; i<arr.length;i++){

        ultimoNum=arr[i];
    }

    return ultimoNum;
    }


    ///Getters y setters
    public double[] getArr() {
        return arr;
    }

    public void setArr(double[] arr) {
        this.arr = arr;
    }
}
