// HFK C9 Page 428-436 - Lists, Mutable Lists - Practice

fun main() {
	
// LIST ----------------------------------------------
    println("----------------------- LIST -----------------------")
    val shopping = listOf("Tea", "Eggs", "Milk")

    // print initial list
    println("List:-  \n" + shopping)
    println("List to String:-  \n" + shopping.joinToString())
    println()
    
    // print the value from a specific index - [] or .get()
    println("shopping[1]:-  \n" + shopping[1])
    println("shopping.get(1):-  \n" + shopping.get(1))
    println()

    // print values of list with a for loop
    println("print list item on each line using for loop:-  ")
    for(item in shopping) {
        println("$item")
    }
    println()
    
    // check whether list contains a specific value or not - .contains()
    println("List contains 'Milk' or not:-  \n" + shopping.contains("Milk"))

    // print index of a specific value - .indexOf()
    println("index of 'Milk':-  \n" + shopping.indexOf("Milk"))
    println(); println()



// MUTABLE LIST ----------------------------------------
    println("----------------------- MUTABLE LIST -----------------------")
    val mShopping = mutableListOf("Tea", "Eggs")
    
    // print initial list
    println("Mutable List:-  \n" + mShopping)
    println(mShopping.size)
    println()

    // add value at the end of list - .add()
    mShopping.add("Milk")
    println("Added value 'Milk':-  \n" + mShopping)
    println(mShopping.size)
    println()

    // add value at a specific index location - .add( , )
    mShopping.add(1, "Coffee")
    println("Added value 'Coffee' at index 1:-  \n" + mShopping)
    println(mShopping.size)
    println()

    // removing value directly - .remove()
    mShopping.remove("Eggs")
    println("Removed value 'Eggs':-  \n" + mShopping)
    println(mShopping.size)
    println()

    // removing value through index - .removeAt()
    mShopping.removeAt(2)
    println("Removed value of index 2:-  \n" + mShopping)
    println(mShopping.size)
    println()

    // replacing values at an index - .set( , )
    mShopping.set(0, "Bread")
    println("Changed index 0 value to 'Bread':-  \n" + mShopping)
    println(mShopping.size)
    println()

    // adding 3 more items...
    mShopping.add("Tea")
    mShopping.add("Milk")
    mShopping.add("Biscuit")
    println("Added 3 more items 'Tea', 'Milk', 'Biscuit':-  \n" + mShopping)
    println()

    // sort the list - .sort()
    mShopping.sort()
    println("Sort List:-  \n" + mShopping)
    println()

    // reverse the list - .reverse()
    mShopping.reverse()
    println("Reverse List:-  \n" + mShopping)
    println()

    // shuffle the list randomly - .shuffle()
    mShopping.shuffle()
    println("Shuffle List:-  \n" + mShopping)
    println(mShopping.size)
    println()

    // bulk add more items from another list - .addAll()
    val moreShopping = listOf("Cookies", "Sugar")
    mShopping.addAll(moreShopping)
    println("Bulk added 2 items 'Cookies', 'Sugar':-  \n" + mShopping)
    println(mShopping.size)
    println()

    // bulk remove specific items - .removeAll()
    val removeItems = listOf("Tea", "Milk")
    mShopping.removeAll(removeItems)
    println("Bulk removed 2 items 'Tea', 'Milk':-  \n" + mShopping)
    println(mShopping.size)
    println()

    // retain specific items & remove everything else - .retainAll()
    val retainItems = listOf("Cookies", "Sugar", "Coffee")
    mShopping.retainAll(retainItems)
    println("Retained 3 items 'Cookies', 'Sugar', 'Coffee':-  \n" + mShopping)
    println(mShopping.size)
    println()

    // save a copy of the list in a variable -
    // .toList(), .toMutableList(), .sorted(), .reversed(), .shuffled()
    val mShoppingSnapShot = mShopping // .to___()
    println("Copy of list:-  \n" + mShoppingSnapShot)
    println(mShoppingSnapShot.size)
    println()

    // clear all items in the list - .clear()
    mShopping.clear()
    println("Cleared the list:-  \n" + mShopping)
    println(mShopping.size)



    println(); println()
}
