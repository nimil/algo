package day3;

/**
 * BsSearch
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/18 8:53 上午
 */
public class BsSearch {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};

		int k = binarySearch(arr,4);

		System.out.println(k);
	}


	private static int  binarySearch(int[] arr,int k){
		int start = 0;
		int end = arr.length-1;

		while (start<=end){
			int pr = (start+end)/2;

			if (arr[pr] == k){
				return pr;
			}

			if (arr[pr] > k){
				end = pr-1;
			}else{
				start = pr+1;
			}

		}

		return -1;
	}

}
