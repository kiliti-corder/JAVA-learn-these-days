/**
 * @author shkstart
 * @create 2021-01-28-6:28 PM
 */

//5.作业：( 文化：中国生肖）使用一个宇符串数组存储动物名称
public class ZodiacArraysTest05 {


    public void ZodiacShow(){
        String [] Zodia = new String[12];
        for(int i = 0; i < Zodia.length; i++){
            if(i == 0){
                Zodia[i] = "老鼠";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            } else if(i == 1){
                Zodia[i] = "牛";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            } else if(i == 2){
                Zodia[i] = "虎";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            } else if(i == 3){
                Zodia[i] = "兔";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            } else if(i == 4){
                Zodia[i] = "龙";
                System.out.println("数字" + (i + 1)+ "为" + Zodia[i]);
                continue;
            }else if(i == 5){
                Zodia[i] = "蛇";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            }else if(i == 6){
                Zodia[i] = "马";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            }else if(i == 7){
                Zodia[i] = "羊";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            }else if(i == 8){
                Zodia[i] = "猴";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            }else if(i == 9){
                Zodia[i] = "鸡";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            }else if(i == 10){
                Zodia[i] = "狗";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            }else if(i == 11){
                Zodia[i] = "猪";
                System.out.println("数字" + (i + 1) + "为" + Zodia[i]);
                continue;
            }

        }
    }

    public static void main(String[] args){
        ZodiacArraysTest05 zodiacArraysTest05 = new ZodiacArraysTest05();
        zodiacArraysTest05.ZodiacShow();
    }
}
