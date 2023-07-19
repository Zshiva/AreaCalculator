public class AreaCalculator {

    public static double area(double radius){
        if(radius < 0){
            System.out.println("You must put the radius more than 0");
            return -1.0;
        }else{
            System.out.println("The area of the circle is : ");
            return (Math.PI)*radius*radius;
        }
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            System.out.println("You must have the positive value ");
            return -1.0;
        }else{
            System.out.println("The area of the rectangle is : ");
            return x * y;
        }
    }
    public static void main(String[] args) {
        System.out.println(area(4.5));
        System.out.println(area(4,5));
        System.out.println(area(-1));
    }
}