package resumptuous.jsonresume

import scala.Option
import scala.Predef.String

/**
 * Award Description
 *
 * @param title e.g. One of the 100 greatest minds of the century
 * @param date e.g. 1989-06-12
 * @param awarder e.g. Time Magazine
 * @param summary e.g. Received for my work with Quantum Physics
 */
case class Award(
    title: Option[String],
    date: Option[String],
    awarder: Option[String],
    summary: Option[String]
)
