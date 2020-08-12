package kr.co.tjoeun.jikbang200812.Adapters

import android.appwidget.AppWidgetHostView
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.jikbang200812.R
import kr.co.tjoeun.jikbang200812.datas.Room
import java.math.MathContext

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

        return row

    }

}
