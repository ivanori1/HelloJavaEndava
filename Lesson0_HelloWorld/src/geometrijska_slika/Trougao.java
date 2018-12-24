package geometrijska_slika;

public class Trougao extends GeometrijskaSlika {
    int a;

    public Trougao() {
        a = 1;
    }

    public Trougao(int a) {
        this.a = a;
    }

    @Override
    public double obim() {
        return a * 3;
    }

    @Override
    public double povrsina() {
        return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }
}
