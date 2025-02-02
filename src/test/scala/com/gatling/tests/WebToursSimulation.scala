package com.gatling.tests

import io.gatling.core.Predef.*
import io.gatling.http.Predef.*

class WebToursSimulation extends Simulation {
  val BASE_URL = "http://localhost:1080"

  //protocol
  val httpProtocol = http
    .baseUrl(BASE_URL)
    .inferHtmlResources()
    .acceptHeader("image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("ru-RU,ru;q=0.9")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36")

  //headers
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

  val fp_headers_0 = Map(
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

  val fp_headers_1 = Map(
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

  val fp_headers_3 = Map(
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val ff_headers_0 = Map(
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "frame",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val cf_headers_0 = Map(
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "frame",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

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

  val hp_headers_0 = Map(
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

  val hp_headers_1 = Map(
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

  val hp_headers_3 = Map(
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val it_headers_0 = Map(
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

  val it_headers_1 = Map(
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

  val it_headers_3 = Map(
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val cr_headers_0 = Map(
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "frame",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val so_headers_0 = Map(
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

  val so_headers_1 = Map(
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "frame",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Upgrade-Insecure-Requests" -> "1",
    "sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val so_headers_3 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  //scenario
  val startPage = scenario("[UC_01]_StartPage")
    .exec(http("sp_request_0")
      .get("/webtours/")
      .headers(sp_headers_0)
      .resources(http("sp_request_1")
        .get("/webtours/header.html")
        .headers(sp_headers_1), http("sp_request_2")
          .get("/webtours/images/hp_logo.png")
          .headers(sp_headers_2), http("sp_request_3")
          .get("/webtours/images/webtours.png")
          .headers(sp_headers_2), http("sp_request_4")
          .get("/cgi-bin/welcome.pl?signOff=true")
          .headers(sp_headers_1), http("sp_request_5")
          .get("/WebTours/home.html")
          .headers(sp_headers_1), http("sp_request_6")
          .get("/cgi-bin/nav.pl?in=home")
          .headers(sp_headers_1), http("sp_request_7")
          .get("/WebTours/images/mer_login.gif")
          .headers(sp_headers_2)))

  val login = scenario("[UC_02]_Login")
    .exec(http("lo_request_0")
      .post("/cgi-bin/login.pl")
      .headers(lo_headers_0)
      .formParam("userSession", "140817.194410693HctDcitptDHftDtfQpHAzzcf")
      .formParam("username", "jojo")
      .formParam("password", "bean")
      .formParam("login.x", "58")
      .formParam("login.y", "14")
      .formParam("JSFormSubmit", "off")
      .resources(http("lo_request_1")
        .get("/cgi-bin/nav.pl?page=menu&in=home")
        .headers(lo_headers_1), http("lo_request_2")
        .get("/cgi-bin/login.pl?intro=true")
        .headers(lo_headers_1), http("lo_request_3")
        .get("/WebTours/images/itinerary.gif")
        .headers(lo_headers_3), http("lo_request_4")
        .get("/WebTours/images/in_home.gif")
        .headers(lo_headers_3), http("lo_request_5")
        .get("/WebTours/images/signoff.gif")
        .headers(lo_headers_3), http("lo_request_6")
        .get("/WebTours/images/flights.gif")
        .headers(lo_headers_3)))

  val flightsPage = scenario("[UC_03]_Flights_Page")
    .exec(http("fp_request_0")
      .get("/cgi-bin/welcome.pl?page=search")
      .headers(fp_headers_0)
      .resources(http("fp_request_1")
        .get("/cgi-bin/reservations.pl?page=welcome")
        .headers(fp_headers_1), http("fp_request_2")
        .get("/cgi-bin/nav.pl?page=menu&in=flights")
        .headers(fp_headers_1), http("fp_request_3")
        .get("/WebTours/images/itinerary.gif")
        .headers(fp_headers_3), http("fp_request_4")
        .get("/WebTours/images/signoff.gif")
        .headers(fp_headers_3), http("fp_request_5")
        .get("/WebTours/images/home.gif")
        .headers(fp_headers_3), http("fp_request_6")
        .get("/WebTours/images/button_next.gif")
        .headers(fp_headers_3), http("fp_request_7")
        .get("/WebTours/images/in_flights.gif")
        .headers(fp_headers_3)))

  val findGFlights = scenario("[UC_04]_Find_Flights")
    .exec(http("ff_request_0")
      .post("/cgi-bin/reservations.pl")
      .headers(ff_headers_0)
      .formParam("advanceDiscount", "0")
      .formParam("depart", "Denver")
      .formParam("departDate", "02/02/2025")
      .formParam("arrive", "Frankfurt")
      .formParam("returnDate", "02/03/2025")
      .formParam("numPassengers", "1")
      .formParam("roundtrip", "on")
      .formParam("seatPref", "None")
      .formParam("seatType", "Coach")
      .formParam("findFlights.x", "57")
      .formParam("findFlights.y", "6")
      .formParam(".cgifields", "roundtrip")
      .formParam(".cgifields", "seatType")
      .formParam(".cgifields", "seatPref"))

  val chooseFlights = scenario("[UC_05]_Choose_Flights")
    .exec(http("cf_request_0")
      .post("/cgi-bin/reservations.pl")
      .headers(cf_headers_0)
      .formParam("outboundFlight", "010;386;02/02/2025")
      .formParam("returnFlight", "100;386;02/03/2025")
      .formParam("numPassengers", "1")
      .formParam("advanceDiscount", "0")
      .formParam("seatType", "Coach")
      .formParam("seatPref", "None")
      .formParam("reserveFlights.x", "57")
      .formParam("reserveFlights.y", "1"))

  val reservation = scenario("[UC_06]_Reservation")
    .exec(http("re_request_0")
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

  val homePage = scenario("[UC_07]_Home_Page")
    .exec(http("hp_request_0")
      .get("/cgi-bin/welcome.pl?page=menus")
      .headers(hp_headers_0)
      .resources(http("hp_request_1")
        .get("/cgi-bin/nav.pl?page=menu&in=home")
        .headers(hp_headers_1), http("hp_request_2")
        .get("/cgi-bin/login.pl?intro=true")
        .headers(hp_headers_1), http("hp_request_3")
        .get("/WebTours/images/flights.gif")
        .headers(hp_headers_3), http("hp_request_4")
        .get("/WebTours/images/itinerary.gif")
        .headers(hp_headers_3), http("hp_request_5")
        .get("/WebTours/images/in_home.gif")
        .headers(hp_headers_3), http("hp_request_6")
        .get("/WebTours/images/signoff.gif")
        .headers(hp_headers_3)))

  val itinerary = scenario("[UC_09]_Itinerary")
    .exec(http("it_request_0")
      .get("/cgi-bin/welcome.pl?page=itinerary")
      .headers(it_headers_0)
      .resources(http("it_request_1")
        .get("/cgi-bin/nav.pl?page=menu&in=itinerary")
        .headers(it_headers_1), http("it_request_2")
        .get("/cgi-bin/itinerary.pl")
        .headers(it_headers_1), http("it_request_3")
        .get("/WebTours/images/home.gif")
        .headers(it_headers_3), http("it_request_4")
        .get("/WebTours/images/signoff.gif")
        .headers(it_headers_3), http("it_request_5")
        .get("/WebTours/images/cancelreservation.gif")
        .headers(it_headers_3), http("it_request_6")
        .get("/WebTours/images/cancelallreservations.gif")
        .headers(it_headers_3), http("it_request_7")
        .get("/WebTours/images/flights.gif")
        .headers(it_headers_3), http("it_request_8")
        .get("/WebTours/images/in_itinerary.gif")
        .headers(it_headers_3)))

  val cancelReservation = scenario("[UC_09]_Cancel_Reservation")
    .exec(http("cr_request_0")
      .post("/cgi-bin/itinerary.pl")
      .headers(cr_headers_0)
      .formParam("flightID", "41148532-84674-JB")
      .formParam("removeAllFlights.x", "36")
      .formParam("removeAllFlights.y", "6")
      .formParam(".cgifields", "1"))

  val signOff = scenario("[UC_10]_Sign_Off")
    .exec(http("so_request_0")
      .get("/cgi-bin/welcome.pl?signOff=1")
      .headers(so_headers_0)
      .resources(http("so_request_1")
        .get("/cgi-bin/nav.pl?in=home")
        .headers(so_headers_1), http("so_request_2")
        .get("/WebTours/home.html")
        .headers(so_headers_1), http("so_request_3")
        .get("/WebTours/images/mer_login.gif")
        .headers(so_headers_3)))

  //setup
  setUp(
    startPage.inject(atOnceUsers(1)).protocols(httpProtocol),
    login.inject(atOnceUsers(1)).protocols(httpProtocol),
    flightsPage.inject(atOnceUsers(1)).protocols(httpProtocol),
    findGFlights.inject(atOnceUsers(1)).protocols(httpProtocol),
    chooseFlights.inject(atOnceUsers(1)).protocols(httpProtocol),
    reservation.inject(atOnceUsers(1)).protocols(httpProtocol),
    homePage.inject(atOnceUsers(1)).protocols(httpProtocol),
    itinerary.inject(atOnceUsers(1)).protocols(httpProtocol),
    cancelReservation.inject(atOnceUsers(1)).protocols(httpProtocol),
    signOff.inject(atOnceUsers(1)).protocols(httpProtocol)
  )
}