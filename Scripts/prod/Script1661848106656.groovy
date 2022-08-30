import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin.r2v2.in/#/home/devices')

WebUI.setText(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/input_Login_mat-input-0'), 
    'gaadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/input_User Id_mat-input-1'), 
    'wBWaYbuXUvE=')

WebUI.click(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/button_Login'))

WebUI.click(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/span_DEVICES'))

WebUI.setText(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/input_Showing Pageof_no-border no-outline p_6051d1'), 
    '863234058268302')

WebUI.sendKeys(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/input_Showing Pageof_no-border no-outline p_6051d1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/span_R2V2CHS000001021'))

WebUI.click(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/span_Status Calls'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/div_Advertisements_ag-header-cell-resize'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/div_Advertisements_ag-header-cell-resize'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/prod/Page_R2V2 Admin Center/Page_R2V2 Admin Center/div_Advertisements_ag-header-cell-resize'))

WebUI.delay(2)

WebUI.closeBrowser()

