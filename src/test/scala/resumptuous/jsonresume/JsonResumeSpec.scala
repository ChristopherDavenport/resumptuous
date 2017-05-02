package resumptuous.jsonresume

import scala.io.Source
import org.scalatest.{FlatSpec, Matchers}
//import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import scala.Right
import scala.None

class JsonResumeSpec extends FlatSpec with Matchers {

  "Circe" should "Be Able to Derive from an Empty Json" in {
    val resume =
      Source.fromResource("jsonresume/examples/valid/empty.json").mkString

    val emptyJsonResume = JsonResume(
      None,
      None,
      None,
      None,
      None,
      None,
      None,
      None,
      None,
      None,
      None,
      None
    )

    decode[JsonResume](resume.asJson.spaces4) === Right(emptyJsonResume)
  }

}
