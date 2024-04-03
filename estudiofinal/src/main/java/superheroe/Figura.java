
package superheroe;

import dimension.Dimensiones;


public class Figura {
    String codigo;
    double price;
    Dimensiones dimensiones;
    SuperHeroe superheroe; 
    
    
    public Figura(){
        this.codigo=codigo;
        this.price=price;
        this.dimensiones=dimensiones;
        this.superheroe=superheroe; 
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrice() {
        return price;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public SuperHeroe getSuperheroe() {
        return superheroe;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setSuperheroe(SuperHeroe superheroe) {
        this.superheroe = superheroe;
    }

    @Override
    public String toString() {
        return "Figura{" + "codigo=" + codigo + ", price=" + price + ", dimensiones=" + dimensiones + ", superheroe=" + superheroe + '}';
    }
    
    public void subirPrecio(double cantidad){
        this.price=this.price+cantidad; 
        
    }
    
}
