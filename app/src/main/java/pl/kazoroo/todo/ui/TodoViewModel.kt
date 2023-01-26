package pl.kazoroo.todo.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import pl.kazoroo.todo.data.TasksData

class TodoViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(TodoUiState())
    val uiState: StateFlow<TodoUiState> = _uiState.asStateFlow()

    private lateinit var title: MutableList<String>
    private lateinit var description: MutableList<String>
    private lateinit var date: MutableList<String>

    @Suppress("UNREACHABLE_CODE")
    private fun getTitle(): MutableList<String> {
        for (i in 0..TasksData.tasksData.size) {
            title[i] = TasksData.tasksData[i].title
            description[i] = TasksData.tasksData[i].description
            date[i] = TasksData.tasksData[i].date
        }

        return title; description; date
    }
}