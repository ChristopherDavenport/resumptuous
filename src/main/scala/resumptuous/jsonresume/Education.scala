package resumptuous.jsonresume

import scala.List
import scala.Option
import scala.Predef.String

/**
 * Education Institutions
 *
 * @param institution e.g. Massachusetts Institute of Technology
 * @param area e.g. Arts
 * @param studyType e.g. Bachelor
 * @param startDate e.g. 2014-06-29
 * @param endDate e.g. 2012-06-29
 * @param gpa grade point average, e.g. 3.67/4.0
 * @param courses List notable courses/subjects
 */
case class Education(
    institution: Option[String],
    area: Option[String],
    studyType: Option[String],
    startDate: Option[String],
    endDate: Option[String],
    gpa: Option[String],
    courses: Option[List[String]]
)
