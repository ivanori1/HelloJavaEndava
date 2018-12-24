package geometrijska_slika;

public class Krug extends GeometrijskaSlika {
    int a;

    public Krug() {
        a = 2;
    }

    public Krug(int a) {
        this.a = a;
    }

    @Override
    public double obim() {
        return a * 2 * Math.PI;
    }

    @Override
    public double povrsina() {
        return Math.pow(a, 2) * Math.PI;
    }
}
