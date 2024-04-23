package dev.aga.domain

import org.jetbrains.exposed.dao.id.LongIdTable

object Parents: LongIdTable("parents") {
  val name = varchar("name", 255)
}
