package Entities

abstract class BaseEntity {

    var id: Int=0;
    constructor(){
        ++id
    }
}