package com.example.mydetails

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.mydetails", appContext.packageName)
    }
    @Test
    fun checkWhetherEnteredDetailsAreCorrectOrNot() {
        onView(withId(R.id.name)).perform(typeText("Bhavana"))
        onView(withId(R.id.age)).perform(typeText("22"))
        onView(withId(R.id.email)).perform(typeText("bhavana@gmail.com"))
        onView(withId(R.id.mobile_number)).perform(typeText("12345"))
        onView(withId(R.id.submit)).perform(click())
        onView(withId(R.id.nameTv)).check(matches(withText("Bhavana")))
        onView(withId(R.id.ageTv)).check(matches(withText("22")))
        onView(withId(R.id.emailTv)).check(matches(withText("bhavana@gmail.com")))
        onView(withId(R.id.mobileNumberTv)).check(matches(withText("12345")))

    }
}