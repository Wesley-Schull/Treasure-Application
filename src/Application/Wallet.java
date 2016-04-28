package Application;

public class Wallet {
    public int gold;
    public int silver;
    public int copper;

    public Wallet(int g, int s, int c){
        this.gold = g;
        this.silver = s;
        this.copper = c;
    }
    public Wallet simplifyWallet(){
        this.gold += this.copper/100;
        this.copper %= 100;
        this.silver += this.copper/10;
        this.copper %= 10;
        return this;
    }
    public String toString(){
        return this.gold + "gp " + this.silver + "sp " + this.copper + "cp";
    }
}
