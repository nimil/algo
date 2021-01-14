package day1;

/**
 * BinarySearch
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/15 8:56 上午
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};

		int k = findk(arr,4);

		System.out.println(k);
	}


	private static int findk(int[] arr,int k){
		int start = 0;

		int end = arr.length;

		while(start<=end){

			int find = (start+end)/2;

			if (arr[find]==k){
				return find;
			}

			if (arr[find] > k){
				end = find-1;
			}else{

				start=find+1;

			}
		}


		return -1;

	}


}
