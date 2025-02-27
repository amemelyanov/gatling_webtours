package com.gatling.tests.webtours

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class StartPage extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost:1080")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("ru-RU,ru;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36")

	val sp_headers_0 = Map(
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

	val sp_headers_1 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "frame",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val sp_headers_2 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")



	val scn = scenario("StartPage")
		.exec(http("request_0")
			.get("/webtours/")
			.headers(sp_headers_0)
			.resources(http("request_1")
				.get("/webtours/header.html")
				.headers(sp_headers_1),
				http("request_2")
					.get("/webtours/images/hp_logo.png")
					.headers(sp_headers_2),
				http("request_3")
					.get("/webtours/images/webtours.png")
					.headers(sp_headers_2),
				http("request_4")
					.get("/cgi-bin/welcome.pl?signOff=true")
					.headers(sp_headers_1),
				http("request_5")
					.get("/WebTours/home.html")
					.headers(sp_headers_1),
				http("request_6")
					.get("/cgi-bin/nav.pl?in=home")
					.headers(sp_headers_1),
				http("request_7")
					.get("/WebTours/images/mer_login.gif")
					.headers(sp_headers_2)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}