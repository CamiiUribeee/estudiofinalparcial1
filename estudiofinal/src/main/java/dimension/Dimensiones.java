
package dimension;


public class Dimensiones {
    double alto;
    double ancho;
    double profundidad;
    
    public Dimensiones(){
        this.alto=0;
        this.ancho=0;
        this.profundidad=0; 
    }
    public Dimensiones(double alto, double ancho, double profundidad){
        this.alto=alto;
        this.ancho=ancho;
        this.profundidad=profundidad; 
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    public double getVolumen(){
        return (alto*ancho*profundidad);
    }

    @Override
    public String toString() {
        return "Dimensiones{" + "alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad +", volumen total=" + getVolumen()+ '}';
    }
    
    
    
}
