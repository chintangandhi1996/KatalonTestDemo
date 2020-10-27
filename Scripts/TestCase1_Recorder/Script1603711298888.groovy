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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://exxat-uat-apps.azurewebsites.net/Fusion/Account/Login')

WebUI.setText(findTestObject('Object Repository/Test1_Recorder/Page_Login/input_Username_Username'), 'exxat')

WebUI.setEncryptedText(findTestObject('Object Repository/Test1_Recorder/Page_Login/input_Password_Password'), 'gPJAcWMbZfY9Jbb8mllWxXYZ8pPW1Xgy')

WebUI.click(findTestObject('Object Repository/Test1_Recorder/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Test1_Recorder/Page_Launch/div_A. Physical Therapy                    _bf2bb5'))

WebUI.click(findTestObject('Object Repository/Test1_Recorder/Page_Launch/a_Augusta-PT'))

WebUI.click(findTestObject('Object Repository/Test1_Recorder/Page_Dashboard/img'))

WebUI.click(findTestObject('Object Repository/Test1_Recorder/Page_Launch/i_Exxat LLC_fa fa-angle-down'))

WebUI.closeBrowser()

