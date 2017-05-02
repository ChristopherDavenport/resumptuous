package resumptuous.jsonresume

import scala.List
import scala.Option
import scala.Predef.String

/**
 * A Volunteer Based Position
 *
 * @param organization e.g. Facebook
 * @param position e.g. Software Engineer
 * @param url e.g. http://facebook.example.com
 * @param startDate resume.json uses the ISO 8601 date standard e.g. 2014-06-29
 * @param endDate resume.json uses the ISO 8601 date standard e.g. 2014-06-29
 * @param summary Give an overview of your responsibilities at the company
 * @param highlights Specify accomplishments and achievements
 */
case class Volunteer(
    organization: Option[String],
    position: Option[String],
    url: Option[String],
    startDate: Option[String],
    endDate: Option[String],
    summary: Option[String],
    highlights: Option[List[String]]
)
