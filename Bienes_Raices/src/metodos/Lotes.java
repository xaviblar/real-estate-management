/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Luis
 */
public class Lotes extends Propiedades{

    public Lotes siguient,primer;
    
    Lotes(){}
    
    public Lotes(Lotes siguient, Lotes primer,int NumeroFinca, int AreaTerreno, int ValorFiscal,String Direccion,String tipo,String foto,Propiedades siguiente, Propiedades primero) 
       {
        super(NumeroFinca, AreaTerreno, ValorFiscal,Direccion,tipo,foto,siguiente,primero);
        this.siguient=siguient;
        this.primer=primer;
    }

    public Lotes getSiguient() {
        return siguient;
    }

    public void setSiguient(Lotes siguient) {
        this.siguient = siguient;
    }

    public Lotes getPrimer() {
        return primer;
    }

    public void setPrimer(Lotes primer) {
        this.primer = primer;
    }
    
    //***************************************************InsertarL*************************************************
    
    public Lotes InsertarL(int NumeroFinca, int AreaTerreno, int ValorFiscal,String Direccion,String tipo,String foto){       
      Lotes nl = new Lotes(null,null,NumeroFinca,AreaTerreno,ValorFiscal,Direccion,tipo,foto,null,null);
        if (primer==null){ 
          this.primer=nl;
                    
          }
      else{
          Lotes aux =primer;
          nl.siguient=aux;
          this.primer=nl;
      }
      //System.out.println(na.toString()+na.getAreaTerreno()+"area");
      return nl;
      
    }    
    
    //***************************************************BuscarL*************************************************

    public Lotes BuscarL(int ID){
        Lotes buscar = primer;
        if (buscar==null) {
            return null;
        }
        if (buscar.getNumeroFinca()==ID){ 
            return buscar;}
        else{
            Lotes temp=primer;
            while (temp.siguient!=null){
                if (temp.siguient.getNumeroFinca()==ID) {
                    return temp.siguient;}
                temp=temp.siguient;}
            return null;
        }
    }
    //***************************************************BorrarL*************************************************    
     
    public Lotes BorrarL(int ID){
        Lotes borrar = BuscarL(ID);
        if (borrar == primer){
        primer=borrar.siguient;
        System.out.println("gg");
        }
        else{
            Lotes temp = primer;
            while(temp.siguient!=borrar){
            temp=temp.siguient;}
            temp.siguient=temp.siguient.siguient;
        System.out.println("gg");    
        }
        
        System.out.print("borrado");
        return null;
        
    }
}
