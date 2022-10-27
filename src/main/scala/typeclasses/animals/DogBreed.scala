package typeclasses.animals

sealed trait DogBreed {

  import DogBreed._

  override def toString : String =
    this match {
      case Beagle           => "Beagle"
      case GreatDane        => "Great Dane"
      case Labrador         => "Labrador"
      case Other(breedName) => breedName
    }

}

object DogBreed {

  case object Beagle                        extends DogBreed
  case object GreatDane                     extends DogBreed
  case object Labrador                      extends DogBreed
  final case class Other(breedName: String) extends DogBreed

  def fromString(value: String): DogBreed =
    value.toLowerCase match {
      case "beagle"       => Beagle
      case "great dane"   => GreatDane
      case "labrador"     => Labrador
      case otherBreedName => Other(otherBreedName)
    }

}
