package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LRUDay2
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/17 9:09 上午
 */
public class LRUDay2<T> {

	private int count = 0;

	private int capcity = 3;

	private Map<T,Integer> indexMap= new HashMap<>();


	private T[] valueArr = (T[])new Object[capcity];


	public void put(T value){

		Integer index = indexMap.get(value);

		//如果存在
		if (Objects.nonNull(index)){
			T target = valueArr[index];
			move(count);
			valueArr[0] = target;
			indexMap.put(target, 0);
			//如果不存在，考虑淘汰
		}else{

			//如果满了。真的淘汰了
			if (count>=capcity){



				//如果没满，考虑右移
			}else{





			}
		}




	}

	private void move(int count) {
		for (int i = count-1; i > 0 ; i--) {
			valueArr[i+1] = valueArr[i];
			indexMap.put(valueArr[i],i+1);
		}

	}


	public static void main(String[] args) {

		int[] arr = new int[]{123,456};

		for (int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}

		System.out.println(arr);

	}


}
