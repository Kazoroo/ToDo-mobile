package pl.kazoroo.todo.data

import pl.kazoroo.todo.model.Task

object TasksData
{
    var tasksData = mutableListOf(
            Task(
                    "Title",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                    "25.01 - 07.02"
            ),
            Task("Get out garbage", "what a stink🤢", "25.01 - 10.04"),
            Task(
                    "vacuum the home",
                    "Take the vaccum machine to the hand and let`s go!",
                    "28.01 - 30.01"
            ),
            Task(
                    "End the ToDo app",
                    "add editing the task, deleting the task and editing the task. If there are a bugs, kill them!!!",
                    "as fast as it is possible"
            )
    )
}