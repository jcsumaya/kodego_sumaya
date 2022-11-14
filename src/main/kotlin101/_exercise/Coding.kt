fun main() {

}

fun teenSum(a: Int, b:Int) =
if(a in 13..99 || b in 13 .. 19){
    19
}else{
    a + b
}
fun frontPiece(nums: IntArray?): IntArray? {

    nums?.let {
        if(it.size <= 2){
            return nums
        }else{
            return intArrayOf(nums[0], nums[1])
        }
    }
    return null
}