package ValiPhone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiDatePhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so dien thoai");
        String phone = input.nextLine();
        final String phone_Regex = "^\\([0-9]{2}\\)\\-\\(0[0-9]{9}\\)$";


        Pattern pattern = Pattern.compile(phone_Regex);
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()){
            System.out.println("Email is " + phone + " is valid");
        }else {
            System.out.println("Email is " + phone + " is not valid");
        }
    }
}
