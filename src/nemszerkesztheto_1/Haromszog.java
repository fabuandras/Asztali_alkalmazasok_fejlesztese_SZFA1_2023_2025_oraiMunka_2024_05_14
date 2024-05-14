package nemszerkesztheto_1;

public class Haromszog {
    private boolean szerkesztheto;
    private int a, b, c;

    public Haromszog(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        szerkesztheto();
    }

    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
        szerkesztheto();
    }

    public int getB() {
        return b;
    }
    
    public void setB(int b) {
        this.b = b;
        szerkesztheto();
    }

    public int getC() {
        return c;
    }
    
    public void setC(int c) {
        this.c = c;
        szerkesztheto();
    }

    public String oldalakAdatai() {
        if (szerkesztheto) {
            return "a=" + a + ", b=" + b + ", c=" + c;
        }else {
            return "";
        }
    }
    
    private void szerkesztheto(){
        szerkesztheto = a+b > c && a+c > b && b+c > a;
    }
    
    private double kerulet() {
        if (szerkesztheto) {
            return a+b+c;
        }else {
            return 0;
        }
    }
}
