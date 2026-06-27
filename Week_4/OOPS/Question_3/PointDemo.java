public class PointDemo {

    public static void main(String[] args) {

        Point point = new Point();

        point.display();

        point.setX(15);
        point.setY(20);

        point.display();

        point.setXY(30, 40);

        point.display();

        Point point2 = new Point(50, 60);

        point2.display();
    }
}
