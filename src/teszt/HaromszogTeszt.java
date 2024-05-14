package teszt;

import main.Haromszog;

public class HaromszogTeszt {
    public static void main(String[] args) {
        new HaromszogTeszt().tesztek();
    }

    private void tesztek() {
        azonosOldaluHszTeszt();
    }

    private void azonosOldaluHszTeszt() {
        System.out.println("Azonos oldal hosszúságu teszt: a=1, b=1, c=1");
        Haromszog h = new Haromszog(3, 4, 5);
        int kapott = h.getA() + h.getB() + h.getC();
        int vart = 3 * h.getA();
        assert kapott == vart : "hiba: ";
    }
    
}