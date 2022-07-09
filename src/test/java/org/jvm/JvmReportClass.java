package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportClass {
	
	public static void jvmReport(String json) {
		
		File f = new File("C:\\Users\\Lokesh\\eclipse-workspace\\KonicaMinolta\\Reports\\JVMReport");
		
		Configuration c = new Configuration(f, "Konica Minolta");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}

}
