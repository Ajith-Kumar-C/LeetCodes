
class Find {
    public int findNumbers(int[] nums) {
        int counter = 0;
        int len = 0;
        int temp = 0;
        for(int i = 0; i<nums.length; i++){
            temp = nums[i];
            while(temp>0){
            temp = temp/10;
                counter++;
            }
            if(counter%2 == 0){
                len++;
            }
            counter = 0;
        }
        return len;
    }
}

public class q2{
	public static void main(String [] args) {
		Find f = new Find();
		int nums[] = {12,345,2,6,7896};
		int val = f.findNumbers(nums);
		System.out.println(val);
	}
	
}