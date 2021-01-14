package day1;

/**
 * TestLRUSS
 *
 * @Since v5.10
 * @Author amin
 * @Date 2021/1/8 12:18 下午
 */
public class TestLRUSS {

	public static void main(String[] args) {
		double lng = 0.1d;
		double lat = 0.3d;

		wrapUU(lat,lng);

		System.out.println(lng+lat);

	}



	static void wrapUU(double lat,double lng){
		lat = lat*2;
		lng = lng*2;

	}


}
