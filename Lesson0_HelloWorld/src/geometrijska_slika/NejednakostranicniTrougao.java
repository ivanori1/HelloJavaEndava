package geometrijska_slika;

public class NejednakostranicniTrougao extends Trougao {
    int b;
    int c;

    public NejednakostranicniTrougao() {
        super();
        b = 2;
        c = 3;
    }

    public NejednakostranicniTrougao(int a, int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double obim() {
        return a + b + c;
    }

    @Override
    public double povrsina() {
        double s = (a + b + c) / 2;
        double heronovObrazac = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return heronovObrazac;

    }

    public static void main(String[] args) {
        GeometrijskaSlika gs1 = new NejednakostranicniTrougao();
        GeometrijskaSlika gs2 = new Trougao(5);
        GeometrijskaSlika gs3 = new NejednakostranicniTrougao(23, 41, 46);

    }

    public String toString() {
        return "Povrsina je " + this.povrsina() + "." + " Obim  je " + this.obim();
    }
}
