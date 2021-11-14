package com.harman.differentiation

fun main(args: Array<String>) {
    val x = listOf(0.0, 0.2, 0.4, 0.6, 0.8, 1.0)
    val fx = listOf(1.0, 1.22140, 1.49182, 1.82212, 2.22554, 2.71828)
    val h = 0.2

    val derfx = ArrayList<Double>()

    var tmp: Double
    for (iter in fx.indices) {
        tmp = when(iter) {
            0 -> MyMath.oneWayDifferenceLeft(fx[iter + 1], fx[iter], h)
            fx.lastIndex -> MyMath.oneWayDifferenceRight(fx[iter], fx[iter - 1], h)
            else -> {
                MyMath.derivativeCentralDifference(fx[iter + 1], fx[iter - 1], h)

            }
        }
        derfx.add(tmp)

    }

    println("f(x) = e^x\nx∈[0, 1] h = $h\n")
    print("x     ")
    x.forEach { print(String.format("%9.2f", it))}.also { println() }
    print("f(x)  ")
    fx.forEach { print(String.format("%9.5f", it))}.also { println() }
    print("f'(x) ")
    derfx.forEach { print(String.format("%9.5f", it))}.also { println() }


}