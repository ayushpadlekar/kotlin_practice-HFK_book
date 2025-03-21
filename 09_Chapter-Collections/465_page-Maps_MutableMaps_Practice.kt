// HFK C9 Page 465 - Map, MutableMap - Practice

fun main() {

// MAP -----------------------------------------------------------
	println("----------------- MAP ------------------"); println()

    var recipeMap: Map<String, String>
    recipeMap = mapOf("r1" to "Recipe1", "r2" to "Recipe2", "r3" to "Recipe3")
    // print recipeMap
    println("recipeMap :- \n" + recipeMap)
    println(recipeMap.size) // size
    println(recipeMap::class.simpleName) // type
    println()

    // check whether map contains a key or not - .containsKey()
    println("recipeMap.containsKey(\"r1\") :- \n" + recipeMap.containsKey("r1"))
    println()

    // check whether map contains a value or not - .containsValue()
    println("recipeMap.containsValue(\"Recipe2\") :- \n" + recipeMap.containsValue("Recipe2"))
    println()
    
    // get value from index - .getValue()
    val getValue = recipeMap.getValue("r3")
    println("recipeMap.getValue(\"r3\") :- \n" + getValue)
    println()

    // print keys & values of map with for loop
    println("for loop to print keys and values of recipeMap :- ")
    for((key, value) in recipeMap) {
        println("Key: $key, Value: $value")
    }
    println()

    // create a copy of a map - .toMap()
    val recipeMapCopy = recipeMap.toMap()
    println("recipeMap's Copy :-  \n" + recipeMapCopy)
    println(recipeMapCopy.size) // size
    println(recipeMapCopy::class.simpleName) // type
    println()

    // convert map to list - .toList()
    val recipeList = recipeMap.toList()
    println("recipeMap as List :-  \n" + recipeList)
    println(recipeList.size) // size
    println(recipeList::class.simpleName) // type
    println()
    
    // make map's key-value pairs as set - .entries
    println("Map's key-value pairs as Set :-  \n" + recipeMap.entries)
    println(recipeMap.entries.size) // size
    println(recipeMap.entries::class.simpleName) // type
    println()

    // make map's keys as set - .keys
    println("Map's keys as Set :-  \n" + recipeMap.keys)
    println(recipeMap.keys.size) // size
    println(recipeMap.keys::class.simpleName) // type
    println()
    
    // make map's values as set - .values
    println("Map's values as Set :-  \n" + recipeMap.values)
    println(recipeMap.values.size) // size
    println(recipeMap.values::class.simpleName) // type
    println()
    


    println()

// MUTABLE MAP ----------------------------------------------------------
    println("----------------- MUTABLE MAP ------------------"); println()

    val recipeMap2: MutableMap<String, String>
    recipeMap2 = mutableMapOf("r4" to "Recipe4", "r5" to "Recipe5")
    // print initial mutable map
    println("recipeMap2 (initial) :- \n" + recipeMap2)
    println(recipeMap2.size) // size
    println()

    // add an entry in the map - .put(,)
    recipeMap2.put("r6", "Recipe6")
    println("add r6 :- \n" + recipeMap2)
    println(recipeMap2.size) // size
    println()

    // bulk add many entries in the map at once - .putAll()
    val recipesToAdd = mapOf("r7" to "Recipe7", "r8" to "Recipe8", "r9" to "Recipe9")
    recipeMap2.putAll(recipesToAdd)
    println("add r7, r8, r9 :- \n" + recipeMap2)
    println(recipeMap2.size)  // size
    println()

    // remove an entry in the map - .remove()
    recipeMap2.remove("r5")
    println("remove r5 :- \n" + recipeMap2)
    println(recipeMap2.size)  // size
    println()
    // .remove( , )
    recipeMap2.remove("r6", "Recipe6")
    println("remove (r6, Recipe6) :- \n" + recipeMap2)
    println(recipeMap2.size)  // size
    println()

    // Doesn't work for map :(
    // bulk remove many entries in the map - .removeAll()
    // val toRemove = mapOf("r7" to "Recipe7", "r8" to "Recipe8")
    // recipeMap2.removeAll(toRemove)
    // println("remove r7, r8 :- \n" + recipeMap2)
    // println()

    // clear recipeMap2 - .clear()
    recipeMap2.clear()
    println("clear recipeMap2 :- \n" + recipeMap2)
    println(recipeMap2.size)  // size
    println()



    println(); println()
}
