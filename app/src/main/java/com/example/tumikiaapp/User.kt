package com.example.tumikiaapp

class User {
    var name:String = ""
    var email:String = ""
    var info:String = ""
    var time_id:String = ""

    constructor(name: String, email: String, info: String, time_id: String) {
        this.name = name
        this.email = email
        this.info = info
        this.time_id = time_id
    }
    constructor()
}