import com.thoughtworks.xstream.*;
import java.io.*;
import javaHttpJ.*;
import javaHttpJ.parsers.*;
import javaHttpJ.replay.*;
import lrapi.*;

import java.lang.String;
import java.util.Random;

public class Actions
{
  public int init(){
	lr.message(lr.eval_string("{CURRTIME} : URL = {HOST}:{PORT}"));
	
    return 0;
  }

    public int end(){return 0;}


    public int action() throws Throwable{
    	

	String ENDFORM      =  "ENDFORM";
	String LAST         =  "LAST";
	String ENDITEM      =  "ENDITEM";
	String ITEMDATA     =  "ITEMDATA";
	String STARTHIDDENS =  "STARTHIDDENS";
	String ENDHIDDENS   =  "ENDHIDDENS";
	String CONNECT	    =  "CONNECT";
	String RECEIVE      =  "RECEIVE";
	String RESOLVE	    =  "RESOLVE";
	String REQUEST      =  "REQUEST";
	String RESPONSE	    =  "RESPONSE";
	String EXTRARES     =  "EXTRARES";
	
	int _webresult; 

	try{
		
	lr.message(lr.eval_string("{CURRTIME} : - Iteration: {ITERNUM}"));
		
	lr.message(lr.eval_string("{CURRTIME} :   Account: {USERNAME}/{PASSWORD}"));

	lr.start_transaction("01_loadHomePage");
	
	_webresult = lrapi.web.add_auto_header("User-Agent",
		"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:103.0) Gecko/20100101 Firefox/103.0");

	_webresult = lrapi.web.add_auto_header("Accept", 
		"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");

	_webresult = lrapi.web.add_auto_header("Accept-Language", 
		"ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3");

	_webresult = lrapi.web.add_auto_header("Accept-Encoding", 
		"gzip, deflate, br");

	_webresult = lrapi.web.add_auto_header("Upgrade-Insecure-Requests", 
		"1");

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"document");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-User", 
		"?1");

	_webresult = lrapi.web.url("WebTours", 
		"URL=http://{HOST}:{PORT}/WebTours/", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"frame");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("header.html", 
		"URL=http://{HOST}:{PORT}/WebTours/header.html", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/WebTours/", 
		"Snapshot=t2.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"frame");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.url("welcome.pl", 
		"URL=http://{HOST}:{PORT}/cgi-bin/welcome.pl?signOff=true", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/WebTours/", 
		"Snapshot=t3.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"frame");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("home.html", 
		"URL=http://{HOST}:{PORT}/WebTours/home.html", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?signOff=true", 
		"Snapshot=t4.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"frame");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	//userSession correlation
	web.reg_save_param("USER_SESSION",
	                      new String []{
	    "LB=name=\"userSession\" value=\"",
	    "RB=\"/>",
	    "Ordinal=1",
	        LAST});
		
	_webresult = lrapi.web.url("nav.pl", 
		"URL=http://{HOST}:{PORT}/cgi-bin/nav.pl?in=home", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?signOff=true", 
		"Snapshot=t7.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"image");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("hp_logo.png", 
		"URL=http://{HOST}:{PORT}/WebTours/images/hp_logo.png", new String[]{ 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=http://{HOST}:{PORT}/WebTours/header.html", 
		"Snapshot=t5.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"image");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.url("webtours.png", 
		"URL=http://{HOST}:{PORT}/WebTours/images/webtours.png", new String[]{ 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=http://{HOST}:{PORT}/WebTours/header.html", 
		"Snapshot=t6.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"image");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.url("mer_login.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/mer_login.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?in=home", 
		"Snapshot=t8.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	lr.end_transaction("01_loadHomePage",lr.AUTO);
	
	
	
	
	lr.think_time(10);
	
	lr.start_transaction("02_makeLogin");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"frame");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.add_header("Origin", 
		"http://{HOST}:{PORT}");
	
	web.reg_find("Text=User password was correct",
	             new String[]{
		"Fail=NotFound",
		LAST});
	
	_webresult = lrapi.web.submit_data("login.pl", 
		"Action=http://{HOST}:{PORT}/cgi-bin/login.pl", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?in=home", 
		"Snapshot=t9.inf", 
		"Mode=HTTP", 
		}, new String[]{ // ITEM DATA 
		"Name=userSession", "Value={USER_SESSION}", ENDITEM, //initial value userSession 134443.37545565zQVftDVpVcftVtQcpfizHf
		"Name=username", "Value={USERNAME}", ENDITEM, //jojo
		"Name=password", "Value={PASSWORD}", ENDITEM, //bean
		"Name=login.x", "Value=0", ENDITEM, 
		"Name=login.y", "Value=0", ENDITEM, 
		"Name=JSFormSubmit", "Value=off", ENDITEM, 
		LAST});

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("nav.pl_2", 
		"URL=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=home", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/login.pl", 
		"Snapshot=t10.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("login.pl_2", 
		"URL=http://{HOST}:{PORT}/cgi-bin/login.pl?intro=true", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/login.pl", 
		"Snapshot=t12.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("flights.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/flights.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t11.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("itinerary.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/itinerary.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t13.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("in_home.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/in_home.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t14.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("signoff.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/signoff.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t15.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	lr.end_transaction("02_makeLogin",lr.AUTO);

	lr.message(lr.eval_string("{CURRTIME} :   Login completed"));



	
	lr.think_time(5);

	lr.start_transaction("10_makeLogout");

	_webresult = lrapi.web.url("SignOff Button", 
		"URL=http://{HOST}:{PORT}/cgi-bin/welcome.pl?signOff=1", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=itinerary", 
		"Snapshot=t36.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("If-None-Match", 
		"\"d0000000abcc3-551-4ddb1559ac980\"");

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("home.html_2", 
		"URL=http://{HOST}:{PORT}/WebTours/home.html", new String[]{ 
		"Resource=0", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?signOff=1", 
		"Snapshot=t37.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("nav.pl_6", 
		"URL=http://{HOST}:{PORT}/cgi-bin/nav.pl?in=home", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?signOff=1", 
		"Snapshot=t38.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	lr.end_transaction("10_makeLogout",lr.AUTO);
	
	lr.message(lr.eval_string("{CURRTIME} :   Logout completed"));

	}catch(Exception e){
		e.printStackTrace();
		return -1;
	}
	return 0;
    }

}