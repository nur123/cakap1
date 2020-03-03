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

WebUI.setText(findTestObject('Login/Button/input login email'), emaillogin)

WebUI.setText(findTestObject('Login/Button/input password'), password)

WebUI.click(findTestObject('Login/Button/button login'))

WebUI.waitForPageLoad(20)

WebUI.waitForJQueryLoad(20)

WebUI.waitForElementPresent(findTestObject('Login/Button/button login'), 10)

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.urlLoginSchedule)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.delay(2)
