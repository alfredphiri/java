// just playing around with a class
// import java.util.*;

public class one {

    public int functOne(int i) {
        for (i = 0; i < 10; i++) {
            System.out.println(i);

        }
        return 0;
    }
    public static void main(String[] args) {

        one obj = new one();
        obj.functOne(1);
    }
}