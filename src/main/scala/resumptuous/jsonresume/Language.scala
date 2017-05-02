package resumptuous.jsonresume

import scala.Option
import scala.Predef.String

/**
 * List any other languages you speak.
 * @param language e.g. English, Spanish
 * @param fluency e.g. Fluent, Beginner
 */
case class Language(
    language: Option[String],
    fluency: Option[String]
)
