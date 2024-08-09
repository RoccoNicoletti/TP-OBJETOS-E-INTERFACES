public class Revistas extends Biblioteca{

      private int numero;





     public Revistas(){ ///CONSTRUCTORES

     }

     public Revistas(int codigo, String titulo, int anioPubli, int numero){

         super(codigo, titulo, anioPubli);

         this.numero=numero;

     }

    @Override
    public String toString() {
        return "Revistas{" +
                "numero= " + numero +
                ", codigo= " + this.getCodigo() +
                ", titulo=' " + this.getTitulo() + '\'' +
                ", anioPublicacion= " + getAnioPublicacion()+'}';
    }


    public int devolverAnio(){

        return this.getAnioPublicacion();
    }

    public int devolverCodigo(){

        return this.getCodigo();
    }


    ///GETTERS Y SETTERS

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
