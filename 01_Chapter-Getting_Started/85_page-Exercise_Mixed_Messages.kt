fun main(args: Array<String>) {

	// HFK page 85 - Exercise - 'Mixed Messages' / Match the code with output.

    var x = 0
    var y = 0

    while (x < 5) {

        // 5]
        if (y < 5) {
            x = x + 1
            if (y < 3) x = x - 1
        }
        y = y + 3
        // 
        
        print("$x$y ")
        x = x + 1
    }


    /* Candidates Codes
    
    1] y = x - y

    2] y = y + x
    
    3]
    y = y + 3
    if (y > 4) y = y - 1
    
    4]
    x = x + 2
    y = y + x

    5]
    if (y < 5) {
        x = x + 1
        if (y < 3) x = x - 1
    }
    y = y + 3

    */

}
