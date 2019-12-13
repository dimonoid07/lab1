package Ball;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball( "black", "regbi");
        Ball b2 = new Ball( "pink", "football");
        Ball b3 = new Ball( "grey", "basketball");

        b3.setColor("white");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}