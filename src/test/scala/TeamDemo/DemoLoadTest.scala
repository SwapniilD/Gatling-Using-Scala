package TeamDemo

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class DemoLoadTest extends Simulation {

  // Protocol Definition
  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("https://reqres.in/api")

  // Scenario Definition
  val scene = scenario("Demo-Test")

    .exec(
      http("Get User Request")
        .get("/users?page=2")
        .check(status.is(200),bodyString.saveAs("body")
        )
    )

      .pause(1)

    .exec(
      http("Post Request")
        .post("/users")
        .body(RawFileBody("data/Demo/user.json")).asJson
//        .body(StringBody(session =>
//            s"""
//          {
//						"name": "Swapnil",
//						"job": "Dorge"
//					}
//            """
//        )).asJson
        .check(status.is(201),bodyString.saveAs("body")
        )
    )

  // SetUp Configuration
  setUp(
    scene.inject(
      //nothingFor(1), // Optional: Wait 1 second before starting the injection
      //atOnceUsers(1), // Start injecting users one by one
      rampUsers(25).during(10) // Inject 25 users over 10 seconds
    )
  ).protocols(httpProtocol)
}



//mvn gatling:test -Dgatling.simulationClass=TeamDemo.DemoLoadTest
