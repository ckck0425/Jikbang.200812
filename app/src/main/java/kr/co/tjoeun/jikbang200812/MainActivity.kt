package kr.co.tjoeun.jikbang200812

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.jikbang200812.Adapters.RoomAdapter
import kr.co.tjoeun.jikbang200812.datas.Room

class MainActivity : BaseActivity() {

//    화면에 나타날 방들이 담길 목록(배열)

    val mRoomList = ArrayList<Room>()

//    lateinit var : 변수는 미리 만들지만, 객체 대입 (초기화)은 나중에 하겟다.
//    리스트뷰에 실제 xml + 데이터객체 조합 => 뿌려주는 역할 : Adapter

    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      두개의 함수에 적힌 코드는 반드시 onCreate내부에서 실행 시켜줘야 => 실제로 동작함.
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

//       메인화면의 이벤트 관련 코드 모아둘 장소
//       리스트뷰의 각 줄이 눌리는 시점의 이벤트
//       => 세번째 변수의 이름 확인 (position 또는 i 등 )

        roomListView.setOnItemClickListener { adapterview, view, position, id ->

//            눌린 위치에 해당하는 방이 어떤 방인지 가져오기
            val clickedRoom = mRoomList[position]
            val myIntent = Intent(mContext, ViewRoomActivity::class.java)
            myIntent.putExtra("roomInfo", clickedRoom)
            startActivity(myIntent)
        }
    }

    override fun setValues() {

//        메인화면의 값 출력 관련 코드 모아둘 장소
//        방목록을 강제로 추가하는 코드

        mRoomList.add(Room(8500,"서울시 은평구", 5, "은평구의 5층 방 입니다."))
        mRoomList.add(Room(12500,"서울시 은평구", 2, "은평구의 2층 방 입니다."))
        mRoomList.add(Room(5900,"서울시 은평구", -1, "은평구의 지하 1층 방 입니다."))
        mRoomList.add(Room(7200,"서울시 영등포구", 6, "영등포구의 6층 방 입니다."))
        mRoomList.add(Room(10000,"서울시 영등포구", 2, "영등포구의 2층 방 입니다."))
        mRoomList.add(Room(11000,"서울시 영등포구", 7, "영등포구의 7층 방 입니다."))
        mRoomList.add(Room(9000,"서울시 동대문구", 0, "동대문구의 반지하 방 입니다."))
        mRoomList.add(Room(112000,"서울시 동대문구", 10, "동대문구의 10층 방 입니다."))
        mRoomList.add(Room(8400,"서울시 동대문구", 1, "동대문구의 1층 방 입니다."))
        mRoomList.add(Room(9800,"서울시 동대문구", 4, "동대문구의 4층 방 입니다."))

//        Lateinit var 로 초기화를 미뤄둔 변수의 실제 초기화 코드
//        (어떤화면에서 ? , 어떤모양으로 줄들을 그릴건지?, 어떤목록을 뿌려줄지?)
//        RoomAdapter의 생성자를 만들때 요구했던 자료들을 넣어준다

        mRoomAdapter = RoomAdapter(mContext, R.layout.room_list_item, mRoomList)

//        방목록 리스트뷰의 어댑터로 => mRoomAdapter를 지정해주자
//        실제로 리스트뷰에 목록을 뿌려주게된다

        roomListView.adapter = mRoomAdapter
    }

}
