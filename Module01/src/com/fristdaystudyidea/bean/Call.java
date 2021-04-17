package com.fristdaystudyidea.bean;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-02-05-9:25 PM
 */
public class Call {

    final static int TOUCH_FIX_NUMBER = 10;
    private final int Touch_Tone[] = {1,2,3,4,5,6,7,8,9,0};
    private final String Touch_Tone_Other[] = {"*","#"};
    private final String calling ="Call";
    private final String HangUp = "Hang up";

     public int[] getTouch_Tone() {
        return Touch_Tone;
     }

     public String[] getTouch_Tone_Other() {
        return Touch_Tone_Other;
     }

     public String getCalling() {
        return calling;
     }

     public String getHangUp() {
        return HangUp;
     }


     public void Calling(){
       System.out.println(calling);
    }

     public void TouchTheKeyNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input you Phone number:");
        int numberPhone = scanner.nextInt();
        for(int index = 0; index < TOUCH_FIX_NUMBER;index ++){
            if (numberPhone == Touch_Tone[0]){
                System.out.println("You input the first number is" + Touch_Tone[0]);
            }
        }

     }

     public void HangUpThePhone(){
        System.out.println(HangUp);
     }


}
