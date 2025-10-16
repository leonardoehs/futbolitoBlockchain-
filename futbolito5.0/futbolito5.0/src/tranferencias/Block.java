package tranferencias;

/**
 *
 * @author carlos
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
//clase padr y hijo sera ytransaccciones 

public class Block implements Serializable
{
    private int id;
    private int nonce;
    private long timeStamp;
    private String hash; // según Nakamoto (2008) es el Root Hash
    private String previousHash;
    private ArrayList<Transferencia> aTransactions;
 

    public Block(int pId, String pPrevHash) {
        this.id = pId;
        this.timeStamp = new Date().getTime();
        this.previousHash=pPrevHash;
        this.aTransactions= new ArrayList<>();
        this.nonce=-1;
        this.hash=null;
    }
    
    public Block() {
        this.timeStamp = new Date().getTime();
        this.aTransactions= new ArrayList<>();
        this.nonce=-1;
        this.hash=null;
        this.id = -1;
    }
   
    public boolean register(int pNonce, String pHash)
    {
        if ((this.id>-1)&&(this.nonce<0)&&(this.hash==null))
        {
            this.nonce=pNonce;
            this.hash=pHash;           
            return true;
        }
        else return false;
    }
    
    public void setTransaction(String pJugador,String pPosicion,double pSalario,int pDorsal)
    {
        this.aTransactions.add(new Transferencia(this.aTransactions.size(),pJugador,pPosicion,pDorsal,pSalario));
    }
    
    
    public void setTransaction(Transferencia pTran)
    {
        this.aTransactions.add(new Transferencia(
                this.aTransactions.size(),pTran.getJugador(),pTran.getPosicion(),pTran.getDorsal(),pTran.getSalario()
        ));
    }
    
    public Transferencia getTransaction(int pId)
    {
        return this.aTransactions.get(pId);
    }
    
    public int countTransactions()
    {
        return this.aTransactions.size();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nonce
     */
    public int getNonce() {
        return nonce;
    }

    /**
     * @return the timeStamp
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * @return the previousHash
     */
    public String getPreviousHash() {
        return previousHash;
    }

    @Override
    public String toString() {
        String sCad= Integer.toString(id)+ Long.toString(timeStamp) 
                + this.previousHash ;
        for(int i=0; i<this.aTransactions.size(); i++)
        {
            sCad= sCad + this.aTransactions.get(i).toString();
        }
        return sCad;
    }
}