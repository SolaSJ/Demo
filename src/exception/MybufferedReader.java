package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class MybufferedReader {
	byte[] b = new byte[1024];
	FileInputStream fir;
	int num = 0;
	int index = 0;

	public MybufferedReader(FileInputStream fir) {
		this.fir = fir;
	}

	public int myread(FileInputStream fir) throws IOException {

		if (num == 0) {
			num = fir.read(b);
		}
		if (num > 0) {
			if (num == index + 1) {
				int i = index;
				num = 0;
				index = 0;
				return b[i] & 255;

			}
			return b[index++] & 255;

		}
		return -1;
	}

}
