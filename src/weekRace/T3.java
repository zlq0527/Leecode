package weekRace;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 11:13 2022/3/20
 * @ Description：统计道路上的碰撞次数
 */
public class T3 {
	public static void main(String[] args) {
		System.out.println(new T3().countCollisions("SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR"));
	}

	public int countCollisions(String directions) {
		while (directions.startsWith("L")) {
			directions=directions.replaceFirst("L", "");
		}
		while (directions.endsWith("R")) {
			directions = directions.substring(0, directions.length()-1);
		}
		int len = directions.length();
		int s=0;
		for (int i = 0; i < directions.length(); i++) {
			if (directions.charAt(i) == 'S') {
				s++;
			}
		}
		return len-s;


//		while (directions.contains("RL") || directions.contains("RS") || directions.contains("SL")) {
//			if (directions.contains("RL")) {
//				directions=directions.replaceFirst("RL", "S");
//				res+=2;
//			}
//			if (directions.contains("RS")) {
//				directions=directions.replaceFirst("RS", "S");
//				res += 1;
//			}
//			if (directions.contains("SL")) {
//				directions=directions.replaceFirst("SL", "S");
//				res+=1;
//			}
//		}
	}
}
