package day1;

/**
 * BinarySeachAgain
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/15 9:06 上午
 */
public class BinarySeachAgain {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};

		int k = goagain(arr,4);

		System.out.println(k);

	}



	private static int goagain(int[] arr,int k){

		int start = 0;
		int end = arr.length-1;

		while (start<=end){

			int middle = (start+end)/2;

			if (arr[middle] == k){
				return middle;
			}


			if (arr[middle]>k){
				end = middle-1;
			}else{
				start = middle+1;
			}



		}

		return -1;

	}

}
