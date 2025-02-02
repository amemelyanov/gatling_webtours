package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class WebToursSimulationOld extends Simulation {

	val httpProtocol = http
		.baseUrl("http://127.0.0.1:1080")
		.inferHtmlResources()
		.acceptHeader("image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("ru-RU,ru;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_1 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "frame",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_2 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_8 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Cache-Control" -> "no-cache",
		"Origin" -> "http://127.0.0.1:1080",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "frame",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_15 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "frame",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val startPage = exec(http("[UC_XX]_Start_Page")
		.get("/WebTours/")
		.headers(headers_0)
		.resources(http("request_1")
			.get("/WebTours/header.html")
			.headers(headers_1), http("request_2")
			.get("/WebTours/images/hp_logo.png")
			.headers(headers_2), http("request_3")
			.get("/WebTours/images/webtours.png")
			.headers(headers_2), http("request_4")
			.get("/cgi-bin/welcome.pl?signOff=true")
			.headers(headers_1), http("request_5")
			.get("/WebTours/home.html")
			.headers(headers_1), http("request_6")
			.get("/cgi-bin/nav.pl?in=home")
			.headers(headers_1), http("request_7")
			.get("/WebTours/images/mer_login.gif")
			.headers(headers_2)))
		.pause(1)

	val users = scenario("Users").exec(startPage)

	setUp(
		users.inject(rampUsers(10).during(10))
	.protocols(httpProtocol)
	)

	val scn = scenario("WebToursSimulation")
				.exec(http("[UC_XX]_Login + [UC_XX]_Flights_Page")
			.post("/cgi-bin/login.pl")
			.headers(headers_8)
			.formParam("userSession", "140799.819684083HctcDQApHcftDtftpDttDf")
			.formParam("username", "jojo")
			.formParam("password", "bean")
			.formParam("login.x", "70")
			.formParam("login.y", "13")
			.formParam("JSFormSubmit", "off")
			.resources(http("request_9")
			.get("/cgi-bin/login.pl?intro=true")
			.headers(headers_1), http("request_10")
			.get("/cgi-bin/nav.pl?page=menu&in=home")
			.headers(headers_1), http("request_11")
			.get("/WebTours/images/in_home.gif")
			.headers(headers_2), http("request_12")
			.get("/WebTours/images/signoff.gif")
			.headers(headers_2), http("request_13")
			.get("/WebTours/images/itinerary.gif")
			.headers(headers_2), http("request_14")
			.get("/WebTours/images/flights.gif")
			.headers(headers_2), http("request_15")
			.get("/cgi-bin/welcome.pl?page=search")
			.headers(headers_15), http("request_16")
			.get("/cgi-bin/reservations.pl?page=welcome")
			.headers(headers_1), http("request_17")
			.get("/cgi-bin/nav.pl?page=menu&in=flights")
			.headers(headers_1), http("request_18")
			.get("/WebTours/images/itinerary.gif")
			.headers(headers_2), http("request_19")
			.get("/WebTours/images/home.gif")
			.headers(headers_2), http("request_20")
			.get("/WebTours/images/signoff.gif")
			.headers(headers_2),http("request_21")
			.get("/WebTours/images/button_next.gif")
			.headers(headers_2), http("request_22")
			.get("/WebTours/images/in_flights.gif")
			.headers(headers_2)))
		.pause(3)
		.exec(http("[UC_XX]_Find_Flights")
			.post("/cgi-bin/reservations.pl")
			.headers(headers_8)
			.formParam("advanceDiscount", "0")
			.formParam("depart", "Denver")
			.formParam("departDate", "01/30/2025")
			.formParam("arrive", "Frankfurt")
			.formParam("returnDate", "01/31/2025")
			.formParam("numPassengers", "1")
			.formParam("roundtrip", "on")
			.formParam("seatPref", "None")
			.formParam("seatType", "Coach")
			.formParam("findFlights.x", "25")
			.formParam("findFlights.y", "2")
			.formParam(".cgifields", "roundtrip")
			.formParam(".cgifields", "seatType")
			.formParam(".cgifields", "seatPref"))
		.pause(1)
		.exec(http("[UC_XX]_Choose_Flights + [UC_XX]_Reservation")
			.post("/cgi-bin/reservations.pl")
			.headers(headers_8)
			.formParam("outboundFlight", "010;386;01/30/2025")
			.formParam("returnFlight", "100;386;01/31/2025")
			.formParam("numPassengers", "1")
			.formParam("advanceDiscount", "0")
			.formParam("seatType", "Coach")
			.formParam("seatPref", "None")
			.formParam("reserveFlights.x", "39")
			.formParam("reserveFlights.y", "12")
			.resources(http("request_25")
			.post("/cgi-bin/reservations.pl")
			.headers(headers_8)
			.formParam("firstName", "Jojo")
			.formParam("lastName", "Bean")
			.formParam("address1", "")
			.formParam("address2", "")
			.formParam("pass1", "Jojo Bean")
			.formParam("creditCard", "")
			.formParam("expDate", "")
			.formParam("oldCCOption", "")
			.formParam("numPassengers", "1")
			.formParam("seatType", "Coach")
			.formParam("seatPref", "None")
			.formParam("outboundFlight", "010;386;01/30/2025")
			.formParam("advanceDiscount", "0")
			.formParam("returnFlight", "100;386;01/31/2025")
			.formParam("JSFormSubmit", "off")
			.formParam("buyFlights.x", "48")
			.formParam("buyFlights.y", "12")
			.formParam(".cgifields", "saveCC"), http("request_26")
			.get("/WebTours/images/bookanother.gif")
			.headers(headers_2)))
		.pause(2)
		.exec(http("[UC_XX]_Home_Page + [UC_XX]_Itinerary")
			.get("/cgi-bin/welcome.pl?page=menus")
			.headers(headers_15)
			.resources(http("request_28")
			.get("/cgi-bin/login.pl?intro=true")
			.headers(headers_1), http("request_29")
			.get("/cgi-bin/nav.pl?page=menu&in=home")
			.headers(headers_1), http("request_30")
			.get("/WebTours/images/in_home.gif")
			.headers(headers_2), http("request_31")
			.get("/WebTours/images/signoff.gif")
			.headers(headers_2), http("request_32")
			.get("/WebTours/images/itinerary.gif")
			.headers(headers_2), http("request_33")
			.get("/WebTours/images/flights.gif")
			.headers(headers_2), http("request_34")
			.get("/cgi-bin/welcome.pl?page=itinerary")
			.headers(headers_15), http("request_35")
			.get("/cgi-bin/nav.pl?page=menu&in=itinerary")
			.headers(headers_1), http("request_36")
			.get("/cgi-bin/itinerary.pl")
			.headers(headers_1), http("request_37")
			.get("/WebTours/images/cancelreservation.gif")
			.headers(headers_2), http("request_38")
			.get("/WebTours/images/cancelallreservations.gif")
			.headers(headers_2), http("request_39")
			.get("/WebTours/images/home.gif")
			.headers(headers_2), http("request_40")
			.get("/WebTours/images/signoff.gif")
			.headers(headers_2), http("request_41")
			.get("/WebTours/images/in_itinerary.gif")
			.headers(headers_2), http("request_42")
			.get("/WebTours/images/flights.gif")
			.headers(headers_2)))
		.pause(3)
		.exec(http("[UC_XX]_Cancel_Reservation")
			.post("/cgi-bin/itinerary.pl")
			.headers(headers_8)
			.formParam("flightID", "384-84674-JB")
			.formParam("removeAllFlights.x", "37")
			.formParam("removeAllFlights.y", "11")
			.formParam(".cgifields", "1"))
		.pause(2)
		.exec(http("[UC_XX]_Sign_Off")
			.get("/cgi-bin/welcome.pl?signOff=1")
			.headers(headers_15)
			.resources(http("request_45")
			.get("/WebTours/home.html")
			.headers(headers_1), http("request_46")
			.get("/cgi-bin/nav.pl?in=home")
			.headers(headers_1), http("request_47")
			.get("/WebTours/images/mer_login.gif")
			.headers(headers_2)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}