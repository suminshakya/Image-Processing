package com.image;

import com.image.util.HeicMetaReader;
import com.image.util.entity.ImageSimpleMeta;
import org.apache.commons.io.IOUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.*;

@SpringBootApplication
public class ImageProcessingApplication {

	public static void main(String[] args) throws IOException {

		String location = new File("")
				.getAbsolutePath().concat("\\tmp\\sample1.heic");
		InputStream in = new FileInputStream(location);
		byte[] imgData = IOUtils.toByteArray(in);
		ImageSimpleMeta imageInfo = HeicMetaReader.decodeByteArray(imgData);
		System.out.println(imageInfo);
	}

}
