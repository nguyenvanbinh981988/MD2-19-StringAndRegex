package ValiDate_Class;

import ValiDate_Class.ValiDateClass;
import Validate_email.EmailExample;

import java.util.Scanner;

public class Test {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten lop: ");
        String lop = input.nextLine();
        ValiDateClass valiDateClass = new ValiDateClass();
        boolean isvalid = valiDateClass.validate(lop);
            System.out.println("Email is " + lop + " is valid: " + isvalid);
    }
}
