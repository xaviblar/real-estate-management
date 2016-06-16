/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

    
    //***************************************************InsertarC*************************************************
    
/**
 *
 * @author Luis
 */
public class Cliente {
 
    private String ID,num_tel,nombre,email,estado_civ,tipo;    
    public Cliente primero,sig;
    
    public Cliente(){}

    public Cliente(String ID,String num_tel,String nombre, String email, String estado_civ,String tipo, Cliente primero, Cliente sig) {
        this.ID = ID;
        this.num_tel = num_tel;
        this.nombre = nombre;
        this.email = email;
        this.estado_civ = estado_civ;
        this.tipo = tipo;
        this.primero = primero;
        this.sig = sig;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado_civ() {
        return estado_civ;
    }

    public void setEstado_civ(String estado_civ) {
        this.estado_civ = estado_civ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getPrimero() {
        return primero;
    }

    public void setPrimero(Cliente primero) {
        this.primero = primero;
    }

    public Cliente getSig() {
        return sig;
    }

    public void setSig(Cliente sig) {
        this.sig = sig;
    }
  
    
//****************************************************InsertarC*************************************************
    public Cliente InsertarC(String ID,String num_tel,String nombre, String email, String estado_civ,String tipo){ 
      Cliente nc = new Cliente(ID,num_tel,nombre,email,estado_civ,tipo,null,null);
      if (primero==null){ 
          this.primero=nc;
                    
          }
      else{
          Cliente aux =primero;
          nc.sig=aux;
          this.primero=nc;
      }
      //System.out.println(nc.toString());
      return nc;
      
    }     
    
    
    //***************************************************BuscarC*************************************************

    public Cliente BuscarC(String nom){
        Cliente buscar = primero;
        if (buscar==null) {
            return null;
        }
        if (buscar.getNombre().equals(nom)){ 
            return buscar;}
        else{
            Cliente temp=primero;
            while (temp.sig!=null){
                if (temp.sig.getNombre().equals(nom)) {
                    return temp.sig;}
                temp=temp.sig;}
            return null;
        }
    }
    
  //***************************************************BorrarC*************************************************    
     
    public Cliente BorrarC(String nom){
        Cliente borrar = BuscarC(nom);
        if (borrar == primero){
        primero=borrar.sig;
        }
        else{
            Cliente temp = primero;
            while(temp.sig!=borrar){
            temp=temp.sig;}
            temp.sig=temp.sig.sig;
            
        }
        
        System.out.print("delete");
        return null;
        
    }

    @Override
    public String toString() {
        return "ID=" + ID +"\n"+ "numero de telefono=" + num_tel +"\n"+ "nombre=" + nombre +"\n"+ "email=" + email +"\n"+"estado civil=" + estado_civ +"\n"+ "tipo=" + tipo;
    }
    
}
