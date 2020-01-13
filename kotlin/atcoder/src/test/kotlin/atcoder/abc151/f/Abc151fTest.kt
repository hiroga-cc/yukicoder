package atcoder.abc151.f

import assertIOWithInError
import org.junit.Test

class Abc151fTest {
    private val ERROR = Math.pow(10.0, -6.0)
    
    @Test
    fun case1() {
        assertIOWithInError(
            """
            2
            0 0
            1 0
            """.trimIndent(), "0.500000000000000000", ERROR, ::main
        )
    }

    @Test
    fun case2() {
        assertIOWithInError(
            """
            3
            0 0
            0 1
            1 0
            """.trimIndent(), "0.707106781186497524", ERROR, ::main
        )
    }

    @Test
    fun case3() {
        assertIOWithInError(
            """
            10
            10 9
            5 9
            2 0
            0 0
            2 7
            3 3
            2 5
            10 0
            3 7
            1 9
            """.trimIndent(), "6.726812023536805158", ERROR, ::main
        )
    }

    @Test
    fun case10() {
        assertIOWithInError(
            """
            50
            338 472
            875 672
            213 422
            264 128
            844 713
            269 474
            845 174
            408 603
            34 422
            322 840
            897 608
            324 452
            244 440
            525 383
            872 985
            112 946
            47 867
            728 829
            665 615
            902 481
            677 789
            697 770
            0 743
            519 389
            814 626
            839 832
            988 531
            750 370
            300 566
            2 552
            919 149
            874 631
            392 984
            421 511
            67 161
            262 249
            280 294
            154 322
            292 745
            318 99
            947 310
            549 391
            831 315
            635 850
            691 937
            568 955
            162 231
            596 35
            845 428
            672 355
            """.trimIndent(), "577.401596983438359700", ERROR, ::main
        )
    }
}