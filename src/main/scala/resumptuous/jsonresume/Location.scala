package resumptuous.jsonresume

import scala.Option
import scala.Predef.String

case class Location(
    address: Option[String],
    postalCode: Option[String],
    city: Option[String],
    countryCode: Option[String],
    region: Option[String]
)
