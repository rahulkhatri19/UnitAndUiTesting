package com.geekforgeek.unitanduitesting

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.geekforgeek.unitanduitesting.Utility.EMAIL
import com.geekforgeek.unitanduitesting.Utility.PASSWORD
import com.geekforgeek.unitanduitesting.Utility.TEST_EMAIL
import com.geekforgeek.unitanduitesting.Utility.TEST_PASSWORD
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Rule
import org.junit.Test

class ComposeTextCase {

    @get:Rule
    val composeTextCase = createComposeRule()

    @Test
    fun checkTextFiled(){

        val mockkInterface = mockk<LoginInterface>(relaxed = true)

        composeTextCase.setContent {
            LoginScreen(mockkInterface)
        }

        composeTextCase.onNodeWithText(EMAIL).performTextInput(TEST_EMAIL)
        composeTextCase.onNodeWithText(PASSWORD).performTextInput(TEST_PASSWORD)

        composeTextCase.onNodeWithText("Login").performClick()

        composeTextCase.onNodeWithText("Button Clicked !").assertExists()

      //  verify { mockkInterface.onClick() }

    }
}

















