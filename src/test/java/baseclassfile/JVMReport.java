package baseclassfile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generatejvmreport(String jsonFile) {
		File loc=new File("src\\test\\resources\\Report");
		Configuration jv=new Configuration(loc,"Adactin");
		jv.addClassifications("fisrst name", "Gokul");
		jv.addClassifications("last name", "GN");
		jv.addClassifications("mobile", "mi");
		jv.addClassifications("Greens", "java");
	    
		List<String>s=new ArrayList<String>();
        s.add(jsonFile);
        ReportBuilder builder=new ReportBuilder(s,jv);
        builder.generateReports();
        
	
	}
	
}
