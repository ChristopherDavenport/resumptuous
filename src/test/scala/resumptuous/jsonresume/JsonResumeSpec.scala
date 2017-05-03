package resumptuous.jsonresume

import scala.io.Source
import org.scalatest.{FlatSpec, Matchers}
import io.circe.generic.auto._
import io.circe.parser._
import io.circe._
// io.circe.generic.semiauto._
//import io.circe.syntax._
import scala.Right
import scala.{None, Some}
import scala.Throwable

class JsonResumeSpec extends FlatSpec with Matchers {

  "Circe" should "Be Able to Derive from an Empty Json" in {
    val resume =
      Source
        .fromResource("jsonresume/examples/valid/empty.json")
        .mkString

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

    decode[JsonResume](resume) shouldBe Right(emptyJsonResume)
  }

  it should "Derive a Json Resume with an Empty Meta" in {
    val resume =
      Source
        .fromResource("jsonresume/examples/valid/empty-meta.json")
        .mkString

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
      Some(
        Meta(
          None,
          None,
          None
        )
      )
    )

    decode[JsonResume](resume) shouldBe Right(emptyJsonResume)
  }

  it should "Fail to Parse a Resume with the wrong type" in {
    val resume =
      Source
        .fromResource("jsonresume/examples/invalid/basics-wrong-type.json")
        .mkString

    intercept[DecodingFailure] {
      throw decode[JsonResume](resume).swap
        .getOrElse(new Throwable("Json Decode Did Not Fail"))
    }
  }

  it should "Fail to Parse a Random Email String" in {
    pendingUntilFixed {
      info("Email Parser Not In Place")

      val resume =
        Source
          .fromResource("jsonresume/examples/invalid/invalid-email.json")
          .mkString

      intercept[DecodingFailure] {
        throw decode[JsonResume](resume).swap
          .getOrElse(new Throwable("Json Decode Did Not Fail"))
      }
      ()
    }
  }

}
