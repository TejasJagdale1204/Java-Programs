//Scanner2.java
import java.util.Scanner;
class Scanner2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
	
        Scanner1 s1 = new Scanner1();
        
        System.out.print("Enter sno\t: ");
        s1.setSno(scn.nextInt());
        scn.nextLine();
        
        System.out.print("Enter sname\t: ");
        s1.setSname(scn.nextLine());
        
        System.out.print("Enter course\t: ");
        s1.setCourse(scn.nextLine());
        
        System.out.print("Enter fee\t: ");
        s1.setFee(scn.nextDouble());
        
        System.out.print("Enter email\t: ");
        s1.setEmail(scn.next());
        
        System.out.print("Enter mobile\t: ");
        s1.setMobile(scn.nextLong());
        
        System.out.print("Enter gender\t: ");
        s1.setGender(scn.next().charAt(0));
        
        System.out.print("Enter courseStatus\t: ");
        s1.setCourseStatus(scn.nextBoolean());
        
        System.out.println("Student details you entered");
        System.out.println(s1);  //s1.toString();
	
  }
}
