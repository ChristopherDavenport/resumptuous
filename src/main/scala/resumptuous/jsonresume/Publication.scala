package resumptuous.jsonresume

import scala.Option
import scala.Predef.String

/**
 * Publication Information
 *
 * @param name e.g. The World Wide Web
 * @param publisher e.g. IEEE, Computer Magazine
 * @param releaseDate e.g. 1990-08-01
 * @param url e.g. http://www.computer.org.example.com/csdl/mags/co/1996/10/rx069-abs.html
 * @param summary Short summary of publication. e.g. Discussion of the World Wide Web, HTTP, HTML.
 */
case class Publication(
    name: Option[String],
    publisher: Option[String],
    releaseDate: Option[String],
    url: Option[String],
    summary: Option[String]
)
