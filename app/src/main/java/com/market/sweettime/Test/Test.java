package com.market.sweettime.Test;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8};

        System.out.println(sum(nums,2));


    }

    public static boolean sum(int[] nums,int k){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if (hashMap.get(nums[i])!=null){
                return true;
            }
          hashMap.put(k-nums[i],i);
        }
        return false;
    }
}
class Main {
    public static boolean checkTwoSum(int[] nums, int k) {
        //合法性判断
        if (nums==null||nums.length<2){
            return false;
        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            //找到了
            if (hashMap.get(nums[i])!=null){
                return true;
            }
            hashMap.put(k-nums[i],i);
        }
        return false;
    }



    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];
        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }


    //
    public static void Sort(int[] nums,int low,int hight){
        int i ,j,temp,t;
        if (low>hight) return;

        i =low;
        j = hight;
        temp = nums[low];
        //一轮执行完成
        while(i<j){
            if (temp<nums[j]&&i<j){
                j--;
            }

            if (temp>nums[i]&&i<j){
                i++;
            }

            //交换
            if (i<j){
                t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
            }
        }
        //交换基准位置与
        nums[low] = nums[i];
        nums[i] = temp;
        //递归

        Sort(nums,low,j-1);
        Sort(nums,j+1,hight);


    }

}
