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

WebUI.openBrowser("https://exxat-uat-apps.azurewebsites.net/Fusion/Home/Launch")

WebUI.maximizeWindow()

for(def i = 1 ; i <= findTestData("TestData1").getRowNumbers() ; i++ ){

	WebUI.setText(findTestObject('Object Repository/Test2_manual/Page_Login/input_Username_Username'), findTestData("TestData1").getValue(1,i) )

	WebUI.setText(findTestObject('Object Repository/Test2_manual/Page_Login/input_Password_Password'), findTestData("TestData1").getValue(2,i))
	
	WebUI.setText(findTestObject('Object Repository/Test1_Recorder/Page_Login/input_Username_Username'), findTestData("TestData2").getValue(1, 1))
	
	Thread.sleep(5000)
}

WebUI.closeBrowser()