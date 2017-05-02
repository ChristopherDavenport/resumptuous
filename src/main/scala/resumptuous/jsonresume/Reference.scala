package resumptuous.jsonresume

import scala.Option
import scala.Predef.String

/**
 * List references you have received
 *
 * @param name e.g. Timothy Cook
 * @param reference e.g. Joe blogs was a great employee, who turned up to work at least once a week.
 *                  He exceeded my expectations when it came to doing nothing.
 */
case class Reference(
    name: Option[String],
    reference: Option[String]
)
