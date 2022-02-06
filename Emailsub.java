import javax.swing.plaf.synth.SynthStyleFactory;

public class Emailsub {
    public static void main(String args[]) {
        String str="subhanssingh7664@gmail.com";
        System.out.println(str.matches("(.*)gmail(.*)"));
        int i=str.indexOf('@');
        String uname=str.substring(0, i);
        System.out.println("Username; "+uname);
        String domain=str.substring(i+1, str.length());
        System.out.println("Domain: "+domain);
    }   
    
}
