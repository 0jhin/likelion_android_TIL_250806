package com.example.myapplication0806

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.myapplication0806.ui.theme.MyApplication0806Theme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication0806Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    test(innerPadding)
                }
            }
        }
    }
}

@Composable
private fun test(innerPadding: PaddingValues) {
    BoxWithonstraintItem(
        modifier = Modifier
            .padding(innerPadding)
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Row(
        modifier = Modifier
            .width(300.dp)
            .height(100.dp)
            .background(Color.LightGray)
            .padding(10.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.bookcover),contentDescription = "책 표지",
            modifier = Modifier
                .height(80.dp)
        )
        Column(verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .padding(start = 5.dp)
        ) {
            Text("베르노")
            Text("[4.10 예약배송]_Short SISISISISI", overflow = TextOverflow.Ellipsis, maxLines = 1,
                modifier = Modifier
            )
            Row(

            ) {
                Text("5%", modifier = Modifier.width(24.dp))
                Text("94,050")
            }
        }
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .width(60.dp)
        ) {
            Text("하트")
            Text("3")
        }
    }
}


@Composable
fun BoxWithonstraintItem(modifier: Modifier = Modifier) {
    BoxWithConstraints(modifier = modifier) {
        if (this.maxWidth > this.maxHeight){
            BView()
        } else {
            AView()
        }
    }
}

@Composable
fun AView() {
    Column(verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFfcecbf), shape = RoundedCornerShape(28.dp))
            .padding(20.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color(0xFF853cfa), shape = RoundedCornerShape(12.dp))

        ) {
            Text("플레이어", style = titleTextStyle, modifier = Modifier
                .align(Alignment.Center)
            )
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color(0xFF757475), shape = RoundedCornerShape(12.dp))
            .padding(12.dp)

        ) {
            Text("영상 제목 1줄영상 제목 1줄영상 제목 1줄영상 제목 1줄영상 제목 1줄영상 제목 1줄영상 제목 1줄",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = titleTextStyle,
                modifier = Modifier
                .align(Alignment.Center)
            )
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color(0xFFcdf4d3), shape = RoundedCornerShape(12.dp))
            .padding(12.dp)

        ) {
            Text("설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리설명 2줄짜리ㅍ",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
//                style = titleTextStyle,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Box(modifier = Modifier
                .width(100.dp)
                .fillMaxHeight()
                .background(Color(0xFFf849c1), shape = RoundedCornerShape(12.dp))
                .padding(8.dp)

            ) {
                Text("썸네일썸네일썸네일썸네일썸네일썸네일",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = titleTextStyle2,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }
            Box(modifier = Modifier
//                .width(170.dp)
                .fillMaxHeight()
                .background(Color(0xFFff9e42), shape = RoundedCornerShape(12.dp))
                .padding(8.dp)
                .weight(1f, fill = false)
            ) {
                Text("유튜버 이름",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = titleTextStyle2,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

        }
    }
}

@Composable
fun BView() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFfcecbf), shape = RoundedCornerShape(28.dp))
            .padding(20.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF853cfa), shape = RoundedCornerShape(12.dp))

        ) {
            Text("플레이어", style = titleTextStyle, modifier = Modifier
                .align(Alignment.Center)
            )
            Column(verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .zIndex(1f)
                    .padding(12.dp)
//                    .background(Color.White)
            ) {
                Row(horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth()
                ) {
                    Box(modifier = Modifier
//                        .width(170.dp)
                        .height(50.dp)
                        .background(Color(0xFFff9e42), shape = RoundedCornerShape(12.dp))
                        .padding(8.dp)
                        .weight(1f, fill = false)

                    ) {
                        Text("영상 제목",
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            style = titleTextStyle3,
                            modifier = Modifier
                                .align(Alignment.Center)
                        )
                    }
                    Row(horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .height(50.dp)
                            .width(170.dp)
                    ) {
                        Box(modifier = Modifier
                            .width(80.dp)
                            .height(50.dp)
                            .background(Color(0xFFf849c1), shape = RoundedCornerShape(12.dp))
                            .padding(8.dp)

                        ) {
                            Text("자막",
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                style = titleTextStyle2,
                                modifier = Modifier
                                    .align(Alignment.Center)
                            )
                        }
                        Box(modifier = Modifier
                            .width(80.dp)
                            .height(50.dp)
                            .background(Color(0xFF757575), shape = RoundedCornerShape(12.dp))
                            .padding(8.dp)

                        ) {
                            Text("설정",
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                style = titleTextStyle2,
                                modifier = Modifier
                                    .align(Alignment.Center)
                            )
                        }
                    }
                }
                Box(modifier = Modifier
                    .width(170.dp)
                    .height(50.dp)
                    .background(Color(0xFF3eadff), shape = RoundedCornerShape(12.dp))
                    .padding(8.dp)
                    .align(alignment = Alignment.CenterHorizontally)

                ) {
                    Text("재생버튼",
                        style = titleTextStyle2,
                        modifier = Modifier
                            .align(Alignment.Center)
                    )
                }
                Box(modifier = Modifier
                    .width(140.dp)
                    .height(50.dp)
                    .background(Color(0xFF66d675), shape = RoundedCornerShape(12.dp))
                    .padding(8.dp)

                ) {
                    Text("즐겨찾기",
                        style = titleTextStyle3,
                        modifier = Modifier
                            .align(Alignment.Center)
                    )
                }
            }
        }

    }
}



