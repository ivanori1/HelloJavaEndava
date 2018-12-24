package geometrijska_slika;

public class Pravougaonik extends Kvadrat {
    int b;

    public Pravougaonik() {
        super();
        b = 4;
    }

    public Pravougaonik(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public double obim() {
        return 2 * (a + b);
    }

    @Override
    public double povrsina() {

        return a * b;
    }

    public static void main(String[] args) {
        GeometrijskaSlika gs1 = new Pravougaonik();
        GeometrijskaSlika gs2 = new Kvadrat(5);
        GeometrijskaSlika gs3 = new Pravougaonik(23, 41);

    }

    public String toString() {
        return "Povrsina je " + this.povrsina() + "." + " Obim  je " + this.obim();
    }
}
