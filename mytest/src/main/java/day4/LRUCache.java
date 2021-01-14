package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LRUCache
 *
 * @Since v5.10
 * @Author amin
 * @Date 2020/12/23 8:57 上午
 */
public class LRUCache<T> {


	private   int count = 0;

	private  int capcity = 3;


	private  T[] valArr= (T[])new Object[3];

	private Map<T,Integer> map = new HashMap<>();






	public void offer(T t){

		Integer index = map.get(t);

		//如果不存在
		if (Objects.isNull(index)){

			if (count >= capcity){
				count--;
				T key = valArr[count];
				map.remove(key);
				rightShift();
				valArr[0] = t;
				map.put(t,0);
				count++;
				//没满
			}else{
				rightShift();
				valArr[0] = t;
				map.put(t,0);
				count++;
			}


			//如果再列表中已经存在
		}else{

			rightShift();

			map.put(t,0);
			valArr[0] = t;
		}



	}



	void rightShift(){
		for (int i = valArr.length-1; i > 0 ; i--) {
			valArr[i] = valArr[i-1];
			map.put(valArr[i],i);
		}
	}


	public static void main(String[] args) {
		System.out.println("======无参测试========");
		day4.LRUCache<Integer> lru = new day4.LRUCache<Integer>();
		lru.offer(1);
		lru.offer(2);
		lru.offer(3);
		lru.offer(4);
		lru.offer(5);
		System.out.println(lru);
		lru.offer(6);
		lru.offer(7);
		lru.offer(8);
		lru.offer(9);
		System.out.println(lru);
	}




}
