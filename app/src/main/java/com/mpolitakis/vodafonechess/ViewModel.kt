package com.mpolitakis.vodafonechess

class ViewModel {

    val board = mutableListOf<Pair<Int, Int>>()
    var startingChoice : Pair<Int, Int>? = null
    var endChoice : Pair<Int, Int>? = null

}