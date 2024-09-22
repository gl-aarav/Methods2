public class Q6 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double radius = i;
            double area = calculateArea(radius);
            System.out.printf("The area of a circle with radius %.1f is %.1f.\n", radius, area);
        }
    }

    public static double calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}