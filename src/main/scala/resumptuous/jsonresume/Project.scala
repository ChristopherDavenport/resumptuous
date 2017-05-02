package resumptuous.jsonresume

import scala.List
import scala.Option
import scala.Predef.String

/**
 * Specify Career Projects
 *
 * @param name e.g. The World Wide Web
 * @param description Short summary of project. e.g. Collated works of 2017.
 * @param highlights Specify multiple features
 * @param keywords Specify special elements involved
 * @param startDate resume.json uses the ISO 8601 date standard e.g. 2014-06-29
 * @param endDate e.g. 2012-06-29
 * @param url e.g. http://www.computer.org/csdl/mags/co/1996/10/rx069-abs.html
 * @param roles Specify your role on this project or in company
 * @param entity Specify the relevant company/entity affiliations e.g. 'greenpeace', 'corporationXYZ'
 * @param `type` e.g. 'volunteering', 'presentation', 'talk', 'application', 'conference'
 */
case class Project(
    name: Option[String],
    description: Option[String],
    highlights: Option[List[String]],
    keywords: Option[List[String]],
    startDate: Option[String],
    endDate: Option[String],
    url: Option[String],
    roles: Option[List[String]],
    entity: Option[String],
    `type`: Option[String]
)
