package com.example.testing

object Registeration {
    private val users= arrayOf("mohamed","ali","adel")

    /**
     * #### this test will be set source inside test because is not rely with emaluter
     * this fun will be valid if
     * 1-if username is not empty
     * 2-if password lenght < 3
     * 3-if username is not register before
     * 4-if confirme password == password
     **/

    fun register(
        username:String,
        password:String,
        confPassword:String
    ):Boolean{
        if (username.isEmpty()){
            return false
        }
        if (password.length<3){
            return false
        }
        if (username in users){
            return false
        }
        if (password!=confPassword){
            return false
        }
        return true
    }
}