//
//// TODO: BoxWithConstraints 연습(세로 모드)
//@Composable
//fun AView(){
//    Column(verticalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFfcecbf), shape = RoundedCornerShape(28.dp))
//            .padding(20.dp)
//    ) {
//        Box(
//            modifier = Modifier
//                .width(170.dp)
//                .height(120.dp)
//                .background(Color(0xFFf89a46), shape = RoundedCornerShape(20.dp))
//        )
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(120.dp)
//                .background(Color(0xFF3eadff), shape = RoundedCornerShape(20.dp))
//        )
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(400.dp)
//                .background(Color(0xFF66d675), shape = RoundedCornerShape(20.dp))
//        )
//    }
//}
//
//
//// TODO: BoxWithConstraints 연습(가로 모드)
//@Composable
//fun BView(){
//    Row(horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFfcecbf), shape = RoundedCornerShape(28.dp))
//            .padding(20.dp)
//    )  {
//        Box(
//            modifier = Modifier
//                .width(150.dp)
//                .height(130.dp)
//                .align(Alignment.Top)
//                .background(Color(0xFF66d675), shape = RoundedCornerShape(20.dp))
//        )
//        Box(
//            modifier = Modifier
//                .width(400.dp)
//                .height(130.dp)
//                .background(Color(0xFFf89a46), shape = RoundedCornerShape(20.dp))
//        )
//        Box(
//            modifier = Modifier
//                .width(130.dp)
//                .height(130.dp)
//                .background(Color(0xFF3eadff), shape = RoundedCornerShape(20.dp))
//        )
//    }
//}

//@Preview(showBackground = true)
@Composable
fun ColorView(){
    Column {
        Box(modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(topStart = 12.dp))
            .background(Color(0xFFE24949))
        ){

        }
        Box(modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            .background(Color(0xFF2E64D0))
        ){

        }
        Box(modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp, bottomEnd = 12.dp))
            .background(Color(0xFF464F57))
        ){

        }
        Box(modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(percent = 50))
            .background(Color(0xFFDF7630))
        ){

        }

    }

}


//@Preview(showBackground = false)
@Composable
fun Mission() {
    Column(verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .size(width = 236.dp, height = 159.dp)
            .background(Color(0xFFffffff), shape = RoundedCornerShape(8.dp))
            .padding(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(57.dp)
        ) {
            Text("지금 닫으시면\n작성된 내용은 모두 사라집니다.\n진행하시겠나요?", style = titleTextStyle4,
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
            )
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .height(34.dp)
                .fillMaxWidth()
        ) {
            Box(modifier = Modifier
                .width(94.dp)
                .fillMaxHeight()
                .background(Color(0xFFe5e5e7), shape = RoundedCornerShape(8.dp))
            ) {
                Text("취소", style = titleTextStyle5, modifier = Modifier
                    .align(alignment = Alignment.Center)
                )
            }
            Box(modifier = Modifier
                .width(94.dp)
                .fillMaxHeight()
                .background(Color(0xFF2258e1), shape = RoundedCornerShape(8.dp))
            ) {
                Text("확인", style = titleTextStyle6, modifier = Modifier
                    .align(alignment = Alignment.Center)
                )
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun Refactoring() {
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .width(400.dp)
                    .height(220.dp)
                    .background(Color.LightGray)
                    .padding(bottom = 12.dp, start = 12.dp, end = 12.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(Color(0xFFffffff), shape = RoundedCornerShape(bottomStart = 12.dp, bottomEnd = 12.dp))
                        .padding(16.dp)
                ) {
                    // + 1 - 부분
                    Row(horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color(0xFFffffff), shape = RoundedCornerShape(percent = 50))
                                .border(border = BorderStroke(width = 1.dp, color = Color(0xFFdddddd)), shape = RoundedCornerShape(percent = 50))
                        ) {
                            Text("-", style = titleTextStyle7)
                        }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .size(40.dp)
//                                .background(Color(0xFFffffff), shape = RoundedCornerShape(percent = 50))

                        ) {
                            Text("1", style = titleTextStyle7)
                        }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color(0xFFffffff), shape = RoundedCornerShape(percent = 50))
                                .border(border = BorderStroke(width = 1.dp, color = Color(0xFFdddddd)), shape = RoundedCornerShape(percent = 50))
                        ) {
                            Text("+", style = titleTextStyle7)
                        }
                    }
                    // 4,600원
                    Text("4,600 원", style = titleTextStyle7)
                }

                // 공간을 위한 스페이서
                Spacer(modifier = Modifier.height(20.dp))

                // 밑에 줄
                Row(modifier = Modifier.height(60.dp)) {

                    // 하트
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxHeight(1f)
                            .width(60.dp)
                            .background(Color.Green.copy(0.3f))) {
                        Text("하트")
                    }

                    // 공간
                    Spacer(modifier = Modifier.width(10.dp))

                    // 옵션 저장하기 버튼
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(1f)
                            .background(Color(0xFFe95241))
                    ) {
                        Text("옵션 저장하기")
                    }

                }
            }
        }