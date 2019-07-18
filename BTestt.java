class BTestt {
	static int[] nums = {-1,0,3,5,9,12};
	static int target = 2;
	
      public static void main(String ... args) {
    	BTestt obj = new BTestt();
		int Left = 0;
        int Right = nums.length-1;
        int result = obj.findNumber(Left,Right);
        System.out.println("result:: "+ result);
      
     }
     public int findNumber(int Left, int Right) {
		  if(Left>Right) return -1;
    	  int mid = (Left + Right) / 2;
          if(nums[mid] == target) {
          	return mid;
          }
          if(nums[mid]<target) {
                  Left = mid+1;
                  return findNumber(Left,Right);
          }
          else {
                  Right = mid-1;
                  return findNumber(Left,Right);
              }                  
          }
        
}