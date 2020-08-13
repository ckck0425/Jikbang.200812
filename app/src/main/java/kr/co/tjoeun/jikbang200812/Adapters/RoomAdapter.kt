package kr.co.tjoeun.jikbang200812.Adapters

import android.appwidget.AppWidgetHostView
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.jikbang200812.R
import kr.co.tjoeun.jikbang200812.datas.Room
import java.math.MathContext
import java.text.NumberFormat
import java.util.*

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<Room>
) : ArrayAdapter<Room>(mContext, resId, mList){

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null){
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }
        val row = tempRow!!

        val descTxt = row.findViewById<TextView>(R.id.descTxt)
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addTxt = row.findViewById<TextView>(R.id.addTxt)

        val data = mList[position]

        descTxt.text = data.description
        if (data.price >= 10000) {

//            / -> 나누기 하고 소숫점 뒤에 버림
//            % -> 나누기 하고 소숫점 뒷자리 나타내줌???

            val hm = data.price / 10000
            val th = data.price % 10000
            priceTxt.text = "${hm}억${NumberFormat.getNumberInstance(Locale.KOREA).format(th)
            }"

        }
        else {
            priceTxt.text = NumberFormat.getNumberInstance(Locale.KOREA).format(data.price)
        }


//        층수 >= 1 : 2층, 5층 등
//        층수 == 0 : 반지하
//        그외 : 지하 2층, 지하 1층 등
//           ㄴ>>  그냥 하면 지하 -1층으로  나오니까 앞에 - 붙여서 + 만들어줌

        var floorStr : String
        if(data.floor >= 1 ){
            floorStr = "${data.floor}층"
        }
        else if (data.floor == 0){
            floorStr = "반지하"
        }
        else {
            floorStr = "지하 ${-data.floor}층"
        }

        addTxt.text = "${data.address}, ${floorStr}"


        return row

    }

}
