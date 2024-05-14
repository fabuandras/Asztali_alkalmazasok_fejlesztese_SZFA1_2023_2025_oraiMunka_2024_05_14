package letresemjon;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Haromszog {
    private int a, b, c;

    public Haromszog(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        try {
            szerkesztheto();
        } catch (Exception e) {
            System.err.println("Nem szerkeszthető a háromszög!");
        }
    }

    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
        try {
            szerkesztheto();
        } catch (Exception ex) {
            System.err.println("Nem szerkeszthető a háromszög!");
            //Logger.getLogger(Haromszog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getB() {
        return b;
    }
    
    public void setB(int b) {
        this.b = b;
        try {
            szerkesztheto();
        } catch (Exception ex) {
            System.err.println("Nem szerkeszthető a háromszög!");
            //Logger.getLogger(Haromszog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getC() {
        return c;
    }
    
    public void setC(int c) {
        this.c = c;
        try {
            szerkesztheto();
        } catch (Exception ex) {
            System.err.println("Nem szerkeszthető a háromszög!");
            //Logger.getLogger(Haromszog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String oldalakAdatai() {
        return "a=" + a + ", b=" + b + ", c=" + c;
    }
    
    private void szerkesztheto() throws Exception{
        if (!(a+b > c && a+c > b && b+c > a)){
            throw new Exception();
        }
    }
    
    private double kerulet() {
        return a+b+c;
    }
}
