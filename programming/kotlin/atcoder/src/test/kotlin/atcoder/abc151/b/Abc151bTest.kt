package atcoder.abc151.b

import assertIO
import org.junit.Test

class Abc151bTest{

    @Test
    fun case1(){
        assertIO(
            """
            5 10 7
            8 10 3 6
            """.trimIndent(),"8", ::main
        )
    }

    @Test
    fun case2(){
        assertIO(
            """
            4 100 60
            100 100 100
            """.trimIndent(),"0", ::main
        )
    }

    @Test
    fun case3(){
        assertIO(
            """
            4 100 60
            0 0 0
            """.trimIndent(),"-1", ::main
            )
    }
}