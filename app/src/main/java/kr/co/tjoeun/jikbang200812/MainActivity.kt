package kr.co.tjoeun.jikbang200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.jikbang200812.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

//        메인화면의 이벤트 관련 코드 모아둘 장소
//        방목록을 강제로 추가하는 코드

        mRoomList.add(Room(8500,"서울시 은평구", 5, "은평구의 5층 방 입니다."))
        mRoomList.add(Room(12500,"서울시 은평구", 2, "은평구의 2층 방 입니다."))
        mRoomList.add(Room(5900,"서울시 은평구", -1, "은평구의 지하 1층 방 입니다."))
        mRoomList.add(Room(7200,"서울시 영등포구", 6, "영등포구의 6층 방 입니다."))
        mRoomList.add(Room(10000,"서울시 영등포구", 2, "영등포구의 2층 방 입니다."))
        mRoomList.add(Room(11000,"서울시 영등포구", 7, "영등포구의 7층 방 입니다."))
        mRoomList.add(Room(9000,"서울시 동대문구", 0, "동대문구의 반지하 방 입니다."))
        mRoomList.add(Room(12000,"서울시 동대문구", 10, "동대문구의 10층 방 입니다."))
        mRoomList.add(Room(8400,"서울시 동대문구", 1, "동대문구의 1층 방 입니다."))
        mRoomList.add(Room(9800,"서울시 동대문구", 4, "동대문구의 4층 방 입니다."))

    }

    override fun setValues() {

//        메인화면의 값 출력 관련 코드 모아둘 장소
    }



}
