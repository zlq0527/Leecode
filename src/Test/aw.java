package Test;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 18:57 2022/4/11
 * @ Description：
 */
public class aw {
	public static void main(String[] args) {

	}
	class Rect {
		public float x;                //左上角，x轴坐标
		public float y;        //左上角，y轴坐标
		public float width;    //矩形的宽
		public float height;    //矩形的高
	}
	boolean isIntersect(Rect a, Rect b) {
		if (b.y - b.height > a.y && b.x + b.width < a.x) {
			return false;
		} else {
			return true;
		}
	}
}
