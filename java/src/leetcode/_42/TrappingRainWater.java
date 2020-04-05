package leetcode._42;
/*
 *Created by XuFan
 *on 2020/4/5
 */

public class TrappingRainWater {
    public static int trap(int[] height) {
        int tarpNum = 0;
        int left = 0;
        int leftPos = 0;
        int temp = 0;
        while(temp<height.length){
            if(left == 0){
                left =height[temp];
                leftPos = temp;
                temp++;
            }else{
                boolean isSuccess =false;
                int  rightMax  = 0;
                int  rightPos = 0;
                if(height[temp]<left) {
                    for (int i = temp; i < height.length; i++) {
                        if (height[i] >= left && i != leftPos + 1 && i != leftPos) {
                            isSuccess = true;
                            int Summm = 0;
                            for (int j = leftPos + 1; j < i; j++) {
                                Summm += height[j];
                            }
                            int tempppp = (i - leftPos - 1) * Math.min(left, height[i]) - Summm;
                            tarpNum += tempppp;
                            System.out.println("----------left-----------");
                            System.out.println("左边位置：" + leftPos);
                            System.out.println("左边高度：" + left);
                            System.out.println("右边位置：" + i);
                            System.out.println("右边高度：" + height[i]);
                            System.out.println("这次水滴：" + tempppp);
                            System.out.println("现在水滴：" + tarpNum);
                            System.out.println("---------------------");
                            left = height[i];
                            leftPos = i;
                            temp = i;
                            break;
                        } else {
                            if (height[i] > rightMax) {
                                rightMax = height[i];
                                rightPos = i;
                            }
                        }
                    }
                }
                if(isSuccess == false ){
                    if(rightPos !=leftPos+1 && rightPos !=leftPos && rightMax !=0){
                        int Summm22 =0;
                        for (int j = leftPos+1; j <rightPos ; j++) {
                            Summm22+=height[j];
                        }
                        int tempppp =  (rightPos-leftPos-1)*Math.min(left,rightMax) - Summm22  ;
                        tarpNum= tempppp+tarpNum;
                        System.out.println("---------right------------");
                        System.out.println("左边位置："+ leftPos);
                        System.out.println("左边高度："+ left);
                        System.out.println("右边位置："+ rightPos);
                        System.out.println("右边高度："+ rightMax);
                        System.out.println("这次水滴："+ tempppp);
                        System.out.println("现在水滴："+ tarpNum);
                        System.out.println("---------------------");
                        left =rightMax;
                        leftPos = rightPos;
                        temp =rightPos+1;
                    }else{
                        if(temp<height.length-1){
                            left =height[temp];
                            leftPos = temp;
                        }
                        temp++;
                    }

                }
            }
        }
        return tarpNum;
    }

    public static void main(String[] args) {
        int[]  height = {4,9,4,5,3,2};
        int emp =trap(height);
        System.out.println("---------emp-------");
        System.out.println(emp);
    }
}
