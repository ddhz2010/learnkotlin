package com.davidherndeztechpro.learn.kotlin.mappers

interface Mapper<T, out U> {
    fun map(source : T): U
}