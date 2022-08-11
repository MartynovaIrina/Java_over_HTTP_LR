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
	lr.message(lr.eval_string("USER SESSION IS {USER_SESSION}"));

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

	lr.start_transaction("03_openFlightsPage");

	_webresult = lrapi.web.url("Search Flights Button", 
		"URL=http://{HOST}:{PORT}/cgi-bin/welcome.pl?page=search", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t16.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("nav.pl_3", 
		"URL=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=flights", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?page=search", 
		"Snapshot=t17.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;
	
	web.reg_save_param("SEATTYPE",
	                   new String[]{
	    "LB=name=\"seatType\" value=\"",
	    "RB=\"",
	    "Ordinal=all",
	    LAST});
	
	web.reg_save_param("SEATPREF",
	     new String[]{
	    "LB=name=\"seatPref\" value=\"",
	    "RB=\"",
	    "Ordinal=all",
	    LAST});

	web.reg_save_param("CITIES",
	     new String[]{
	    "LB=\">",
	    "RB=</option>",
	    "Ordinal=ALL",
	    LAST});
	
	_webresult = lrapi.web.url("reservations.pl", 
		"URL=http://{HOST}:{PORT}/cgi-bin/reservations.pl?page=welcome", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?page=search", 
		"Snapshot=t20.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("in_flights.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/in_flights.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=flights", 
		"Snapshot=t18.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("home.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/home.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=flights", 
		"Snapshot=t19.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.url("button_next.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/button_next.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/reservations.pl?page=welcome", 
		"Snapshot=t21.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	lr.end_transaction("03_openFlightsPage",lr.AUTO);


	
	
 	Random random = new Random();
 	
	int maxRandomNumberCities = Integer.parseInt(lr.eval_string("{CITIES_count}"));
	
	//defining random depart city
	int randomNumberforDepartCity = random.nextInt(maxRandomNumberCities) + 1; //+1 cause we need the numeration starting from 1
	String DepartCityRnd = String.format("{CITIES_%d}", randomNumberforDepartCity);
	lr.save_string(lr.eval_string(DepartCityRnd), "DEPARTCITYRND");
	
	//defining random arrive city
	int randomNumberforArriveCity = random.nextInt(maxRandomNumberCities) + 1; //+1 cause we need the numeration starting from 1
	String ArriveCityRnd = String.format("{CITIES_%d}", randomNumberforArriveCity);
	lr.save_string(lr.eval_string(ArriveCityRnd), "ARRIVECITYRND");
	
	
	//making sure that cities are different
	while (lr.eval_string("{DEPARTCITYRND}").equals(lr.eval_string("{ARRIVECITYRND}"))){
		randomNumberforArriveCity = random.nextInt(maxRandomNumberCities) + 1;
		ArriveCityRnd = String.format("{CITIES_%d}", randomNumberforArriveCity);
		lr.save_string(lr.eval_string(ArriveCityRnd), "ARRIVECITYRND");
	}
	
	//defining random seat type
	int maxRandomNumberSeatType = Integer.parseInt(lr.eval_string("{SEATTYPE_count}"));
	int randomNumberforSeatType = random.nextInt(maxRandomNumberSeatType) + 1; //+1 cause we need the numeration starting from 1
	String SeatTypeCurr = String.format("{SEATTYPE_%d}", randomNumberforSeatType);
	lr.save_string(lr.eval_string(SeatTypeCurr), "SEATTYPERND");
	
	//defining random seat preference
	int maxRandomNumberSeatPref = Integer.parseInt(lr.eval_string("{SEATPREF_count}"));
	int randomNumberforSeatPref = random.nextInt(maxRandomNumberSeatPref) + 1; //+1 cause we need the numeration starting from 1
	String SeatPrefCurr = String.format("{SEATPREF_%d}", randomNumberforSeatPref);
	lr.save_string(lr.eval_string(SeatPrefCurr), "SEATPREFRND");

	lr.think_time(10);
	
	lr.start_transaction("04_findFlight");

	_webresult = lrapi.web.add_auto_header("Origin", 
		"http://{HOST}:{PORT}");
	
	web.reg_save_param("OUTBOUNDFLIGHT",
	     new String[]{
	    "LB=name=\"outboundFlight\" value=\"",
	    "RB=\"",
	    "Ordinal=ALL",
	    LAST});

	web.reg_save_param("RETURNFLIGHT",
	     new String[]{
	    "LB=name=\"returnFlight\" value=\"",
	    "RB=\"",
	    "Ordinal=ALL",
	    LAST});
	             			
	web.reg_find("Text={DEPARTDATE}",
	     new String[]{
		"Fail=NotFound",
		LAST});

	web.reg_find("Text={RETURNDATE}",
		 new String[]{
		"Fail=NotFound",     
		LAST});

	_webresult = lrapi.web.submit_data("reservations.pl_2", 
		"Action=http://{HOST}:{PORT}/cgi-bin/reservations.pl", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/reservations.pl?page=welcome", 
		"Snapshot=t22.inf", 
		"Mode=HTTP", 
		}, new String[]{ // ITEM DATA 
		"Name=advanceDiscount", "Value=0", ENDITEM, 
		"Name=depart", "Value={DEPARTCITYRND}", ENDITEM, //Denver
		"Name=departDate", "Value={DEPARTDATE}", ENDITEM, /*08/06/2022*/
		"Name=arrive", "Value={ARRIVECITYRND}", ENDITEM, //Sydney
		"Name=returnDate", "Value={RETURNDATE}", ENDITEM, //08/07/2022
		"Name=numPassengers", "Value=1", ENDITEM, 
		"Name=roundtrip", "Value=on", ENDITEM, 
		"Name=seatPref", "Value={SEATPREFRND}", ENDITEM, //None 
		"Name=seatType", "Value={SEATTYPERND}", ENDITEM, //Coach
		"Name=findFlights.x", "Value=47", ENDITEM, 
		"Name=findFlights.y", "Value=14", ENDITEM, 
		"Name=.cgifields", "Value=roundtrip", ENDITEM, 
		"Name=.cgifields", "Value=seatType", ENDITEM, 
		"Name=.cgifields", "Value=seatPref", ENDITEM, 
		LAST});

	lr.end_transaction("04_findFlight",lr.AUTO);


	
	
	//defining random outbound flight
	int maxRandomNumberOutboundFlight = Integer.parseInt(lr.eval_string("{OUTBOUNDFLIGHT_count}"));
	int randomNumberforOutboundFlight = random.nextInt(maxRandomNumberOutboundFlight) + 1; //+1 cause we need the numeration starting from 1
	String OutboundFlightCurr = String.format("{OUTBOUNDFLIGHT_%d}", randomNumberforSeatPref);
	lr.save_string(lr.eval_string(OutboundFlightCurr), "OUTBOUNDFLIGHTRND");
	
	//defining random return flight
	int maxRandomNumberReturnFlight = Integer.parseInt(lr.eval_string("{RETURNFLIGHT_count}"));
	int randomNumberforReturnFlight = random.nextInt(maxRandomNumberOutboundFlight) + 1; //+1 cause we need the numeration starting from 1
	String ReturnFlightCurr = String.format("{RETURNFLIGHT_%d}", randomNumberforReturnFlight);
	lr.save_string(lr.eval_string(ReturnFlightCurr), "RETURNFLIGHTRND");
	
	lr.think_time(10);

	lr.start_transaction("05_selectFlight");
	
	web.reg_find("Text={FIRSTNAME}",
		new String[]{
		"Fail=NotFound",     
		LAST});

	web.reg_find("Text={LASTNAME}",
		new String[]{
		"Fail=NotFound",     
		LAST});
	
	_webresult = lrapi.web.submit_data("reservations.pl_3", 
		"Action=http://{HOST}:{PORT}/cgi-bin/reservations.pl", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/reservations.pl", 
		"Snapshot=t23.inf", 
		"Mode=HTTP", 
		}, new String[]{ // ITEM DATA 
		"Name=outboundFlight", "Value={OUTBOUNDFLIGHTRND}", ENDITEM, //082;748;08/06/2022
		"Name=returnFlight", "Value={RETURNFLIGHTRND}", ENDITEM, //802;748;08/07/2022 
		"Name=numPassengers", "Value=1", ENDITEM, 
		"Name=advanceDiscount", "Value=0", ENDITEM, 
		"Name=seatType", "Value={SEATTYPERND}", ENDITEM, //Coach
		"Name=seatPref", "Value={SEATPREFRND}", ENDITEM, //None
		"Name=reserveFlights.x", "Value=26", ENDITEM, 
		"Name=reserveFlights.y", "Value=6", ENDITEM, 
		LAST});

	lr.end_transaction("05_selectFlight",lr.AUTO);

	
	
	
	lr.think_time(20);

	lr.start_transaction("06_makePayment");

	web.reg_find("Text=Reservation Made!",
	    new String[]{
	    "Fail=NotFound",
	    LAST
	    });

	web.reg_find("Text={DEPARTDATE}",
	    new String[]{
	    "Fail=NotFound",
		LAST});

	_webresult = lrapi.web.submit_data("reservations.pl_4", 
		"Action=http://{HOST}:{PORT}/cgi-bin/reservations.pl", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/reservations.pl", 
		"Snapshot=t24.inf", 
		"Mode=HTTP", 
		}, new String[]{ // ITEM DATA 
		"Name=firstName", "Value={FIRSTNAME}", ENDITEM, //Jojo
		"Name=lastName", "Value={LASTNAME}", ENDITEM, //Bean
		"Name=address1", "Value={ADDR1}", ENDITEM, //Tverskaya
		"Name=address2", "Value={ADDR2}", ENDITEM, //140104
		"Name=pass1", "Value={PASSANGER1}", ENDITEM, //Jojo Bean
		"Name=creditCard", "Value={CARDNUM}", ENDITEM, //12345678
		"Name=expDate", "Value={EXPCARDDATE}", ENDITEM, //05/25
		"Name=saveCC", "Value=on", ENDITEM, 
		"Name=oldCCOption", "Value=on", ENDITEM, 
		"Name=numPassengers", "Value=1", ENDITEM, 
		"Name=seatType", "Value={SEATTYPERND}", ENDITEM, //Coach
		"Name=seatPref", "Value={SEATPREFRND}", ENDITEM, //None
		"Name=outboundFlight", "Value={OUTBOUNDFLIGHTRND}", ENDITEM, //082;748;08/06/2022
		"Name=advanceDiscount", "Value=0", ENDITEM, 
		"Name=returnFlight", "Value={RETURNFLIGHTRND}", ENDITEM, 
		"Name=JSFormSubmit", "Value=off", ENDITEM, 
		"Name=buyFlights.x", "Value=38", ENDITEM, 
		"Name=buyFlights.y", "Value=12", ENDITEM, 
		"Name=.cgifields", "Value=saveCC", ENDITEM, 
		LAST});

	_webresult = lrapi.web.url("bookanother.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/bookanother.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/reservations.pl", 
		"Snapshot=t25.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	lr.end_transaction("06_makePayment",lr.AUTO);

	lr.message(lr.eval_string("{CURRTIME} :   Flights have been booked: outbound(flight ¹; price; date): {OUTBOUNDFLIGHTRND}," +
	"return(flight ¹; price; date): {RETURNFLIGHTRND} for {FIRSTNAME} {LASTNAME}"));
	
	
	
	
	lr.think_time(5);

	lr.start_transaction("07_returnToHomepage");

	_webresult = lrapi.web.revert_auto_header("Origin");
	
	_webresult = lrapi.web.url("Home Button", 
		"URL=http://{HOST}:{PORT}/cgi-bin/welcome.pl?page=menus", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=flights", 
		"Snapshot=t26.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("nav.pl_4", 
		"URL=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=home", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?page=menus", 
		"Snapshot=t27.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("login.pl_3", 
		"URL=http://{HOST}:{PORT}/cgi-bin/login.pl?intro=true", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?page=menus", 
		"Snapshot=t28.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	lr.end_transaction("07_returnToHomepage",lr.AUTO);

	
	
	
	lr.think_time(5);

	lr.start_transaction("08_goToItinerary");

	_webresult = lrapi.web.url("Itinerary Button", 
		"URL=http://{HOST}:{PORT}/cgi-bin/welcome.pl?page=itinerary", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t29.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("nav.pl_5", 
		"URL=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=itinerary", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?page=itinerary", 
		"Snapshot=t30.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	web.reg_save_param("FLIGHTID",
	     new String[]{
	    "LB=name=\"flightID\" value=\"",
	    "RB=\"",
	    "Ordinal=ALL",
	     LAST});
	
	_webresult = lrapi.web.url("itinerary.pl", 
		"URL=http://{HOST}:{PORT}/cgi-bin/itinerary.pl", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/welcome.pl?page=itinerary", 
		"Snapshot=t32.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.url("in_itinerary.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/in_itinerary.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/nav.pl?page=menu&in=itinerary", 
		"Snapshot=t31.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("cancelreservation.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/cancelreservation.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/itinerary.pl", 
		"Snapshot=t33.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("cancelallreservations.gif", 
		"URL=http://{HOST}:{PORT}/WebTours/images/cancelallreservations.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://{HOST}:{PORT}/cgi-bin/itinerary.pl", 
		"Snapshot=t34.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	lr.end_transaction("08_goToItinerary",lr.AUTO);

	
	

	lr.think_time(10);
	
	lr.start_transaction("09_deleteBooking");

	_webresult = lrapi.web.add_header("Origin", 
		"http://{HOST}:{PORT}");

	
	int count = Integer.parseInt(lr.eval_string("{FLIGHTID_count}")); //geting the number of FLIGHTID array parameters;
	int randomBookingNumberToDeleteIndex;
	int idx;
	String[] temp;
	String body_req = "Body=";
	if (count == 1) {
		randomBookingNumberToDeleteIndex = 1;
		idx = 1;
	}
	else
	{
		randomBookingNumberToDeleteIndex = random.nextInt(count) + 1; //+1 cause we need the numeration starting from 1
	}
	
	String FlightToDeleteCurr = String.format("{FLIGHTID_%d}", randomBookingNumberToDeleteIndex);
	lr.save_string(lr.eval_string(FlightToDeleteCurr), "FLIGHTTODELETE");
	lr.message(String.format(lr.eval_string("{CURRTIME} :   Booking to delete: %d booking {FLIGHTTODELETE}"), randomBookingNumberToDeleteIndex));	
	
	//following is used to determine the flight index to confirm the deletion, and cyclically add all flightID values
	for (idx = 1; idx <= count; idx++) {
		if (idx == randomBookingNumberToDeleteIndex) {
			body_req += Integer.toString(idx) + "=on&";
		}
		body_req += "flightID=";
		String CurrBooking = String.format("{FLIGHTID_%d}", idx);
		body_req += lr.eval_string(CurrBooking) + "&";
	}
	
	if (count == 1) {
		body_req += "removeFlights.x=47&removeFlights.y=3&";
	}
	for (idx = 1; idx <= count; idx++) {
		body_req += ".cgifields=" + Integer.toString(idx);
	}
	if (count > 1) {
		body_req += "&removeFlights.x=47&removeFlights.y=3&";
	}
	
	if (Integer.parseInt(lr.eval_string("{FLIGHTID_count}")) == 1) {
		//checking that the list is empty in single case booking;
		web.reg_find("Text=No flights have been reserved.",
		     new String[]{
		    "Fail=NotFound",
			LAST});
	}
	else {
		//getting a new list after deleting booking;
		web.reg_save_param("FLIGHTID_new",
		     new String[]{
			"LB=name=\"flightID\" value=\"",
			"RB=\"",
			"Ordinal=ALL",
			LAST});
	}

	web.custom_request("itinerary.pl_2", 
    "Method=POST", 
    new String[]{
        "URL=http://{HOST}:{PORT}/cgi-bin/itinerary.pl",
        body_req,
        //"TargetFrame=",
    "LAST"});

	//checking that number of bookings before and after removal isn't equal in multiple case booking;
	if (Integer.parseInt(lr.eval_string("{FLIGHTID_count}")) > 1 && 
	    Integer.parseInt(lr.eval_string("{FLIGHTID_count}")) == Integer.parseInt(lr.eval_string("{FLIGHTID_new_count}"))) {

		lr.error_message("Sorry, we couldn't delete the booking! Please try again later.");
	}

	lr.end_transaction("09_deleteBooking",lr.AUTO);

	
	
	
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