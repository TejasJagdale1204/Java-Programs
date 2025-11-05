public class String_Builder4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABC ");
        System.out.println(sb);

        sb.insert(4,new A()+" ");
        System.out.println(sb);

        System.out.println(sb.length());

        sb.insert(15,new B());
        System.out.println(sb);
    }
}
class A {

}
class B {

}