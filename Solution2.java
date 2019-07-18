class Solution2 {
	
	static int var=0;
	
    public int search(int[] nums, int target) {
        int Left = 0;
        int Right = nums.length-1;
        return findNumber(Left,Right,nums,target);
      
    }
     public int findNumber(int Left, int Right, int[] nums, int target) {
    	  int mid = (Left + Right) / 2;
          if(nums[mid] == target) {
          	return mid;
          }
          else {
              if(nums[mid]<target) {
                  Left = mid+1;
                  var++;
                  return findNumber(Left,Right, nums,target);
              }
              else if(nums[mid]>target) {
                  Right = mid-1;
                  var++;
                  return findNumber(Left,Right, nums,target);
              }
                  
          }
          
          return -1;
        }
     
     
     public static void main(String ...strings) {
    	//int iArr[] = {-1,0,3,5,9,2,5,7,16,55,76,78,12};
    	 int iArr[] = {-1,0,2,3,5,7,9,12,16,55,76,78};
    	Solution2 r1 = new Solution2();
    	System.out.println(r1.search(iArr,78));
    	System.out.println("number" +var);
    	
     }
}