package bootcamp.com.bootcampkotlin

import android.util.Log

// TODO example of lambdas and enum
enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)
}

class Game {
    //lambda - annonymous functions without a name
    var path = mutableListOf<Direction>(Direction.START)
    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }
    val end = {
        path.add(Direction.END)
        Log.d("", "Game Over")
        Log.d("Path: ", "" + path)
        path.clear()
    }
}


