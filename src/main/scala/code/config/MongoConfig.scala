package code
package config

import net.liftweb._
import common._
import mongodb._
import util.Props

import com.mongodb.{ ServerAddress, Mongo }

object MongoConfig extends Loggable {
  def init() {
    val server = new ServerAddress(
      Props.get("mongo.host", "127.0.0.1"),
      Props.getInt("mongo.port", 27017))
    MongoDB.defineDb(DefaultMongoIdentifier, new Mongo(server), Props.get("mongo.dbname", "test"))
  }
}
