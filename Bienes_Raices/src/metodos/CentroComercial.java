/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Luis
 */
public class CentroComercial extends Propiedades{
    private int TelefonosPublicos;
    private int Tiendas;
    private int SalasCine;
    private String CadenaCines;
    private int Hotspots;
    private int EscalerasElectricas;
    private int CantidadParqueo;
    public CentroComercial siguient,primer;
    
    CentroComercial(){}

    public CentroComercial(CentroComercial siguient, CentroComercial primer, int TelefonosPublicos, int Tiendas, int SalasCine, String CadenaCines, int Hotspots, int EscalerasElectricas, int CantidadParqueo, int NumeroFinca, int AreaTerreno, int ValorFiscal,String Direccion,String tipo,String foto,Propiedades siguiente, Propiedades primero) {
        super(NumeroFinca, AreaTerreno, ValorFiscal, Direccion,tipo,foto,siguiente,primero);
        this.TelefonosPublicos = TelefonosPublicos;
        this.Tiendas = Tiendas;
        this.SalasCine = SalasCine;
        this.CadenaCines = CadenaCines;
        this.Hotspots = Hotspots;
        this.EscalerasElectricas = EscalerasElectricas;
        this.CantidadParqueo = CantidadParqueo;
        this.siguient=siguient;
        this.primer=primer;
    }    

    public int getTelefonosPublicos() {
        return TelefonosPublicos;
    }

    public void setTelefonosPublicos(int TelefonosPublicos) {
        this.TelefonosPublicos = TelefonosPublicos;
    }

    public int getTiendas() {
        return Tiendas;
    }

    public void setTiendas(int Tiendas) {
        this.Tiendas = Tiendas;
    }

    public int getSalasCine() {
        return SalasCine;
    }

    public void setSalasCine(int SalasCine) {
        this.SalasCine = SalasCine;
    }

    public String getCadenaCines() {
        return CadenaCines;
    }

    public void setCadenaCines(String CadenaCines) {
        this.CadenaCines = CadenaCines;
    }

    public int getHotspots() {
        return Hotspots;
    }

    public void setHotspots(int Hotspots) {
        this.Hotspots = Hotspots;
    }

    public int getEscalerasElectricas() {
        return EscalerasElectricas;
    }

    public void setEscalerasElectricas(int EscalerasElectricas) {
        this.EscalerasElectricas = EscalerasElectricas;
    }

    public int getCantidadParqueo() {
        return CantidadParqueo;
    }

    public void setCantidadParqueo(int CantidadParqueo) {
        this.CantidadParqueo = CantidadParqueo;
    }

    public CentroComercial getSiguient() {
        return siguient;
    }

    public void setSiguient(CentroComercial siguient) {
        this.siguient = siguient;
    }

    public CentroComercial getPrimer() {
        return primer;
    }

    public void setPrimer(CentroComercial primer) {
        this.primer = primer;
    }
    
     //***************************************************InsertarCC*************************************************
    
    public CentroComercial InsertarCC(int TelefonosPublicos, int Tiendas, int SalasCine, String CadenaCines, int Hotspots, int EscalerasElectricas, int CantidadParqueo, int NumeroFinca, int AreaTerreno, int ValorFiscal,String Direccion,String tipo,String foto){       
      CentroComercial nca = new CentroComercial(null,null,TelefonosPublicos,Tiendas,SalasCine,CadenaCines,Hotspots,EscalerasElectricas,CantidadParqueo,NumeroFinca,AreaTerreno,ValorFiscal,Direccion,tipo,foto,null,null);
        if (primer==null){ 
          this.primer=nca;
                    
          }
      else{
          CentroComercial aux =primer;
          nca.siguient=aux;
          this.primer=nca;
      }
      //System.out.println(na.toString()+na.getAreaTerreno()+"area");
      return nca;
      
    }    
    
    //***************************************************BuscarCC*************************************************

    public CentroComercial BuscarCC(int ID){
        CentroComercial buscar = primer;
        if (buscar==null) {
            return null;
        }
        if (buscar.getNumeroFinca()==ID){ 
            return buscar;}
        else{
            CentroComercial temp=primer;
            while (temp.siguient!=null){
                if (temp.siguient.getNumeroFinca()==ID) {
                    return temp.siguient;}
                temp=temp.siguient;}
            return null;
        }
    }
    //***************************************************BorrarCC*************************************************    
     
    public CentroComercial BorrarCC(int ID){
        CentroComercial borrar = BuscarCC(ID);
        if (borrar == primer){
        primer=borrar.siguient;
        System.out.println("gg");
        }
        else{
            CentroComercial temp = primer;
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
        return "CentroComercial{" + "TelefonosPublicos=" + TelefonosPublicos + ", Tiendas=" + Tiendas + ", SalasCine=" + SalasCine + ", CadenaCines=" + CadenaCines + ", Hotspots=" + Hotspots + ", EscalerasElectricas=" + EscalerasElectricas + ", CantidadParqueo=" + CantidadParqueo + '}';
    }
    
}
