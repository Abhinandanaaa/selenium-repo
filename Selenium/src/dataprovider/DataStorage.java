package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] datasender() {
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
}
	@DataProvider
	public String[][] dataregister() {//take 5 datas
		String[][] data= {{},{},{},{}};
		return data;
	
}
}