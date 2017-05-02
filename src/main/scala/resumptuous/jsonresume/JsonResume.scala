package resumptuous.jsonresume

import scala.List
import scala.Option

/**
 *
 * @param basics Basic Information
 * @param work Work Information
 * @param volunteer Volunteer Information
 * @param education Education Information
 * @param awards Specify any awards you have received throughout your professional career
 * @param publications Specify your publications through your career
 * @param skills List out your professional skill-set
 * @param languages List any other languages you speak
 * @param interests List any other interests you have
 * @param references List references you have received
 * @param projects Specify career projects
 * @param meta The schema version and any other tooling configuration lives here
 */
case class JsonResume(
    basics: Option[Basics],
    work: Option[List[Work]],
    volunteer: Option[List[Volunteer]],
    education: Option[List[Education]],
    awards: Option[List[Award]],
    publications: Option[List[Publication]],
    skills: Option[List[Skill]],
    languages: Option[List[Language]],
    interests: Option[List[Interest]],
    references: Option[List[Reference]],
    projects: Option[List[Project]],
    meta: Option[Meta]
)
