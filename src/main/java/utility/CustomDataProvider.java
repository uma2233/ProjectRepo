package utility;


import org.testng.annotations.DataProvider;

public class CustomDataProvider {
@DataProvider(name ="loginDetails")
public static Object[][] getData(){
	Object[][] arr = ExcelReader.getDataFromSheet("param");
	return arr;
}
}
