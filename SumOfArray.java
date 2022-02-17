public class SumOfArray {
    // public static void main(String args[]) {
    //     int a[]={1,2,3,4,5};
    //     int sum=0;
    //     for(int i=0;i<a.length;i++){
    //         sum=sum+a[i];
    //     }
    //     System.out.println(sum);
    // }
    public static void main(String args[]) {
        int a[]={1,2,3,4,5};
        int n=4;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if (a[i]==n) {
                System.out.println("element is in array");
                System.exit(0);
            }
            
        }
        System.out.println("not found");
    }
}
