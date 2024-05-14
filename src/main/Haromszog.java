package main;

public class Haromszog {
    private int a, b, c;

    public Haromszog(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public int getA() { return a; }

    public void setA(int a) { 
        if(a < 0){
            a = Math.abs(a);
        }else if(a == 0){
            a = 1;
        }
        this.a = a;
    }

    public int getB() { return b; }

    public void setB(int b) { 
        if(b < 0){
            b = Math.abs(b);
        }else if(b == 0){
            b = 1;
        }
        this.b = b;
    }
    
    public int getC() { return c; }

    /**
     * 
     * @param c 
     */
    public void setC(int c) { 
        if(c < 0){
            c = Math.abs(c);
        }else if(c == 0){
            c = 1;
        }
        this.c = c;
    }

    public String oldalakAdatai() {
        return "a=" + a + ", b=" + b + ", c=" + c;
    }
    
    private boolean szerkesztheto(){
        return a+b > c && a+c > b && b+c > a;
    }
    
    private void beallit() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }
}
