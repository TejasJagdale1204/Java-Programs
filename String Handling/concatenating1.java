public class concatenating1 {
    public static void main(String[] args) {
        String s1 = "Hari";
        System.out.println(s1);

        s1.concat("NiT");
        System.out.println(s1);
    }
}
// HariNiT will not be print because if we consider s1 is 1010 
// then in s1 Hari is stored . Now HariNiT will become 2020 so 
// s1 is 1010 it will not accept 2020 . and 2020 will stored to garbage collection