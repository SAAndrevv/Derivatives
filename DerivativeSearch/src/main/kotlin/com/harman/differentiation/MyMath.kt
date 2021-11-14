package com.harman.differentiation

/**
 * Linear interpolation and differentiation of functions math class
 */
class MyMath {
    companion object {

        /**
         * Linear interpolation formula
         * x2 <= x <= x1
         */
        fun linearInterpolation(x: Double, x1: Double,x2: Double, fx1: Double, fx2: Double) : Double =
            fx1 + (fx2 - fx1) / (x2 - x1) * (x - x1)

        /**
         * Left Difference Derivative
         * fxh = f(x + h)
         * fx = f(x)
         * x + h >= x
         */
        fun oneWayDifferenceLeft(fxh: Double, fx: Double, h:Double): Double =
            (fxh - fx) / h

        /**
         * Right Difference Derivative
         * fxh = f(x - h)
         * fx = f(x)
         * x - h <= x
         */
        fun oneWayDifferenceRight( fx: Double, fxh: Double, h:Double): Double =
            (fx - fxh) / h

        /**
         * Central Difference Derivative
         * fxh1 = f(x + h)
         * fxh2 = f(x - h)
         * x + h >= x - h
         */
        fun derivativeCentralDifference(fxh1: Double, fxh2: Double, h: Double): Double =
            (fxh1 - fxh2) / (2 * h)
    }
}