package resumptuous.jsonresume

import scala.List
import scala.Option
import scala.Predef.String

/**
 * List out your professional skill-set
 *
 * @param name e.g. Web Development
 * @param level e.g. Master
 * @param keywords List some keywords pertaining to this skill
 */
case class Skill(
    name: Option[String],
    level: Option[String],
    keywords: Option[List[String]]
)
