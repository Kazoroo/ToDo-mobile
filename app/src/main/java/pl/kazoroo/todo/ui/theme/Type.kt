package pl.kazoroo.todo.ui.theme

import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
        body1 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp),

        h2 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.W500,
                fontSize = 18.sp),

        h1 = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W900,
                fontSize = 24.sp),

        subtitle1 = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W300,
                fontSize = 14.sp
        )

)

@Preview
@Composable
fun text() {
    Text(text = "Umyć psa", style = Typography.h1)
}