package day2;

/**
 * BsSearch
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/17 9:05 上午
 */
public class BsSearch {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};

		int k = bsSearch(arr,4);

		System.out.println(k);
	}


	private static int bsSearch(int[] arr,int k){
		int start = 0;

		int end = arr.length-1;


		while(start <= end){
			int s = (start+end)/2;

			if (arr[s]==k){
				return s;
			}
			if (arr[s]>k){
				end = s-1;
			}else{
				start = s+1;
			}

		}


		return -1;
	}


}
