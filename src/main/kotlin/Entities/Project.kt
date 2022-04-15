package Entities

import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class Project {
    var name: String
    var projectId: Int
    var categoryId:Int
    var userId:Int
    var projectStartTime: LocalTime?=null
    var projectEndTime: LocalTime?=null
    var projectDifferenceTime: Int=0
    constructor(name:String,projectId:Int,categoryId:Int,userId:Int){
        this.name=name
        this.projectId=projectId
        this.categoryId=categoryId
        this.userId=userId
    }
    fun StartTimer() {
       var projectStartTime= LocalDateTime.now()
    }
    fun EndTimer() {
        var projectEndTime= LocalDateTime.now()
    }


    }
    fun projectTimeDifferenceWithSeconds():Int{
        var differenceTime =projectEndTime?.toSecondOfDay()!! - projectStartTime?.toSecondOfDay()!!
        return  differenceTime;
    }
}