public  class ArrayReales implements Estadisticas {

    private double arreglo[];


    @Override
    public double minimo() {


        double menor = arreglo[0];

        for(int i=0; i<arreglo.length;i++){

            if(arreglo[i]<menor){

                menor=arreglo[i];
            }
        }

return menor;
    }

    @Override
    public double maximo() {



        double mayor=arreglo[0];

        for(int i=0; i< arreglo.length;i++){


            if(mayor<arreglo[i]){

                mayor=arreglo[i];
            }
        }

        return mayor;
    }

    @Override
    public double sumatoria() {

        double suma=0;
        for(int i=0; i<arreglo.length; i++){

            suma=suma+arreglo[i];

        }

      return suma;
    }

    public ArrayReales(double[] arreglo) {///CONSTRUCTORES
        this.arreglo = arreglo;
    }

    public ArrayReales(){


    }
    ///GETTERS Y SETTERS
    public double[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(double[] arreglo) {
        this.arreglo = arreglo;
    }
}
