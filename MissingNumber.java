public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,5};
       int ans = 0;
        System.out.println(findNumber(ans,array));
    }
    public static int findNumber(int ans, int[] array){
        int num = array.length + 1;
        int temp = 0;
        int sum = (num * (num + 1) / 2);
        for(int i = 0; i < array.length; i++){
            temp = temp + array[i];
            ans = sum - temp;
        }
        return ans;
    }
}
