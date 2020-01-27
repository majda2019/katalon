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

WebUI.setText(findTestObject('Page_Google/input_Connexion_q'), 'test autom')

WebUI.click(findTestObject('Page_Google/b_atis'))

WebUI.click(findTestObject('Page_test automatis - Recherche Google/h3_Mise en uvre de tests fonctionnels automatiss'))

WebUI.click(findTestObject('Object Repository/Page_Mise en uvre de tests fonctionnels automatiss/h2_Intrt des tests automatiss'))

WebUI.click(findTestObject('Object Repository/Page_Mise en uvre de tests fonctionnels automatiss/span_Important'))

WebUI.click(findTestObject('Object Repository/Page_Mise en uvre de tests fonctionnels automatiss/h2_Quest-ce quun test automatis'))

WebUI.click(findTestObject('Object Repository/Page_Mise en uvre de tests fonctionnels automatiss/span_Dfinition'))

WebUI.click(findTestObject('Object Repository/Page_Mise en uvre de tests fonctionnels automatiss/p_Dfinition Un test automatis est un test d_c0594b'))

WebUI.closeBrowser()

