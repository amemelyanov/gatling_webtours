package com.gatling.tests.webtours

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Login extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost:1080")
		.inferHtmlResources()
		.acceptHeader("image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("ru-RU,ru;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36")

	val lo_headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Cache-Control" -> "no-cache",
		"Origin" -> "http://localhost:1080",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "frame",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val lo_headers_1 = Map(
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

	val lo_headers_3 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")



	val scn = scenario("Login")
		.exec(http("request_0")
			.post("/cgi-bin/login.pl")
			.headers(lo_headers_0)
			.formParam("userSession", "140817.194410693HctDcitptDHftDtfQpHAzzcf")
			.formParam("username", "jojo")
			.formParam("password", "bean")
			.formParam("login.x", "58")
			.formParam("login.y", "14")
			.formParam("JSFormSubmit", "off")
			.resources(http("request_1")
			.get("/cgi-bin/nav.pl?page=menu&in=home")
			.headers(lo_headers_1), http("request_2")
			.get("/cgi-bin/login.pl?intro=true")
			.headers(lo_headers_1), http("request_3")
			.get("/WebTours/images/itinerary.gif")
			.headers(lo_headers_3), http("request_4")
			.get("/WebTours/images/in_home.gif")
			.headers(lo_headers_3), http("request_5")
			.get("/WebTours/images/signoff.gif")
			.headers(lo_headers_3), http("request_6")
			.get("/WebTours/images/flights.gif")
			.headers(lo_headers_3)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}