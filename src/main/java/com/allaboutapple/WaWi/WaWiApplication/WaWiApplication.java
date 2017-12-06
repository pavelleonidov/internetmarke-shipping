package com.allaboutapple.WaWi.WaWiApplication;

import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProductList;
import com.allaboutapple.WaWi.WaWiApplication.service.ProdWSSalesProductService;
import com.allaboutapple.WaWi.WaWiApplication.view.MainView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.apache.commons.io.FileUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class WaWiApplication extends AbstractJavaFxApplicationSupport {
	private static String homeDirectory;

	public static void main(String[] args) {

		homeDirectory = FileUtils.getUserDirectoryPath() + "/.allaboutapple/";
		File file = new File(homeDirectory);
		if (!file.exists()) {
			try {
				file.mkdirs();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}




		//SpringApplication.run(WaWiApplication.class, args);
		launch(WaWiApplication.class, MainView.class, args);
	}

	public static String getHomeDirectory() {
		return homeDirectory;
	}
}
