package Ball;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball( "blue", "football");
        Ball b2 = new Ball( "green", "tennis");
        Ball b3 = new Ball( "brown", "basketball");

        b3.setColor("black");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
