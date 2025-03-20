// HFK C9 Page 456 - Sets - Practice

fun main() {
	
// SET ----------------------------------------------
    println("----------------------- SET -----------------------")
    val friendSet = setOf("Jim", "Mark", "Elon")

    // print initial set
    println("Set:-  \n" + friendSet)
    println("Set to String:-  \n" + friendSet.joinToString())
    println()

    // print values of set with a for loop
    println("Print set item on each line using for loop:-  ")
    for(item in friendSet) {
        println("$item")
    }
    println()
    
    // check whether set contains a specific value or not - .contains()
    println("Set contains 'Elon' or not:-  \n" + friendSet.contains("Elon"))

    // print index of a specific value in set - .indexOf()
    println("index of 'Elon':-  \n" + friendSet.indexOf("Elon"))
    println()

    // compare 2 sets
    val friendSet2 = setOf("Jim", "Elon", "Mark")
    println("Set 2:-  \n" + friendSet2)
    println("Compare Set==Set2 :-")
    println(friendSet == friendSet2)
    println(); println()



// MUTABLE SET ----------------------------------------
    println("----------------------- MUTABLE SET -----------------------")
    
    // create Mutable list to put it as Set.
    var mShopping = mutableListOf("Sugar", "Cookies", "Coffee", "Tea")
    // print initial list
    println("Initial Mutable List:-  \n" + mShopping)
    println(mShopping.size)
    println()

    // put Mutable List as Mutable Set.
    val mShoppingSet = mShopping.toMutableSet()
    // print mutable set
    println("Mutable Set:-  \n" + mShoppingSet)
    println(mShoppingSet.size)
    println()

    // add value at the end of set - .add()
    mShoppingSet.add("Bread")
    println("Added value 'Bread':-  \n" + mShoppingSet)
    println(mShoppingSet.size)
    println()

    // removing a value directly - .remove()
    mShoppingSet.remove("Tea")
    println("Removed value 'Tea':-  \n" + mShoppingSet)
    println(mShoppingSet.size)
    println()

    // bulk Add more items from another set - .addAll()
    val moreShopping = setOf("Chives", "Spinach", "Carrot")
    mShoppingSet.addAll(moreShopping)
    println("Bulk Add 3 items 'Chives', 'Spinach', 'Carrot':-  \n" + mShoppingSet)
    println(mShoppingSet.size)
    println()

    // bulk Remove specified items - .removeAll()
    val removeItems = setOf("Carrot", "Sugar")
    mShoppingSet.removeAll(removeItems)
    println("Bulk Remove 2 items 'Carrot', 'Sugar':-  \n" + mShoppingSet)
    println(mShoppingSet.size)
    println()

    // bulk Retain specified items & remove everything else - .retainAll()
    val retainItems = setOf("Cookies", "Coffee", "Bread")
    mShoppingSet.retainAll(retainItems)
    println("Bulk Retain 3 items 'Cookies', 'Coffee', 'Bread':-  \n" + mShoppingSet)
    println(mShoppingSet.size)
    println()

    // save a copy of the set in a variable -
    // .toList(), .toMutableSet(), .sorted(), .reversed(), .shuffled(), etc
    val mShoppingSetCopy = mShoppingSet // .to____()
    println("Copy of set:-  \n" + mShoppingSetCopy)
    println(mShoppingSetCopy.size)
    println()

    // put the set into original mutable list
    mShopping = mShoppingSet.toMutableList()
    println("Mutable List new version from set:- \n" + mShopping)
    println(mShopping.size)
    println()

    // create an array from set - .toTypedArray()
    val shoppingArray = mShoppingSet.toTypedArray()
    println("Array from set:- \n" + shoppingArray.joinToString())
    println(shoppingArray.size)
    println()

    // clear all items in the set - .clear()
    mShoppingSet.clear()
    println("Set Cleared:-  \n" + mShoppingSet)
    println(mShoppingSet.size)




    println(); println()
    // Doesn't work for Set :(
    // Removing value through index - .removeAt()
    // mShoppingSet.removeAt(2)
    // println("Removed value of index 2:-  \n" + mShoppingSet)
    // println(mShoppingSet.size)

    // Doesn't work for Set :(
    // replacing values at an index - .set( , )
    // mShoppingSet.set(0, "Tea")
    // println("Changed index 0 value to 'Tea':-  \n" + mShoppingSet)
    // println(mShoppingSet.size)

    // Doesn't work for Set :(
    // sort the set - .sort()
    // mShoppingSet.sort()
    // println("Sort Set:-  \n" + mShoppingSet)
    // println()

    // Doesn't work for Set :(
    // reverse the set - .reverse()
    // mShoppingSet.reverse()
    // println("Reverse Set:-  \n" + mShoppingSet)
    // println()

    // Doesn't work for Set :(
    // shuffle the set randomly - .shuffle()
    // mShoppingSet.shuffle()
    // println("Shuffle Set:-  \n" + mShoppingSet)
    // println(mShoppingSet.size)
    // println()
}
