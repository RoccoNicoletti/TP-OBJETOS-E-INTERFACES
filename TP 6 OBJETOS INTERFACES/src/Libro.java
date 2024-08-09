public class Libro extends Biblioteca implements Devoluciones {

    private boolean prestar;


    public Libro(){//CONSTRUCTORES

    }

    public Libro(int codigo, String titulo, int anioPublicacion){

        super(codigo, titulo, anioPublicacion);

        this.prestar=false;


    }
 @Override
    public String toString() {
        return "Libro{" +
                "estado de prestacion (V O F)= " + this.isPrestar() +
                ", codigo= " + this.getCodigo() +
                ", titulo=' " + this.getTitulo() + '\'' +
                ", anioPublicacion= " + getAnioPublicacion() +'}';
    }


    public int devolverAnio(){

        return this.getAnioPublicacion();
    }

    public int devolverCodigo(){

        return this.getCodigo();
    }


    @Override
    public void prestar() {

        if(prestar==false){

            prestar=true;
        }
        else {
            System.out.println("Lo siento, este libro ya fue prestado");
        }


    }

    @Override
    public void devolver() {

        if(prestar==true) {
            prestar = false;

        }
        else{

            System.out.println("El libro que intentas devolver no fue prestado");
        }
    }

    ///GETTERS Y SETTERS

    public boolean isPrestar() {
        return prestar;
    }

    public void setPrestar(boolean prestar) {
        this.prestar = prestar;
    }
}
