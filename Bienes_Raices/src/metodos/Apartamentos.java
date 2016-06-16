/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Luis
 */
public class Apartamentos extends Propiedades {
    private int Altura;
    private int Niveles;
    private int ResidenciasPorNivel;
    private String TipoNivel;
    private int AreaZonasComunes;
    private String Piscina;
    private String Rancho;
    public Apartamentos siguient,primer;
    
    Apartamentos(){}

    public Apartamentos(Apartamentos siguient, Apartamentos primer, int Altura, int Niveles, int ResidenciasPorNivel, String TipoNivel, int AreaZonasComunes,String piscina, String Rancho, int NumeroFinca, int AreaTerreno, int ValorFiscal,String Direccion,String tipo,String foto,Propiedades siguiente,Propiedades primero) {
        super(NumeroFinca, AreaTerreno, ValorFiscal,Direccion,tipo,foto,siguiente,primero);
        this.Altura = Altura;
        this.Niveles = Niveles;
        this.ResidenciasPorNivel = ResidenciasPorNivel;
        this.TipoNivel = TipoNivel;
        this.AreaZonasComunes = AreaZonasComunes;
        this.Piscina = Piscina;
        this.Rancho = Rancho;
        this.siguient=siguient;
        this.primer=primer;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getNiveles() {
        return Niveles;
    }

    public void setNiveles(int Niveles) {
        this.Niveles = Niveles;
    }

    public int getResidenciasPorNivel() {
        return ResidenciasPorNivel;
    }

    public void setResidenciasPorNivel(int ResidenciasPorNivel) {
        this.ResidenciasPorNivel = ResidenciasPorNivel;
    }

    public String getTipoNivel() {
        return TipoNivel;
    }

    public void setTipoNivel(String TipoNivel) {
        this.TipoNivel = TipoNivel;
    }

    public int getAreaZonasComunes() {
        return AreaZonasComunes;
    }

    public void setAreaZonasComunes(int AreaZonasComunes) {
        this.AreaZonasComunes = AreaZonasComunes;
    }

    public String isPiscina() {
        return Piscina;
    }

    public void setPiscina(String Piscina) {
        this.Piscina = Piscina;
    }

    public String isRancho() {
        return Rancho;
    }

    public void setRancho(String Rancho) {
        this.Rancho = Rancho;
    }

    public Apartamentos getSiguient() {
        return siguient;
    }

    public void setSiguient(Apartamentos siguient) {
        this.siguient = siguient;
    }

    public Apartamentos getPrimer() {
        return primer;
    }

    public void setPrimer(Apartamentos primer) {
        this.primer = primer;
    }
    //***************************************************InsertarAP*************************************************
    
    public Apartamentos InsertarAP(int Altura, int Niveles, int ResidenciasPorNivel, String TipoNivel, int AreaZonasComunes, String Piscina, String Rancho, int NumeroFinca, int AreaTerreno, int ValorFiscal,String Direccion,String tipo,String foto){       
      Apartamentos na = new Apartamentos(null,null,Altura,Niveles,ResidenciasPorNivel,TipoNivel,AreaZonasComunes,Piscina,Rancho,NumeroFinca,AreaTerreno,ValorFiscal,Direccion,tipo,foto,null,null);
        if (primer==null){ 
          this.primer=na;
                    
          }
      else{
          Apartamentos aux =primer;
          na.siguient=aux;
          this.primer=na;
      }
      //System.out.println(na.toString()+na.getAreaTerreno()+"area");
      return na;
      
    }    
    
    //***************************************************BuscarAP*************************************************

    public Apartamentos BuscarAP(int ID){
        Apartamentos buscar = primer;
        if (buscar==null) {
            return null;
        }
        if (buscar.getNumeroFinca()==ID){ 
            return buscar;}
        else{
            Apartamentos temp=primer;
            while (temp.siguient!=null){
                if (temp.siguient.getNumeroFinca()==ID) {
                    return temp.siguient;}
                temp=temp.siguient;}
            return null;
        }
    }
    //***************************************************BorrarAP*************************************************    
     
    public Apartamentos BorrarAP(int ID){
        Apartamentos borrar = BuscarAP(ID);
        if (borrar == primer){
        primer=borrar.siguient;
        System.out.println("gg");
        }
        else{
            Apartamentos temp = primer;
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
        return "Apartamentos{" +"Apartamento"+ "Altura=" + Altura + ", Niveles=" + Niveles + ", ResidenciasPorNivel=" + ResidenciasPorNivel + ", TipoNivel=" + TipoNivel + ", AreaZonasComunes=" + AreaZonasComunes + ", Piscina=" + Piscina + ", Rancho=" + Rancho + '}';
    }
    
}
