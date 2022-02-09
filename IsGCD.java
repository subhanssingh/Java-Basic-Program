public class IsGCD {
    static int gcd(int x,int y)
    {
        while (x!=y) {
            
        if (x>y) {
            x=x-y;
        }
        else{
            y=y-x;
        }
    }
    return y;
      
    }
    public static void main(String args[]) 
    {
        int a=35, b=56;
        System.out.println(gcd(a, b));
    }
}
