/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Luis
 */
public class Propiedades {
    
    protected int NumeroFinca,AreaTerreno,ValorFiscal;
    protected String Direccion,tipo,foto;
    public Propiedades siguiente, primero;

    Propiedades(){}
    
    public Propiedades(int NumeroFinca, int AreaTerreno, int ValorFiscal, String Direccion, String tipo,String foto,Propiedades siguiente, Propiedades primero) {
        this.NumeroFinca = NumeroFinca;
        this.AreaTerreno = AreaTerreno;
        this.ValorFiscal = ValorFiscal;
        this.foto=foto;
        this.Direccion = Direccion;
        this.tipo=tipo;
        this.primero = primero;
        this.siguiente = siguiente;
    }

    public int getNumeroFinca() {
        return NumeroFinca;
    }

    public void setNumeroFinca(int NumeroFinca) {
        this.NumeroFinca = NumeroFinca;
    }

    public int getAreaTerreno() {
        return AreaTerreno;
    }

    public void setAreaTerreno(int AreaTerreno) {
        this.AreaTerreno = AreaTerreno;
    }

    public int getValorFiscal() {
        return ValorFiscal;
    }

    public void setValorFiscal(int ValorFiscal) {
        this.ValorFiscal = ValorFiscal;
    }


    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Propiedades getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Propiedades siguiente) {
        this.siguiente = siguiente;
    }

    public Propiedades getPrimero() {
        return primero;
    }

    public void setPrimero(Propiedades primero) {
        this.primero = primero;
    }

    //***************************************************InsertarA*************************************************
    
    public Propiedades InsertarA(Propiedades na){       
      if (primero==null){ 
          this.primero=na;
                    
          }
      else{
          Propiedades aux =primero;
          na.siguiente=aux;
          this.primero=na;
      }
      //System.out.println(na.getAreaTerreno()+"area");
      return na;
      
    }    
    
    //***************************************************BuscarA*************************************************

    public Propiedades BuscarA(int ID){
        Propiedades buscar = primero;
        if (buscar==null) {
            return null;
        }
        if (buscar.getNumeroFinca()==ID){ 
            return buscar;}
        else{
            Propiedades temp=primero;
            while (temp.siguiente!=null){
                if (temp.siguiente.getNumeroFinca()==ID) {
                    return temp.siguiente;}
                temp=temp.siguiente;}
            return null;
        }
    }
    //***************************************************BorrarA*************************************************    
     
    public Propiedades BorrarA(int ID){
        Propiedades borrar = BuscarA(ID);
        if (borrar == primero){
        primero=borrar.siguiente;
        //System.out.println("gg");
        }
        else{
            Propiedades temp = primero;
            while(temp.siguiente!=borrar){
            temp=temp.siguiente;}
            temp.siguiente=temp.siguiente.siguiente;
        //System.out.println("gg");    
        }
        
        //System.out.print("borrado");
        return null;
        
    }

    @Override
    public String toString() {
        return "NumeroFinca=" + NumeroFinca +"\n"+ "AreaTerreno=" + AreaTerreno +"\n"+ "ValorFiscal=" + ValorFiscal +"\n"+ "Direccion=" + Direccion +"\n"+ "tipo=" + tipo;
    }

 
    
}
