class Main {
	public static void main(String args[]) {
		// Your code goes here
		System.out.println("hi");
		int[] arr = new int[]{-3,0,1,3,6,8,11,14,18,25};
		//arr = [-3,0,1,3,6,8,11,14,18,25];
		//Above one is sorted array
		boolean pairExist = checkPair(arr,23);
		if(pairExist){
				System.out.println("Pari of sum is exist");
		} else {
				System.out.println("Pari of sum is not exist");
		}
		
	}
	public static boolean checkPair(int[] arr,int k){
		//System.out.println(arr);
		for(int i=0;i <=arr.length -1 ;i++){
			System.out.println(arr[i]);
		}
		//Using 2 poniters sum
		int n= arr.length;
		int p1 = 0;
		int p2 = n-1;
		while(p1 < p2) {
			int total = arr[p1] + arr[p2];
			if(total == k){
				return true;
			} else if(total < k){
				p1++;
			} else {
				p2--;
			}
		}
		return false;
		
	}
	
}