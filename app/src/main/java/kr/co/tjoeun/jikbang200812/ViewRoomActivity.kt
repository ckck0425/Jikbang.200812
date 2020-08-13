package kr.co.tjoeun.jikbang200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ViewRoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room)
        setupEvents()
        setValues()

    }
}
