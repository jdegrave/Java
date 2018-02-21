/**
 * Created by jdegrave on 07/13/2016.
 */

import java.util.*;

public class Main {

    public static void main(String[] args){

        String[] cityArray = {"New York", "Philadelphia", "Lansing", "Fayetteville"};

        int[] charCount = new int [cityArray.length];
        int cityCharNumb = 0;
        for (int i = 0; i < cityArray.length; i++)
        {

            charCount[i] = cityArray[i].length();
            System.out.println(charCount[i]);

        }

    }

}