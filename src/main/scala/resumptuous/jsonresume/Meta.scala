package resumptuous.jsonresume

import scala.Option
import scala.Predef.String

/**
 * The schema version and any other tooling configuration lives here
 * @param canonical URL (as per RFC 3986) to latest version of this document
 * @param version A version field which follows semver - e.g. v1.0.0
 * @param lastModified Using ISO 8601 with YYYY-MM-DDThh:mm:ss
 */
case class Meta(
    canonical: Option[String],
    version: Option[String],
    lastModified: Option[String]
)
