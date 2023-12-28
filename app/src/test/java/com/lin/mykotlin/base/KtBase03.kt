package com.lin.mykotlin.base


/**
 * @author linth
 */
fun main() {
    //可空类型
    var address: String? = "福建省福州市"
    var name: String?

    //二元元组   元组内的参数个数必须固定
    val student = Pair(18, "zhangsan")
    println("学生 age=" + student.first + " name=" + student.second)

    //三元元组   元组内的参数个数必须固定
    val student1 = Triple(18, "zhangsan", "girl")
    println("student1 first=" + student1.first + " second=" + student1.second + " third=" + student1.third)

    //区间
    val yi到shi = 1..10 //用拼音是因为 Kotlin 中规则：变量不能以数字或下划线开头
    val yi到shi的奇数 = yi到shi.step(2)
    for (i in yi到shi) {
        print(" $i")
    }
    println()
    for (i in yi到shi的奇数) {
        print(" $i")
    }
    println()
    //区间反转
    for (i in yi到shi的奇数.reversed()) {
        print(" $i")
    }
    println()
}