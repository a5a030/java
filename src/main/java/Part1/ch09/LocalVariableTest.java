package Part1.ch09;

public class LocalVariableTest {
    public static void main(String[] args) {
        var i=10;
        var j=10.0;
        var str="test";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2=str;
        System.out.println(str2);

        str="hello";
        System.out.println(str);
    }
}
