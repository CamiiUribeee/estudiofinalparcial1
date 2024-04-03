
package coleccion;

import java.util.ArrayList;
import superheroe.Figura;


public class Coleccion {
    String nombreColeccion;
    ArrayList<Figura> listadefiguras; 
    
    
    public Coleccion(String nombreColeccion){
        this.nombreColeccion=nombreColeccion;
        this.listadefiguras=new ArrayList<Figura>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public ArrayList<Figura> getListadefiguras() {
        return listadefiguras;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void setListadefiguras(ArrayList<Figura> listadefiguras) {
        this.listadefiguras = listadefiguras;
    }
    
    
    public void añadirFigura(Figura fig){
        listadefiguras.add(fig);
    }
    
    public void subirPrecio(double cantidad, String id){
        for(Figura figura : this.listadefiguras){
            figura.subirPrecio(cantidad);

        }
    }

    @Override
    public String toString() {
        String cadena2=""; 
        for (Figura figura : this.listadefiguras){
            cadena2=cadena2+figura.toString(); 
        }
        return "Coleccion{" +  cadena2 + '}';
    }
    
    public void conCapa(){
        String cadena="";
        for(Figura figura: this.listadefiguras){
            if(figura.getSuperheroe().isCapa()==true){
                cadena=cadena+figura.toString(); 
            }
        }
    }
    
    
    
}
