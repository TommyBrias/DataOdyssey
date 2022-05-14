package org.odyssey

import org.odyssey.df.CreateDf


/**
 * @author ${user.name}
 */
object App {

  def main(args : Array[String]) {
    println("Starting")
    System.setProperty("hadoop.home.dir", "C:/w/env/winutils")
    new CreateDf().createSf()

    }

}
