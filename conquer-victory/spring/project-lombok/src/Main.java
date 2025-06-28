//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student st = new Student();
        st.setAge(25);
        System.out.println(st.getAge());
        System.out.println(st.toString());
    }
}