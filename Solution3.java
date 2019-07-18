class Solution3 {
    public int pivotIndex(int[] nums) {
    	Solution3 ob = new Solution3();
    	int outIndex = -1;
    	
    	if(nums.length==0) {
    		return -1;
    	}
        int mid=(nums.length)/2;
		int leftSum = findSum(nums,0, mid-1);
		int righSum = findSum(nums,mid+1, nums.length-1);
		if(leftSum<0 && righSum>=0) {
			//take right to find the feasiblity to become the positive number
			System.out.println("Left sum is Negative" );
			outIndex = ob.amethod(nums,mid,righSum, leftSum);			
		}
		else if(righSum<0  && leftSum>=0) {
			//move left to find the feasiblity to become the positive number
			System.out.println("Right sum is Negative" );
			outIndex = ob.amethod(nums,mid,leftSum,righSum);
						
		}
		else if(leftSum<0 && righSum<0) {
			System.out.println("Both sum are Negative" );
			outIndex = ob.amethod(nums,mid,righSum, leftSum);
		}
		else {
			System.out.println("Both sum are Positive" );
			outIndex = ob.amethod(nums,mid,leftSum,righSum);
		}
		
		return outIndex;        
	}
    
    public int amethod(int[] nums, int mid, int leftSum, int righSum) {
    	if(leftSum==righSum) {
			return mid;
		}else if(righSum>leftSum) {
			//move one step right
			while(mid<nums.length-1) {
				++mid;
				int newLeftSum = findSum(nums,0, mid-1);
				int newRightSum = findSum(nums,mid+1, nums.length-1);
				
				if(newLeftSum==newRightSum) {
					return mid;
				}
				
			}
		}else if(leftSum>righSum)	{
			//move one step left 
			while(mid>1) {
				--mid;
				int newLeftSum = findSum(nums,0, mid-1);
				int newRightSum = findSum(nums,mid+1, nums.length-1);	
				if(newLeftSum==newRightSum) {
					return mid;                    
				}
				
            }
		}
		return -1;
    }
	
	public int findSum(int[] arr, int s,int e ) {
		int sum=0;
		for(int i=s;i<=e;i++) {
			sum+=arr[i];		
		}
		return sum;	
	}
	public static void main(String ...strings ) {
		//int arr[] = {1,7,3,6,5,6};
		//int arr[] = {-1,-1,-1,-1,-1,-1}; //output=-1
		//int arr[] = {-1,-1,-1,-1,-1,0}; //output=2
		//int arr[] = {3,2,1,7,3,6,5,6,5};
		//int arr[] = {-1,-3,1,-1,-5};
		//int arr[] = {-1,-1,-1,-1,0,1};
		int arr[] = {-1,-1,-1,0,1,1};
		Solution3 ob = new Solution3();
		System.out.println(ob.pivotIndex(arr));
	}
    }
