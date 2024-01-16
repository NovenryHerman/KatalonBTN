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

WebUI.navigateToUrl('https://www.btnproperti.co.id/tools/hitung-harga-properti')

WebUI.setText(findTestObject('NormalCase_hitung12jt/input_floating-label-field'), '12000000')

WebUI.setText(findTestObject('NormalCase_hitung12jt/input_floating-label-field_1'), '1500000')

WebUI.click(findTestObject('NormalCase_hitung12jt/klikpenghasilantotal'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NormalCase_hitung12jt/select_Jangka Waktu1 Tahun2 Tahun3 Tahun4 T_cf4447'), 
    '1', true)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/NormalCase_hitung12jt/button_Hitung'))

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

