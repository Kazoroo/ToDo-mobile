package pl.kazoroo.todo.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import pl.kazoroo.todo.data.TasksData.tasksData
import pl.kazoroo.todo.ui.theme.LightGray100
import pl.kazoroo.todo.ui.theme.Typography

@Composable
fun TodoScreen(modifier: Modifier = Modifier, todoViewModel: TodoViewModel = viewModel()) {
    val TodoUiState by todoViewModel.uiState.collectAsState()

    TaskColumn()

    Row(
            horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Add task button",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Gray)
        }
    }


}

@Composable
private fun TaskColumnItem(title: String, description: String, date: String) {
    Card(
            elevation = 4.dp,
            modifier = Modifier
                .padding(top = 4.dp, bottom = 4.dp)
                .height(100.dp)
                .fillMaxWidth()
    ) {

        Column(Modifier.width(48.dp), horizontalAlignment = Alignment.Start) {
            Text(
                    text = title, modifier = Modifier.padding(
                    start = 28.dp
            ), style = Typography.h1
            )  //title

            Text(
                    text = description,
                    style = Typography.body1,
                    modifier = Modifier.padding(start = 8.dp, end = 30.dp, top = 2.dp)
            )  //description
        }


        Column(horizontalAlignment = Alignment.End, modifier = Modifier.width(10.dp)) {
            Text(
                    text = date, style = Typography.subtitle1
            )  //dates

            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit button")
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Delete button",
                        tint = Color.Red
                )
            }
        }
    }
}

@Composable
private fun TaskColumn() {
    LazyColumn(modifier = Modifier.background(color = LightGray100)) {
        items(tasksData) {
            TaskColumnItem(title = it.title, description = it.description, date = it.date)
        }
    }
}

@Preview
@Composable
private fun ColumnPrev() {
    TaskColumn()
}

