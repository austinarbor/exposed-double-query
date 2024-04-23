package dev.aga.entity

import dev.aga.domain.Childs
import dev.aga.domain.Parents
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Parent(id: EntityID<Long>) : LongEntity(id) {
  companion object : LongEntityClass<Parent>(Parents)

  var name by Parents.name
  val children by Child referrersOn Childs.parentId
}
