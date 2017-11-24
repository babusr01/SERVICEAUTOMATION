package com.Service.common;

import com.relevantcodes.extentreports.ExtentReports;

import java.io.File;

public class ExtentReportUtility {

    public  static ExtentReports extent = null;
    public static  boolean overrideExistingReport;


    public  ExtentReportUtility(){

    }

    public  static void  init(){
        try{
            if(extent == null){
                init(true);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {

        }
    }

    //This Method will initiate the reporting file
    public  static void init(boolean overrideExistingReport){
        try{
            String reportName = "ExtentReports";
            System.out.println("Extent Report Initilized:");
            ExtentReportUtility.overrideExistingReport = overrideExistingReport;
            extent = new ExtentReports(System.getProperty("user.dir") + "/ExtentReport" + reportName + ".html",overrideExistingReport);
            System.out.println(System.getProperty("user.dir"));
            extent.loadConfig(new File(System.getProperty("user.dir") + "/Library/extent-config.xml"));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {

        }
    }

    public static ExtentReports report(){
        if (extent == null){
            init();
        }
        return  extent;
    }
}
