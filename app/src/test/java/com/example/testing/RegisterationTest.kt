package com.example.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegisterationTest{

    @Test
    fun  `notvalid username if is empty`(){
        val result=Registeration.register(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun  `valid username if not empty`(){
        val result=Registeration.register(
            "mohamedali",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun  `notvalid username if is exisit`(){
        val result=Registeration.register(
            "mohamed",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun  `notvalid if confirm not equal password`(){
        val result=Registeration.register(
            "mohamed",
            "124",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun  `notvalid if pass lenqth small then three`(){
        val result=Registeration.register(
            "moha",
            "32",
            "32"
        )
        assertThat(result).isFalse()
    }


}