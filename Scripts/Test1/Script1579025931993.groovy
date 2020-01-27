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

WebUI.navigateToUrl('https://www.google.fr/')

WebUI.setText(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Google/input_Connexion_q'), 'katalon studio')

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Google/span_katalon studio'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_katalon studio - Recherche Google/h3_Katalon  Simplify Web API Mobile Desktop_5ccae8'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Katalon  Simplify Web API Mobile Deskt_8a6745/img'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Katalon  Simplify Web API Mobile Deskt_8a6745/div_Services'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Katalon  Simplify Web API Mobile Deskt_8a6745/div_Services'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Katalon  Simplify Web API Mobile Deskt_8a6745/div_Resources'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Katalon  Simplify Web API Mobile Deskt_8a6745/div_Docs'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/div_Contributing Guidelines_toggle-switch'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/div_Contributing Guidelines_slider round'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/div_Contributing Guidelines_slider round_1'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/a_Products and Licenses'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/a_Katalon Studio Enterprise'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/a_Test Design'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/a_GUI and Preferences'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/a_Projects'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/a_Test Design'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/a_Test Design'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/a_Web Test Design'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Home  Katalon Docs/a_Introduction to Web Testing'))

WebUI.click(findTestObject('Object Repository/Exemple_Katalon_Studio/Page_Introduction to Web Testing  Katalon Docs/a_Creating test case using manual mode'))

WebUI.closeBrowser()

