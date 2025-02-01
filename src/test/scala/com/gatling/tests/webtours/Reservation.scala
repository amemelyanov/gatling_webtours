package com.gatling.tests.webtours

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Reservation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost:1080")
		.disableFollowRedirect
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("ru-RU,ru;q=0.9")
		.contentTypeHeader("application/x-www-form-urlencoded")
		.originHeader("http://localhost:1080")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36")

	val re_headers_0 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "frame",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")



	val scn = scenario("Reservation")
		.exec(http("request_0")
			.post("/cgi-bin/reservations.pl")
			.headers(re_headers_0)
			.formParam("firstName", "Jojo")
			.formParam("lastName", "Bean")
			.formParam("address1", "address")
			.formParam("address2", "156")
			.formParam("pass1", "Jojo Bean")
			.formParam("creditCard", "11111111111111111111")
			.formParam("expDate", "02/30")
			.formParam("oldCCOption", "")
			.formParam("numPassengers", "1")
			.formParam("seatType", "Coach")
			.formParam("seatPref", "None")
			.formParam("outboundFlight", "010;386;02/02/2025")
			.formParam("advanceDiscount", "0")
			.formParam("returnFlight", "100;386;02/03/2025")
			.formParam("JSFormSubmit", "off")
			.formParam("buyFlights.x", "74")
			.formParam("buyFlights.y", "1")
			.formParam(".cgifields", "saveCC"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}