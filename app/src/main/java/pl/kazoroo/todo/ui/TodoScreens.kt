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
    val todoUiState by todoViewModel.uiState.collectAsState()

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
fun TaskColumnItem()
{
    Card(
            elevation = 4.dp,
            modifier = Modifier
                .padding(top = 4.dp, bottom = 4.dp)
                .height(100.dp)
                .fillMaxWidth()) {

        Box(contentAlignment = Alignment.TopEnd) {

        }

        Column(Modifier.wrapContentWidth()) {
            Text(
                    text = "title",
                    modifier = Modifier.padding(
                            start = 28.dp),
                    style = Typography.h1
            )  //title

            Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                    style = Typography.body1,
                    modifier = Modifier.padding(start = 8.dp, end = 30.dp, top = 2.dp))  //description
        }


        Column(horizontalAlignment = Alignment.End) {
            Text(
                    text = "25.01 - 28.01",
                    style = Typography.subtitle1)  //dates

            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit button")
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete button", tint = Color.Red)
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    TaskColumnItem()
}

@Composable
private fun TaskColumn()
{
    LazyColumn(modifier = Modifier.background(color = LightGray100))
    {
        items(tasksData)
        {
            TaskColumnItem()
        }
    }
}