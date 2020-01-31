public class AreaCalculator {

    public static double area(double radius){
        if(radius < 0)
            return -1;
        double circleArea = Math.PI *(radius * radius);
        return circleArea;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0)
            return -1;
        double rectangleArea = x * y;
        return rectangleArea;
    }



    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5, 4));

    }
}

