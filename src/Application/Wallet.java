package Application;

public class Wallet {
    public int gold;
    public int silver;
    public int copper;

    public Wallet(int gold, int silver, int copper){
        this.gold = gold;
        this.silver = silver;
        this.copper = copper;
    }
    public Wallet simplifyWallet(){
        this.gold += this.copper/100;
        this.copper %= 100;
        this.silver += this.copper/10;
        this.copper %= 10;
        this.gold += this.silver/10;
        this.silver %= 10;
        return this;
    }
    public void updateGold(int gold){
        this.gold = gold;
    }
    public String toString(){
        return this.gold + "gp " + this.silver + "sp " + this.copper + "cp";
    }
}
