/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Luis
 */
public class Mantenimiento {
    public Mantenimiento siguiente,primero;
    private ListaVentaAlquiler propiedad;
    private String magnitud,tipo,Responsable,fecha;
    int inversion=0;
    
    Mantenimiento (){}

    public Mantenimiento(Mantenimiento siguiente, Mantenimiento primero, ListaVentaAlquiler propiedad, String tipo, String Responsable, String fecha, int inversion,String magnitud) {
        this.siguiente = siguiente;
        this.primero = primero;
        this.propiedad = propiedad;
        this.tipo = tipo;
        this.Responsable = Responsable;
        this.fecha = fecha;
        this.inversion = inversion;
        this.magnitud=magnitud;
    }

    public Mantenimiento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Mantenimiento siguiente) {
        this.siguiente = siguiente;
    }

    public Mantenimiento getPrimero() {
        return primero;
    }

    public void setPrimero(Mantenimiento primero) {
        this.primero = primero;
    }

    public ListaVentaAlquiler getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(ListaVentaAlquiler propiedad) {
        this.propiedad = propiedad;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getInversion() {
        return inversion;
    }

    public void setInversion(int inversion) {
        this.inversion = inversion;
    }
    
    
    //***************************************************InsertarMA*************************************************
    // cliente, monto, fecha, 
    public Mantenimiento InsertarMA(ListaVentaAlquiler propiedad, String tipo, String Responsable, String fecha, int inversion,String magnitud){  
      Mantenimiento na=new Mantenimiento(null,null,propiedad,tipo,Responsable,fecha,inversion,magnitud);
        if (primero==null){ 
          this.primero=na;
          System.out.println(primero.getPropiedad().getCliente()+" -cliente- "+primero.getPropiedad().getPropiedad().getNumeroFinca()+" -propiedad- ");
                    
          }
      else{
          Mantenimiento aux =primero;
          na.siguiente=aux;
          this.primero=na;
          System.out.println(na.toString());
      }
      //System.out.println(na.getAreaTerreno()+"area");
      return na;
      
    }  
        
    //***************************************************BuscarMA*************************************************

    public Mantenimiento BuscarMA(int ID){
        Mantenimiento buscar = primero;
        if (buscar==null) {
            return null;
        }
        if (buscar.getPropiedad().getPropiedad().getNumeroFinca()==ID){ 
            return buscar;}
        else{
            Mantenimiento temp=primero;
            while (temp.siguiente!=null){
                if (temp.siguiente.getPropiedad().getPropiedad().getNumeroFinca()==ID) {
                    return temp.siguiente;}
                temp=temp.siguiente;}
            return null;
        }
    }

    @Override
    public String toString() {
        return "Tipo de propiedad=" + propiedad.getPropiedad().getTipo()+"\n"+"Area del Terreno=  "+propiedad.getPropiedad().getAreaTerreno()+"\n"+"Valor Fiscal=  "+propiedad.getPropiedad().getValorFiscal()+"\n"+" magnitud=" + magnitud +"\n"+ "tipo=" + tipo +"\n"+ "Responsable=" + Responsable +"\n"+ "fecha=" + fecha +"\n"+ "inversion=" + inversion;
    }
    
}
