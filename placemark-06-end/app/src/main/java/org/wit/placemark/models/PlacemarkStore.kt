package org.wit.placemark.models

interface PlacemarkStore {
    fun findAll(): List<PlacemarkModel>
    fun create(placemark: PlacemarkModel)
    fun delete(placemark: PlacemarkModel)
    fun update(placemark: PlacemarkModel)
}