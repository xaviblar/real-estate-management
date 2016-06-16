/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Luis
 */
public class Pagos {
    private int montoPagado;
    private String fecha,encargado;
    private ListaVentaAlquiler propiedad;
    public Pagos siguiente,primero;
    
    Pagos(){}

    public Pagos(int montoPagado, String fecha, String encargado, ListaVentaAlquiler propiedad, Pagos siguiente, Pagos primero) {
        this.montoPagado = montoPagado;
        this.fecha = fecha;
        this.encargado = encargado;
        this.propiedad = propiedad;
        this.siguiente = siguiente;
        this.primero = primero;
    }

    public int getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(int montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public ListaVentaAlquiler getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(ListaVentaAlquiler propiedad) {
        this.propiedad = propiedad;
    }

    public Pagos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Pagos siguiente) {
        this.siguiente = siguiente;
    }

    public Pagos getPrimero() {
        return primero;
    }

    public void setPrimero(Pagos primero) {
        this.primero = primero;
    }
    
    //***************************************************InsertarPA*************************************************
   
    public Pagos InsertarPA(int montoPagado, String fecha, String encargado, ListaVentaAlquiler propiedad){  
      Pagos na=new Pagos(montoPagado,fecha,encargado,propiedad,null,null);
        if (primero==null){ 
          this.primero=na;
          //System.out.println(primero);
                    
          }
      else{
          Pagos aux =primero;
          na.siguiente=aux;
          this.primero=na;
          System.out.println(na.toString());
      }
      return na;
      
    }  
        
    //***************************************************BuscarPA*************************************************

    public Pagos BuscarPA(int ID){
        Pagos buscar = primero;
        if (buscar==null) {
            return null;
        }
        if (buscar.getPropiedad().getPropiedad().getNumeroFinca()==ID){ 
            return buscar;}
        else{
            Pagos temp=primero;
            while (temp.siguiente!=null){
                if (temp.siguiente.getPropiedad().getPropiedad().getNumeroFinca()==ID) {
                    return temp.siguiente;}
                temp=temp.siguiente;}
            return null;
        }
    }

    @Override
    public String toString() {
        return "montoPagado=" + montoPagado+"\n" + ", fecha=" + fecha +"\n"+ ", encargado=" + encargado;
    }
    
}
