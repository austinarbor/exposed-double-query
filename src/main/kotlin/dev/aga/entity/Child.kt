package dev.aga.entity

import dev.aga.domain.Childs
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Child(id: EntityID<Long>): LongEntity(id) {
  companion object : LongEntityClass<Child>(Childs)
  var name by Childs.name
  val parent by Parent referencedOn Childs.parentId
}
