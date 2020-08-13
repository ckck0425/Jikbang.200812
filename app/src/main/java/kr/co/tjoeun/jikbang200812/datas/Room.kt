package kr.co.tjoeun.jikbang200812.datas

import java.io.Serializable
import java.text.NumberFormat

class Room(

    val price : Int,
    val address : String,
    val floor : Int,
    val description : String
): Serializable{

    fun getFormattedFloor() : String {
        val floorstr : String
        if (this.floor >= 1 ) {
            floorstr = "${this.floor}층"
        }
        else if (this.floor < 0) {
            floorstr = "지하 ${-this.floor}층"
        }
        else {
            floorstr = "반지하"
        }

        return floorstr

    }

    fun getFormattedPrice() : String {
        if (this.price >= 10000 ) {
            val hm = this.price / 10000
            val thousand = this.price % 10000

//            / -> 나누기 하고 소숫점 뒤에 버림
//            % -> 나누기 하고 소숫점 뒷자리 나타내줌???

            val thousandStr = NumberFormat.getNumberInstance().format(thousand)

            return "${hm}억 ${thousandStr}"

        }
        else {
            return NumberFormat.getNumberInstance().format(this.price)
        }
    }
}

