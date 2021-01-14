package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * MyLRUCache
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/15 9:30 上午
 */
public class MyLRUCache<T> {


	private T data;


	private int capcity=3;


	private int count = 0;


	private T[] arrCache =  (T[]) new Object[capcity];


	private Map<T,Integer> keyIndexMap = new HashMap<T, Integer>(capcity);



	public void offer(T k){

		Integer index = keyIndexMap.get(k);

		if (Objects.isNull(index)){
			if (isFull()){
				removeAndCache(k);
			}else{
				fillRight(count);
				arrCache[0]=k;
				keyIndexMap.put(k,0);
				count++;
			}
		}else{
			T target = arrCache[index];
			count--;
			fillRight(count);
			arrCache[0] = target;
			keyIndexMap.put(target, 0);
			count++;
		}


	}

	private void removeAndCache(T k) {
		T le = arrCache[--count];
		keyIndexMap.remove(le);
		fillRight(count);
		arrCache[0] = k;
		keyIndexMap.put(k,0);
		count++;
	}

	private void fillRight(int count) {
		for (int i = count - 1; i >= 0; i--) {
			arrCache[i + 1] = arrCache[i];
			keyIndexMap.put(arrCache[i], i + 1);
		}
	}


	private boolean isFull(){
		return count>=capcity;
	}


	public static void testDefaultConstructor() {
		System.out.println("======无参测试========");
		MyLRUCache<Integer> lru = new MyLRUCache<Integer>();
		lru.offer(1);
		lru.offer(2);
		lru.offer(3);
		lru.offer(1);
		lru.offer(4);
		lru.offer(5);
		System.out.println(lru);
		lru.offer(6);
		lru.offer(7);
		lru.offer(8);
		lru.offer(9);
		System.out.println(lru);
	}


	public static void main(String[] args) {
		testDefaultConstructor();

		int[] arr = new int[]{1,2,3,4,5};

//		for (int i = arr.length-1; i > 0; i--) {
//			arr[i] = arr[i-1];
//		}

		for (int i = 0;i < arr.length-1;i++){
			arr[i] = arr[i+1];
		}

		arr[4] = 6;

	}



}
