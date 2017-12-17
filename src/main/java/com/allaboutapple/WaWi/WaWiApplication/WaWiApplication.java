package com.allaboutapple.WaWi.WaWiApplication;

import com.allaboutapple.WaWi.WaWiApplication.controller.SettingsController;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProductList;
import com.allaboutapple.WaWi.WaWiApplication.service.ProdWSSalesProductService;
import com.allaboutapple.WaWi.WaWiApplication.view.MainView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.api.SalesOrderItemRepositoryV1Api;
import io.swagger.client.api.SalesOrderRepositoryV1Api;
import io.swagger.client.auth.Authentication;
import io.swagger.client.auth.OAuth;
import io.swagger.client.model.FrameworkFilter;
import io.swagger.client.model.FrameworkSearchCriteriaInterface;
import io.swagger.client.model.FrameworkSearchFilterGroup;
import io.swagger.client.model.FrameworkSortOrder;
import org.apache.commons.io.FileUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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
