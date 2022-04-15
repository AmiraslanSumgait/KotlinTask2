import Entities.Category
import Entities.Project
import Entities.User
import kotlin.concurrent.thread

fun main(args: Array<String>) {
 var user1=User()
 var category=Category("Sdf1Task",1)
 var project1= Project( "GeneralTask",1,1,1)
  var start=project1.StartTimer();

 Thread.sleep(1_000)
 var end =project1.EndTimer()

var difference=start-end;
println(difference)

}