package geometrijska_slika;

public class Elipsa extends Krug {
    int b;

    public Elipsa() {
        super();
        b = 2;
    }

    public Elipsa(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public double obim() {
        return a * Math.PI * ( 9 - Math.sqrt(35)/2) ;
    }

    @Override
    public double povrsina() {
        return a * b * Math.PI;

    }

    public static void main(String[] args) {
        GeometrijskaSlika gs1 = new Elipsa();
        GeometrijskaSlika gs2 = new Krug(5);
        GeometrijskaSlika gs3 = new Elipsa(23, 41);

        System.out.println("String reprezentacija objekta gs1 je " + gs1.toString());
        System.out.println("String reprezentacija objekta gs2 je " + gs2.toString());
        System.out.println("String reprezentacija objekta gs3 je " + gs3.toString());
    }
}
