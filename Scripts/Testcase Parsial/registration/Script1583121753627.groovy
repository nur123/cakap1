import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('Registration/Button/input email'), email)

WebUI.click(findTestObject('Registration/Button/input gender'))

WebUI.setText(findTestObject('Registration/Button/input firstname'), firstname)

WebUI.setText(findTestObject('Registration/Button/input lastname'), lastname)

WebUI.setText(findTestObject('Registration/Button/input password'), password)

WebUI.setText(findTestObject('Registration/Button/input confirmpassword'), confirmpassword)

WebUI.click(findTestObject('Registration/Button/button_sign up'))

WebUI.waitForJQueryLoad(10)

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Button/input button learn'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Button/input button next'))

WebUI.delay(2)

WebUI.setText(findTestObject('Registration/Button/input phone number'), phonenumber)

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Button/button_start learning'))

WebUI.waitForJQueryLoad(10)

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Button/button_dashboard'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.waitForElementPresent(findTestObject('Registration/Button/button_dashboard'), 10)

WebUI.click(findTestObject('Registration/Button/button_ok'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.delay(2)

//WebUI.click(findTestObject('Registration/Button/button_drop_icon_logout'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Registration/Button/button_logout'))
//
//WebUI.waitForJQueryLoad(10)
//
//WebUI.delay(2)

