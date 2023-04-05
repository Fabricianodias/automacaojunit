package org.apache.commons.io;

import java.io.File;


public class FileUtils {

	public static void copyFile(File screenshotFile, File file) {
		// TODO Auto-generated method stub
		
		
		// Salvando o arquivo de imagem em um local específico
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\User\\Pictures\\Screenshots.png"));
		
	}

}
