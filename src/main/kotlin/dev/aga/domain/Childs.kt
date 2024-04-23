package dev.aga.domain

import org.jetbrains.exposed.dao.id.LongIdTable

object Childs: LongIdTable("childs") {
  val name = varchar("name", 255)
  val parentId = reference("parent_id", Parents)
}
