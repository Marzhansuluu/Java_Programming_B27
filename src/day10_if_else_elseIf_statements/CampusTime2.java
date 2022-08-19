package day10_if_else_elseIf_statements;

import java.util.Scanner;

public class CampusTime2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a time from 0-23 in 24H format, where 0 is midnight");
        int time = s.nextInt();

        String message = "";// declaring and assigning a String with value empty space "". Default starting value

        if(time >= 6 && time <= 11){
            message = "Good morning"; //System.out.println("Good morning"); Both of them are acceptable when we assign empty String it will help us to reduce writing system out println part.

        }else if(time >= 12 && time <= 16) {
            message = "Good afternoon";

        }else if(time >= 17 && time <= 19){
            message = "Good evening";

        }else if((time >=20 && time <=23) || (time >= 0  && time <=5)){
            message = "Good night";

        }else{
            message = "Not in 24 h range";
        }
        System.out.println(message);
    }
}
