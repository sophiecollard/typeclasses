package typeclasses.animals.oop

import typeclasses.animals.DogBreed

final case class Dog(name: String, breed: DogBreed)
  extends JsonEncodable
    with XmlEncodable {

  override def toJson: String =
    s"""{
       |  "name" : "$name",
       |  "breed" : "${breed.toString}"
       |}""".stripMargin

  override def toXml: String =
    s"""<Dog>
       |  <name>$name</name>
       |  <breed>${breed.toString}</breed>
       |</Dog>
       |""".stripMargin

}
