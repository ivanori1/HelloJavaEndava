package geometrijska_slika;

public class Kvadrat extends GeometrijskaSlika {
    int a;

    public Kvadrat() {
        a = 1;
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    @Override
    public double obim() {
        return a * 4;
    }

    @Override
    public double povrsina() {
        return (Math.pow(a, 2));
    }
}
