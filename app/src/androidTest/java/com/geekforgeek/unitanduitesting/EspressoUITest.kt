package com.geekforgeek.unitanduitesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.geekforgeek.unitanduitesting.Utility.TEST_EMAIL
import com.geekforgeek.unitanduitesting.Utility.TEST_PASSWORD
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class EspressoUITest {

    @get:Rule
    var activityScenarioRUle = activityScenarioRule<EspressoActivity>()

    @Test
    fun text_editTextValueChange(){
        onView(withId(R.id.etEmail)).perform(typeText(TEST_EMAIL))
        onView(withId(R.id.etPassword)).perform(typeText(TEST_PASSWORD))
        onView(withId(R.id.btnLogin)).perform(click())

        onView(withId(R.id.tvText)).check(matches(withText(TEST_EMAIL)))

    }
}