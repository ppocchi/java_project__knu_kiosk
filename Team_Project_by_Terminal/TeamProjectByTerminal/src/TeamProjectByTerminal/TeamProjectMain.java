package TeamProjectByTerminal;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamProjectMain
{
    public static void main(String[] args)
    {
        Date n = new Date();
        System.out.println(n.toString());

        Student s = new Student("2021111873", "김진현", "01023824633", "kimjhyun0627", 82, false);
        System.out.println(s.toString());

        Cabinet c = new Cabinet(82, "0004");
        System.out.println(c.toString());

        c.changePW("0627");
        System.out.println(c.toString());

        c.changePW("abcd");
        System.out.println(c.toString());

        BorrowObj b1 = new BorrowObj(3, new Date(), new Date(2023, 5, 8, 11, 38, 23), "2021111873");
        BorrowObj b2 = new BorrowObj(5, new Date(), new Date(), "1234567890");
        BorrowObj b3 = new BorrowObj(8, "9999911111");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }

}
