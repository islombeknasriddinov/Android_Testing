package com.example.android_testing

import com.example.android_testing.network.RetrofitHttp
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun chekStatusCode() {
        val response = RetrofitHttp.postService.listPost().execute()
        assertEquals(response.code(), 200)
    }

    @Test
    fun responseIsSuccessful() {
        val response = RetrofitHttp.postService.listPost().execute()
        assertTrue(response.isSuccessful)
    }

    @Test
    fun chekPostListNotNull() {
        val response = RetrofitHttp.postService.listPost().execute()
        assertNotNull(response.body())
    }

    @Test
    fun chekPostLisSize() {
        val response = RetrofitHttp.postService.listPost().execute()
        val posts = response.body()
        assertEquals(posts!!.size, 100)
    }

    @Test
    fun chekFirstUserId() {
        val response = RetrofitHttp.postService.listPost().execute()
        val posts = response.body()
        val post = posts!![0]

    }
}