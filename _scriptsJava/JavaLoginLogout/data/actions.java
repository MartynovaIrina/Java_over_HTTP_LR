import com.thoughtworks.xstream.*;
import java.io.*;
import javaHttpJ.*;
import javaHttpJ.parsers.*;
import javaHttpJ.replay.*;
import lrapi.*;

public class Actions
{
  public int init(){
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

	lr.think_time(0);

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
		"URL=http://localhost:1080/WebTours/", new String[]{ 
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
		"URL=http://localhost:1080/WebTours/header.html", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/", 
		"Snapshot=t2.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"frame");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.url("welcome.pl", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/", 
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
		"URL=http://localhost:1080/WebTours/home.html", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", 
		"Snapshot=t4.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"frame");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.url("nav.pl", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?in=home", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", 
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
		"URL=http://localhost:1080/WebTours/images/hp_logo.png", new String[]{ 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=http://localhost:1080/WebTours/header.html", 
		"Snapshot=t5.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"image");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.url("webtours.png", 
		"URL=http://localhost:1080/WebTours/images/webtours.png", new String[]{ 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=http://localhost:1080/WebTours/header.html", 
		"Snapshot=t6.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"image");

	_webresult = lrapi.web.add_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.url("mer_login.gif", 
		"URL=http://localhost:1080/WebTours/images/mer_login.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?in=home", 
		"Snapshot=t8.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	lr.start_transaction("02_makeLogin");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"frame");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.add_header("Origin", 
		"http://localhost:1080");

	lr.think_time(11);

	_webresult = lrapi.web.submit_data("login.pl", 
		"Action=http://localhost:1080/cgi-bin/login.pl", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?in=home", 
		"Snapshot=t9.inf", 
		"Mode=HTTP", 
		}, new String[]{ // ITEM DATA 
		"Name=userSession", "Value=134443.37545565zQVftDVpVcftVtQcpfizHf", ENDITEM, 
		"Name=username", "Value=jojo", ENDITEM, 
		"Name=password", "Value=bean", ENDITEM, 
		"Name=login.x", "Value=0", ENDITEM, 
		"Name=login.y", "Value=0", ENDITEM, 
		"Name=JSFormSubmit", "Value=off", ENDITEM, 
		LAST});

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("nav.pl_2", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl", 
		"Snapshot=t10.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("login.pl_2", 
		"URL=http://localhost:1080/cgi-bin/login.pl?intro=true", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl", 
		"Snapshot=t12.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("flights.gif", 
		"URL=http://localhost:1080/WebTours/images/flights.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t11.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("itinerary.gif", 
		"URL=http://localhost:1080/WebTours/images/itinerary.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t13.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("in_home.gif", 
		"URL=http://localhost:1080/WebTours/images/in_home.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t14.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("signoff.gif", 
		"URL=http://localhost:1080/WebTours/images/signoff.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t15.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	lr.end_transaction("02_makeLogin",lr.AUTO);

	lr.think_time(29);

	lr.start_transaction("03_openFlightsPage");

	_webresult = lrapi.web.url("Search Flights Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=search", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t16.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("nav.pl_3", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=flights", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=search", 
		"Snapshot=t17.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("reservations.pl", 
		"URL=http://localhost:1080/cgi-bin/reservations.pl?page=welcome", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=search", 
		"Snapshot=t20.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("in_flights.gif", 
		"URL=http://localhost:1080/WebTours/images/in_flights.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=flights", 
		"Snapshot=t18.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("home.gif", 
		"URL=http://localhost:1080/WebTours/images/home.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=flights", 
		"Snapshot=t19.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.url("button_next.gif", 
		"URL=http://localhost:1080/WebTours/images/button_next.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/reservations.pl?page=welcome", 
		"Snapshot=t21.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	lr.end_transaction("03_openFlightsPage",lr.AUTO);

	lr.start_transaction("04_findFlight");

	_webresult = lrapi.web.add_auto_header("Origin", 
		"http://localhost:1080");

	lr.think_time(28);

	_webresult = lrapi.web.submit_data("reservations.pl_2", 
		"Action=http://localhost:1080/cgi-bin/reservations.pl", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/reservations.pl?page=welcome", 
		"Snapshot=t22.inf", 
		"Mode=HTTP", 
		}, new String[]{ // ITEM DATA 
		"Name=advanceDiscount", "Value=0", ENDITEM, 
		"Name=depart", "Value=Denver", ENDITEM, 
		"Name=departDate", "Value=08/06/2022", ENDITEM, 
		"Name=arrive", "Value=Sydney", ENDITEM, 
		"Name=returnDate", "Value=08/07/2022", ENDITEM, 
		"Name=numPassengers", "Value=1", ENDITEM, 
		"Name=roundtrip", "Value=on", ENDITEM, 
		"Name=seatPref", "Value=None", ENDITEM, 
		"Name=seatType", "Value=Coach", ENDITEM, 
		"Name=findFlights.x", "Value=47", ENDITEM, 
		"Name=findFlights.y", "Value=14", ENDITEM, 
		"Name=.cgifields", "Value=roundtrip", ENDITEM, 
		"Name=.cgifields", "Value=seatType", ENDITEM, 
		"Name=.cgifields", "Value=seatPref", ENDITEM, 
		LAST});

	lr.end_transaction("04_findFlight",lr.AUTO);

	lr.think_time(25);

	lr.start_transaction("05_selectFlight");

	_webresult = lrapi.web.submit_data("reservations.pl_3", 
		"Action=http://localhost:1080/cgi-bin/reservations.pl", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/reservations.pl", 
		"Snapshot=t23.inf", 
		"Mode=HTTP", 
		}, new String[]{ // ITEM DATA 
		"Name=outboundFlight", "Value=082;748;08/06/2022", ENDITEM, 
		"Name=returnFlight", "Value=802;748;08/07/2022", ENDITEM, 
		"Name=numPassengers", "Value=1", ENDITEM, 
		"Name=advanceDiscount", "Value=0", ENDITEM, 
		"Name=seatType", "Value=Coach", ENDITEM, 
		"Name=seatPref", "Value=None", ENDITEM, 
		"Name=reserveFlights.x", "Value=26", ENDITEM, 
		"Name=reserveFlights.y", "Value=6", ENDITEM, 
		LAST});

	lr.end_transaction("05_selectFlight",lr.AUTO);

	lr.think_time(24);

	lr.start_transaction("06_makePayment");

	_webresult = lrapi.web.submit_data("reservations.pl_4", 
		"Action=http://localhost:1080/cgi-bin/reservations.pl", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/reservations.pl", 
		"Snapshot=t24.inf", 
		"Mode=HTTP", 
		}, new String[]{ // ITEM DATA 
		"Name=firstName", "Value=Jojo", ENDITEM, 
		"Name=lastName", "Value=Bean", ENDITEM, 
		"Name=address1", "Value=Tverskaya", ENDITEM, 
		"Name=address2", "Value=140104", ENDITEM, 
		"Name=pass1", "Value=Jojo Bean", ENDITEM, 
		"Name=creditCard", "Value=12345678", ENDITEM, 
		"Name=expDate", "Value=05/25", ENDITEM, 
		"Name=saveCC", "Value=on", ENDITEM, 
		"Name=oldCCOption", "Value=on", ENDITEM, 
		"Name=numPassengers", "Value=1", ENDITEM, 
		"Name=seatType", "Value=Coach", ENDITEM, 
		"Name=seatPref", "Value=None", ENDITEM, 
		"Name=outboundFlight", "Value=082;748;08/06/2022", ENDITEM, 
		"Name=advanceDiscount", "Value=0", ENDITEM, 
		"Name=returnFlight", "Value=802;748;08/07/2022", ENDITEM, 
		"Name=JSFormSubmit", "Value=off", ENDITEM, 
		"Name=buyFlights.x", "Value=38", ENDITEM, 
		"Name=buyFlights.y", "Value=12", ENDITEM, 
		"Name=.cgifields", "Value=saveCC", ENDITEM, 
		LAST});

	_webresult = lrapi.web.url("bookanother.gif", 
		"URL=http://localhost:1080/WebTours/images/bookanother.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/reservations.pl", 
		"Snapshot=t25.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	lr.end_transaction("06_makePayment",lr.AUTO);

	lr.start_transaction("07_returnToHomepage");

	_webresult = lrapi.web.revert_auto_header("Origin");

	lr.think_time(23);

	_webresult = lrapi.web.url("Home Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=menus", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=flights", 
		"Snapshot=t26.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("nav.pl_4", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=menus", 
		"Snapshot=t27.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("login.pl_3", 
		"URL=http://localhost:1080/cgi-bin/login.pl?intro=true", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=menus", 
		"Snapshot=t28.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	lr.end_transaction("07_returnToHomepage",lr.AUTO);

	lr.think_time(18);

	lr.start_transaction("08_goToItinerary");

	_webresult = lrapi.web.url("Itinerary Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t29.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("nav.pl_5", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=itinerary", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"Snapshot=t30.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("itinerary.pl", 
		"URL=http://localhost:1080/cgi-bin/itinerary.pl", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"Snapshot=t32.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	_webresult = lrapi.web.url("in_itinerary.gif", 
		"URL=http://localhost:1080/WebTours/images/in_itinerary.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=itinerary", 
		"Snapshot=t31.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("cancelreservation.gif", 
		"URL=http://localhost:1080/WebTours/images/cancelreservation.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Snapshot=t33.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("cancelallreservations.gif", 
		"URL=http://localhost:1080/WebTours/images/cancelallreservations.gif", new String[]{ 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Snapshot=t34.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	lr.end_transaction("08_goToItinerary",lr.AUTO);

	lr.start_transaction("09_deleteBooking");

	_webresult = lrapi.web.add_header("Origin", 
		"http://localhost:1080");

	lr.think_time(19);

	_webresult = lrapi.web.submit_data("itinerary.pl_2", 
		"Action=http://localhost:1080/cgi-bin/itinerary.pl", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Snapshot=t35.inf", 
		"Mode=HTTP", 
		}, new String[]{ // ITEM DATA 
		"Name=flightID", "Value=210298194-788-JB", ENDITEM, 
		"Name=2", "Value=on", ENDITEM, 
		"Name=flightID", "Value=210297416-177114-JB", ENDITEM, 
		"Name=flightID", "Value=210299361-2924730-JB", ENDITEM, 
		"Name=removeFlights.x", "Value=66", ENDITEM, 
		"Name=removeFlights.y", "Value=4", ENDITEM, 
		"Name=.cgifields", "Value=1", ENDITEM, 
		"Name=.cgifields", "Value=3", ENDITEM, 
		"Name=.cgifields", "Value=2", ENDITEM, 
		LAST});

	lr.end_transaction("09_deleteBooking",lr.AUTO);

	lr.think_time(18);

	lr.start_transaction("10_makeLogout");

	_webresult = lrapi.web.url("SignOff Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=itinerary", 
		"Snapshot=t36.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("If-None-Match", 
		"\"d0000000abcc3-551-4ddb1559ac980\"");

	_webresult = lrapi.web.concurrent_start(null);

	_webresult = lrapi.web.url("home.html_2", 
		"URL=http://localhost:1080/WebTours/home.html", new String[]{ 
		"Resource=0", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Snapshot=t37.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("nav.pl_6", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?in=home", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Snapshot=t38.inf", 
		"Mode=HTTP", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.concurrent_end(null);

	lr.end_transaction("10_makeLogout",lr.AUTO);

	}catch(Exception e){
		e.printStackTrace();
		return -1;
	}
	return 0;
    }

}