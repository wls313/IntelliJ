package test;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Arrays.sort(arr);
        System.out.println(arr);
        for (int i = 0; i <arr.length; i++){
            if(arr[i] % divisor == 0 ){
                answer[i] = arr[i];
                System.out.println(answer);
            }
        }
        return answer;
    }
}