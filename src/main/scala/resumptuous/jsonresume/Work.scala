package resumptuous.jsonresume

import scala.List
import scala.Option
import scala.Predef.String

/**
 * Work History
 *
 * @param name e.g. Facebook
 * @param description e.g. Social Media Company
 * @param position e.g. Software Engineer
 * @param url e.g. http://facebook.example.com
 * @param startDate resume.json uses the ISO 8601 date standard e.g. 2014-06-29
 * @param endDate e.g. 2012-06-29
 * @param summary Give an overview of your responsibilities at the company
 * @param highlights Specify multiple accomplishments
 */
case class Work(
    name: Option[String],
    description: Option[String],
    position: Option[String],
    url: Option[String],
    startDate: Option[String],
    endDate: Option[String],
    summary: Option[String],
    highlights: Option[List[String]]
)
