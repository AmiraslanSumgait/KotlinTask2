package Entities

class Category {
    var name: String
    var categoryId: Int
    var projects = listOf<Project>()
    constructor(name:String,categoryId:Int){
        this.name=name
        this.categoryId=categoryId
    }
}