package mathDemo;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        System.out.printf("Area of the triangle is %d.\n",
                findTriangleAreaByTwoSidesAndAngle(3, 4, 90));

        Random random = new Random();
        System.out.print("[ ");
        System.out.print(random.nextInt(1, 49));
        System.out.print(", ");
        System.out.print(random.nextInt(1, 49));
        System.out.print(", ");
        System.out.print(random.nextInt(1, 49));
        System.out.print(", ");
        System.out.print(random.nextInt(1, 49));
        System.out.print(", ");
        System.out.print(random.nextInt(1, 49));
        System.out.print(" ]");
    }

    public static int findTriangleAreaByTwoSidesAndAngle(int a, int b, double angle){
        return (int) (0.5 * a * b * Math.sin(Math.toRadians(angle)));
    }

}
