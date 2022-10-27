package typeclasses.animals.fp

import typeclasses.animals.DogBreed

final case class Dog(
  name: String,
  breed: DogBreed
)

object Dog {

  implicit val jsonEncoder: JsonEncoder[Dog] =
    JsonEncoder.instance[Dog] { dog =>
      s"""{
         |  "name" : "${dog.name}",
         |  "breed" : "${dog.breed.toString}"
         |}""".stripMargin
    }

//  implicit val xmlEncoder: XmlEncoder[Dog] =
//    XmlEncoder.instance[Dog] { dog =>
//      s"""<Dog>
//         |  <name>${dog.name}</name>
//         |  <breed>${dog.breed.toString}</breed>
//         |</Dog>
//         |""".stripMargin
//    }

}
