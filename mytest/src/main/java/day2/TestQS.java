package day2;

/**
 * TestQS
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/17 9:00 上午
 */
public class TestQS {

	public static void main(String[] args) {
		int[] arr = new int[]{23,1,2321,312,2312,3,12,313,12,31,3,1};
		quss(arr,0,arr.length-1);
		System.out.println(arr);
	}



	private static void quss(int[] arr,int statr,int end){
		if (statr>end){
			return;
		}
		int q  = findK(arr,statr,end);

		quss(arr,q+1,end);
		quss(arr,statr,q-1);

	}

	private static int findK(int[] arr, int statr, int end) {
		int i = statr;
		int proviot = arr[end];

		for (int j = statr; j < end; j++) {

			if (arr[j]<proviot){
				if (i==j){
					i++;
				}else{
					int tmp = arr[i];
					arr[i++] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		int tmp = arr[i];
		arr[i] = arr[end];
		arr[end] = tmp;


		return i;


	}


}
