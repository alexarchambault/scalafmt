package org.scalafmt.community

import scala.meta._

case class CommunityBuild(
    giturl: String,
    commit: String,
    name: String,
    excluded: List[String],
    checkedFiles: Int,
    dialect: sourcecode.Text[Dialect],
)
