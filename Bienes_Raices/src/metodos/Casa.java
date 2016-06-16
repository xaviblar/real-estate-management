/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Luis
 */
public class Casa extends Propiedades{
    private int Niveles,EspaciosCochera,AnoConstruccion;
    private String EstiloConstruccion,Color;
    public Casa siguient,primer;

    Casa(){}
    public Casa(Casa siguient,Casa primer,String EstiloConstruccion, int Niveles, String Color, int EspaciosCochera, int AnoConstruccion, int NumeroFinca, int AreaTerreno, int ValorFiscal,String Direccion, String tipo,String foto,Propiedades siguiente, Propiedades primero) 
    {
        super(NumeroFinca, AreaTerreno, ValorFiscal,Direccion,tipo,foto,siguiente,primero);
        this.EstiloConstruccion = EstiloConstruccion;
        this.Niveles = Niveles;
        this.Color = Color;
        this.EspaciosCochera = EspaciosCochera;
        this.AnoConstruccion = AnoConstruccion;
        this.siguiente=siguiente;
        this.primer=primer;
    }

    public Casa getSiguient() {
        return siguient;
    }

    public void setSiguient(Casa siguient) {
        this.siguient = siguient;
    }

    public Casa getPrimer() {
        return primer;
    }

    public void setPrimer(Casa primer) {
        this.primer = primer;
    }


    public int getNiveles() {
        return Niveles;
    }

    public void setNiveles(int Niveles) {
        this.Niveles = Niveles;
    }

    public int getEspaciosCochera() {
        return EspaciosCochera;
    }

    public void setEspaciosCochera(int EspaciosCochera) {
        this.EspaciosCochera = EspaciosCochera;
    }

    public int getAnoConstruccion() {
        return AnoConstruccion;
    }

    public void setAnoConstruccion(int AnoConstruccion) {
        this.AnoConstruccion = AnoConstruccion;
    }

    public String getEstiloConstruccion() {
        return EstiloConstruccion;
    }

    public void setEstiloConstruccion(String EstiloConstruccion) {
        this.EstiloConstruccion = EstiloConstruccion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
     //***************************************************InsertarCA*************************************************
    
    public Casa InsertarCA(String EstiloConstruccion, int Niveles, String Color, int EspaciosCochera, int AnoConstruccion, int NumeroFinca, int AreaTerreno, int ValorFiscal, String Direccion, String tipo,String foto){       
      Casa nca = new Casa(null,null,EstiloConstruccion,Niveles,Color,EspaciosCochera,AnoConstruccion,NumeroFinca,AreaTerreno,ValorFiscal,Direccion,tipo,foto,null,null);
        if (primer==null){ 
          this.primer=nca;
                    
          }
      else{
          Casa aux =primer;
          nca.siguient=aux;
          this.primer=nca;
      }
      //System.out.println(na.toString()+na.getAreaTerreno()+"area");
      return nca;
      
    }    
    
    //***************************************************BuscarCA*************************************************

    public Casa BuscarCA(int ID){
        Casa buscar = primer;
        if (buscar==null) {
            return null;
        }
        if (buscar.getNumeroFinca()==ID){ 
            return buscar;}
        else{
            Casa temp=primer;
            while (temp.siguient!=null){
                if (temp.siguient.getNumeroFinca()==ID) {
                    return temp.siguient;}
                temp=temp.siguient;}
            return null;
        }
    }
    //***************************************************BorrarCA*************************************************    
     
    public Casa BorrarCA(int ID){
        Casa borrar = BuscarCA(ID);
        if (borrar == primer){
        primer=borrar.siguient;
        System.out.println("gg");
        }
        else{
            Casa temp = primer;
            while(temp.siguient!=borrar){
            temp=temp.siguient;}
            temp.siguient=temp.siguient.siguient;
        System.out.println("gg");    
        }
        
        System.out.print("borrado");
        return null;
        
    }

    @Override
    public String toString() {
        return "Casa{"  + ", Niveles=" + Niveles + ", EspaciosCochera=" + EspaciosCochera + ", AnoConstruccion=" + AnoConstruccion + ", EstiloConstruccion=" + EstiloConstruccion + ", Color=" + Color + '}';
    }

    
}
