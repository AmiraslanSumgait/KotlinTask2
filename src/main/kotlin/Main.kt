import Entities.Category
import Entities.Project
import Entities.User
import kotlin.concurrent.thread

fun main(args: Array<String>) {
 var user1=User()
 var category=Category("Sdf1Task",1)
 var project1= Project( "GeneralTask",1,1,1)
 project1.StartTimer()

 Thread.sleep(1_000)
 project1.EndTimer()
 var difference = project1.projectTimeDifferenceWithSeconds()
 println(difference)

}
