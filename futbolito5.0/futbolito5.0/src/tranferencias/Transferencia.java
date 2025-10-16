package tranferencias;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/*
 * @author hsandoval
 */
public class Transferencia implements Serializable
{
    private int id;
    private int codigo;
    private String equipoEnvia;
    private String equipoRecibe;
    private String jugador;
    private Date fechaHora;
    private long timeStamp;
    private String posicion;
    private int dorsal;
    private double salario;
    public ArrayList<Transferencia> aTran;
    //public ArrayList<Transferencia> hijo;
    
    public Transferencia()
    {
        this.aTran= new ArrayList<>();
    }


    public double getSalario() {
        return salario;
    }
        /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the equipoEnvia
     */
    public String getEquipoEnvia() {
        return equipoEnvia;
    }

    /**
     * @param equipoEnvia the equipoEnvia to set
     */
    public void setEquipoEnvia(String equipoEnvia) {
        this.equipoEnvia = equipoEnvia;
    }

    /**
     * @return the equipoRecibe
     */
    public String getEquipoRecibe() {
        return equipoRecibe;
    }

    /**
     * @param equipoRecibe the equipoRecibe to set
     */
    public void setEquipoRecibe(String equipoRecibe) {
        this.equipoRecibe = equipoRecibe;
    }

    /**
     * @return the jugador
     */
    public String getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    /**
     * @return the fechaHora
     */
    public Date getFechaHora() {
        return fechaHora;
    }

    /**
     * @param fechaHora the fechaHora to set
     */
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * @return the timeStamp
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void Transferencia(int pId, String pJugador, String pPosicion,int pDorsal,Double pSalario)
    {
        Transferencia tranTemp= new Transferencia();
        tranTemp.id=pId;
        tranTemp.jugador=pJugador;
        tranTemp.posicion=pPosicion;
        tranTemp.dorsal=pDorsal;
        this.timeStamp= new Date().getTime();
        tranTemp.salario= pSalario;
        this.aTran.add(tranTemp);
    }
        public Transferencia(int pId, String pJugador, String pPosicion,int pDorsal,  Double pSalario)
    {
        this.id=pId;
        this.jugador=pJugador;
        this.posicion=pPosicion;
        this.dorsal=pDorsal;
        this.timeStamp= new Date().getTime();
        this.salario= pSalario;
    }
          @Override
    public String toString() {
        return Integer.toString(id)+Long.toString(timeStamp)+jugador+posicion+Integer.toString(dorsal)+Double.toString(salario);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    
}
