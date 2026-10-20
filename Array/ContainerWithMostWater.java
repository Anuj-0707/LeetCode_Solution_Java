public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int end = height.length-1;
        int start = 0;
        while(start<end){
            int a=height[start], b=height[end];
            int ar = Math.abs(start-end)*min(a,b);
            if(max<ar){
                max=ar;
            }
            if(a<b){
                start++;
            }
            else{
                end--;
            }
        }
        return max;
    }
    public static int min(int a,int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
}