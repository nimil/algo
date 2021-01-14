package day1;

/**
 * TestQuickSort
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/15 8:47 上午
 */
public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr = new int[]{23,1,2321,312,2312,3,12,313,12,31,3,1};
		qsss(arr,0,arr.length-1);
		System.out.println(arr);
	}


	private static void qsss(int[] arr,int sat,int len){
		if (sat > len){
			return;
		}

		int q = findpos(arr,sat,len);

		qsss(arr,sat,q-1);

		qsss(arr,q+1,len);


	}

	private static int findpos(int[] arr, int sat, int len) {

		int i = sat;
		int poviot = arr[len];

		for (int j = sat; j < len; j++) {
			if (poviot > arr[j]){
				if (j==i){
					i++;
				}else{
					int tmp = arr[i];
					arr[i++] = arr[j];
					arr[j] = tmp;
				}

			}
		}



		int tmp = arr[i];
		arr[i] = arr[len];
		arr[len] = tmp;
		return i;
	}

}
