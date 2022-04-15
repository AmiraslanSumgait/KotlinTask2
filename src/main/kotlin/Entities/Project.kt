package Entities

import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

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
       this.projectStartTime= LocalDateTime.now()
    }
    fun EndTimer() {
        this.projectEndTime= LocalDateTime.now()
    }

    fun projectTimeDifferenceWithSeconds():Int{
        var differenceTime =this.projectEndTime?.toSecondOfDay()!! - this.projectStartTime?.toSecondOfDay()!!
        return  differenceTime;
    }
