package i_introduction._8_Smart_Casts

import util.*

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun todoTask8(expr: Expr): Nothing = TODO(
    """
        Task 8.
        Rewrite 'JavaCode8.eval()' in Kotlin using smart casts and 'when' expression.
    """,
    documentation = doc8(),
    references = { JavaCode8().eval(expr) })

