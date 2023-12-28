package com.lin.mykotlin.base


/**
 * 基本语法
 * @author linth
 */
fun main() {
    /**
     * const:常量
     * var:变量
     * val:只读类型的变量
     */

    //可读/可写 变量名: 类型 = 值
    var info: String = "Hello Word"
    info = "Change Word"
    println(info)

    //可读 变量名: 类型 = 值
    val info1: String = "This Only Read"
    println(info1)

    //类型推断
    val name = "linTianHao"
    val age = 25
    println(name + age)

    //常量定义
    //const val PI = 3.1415 不能够在函数内部定义
    println(PI)
}

//查看kt字节码
//Tools-> Kotlin-> Show Kotlin Bytecode
//查看后，点击Decompile，可以查看kt反编译成java


//编译常量
//编译时常量只能是常用的基本数据类型: (String，Double，Int，Float，Long，Short，Byte，Char，Boolean)
//编译时常量只能在函数之外定义，为什么? 答:如果在函数之内定义，就必须在运行时才能调用函数赋值，何来编译时常量一说
// 结论:编译时常量只能在函数之外定义，就可以在编译期间初始了
const val PI = "3.1415"