package Entities



class User: BaseEntity {
    var userName: String
    var password: Int
    var projects = listOf<Project>()
    constructor(userName:String,password:Int){
        this.userName=userName
        this.password=password
    }
}