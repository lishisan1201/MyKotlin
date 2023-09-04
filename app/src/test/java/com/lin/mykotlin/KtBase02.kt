package com.lin.mykotlin

import kotlin.math.abs

/**
 * 二元及多元判断
 * @author linth
 * @create 2023/1/16
 */
fun main() {
    //二元判断

    //if-else 语句块可以直接赋值给一个变量，或者把整个 if-else 作为一个函数的参数。 ---- 即：控制流可以作为表达式
    val test = true
    println(if (test) "is test" else "not test")
    println(if (test) print("134") else "not test")
    val str: String = if (test) "134" else "not test"
    println(str)

    println("")
    println("多元判断")
    //多元判断
    testWhen01()
    //when带返回值
    println(testWhen02(10))
    //添加函数对值进行判断
    println(testWhen03(10))
    //判断数据是否在区间内
    println("数字是否在0-9区间内： " + testWhen04(10))
}

/**
 * 在c/java中  多元判断都是使用switch语句
 * 在kotlin中使用的是when关键字语句
 */
fun testWhen01(a: Int = 3) {
    when (a) {
        0 -> println("input param 0")
        1 -> println("input param 1")
        else -> println("else param $a")
    }
}

/**
 * 带返回值的when
 */
fun testWhen02(a: Int): Boolean {
    return when (a) {
        0, 1 -> true//相同的情况可以写在同一个分支上，用逗号分隔
        2 -> false
        3, 4, 5 -> true
        else -> false
    }
}

/**
 * 不限于对常量的每种情况判断，可以的对其加上函数
 */
fun testWhen03(a: Int): Boolean {
    return when (a) {
        abs(a) -> true //满足函数的返回值，即可走到
        else -> false
    }
}

/**
 * 判断是否在区间中
 */
fun testWhen04(a: Int): Boolean {
    return when (a) {
        in 0..9 -> true
        else -> false
    }
}
