package resumptuous.jsonresume

import scala.List
import scala.Option
import scala.Predef.String

/**
 * Interests
 *
 * @param name e.g. Philosophy
 * @param keywords e.g. Friedrich Nietzsche
 */
case class Interest(
    name: Option[String],
    keywords: Option[List[String]]
)
