package de.pavelleonidov.InternetmarkeShipping;

import de.pavelleonidov.InternetmarkeShipping.view.MainView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.apache.commons.io.FileUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class Main extends AbstractJavaFxApplicationSupport {
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


		SplashScreen splash = new SplashScreen();

		//SpringApplication.run(WaWiApplication.class, args);
		launch(Main.class, MainView.class, splash, args);
	}

	public static String getHomeDirectory() {
		return homeDirectory;
	}
}
