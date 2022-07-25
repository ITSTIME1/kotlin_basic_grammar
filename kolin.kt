fun main() {
    // 함수 연습
    printMessage("Hello") // 기본적으로 함수를 호출해서 인자값을 넘겨주는 방법.
    printMessageWithPrefix("Hello", "Log") // 기본파라메터를 설정해서 값을 넣어주는 방법(자바의 오버로딩을 이런식으로 표현함)


    /**
     * 기본 인자를 넘겨주지 않았다면 기본적으로 설정 되었던
     * 기본 파라메터 값을 자동 적용해주어 출력하게 된다.
     */
    printMessageWithPrefix("Hello")


    /**
     * 기본 파라메터와 값을 할당해준 파라메터의 위치가 바뀐다면
     * 기본인자인지 혹은 값이 들어가는 파라메터인지 명시해준다면 해당 파라메터를 찾아
     * 값을 할당해주게 된다.
     */

    printMessageWithPrefix(prefix = "Taesun", message = "Hello hi")


    print(sum(5, 6))
    
    /**
     * Infix functions
     */

     infix fun String.onto(other : String) = Pair(this, other)
     val myPair = "McLaken" onto "Laset"
     println(myPair)

     /**
      * Operator
      */
    data class Price(val value: Int) {
        operator fun plus(b: Price): Price {
            return Price(value + b.value)
        }
    }
    
    val c: Int = 10

    // a 변수에 타입인 Price 에다가 value = 10을 저장
    // b 변수에 타입인 Price 에다가 value = 50을 저장
    val a: Price = Price(10)
    print(a)
    val b: Price = Price(50)

    priunt(b)
    // 이때 a 에서 value 값을 10 가져오고 
    // plus 연산자오버로딩을 이용해서 
    // Price(value=10)Price(value=50)
    val result: Price = a + b
    println(result)
    
}


/**
 * 함수를 정의후 파라메터 값을 작성해준 뒤 Unit 값 (반환 타입)은 자바에서의 void와 동일하게
 * 같은 기능을 가지고 있다. 즉 반환 되는 타입이 없다는 것이다.
 */
fun printMessage(message : String) : Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int) : Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y
