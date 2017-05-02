package resumptuous.jsonresume

import scala.Option
import scala.Predef.String

/**
 * Social Network
 *
 * @param network e.g. Facebook or Twitter
 * @param username e.g. neutralthoughts
 * @param url e.g. http://twitter.example.com/neutralthoughts
 */
case class SocialProfile(
    network: Option[String],
    username: Option[String],
    url: Option[String]
)
