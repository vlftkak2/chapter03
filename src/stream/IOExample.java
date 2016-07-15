package stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {

		byte[] src = { 0, 1, 2, 3, 4, 5 };

		ByteArrayInputStream bias = new ByteArrayInputStream(src); // 관은 꽂아놨다
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int data = -1;
		while ((data = bias.read()) != -1) {
			//System.out.println(data);
			baos.write(data);
		}
		byte[] dest=baos.toByteArray();
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));

	}

}
