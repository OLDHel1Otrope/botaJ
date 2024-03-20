	public static void zerosToEnd2(int []arr) {
    //moving zeros to the end of the array in liner fashion
		int j=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0&&arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
