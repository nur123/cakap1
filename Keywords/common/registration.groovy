package common

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

public class registration {
	/**
	 * Registration Student
	 */
	@Keyword
	def registrationStudent() {
		WebUI.setText(findTestObject('Registration/Button/input email'), email)

		WebUI.click(findTestObject('Registration/Button/input gender'))

		WebUI.setText(findTestObject('Registration/Button/input firstname'), firstname)

		WebUI.setText(findTestObject('Registration/Button/input lastname'), lastname)

		WebUI.setText(findTestObject('Registration/Button/input password'), password)

		WebUI.setText(findTestObject('Registration/Button/input confirmpassword'), confirmpassword)

		WebUI.click(findTestObject('Registration/Button/button_sign up'))

		WebUI.waitForJQueryLoad(20)

		WebUI.delay(2)

		WebUI.click(findTestObject('Registration/Button/input button learn'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Registration/Button/input button next'))

		WebUI.delay(2)

		WebUI.setText(findTestObject('Registration/Button/input phone number'), phonenumber)

		WebUI.delay(2)

		WebUI.click(findTestObject('Registration/Button/button_start learning'))

		WebUI.waitForJQueryLoad(20)

		WebUI.delay(2)

		WebUI.click(findTestObject('Registration/Button/button_dashboard'))

		WebUI.waitForPageLoad(20)

		WebUI.waitForJQueryLoad(20)

		WebUI.click(findTestObject('Registration/Button/button_ok'))

		WebUI.waitForPageLoad(20)

		WebUI.waitForJQueryLoad(20)

		WebUI.delay(2)

		//		WebUI.click(findTestObject('Registration/Button/button_drop_icon_logout'))
		//
		//		WebUI.delay(2)
		//
		//		WebUI.click(findTestObject('Registration/Button/button_logout'))
		//
		//		WebUI.waitForJQueryLoad(10)
		//
		//		WebUI.delay(2)
	}
}
