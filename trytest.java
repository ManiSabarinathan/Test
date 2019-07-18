class trytest {
	public static void main(String ...strings ) {
		int arr[] = {-1,-1,-1,0,1,1};
		trytest ob = new trytest();
		System.out.println(ob.pivotIndex(arr));
	}
    public int pivotIndex(int[] nums) {
        int total = 0, sum = 0;
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length; sum += nums[i++])
            if (sum * 2 == total - nums[i]) return i;
        return -1;  
    }
}