public class Replacing5 {
    public static void main(String[] args) {
        String s1 = "abc.bbc.cbc";

        String s2 = s1.replace('.','1');
        System.out.println(s2);

        String s3 = s1.replace(".","-");
        System.out.println(s3);

        String s4 = s1.replaceAll(".","!");  //dot has special meaning in replaceAll() method
        System.out.println(s4);
        
        String s5 = s1.replaceAll("\\.","@");
        System.out.println(s5);
        
        String s6 = s1.replaceFirst(".","%");
        System.out.println(s6);

        String s7 = s1.replaceFirst("\\.","#");
        System.out.println(s7);
    }
}
