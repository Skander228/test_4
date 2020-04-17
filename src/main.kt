/*
    Задание No1
    Измените программу, сделанную в задании No1 практической работы No1:
    основной алгоритм вынесите в функцию. Опишите функцию несколькими
    способами:
    1. как обычную функцию;
    2. как tailrec-функцию.

    Задание No2
    В программе, сделанной в задании No1, вынесите проверяемое условие в
    отдельную single-expression функцию.

    Задание No3
    Функции, созданные в задании No1, модифицируйте таким образом, что-
    бы условие, по которому происходит отбор, можно было передавать как ар-
    гумент (один из аргументов функции должен быть lambda со значением по

    умолчанию – условием, что указано было в вашем варианте).

    
*/


fun zadanie1_1(s: String) {
    try {
        //val s = readLine()
        var n = -1
        if (s != null) {
            for (q in s) {
                val b = q.toInt()-48
                if (b == 9 || b == 6 || b == 3) {
                    if (n == -1) {
                        n = b
                    } else {
                        if (n < b) {
                            n = b
                        }
                    }
                }
            }
        }
        if (n == -1) {
            println("No even numbers")
        }
        println(n)
    } catch (e: NumberFormatException) {
        println("Error")
    }
}

tailrec fun zadanie1_2(s: String) {
    try {
        //val s = readLine()
        var n = -1
        //if (s != null) {
        fun zadanie2(s: String) = s != null
        if (zadanie2(s)) {
            for (q in s) {
                val b = q.toInt()-48
                if (b == 9 || b == 6 || b == 3) {
                    if (n == -1) {
                        n = b
                    } else {
                        if (n < b) {
                            n = b
                        }
                    }
                }
            }
        } else {
            println("Vi nithego ne vveli")
        }
        if (n == -1) {
            println("No even numbers")
        }
        println(n)
    } catch (e: NumberFormatException) {
        println("Error")
    }

}

fun zadanie3(s: String) {
    try {
        var n = -1
        if (s != null) {
            for (q in s) {
                val b = q.toInt()-48
                val number: (Int, Int) -> Int = {a,b -> a + b}
                if (b == 9 || number(5,4) == number(3,3) || b == number(1,2)) {
                    if (n == -1) {
                        n = b
                    } else {
                        if (n < b) {
                            n = b
                        }
                    }
                }
            }
        }
        if (n == -1) {
            println("No even numbers")
        }
        println(n)
    } catch (e: NumberFormatException) {
        println("Error")
    }
}

/*Функции, созданные в задании No1, модифицируйте таким образом, что-
бы условие, по которому происходит отбор, можно было передавать как ар-
гумент (один из аргументов функции должен быть lambda со значением по
умолчанию – условием, что указано было в вашем варианте).*/

fun main() {
    println("Enter number: ")
    zadanie1_1(readLine()!!.toString())
    zadanie1_2(readLine()!!.toString())
    zadanie3(readLine()!!.toString())
}

