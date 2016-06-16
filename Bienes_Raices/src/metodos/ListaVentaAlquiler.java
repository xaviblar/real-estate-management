/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Luis
 */
public class ListaVentaAlquiler {
    public ListaVentaAlquiler primero,siguiente;
    private Cliente cliente;
    private String TipoTransaccion;//comprar o alquilar
    private int monto;
    public String fecha;
    private Propiedades propiedad;
 
    ListaVentaAlquiler(){}
    
    public ListaVentaAlquiler(ListaVentaAlquiler siguiente,ListaVentaAlquiler primero,Cliente cliente, String TipoTransaccion,Propiedades propiedad,String fecha,int monto) {
        this.primero = primero;
        this.cliente = cliente;
        this.TipoTransaccion = TipoTransaccion;
        this.siguiente=siguiente;
        this.monto=monto;
        this.propiedad=propiedad;
        this.fecha=fecha;
    }

    public Propiedades getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedades propiedad) {
        this.propiedad = propiedad;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ListaVentaAlquiler getPrimero() {
        return primero;
    }

    public void setPrimero(ListaVentaAlquiler primero) {
        this.primero = primero;
    }
    public ListaVentaAlquiler getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ListaVentaAlquiler primero) {
        this.siguiente = primero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoTransaccion() {
        return TipoTransaccion;
    }

    public void setTipoTransaccion(String TipoTransaccion) {
        this.TipoTransaccion = TipoTransaccion;
    }

    
     //***************************************************InsertarVA*************************************************
    // cliente, monto, fecha, 
    public ListaVentaAlquiler InsertarVA(Cliente cliente,String TipoTransaccion,Propiedades propiedad,String fecha,int monto){  
      ListaVentaAlquiler na=new ListaVentaAlquiler(null,null,cliente,TipoTransaccion,propiedad,fecha,monto);
        if (primero==null){ 
          this.primero=na;
          //System.out.println(primero.toString());
                    
          }
      else{
          ListaVentaAlquiler aux =primero;
          na.siguiente=aux;
          this.primero=na;
          //System.out.println(na.toString());
      }
      //System.out.println(na.getAreaTerreno()+"area");
      return na;
      
    }  
        
    //***************************************************BuscarVA*************************************************

    public ListaVentaAlquiler BuscarVA(int ID){
        ListaVentaAlquiler buscar = primero;
        if (buscar==null) {
            return null;
        }
        if (buscar.getPropiedad().getNumeroFinca()==ID){ 
            return buscar;}
        else{
            ListaVentaAlquiler temp=primero;
            while (temp.siguiente!=null){
                if (temp.siguiente.getPropiedad().getNumeroFinca()==ID) {
                    return temp.siguiente;}
                temp=temp.siguiente;}
            return null;
        }
    }

    @Override
    public String toString() {
        return "ListaVentaAlquiler{" +"cliente=" + cliente + ", TipoTransaccion=" + TipoTransaccion + ", monto=" + monto + ", fecha=" + fecha + ", propiedad=" + propiedad + '}';
    }
       
}
