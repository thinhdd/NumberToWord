import  java.lang.*;
/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 5/19/13
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumberToWord {
    String word=null;
    public String convert(int i) {
        if(i==0)
            return "Zero" ;
        return wordPlace(i);  //To change body of created methods use File | Settings | File Templates.
    }
    public static String num1_9(int i){
        switch (i)
        {
            case  1:
                return "One";
            case 2:
                return  "Two";
            case  3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            default:
                return "Nine";
        }
    }
    public static String num10_20(int i)
    {
        switch (i)
        {
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Ninteen";
            default:
                return "Twenty";
        }
    }
    public static String num21_99(int i)
    {
        switch (i)
        {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            default:
                return "Ninty";
        }
    }
    public static String wordPlace(int number)
    {
        String nuString = "" + number;
        int i = nuString.length();
        int cur=0;
        String t=null;
        switch (i){
            case  1:
                return num1_9(number);
            case  2:
                if(number<21)
                    return num10_20(number);
                else
                {   if((cur=number%10)==0)
                        return  num21_99(number/10);
                    else
                        return  num21_99(number/10) + " " + num1_9(cur);
                }
            case  3:
                if ((cur=number-100*(number/100))==0)
                    return num1_9(number/100)+ " Hundreds";
                else
                    return num1_9(number/100)+ " Hundreds " + wordPlace(cur);
            case 4:
                if ((cur=number-1000*(number/1000))==0)
                    return  num1_9(number/1000)+ " Thousands";
                else
                    return num1_9(number/1000)+ " Thousands " + wordPlace(cur);
            case 5:
                if((cur=number-1000*(number/1000))==0)
                    return  wordPlace(number/1000)+ " Thousands";
                else
                    return wordPlace(number/1000)+ " Thousands " + wordPlace(cur);
            case 6:
                if((cur=number-1000*(number/1000))==0)
                    return wordPlace(number/1000)+ " Thousands";
                else
                    return wordPlace(number/1000)+ " Thousands " + wordPlace(cur);
            case 7:
                if((cur=number-1000000*(number/1000000))==0)
                    return num1_9(number/1000000) + " Millions";
                else
                    return num1_9(number/1000000) + " Millions " + wordPlace(cur);
            case 8:
                if((cur=number-1000000*(number/1000000))==0)
                    return wordPlace(number/1000000) + " Millions";
                else
                    return wordPlace(number/1000000) + " Millions " + wordPlace(cur);
            default:
                if((cur=number-1000000*(number/1000000))==0)
                    return wordPlace(number/1000000)+ " Millions";
                else
                    return num1_9(number/1000000)+ " Millions " + wordPlace(cur);
        }
    }
}
