package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("DemoSite Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Site Name", "DemoQA");
        extentReports.setSystemInfo("Author", "Uma");
        return extentReports;
    }
}