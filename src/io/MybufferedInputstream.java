package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MybufferedInputstream {
	private FileInputStream fr;
	private int index;
	private int num;
	private byte[] b = new byte[1024];

	public MybufferedInputstream(FileInputStream fr) {
		super();
		this.fr = fr;
	}

	public int myread() throws IOException {

		if (num == 0) {
			num = fr.read(b);
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
