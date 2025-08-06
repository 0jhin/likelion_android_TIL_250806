package com.example.myapplication0806.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.myapplication0806.ui.theme.MyApplication0806Theme

@Preview(showBackground = true)
@Composable
fun Mission02Preview() {
    MyApplication0806Theme {
        // 전체 컬럼
        PurchaseFunction(count = 3, price = 5000, optionName = "수량 저장하기", height = 40.dp)
    }
}

@Composable
fun HeartComponent() {
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
}

@Composable
fun OptionButton(optionName: String, modifier: Modifier = Modifier) {
    // 옵션 저장하기 버튼
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxHeight(1f)
            .background(Color.Red.copy(0.4f))) {
        Text("$optionName")
    }
}

@Composable
fun Spacer20(height: Dp) {
    // 공간을 위한 스페이서
    Spacer(modifier = Modifier.height(height))
}

@Composable
fun PriceTag(price: Int) {
    // 4,600원
    Text("${price}원", modifier = Modifier.background(Color.Yellow))
}

@Composable
fun NumCount(count: Int) {
    // + 1 - 부분
    Row(horizontalArrangement = Arrangement
        .spacedBy(10.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .size(40.dp)
                .background(Color.Blue.copy(0.3f))) {
            Text("+")
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .size(40.dp)
                .background(Color.Blue.copy(0.3f))) {
            Text("$count")
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .size(40.dp)
                .background(Color.Blue.copy(0.3f))) {
            Text("-")
        }
    }
}

@Composable
fun TopLine(count: Int, price: Int) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(1f)
    ) {

        // + 1 - 부분
        NumCount(count)

        // 4,600원
        PriceTag(price)
    }
}

@Composable
fun BottomLine(optionName: String) {
    Row(modifier = Modifier.height(60.dp)) {

        HeartComponent()

        // 공간
        Spacer(modifier = Modifier.width(10.dp))

        // 옵션 저장하기 버튼
        OptionButton(optionName = optionName, modifier = Modifier.weight(1f))

    }
}

@Composable
fun PurchaseFunction(count: Int = 1, height: Dp = 20.dp, price: Int, optionName: String = "옵션 저장하기") {
// 전체 컬럼
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .width(400.dp)
            .height(220.dp)
            .padding(20.dp)
    ) {

        // 윗줄
        TopLine(count, price)

        // 공간을 위한 스페이서
        Spacer20(height)

        // 밑에 줄
        BottomLine(optionName)
    }
}