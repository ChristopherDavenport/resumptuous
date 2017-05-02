package resumptuous.jsonresume

import scala.List
import scala.Option
import scala.Predef.String

/**
 * Basic Information
 *
 * @param name e.g. Chris McGoo
 * @param label e.g. Web Developer
 * @param image  URL (as per RFC 3986) to a image in JPEG or PNG format
 * @param email e.g. thomas@gmail.com
 * @param phone Phone numbers are stored as strings so use any format you like, e.g. 712-117-2923
 * @param url URL (as per RFC 3986) to your website, e.g. personal homepage
 * @param summary Write a short 2-3 sentence biography about yourself
 * @param location Address Information
 * @param profiles Specify any number of social networks that you participate in
 */
case class Basics(
    name: Option[String],
    label: Option[String],
    image: Option[String],
    email: Option[String],
    phone: Option[String],
    url: Option[String],
    summary: Option[String],
    location: Option[Location],
    profiles: Option[List[SocialProfile]]
)
