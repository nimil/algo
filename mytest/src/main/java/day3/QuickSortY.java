package day3;

/**
 * QuickSortY
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/18 8:49 上午
 */
public class QuickSortY {


	public static void main(String[] args) {
		int[] arr = new int[]{23,1,2321,312,2312,3,12,313,12,31,3,1};
		qass(arr,0,arr.length-1);
		System.out.println(arr);
	}


	private static void qass(int[] arr,int start,int end){
		if (start>end){
			return;
		}

		int q = find(arr,start,end);

		qass(arr,start,q-1);
		qass(arr,q+1,end);
	}




	private static int find(int[] arr, int start, int end) {
		int proviot = arr[end];

		int i  = start;

		for (int j = start; j < end; j++) {

			if (proviot>arr[j]){
				if (i==j){
					i++;
				}else{
					int tmp = arr[i];
					arr[i++] = arr[j];
					arr[j]= tmp;
				}
			}
		}

		int tmp = arr[end];
		arr[end] = arr[i];
		arr[i] = tmp;

		return i;
	}


}
