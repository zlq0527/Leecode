import com.sun.org.apache.xpath.internal.operations.Bool;
import jdk.jfr.Unsigned;

import java.util.*;
import java.util.concurrent.*;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 13:15 2022/2/27
 * @ Description：
 */
public class test {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.shutdown();

	}

}
