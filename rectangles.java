class rectangle {
    public double lenght;
    public double height;
    public double area(){
        return height*lenght;
    }
    public double perimeter(){
        return 2*(height+lenght);
    }
}
public class rectangles{
    public static void main(String args[]) {
        rectangle R=new rectangle();
        R.lenght=3;
        R.height=5;
        System.out.println("area: "+R.area());
        System.out.println("perimeter: "+R.perimeter());
        
    }
}
