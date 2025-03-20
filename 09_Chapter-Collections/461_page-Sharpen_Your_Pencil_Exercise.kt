// HFK C9 Page 461 - Sharpen your pencil Exercise

// Four friends have each made a List of their pets. One item in the List
// represents one pet. Here are the four lists:
fun main() {

    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")


    // Write the code to print how many types of pet there are -
    // Write the code to create new collection named pets that contains each pet.
    // Use the pets collection to get the total number of pets
    println("Code to print how many pets there are -")
    var pets: MutableList<String> = mutableListOf()
    pets.addAll(petsLiam)
    pets.addAll(petsSophia)
    pets.addAll(petsNoah)
    pets.addAll(petsEmily)
    println(pets)
    println(pets.size)
    
    println()

    println("Code to print how many different types of pets there are -")
    val petSet = pets.toMutableSet()
    println(petSet)
    println(petSet.size)
    println()

    // How would you list the types of pet in alphabetical order?
    println("Code to print types of pets in alphabetical order -")
    val petList = petSet.toMutableList()
    petList.sort()
    println(petList)


    // val petsLiamSet = petsLiam.toMutableSet()
    // val petsSophiaSet = petsSophia.toMutableSet()
    // val petsNoahSet = petsNoah.toMutableSet()
    // val petsEmilySet = petsEmily.toMutableSet()

    // val allPets: MutableSet<String> = mutableSetOf()
    // allPets.addAll(petsLiamSet)
    // allPets.addAll(petsSophiaSet)
    // allPets.addAll(petsNoahSet)
    // allPets.addAll(petsEmilySet)
    // println(allPets)
    // println("Types of pet there are - " + allPets.size)


}
