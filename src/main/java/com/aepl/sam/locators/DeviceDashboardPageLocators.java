package com.aepl.sam.locators;

import org.openqa.selenium.By;

public class DeviceDashboardPageLocators {
	// Shital
	
	//	navigation bar
	public static final By DEVICE_DASHBOARD = By.cssSelector("nav ul li.active-nav-item a");
	public static final By DEVICE_DASHBOARD_BACKBTN = By.xpath("/html/body/app-root/app-device-dashboard/div/form/div[1]/div/div[1]/mat-icon");
	public static final By PAGE_LOGO = By.cssSelector(".header-logo img");
	public static final By PAGETITLE = By.xpath("//div[contains(@class,'header-main-title')]/h6");
	public static final By DEVICE_DASHBOARD_REFRESHBTN = By.xpath("//app-device-dashboard//mat-icon[text()='refresh']");
	public static final By DEVICE_DASHBOARD_TITLE = By.xpath("//app-device-dashboard//span[contains(text(),'Device Dashboard')]");

	
	public static final By DEVICE_DASHBOARD_NAVBAR = By.xpath("/html/body/app-root/app-header/div/div/nav/ul/li[1]/a");
	public static final By DEVICE_DASHBOARD_NAVBAR_DEVICEUTILITY = By.xpath("/html/body/app-root/app-header/div/div/nav/ul/li[2]/a");
	public static final By DEVICE_DASHBOARD_NAVBAR_USER = By.xpath("/html/body/app-root/app-header/div/div/nav/ul/li[3]/a");
	public static final By DEVICE_DASHBOARD_NAVBAR_USERPROFILE = By.xpath("/html/body/app-root/app-header/div/div/nav/ul/li[4]/a/span");
	public static final By DEVICE_DASHBOARD_TOTALPRODUCTIONDEVICESKPI = By.id("TotalProductionDevices");
	public static final By DEVICE_DASHBOARD_TOTALDISPATCHEDDEVICESKPI = By.id("DispatchedDevices");
	public static final By DEVICE_DASHBOARD_PRODUCTIONDEVICETABLEHEADER = By.xpath("/html/body/app-root/app-device-dashboard/div/form/div[4]/form/div[1]/div/div/div[1]/div/h6");
	public static final By DEVICE_DASHBOARD_DISPATCHEDDEVICESTABLEHEADER  = By.xpath("/html/body/app-root/app-device-dashboard/div/form/div[4]/form/div[1]/div/div/div[1]/div/h6");
	public static final By DEVICE_DASHBOARD_SEARCHBOX = By.xpath("/html/body/app-root/app-device-dashboard/div/form/div[4]/form/div[1]/div/div/div[3]/app-common-component-search/div/div/div/input");
	public static final By DEVICE_DASHBOARD_SEARCHCLICK = By.xpath("/html/body/app-root/app-device-dashboard/div/form/div[4]/form/div[1]/div/div/div[3]/app-common-component-search/div/div/button");
	public static final By DEVICE_DASHBOARD_SEARCHCLEAR = By.xpath("/html/body/app-root/app-device-dashboard/div/form/div[4]/form/div[1]/div/div/div[3]/app-common-component-search/div/div/div/input");
	
}
