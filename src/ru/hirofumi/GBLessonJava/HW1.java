package ru.hirofumi.GBLessonJava;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.lang.String.format;


public  class HW1 {

    public static int CalculateTriangleNum(int n){
        int result = 0;
        for (int i = 0; i < n + 1; i++) {
            result += i;
        }
        return result;
    }

    public static String SayHelloInTimeNow(String userName) {
        LocalDateTime currentTime = LocalDateTime.now();
        String result = "";
        var h = currentTime.getHour();
        if (h >= 5 && h < 12) {
            result = format("Good morning, %s!", userName);
            return result;
        } else if (h >= 12 && h < 18) {
            result = format("Good day, %s!", userName);
            return result;
        } else if (h >= 18 && h < 23) {
            result = format("Good evening, %s!", userName);
            return result;
        } else {
            result = format("Good night, %s!", userName);
            return result;
        }
    }

    public static int CalculateNumsCount(int[] arr){
        int count = 0;
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                count++;
                if(result > count) continue;
                else result = count + 1;
            }
            else count = 0;
            }
        return result;
    }

    public static int[] moveItemEqualsKeyToTail(int [] arr, int key){
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            nums.add(arr[i]);
        }

        for (int i = nums.size() - 1; i >= 0; i--) {
            if(nums.get(i).equals(key))  {
                nums.add(key);
                nums.remove(i);
            }
        }

        int[] tmpArr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            tmpArr[i] = nums.get(i);
        }
        return tmpArr;
    }
    public static String printIntArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sb.append(' ');
        }
        return sb.toString();
    }
}

