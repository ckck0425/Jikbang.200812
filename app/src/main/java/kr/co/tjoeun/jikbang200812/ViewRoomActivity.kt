package kr.co.tjoeun.jikbang200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room.*
import kotlinx.android.synthetic.main.room_list_item.*
import kotlinx.android.synthetic.main.room_list_item.priceTxt
import kr.co.tjoeun.jikbang200812.datas.Room

class ViewRoomActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

        val room =  intent.getSerializableExtra("roomInfo") as Room
        addTxt.text = room.address
        priceTxt.text = room.getFormattedPrice()
        descTxt.text = room.description
        floor.text = room.getFormattedFloor()

    }

}
