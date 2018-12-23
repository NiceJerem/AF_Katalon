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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('www.airfrance.fr')

WebUI.click(findTestObject('RESERVATION_ALLER_OR/Page_00_Billets davion rservation de v/01_span_Accepter'))

WebUI.click(findTestObject('RESERVATION_ALLER_OR/Page_00_Billets davion rservation de v/02_label_ALLER SIMPLE'))

WebUI.setText(findTestObject('RESERVATION_ALLER_OR/Page_00_Billets davion rservation de v/03_input_Aroport de dpart_minibe_'), 
    'CDG' + Keys.ENTER)

WebUI.setText(findTestObject('RESERVATION_ALLER_OR/Page_00_Billets davion rservation de v/04_input_concat(Aroport d arrive'), 
    'NCE' + Keys.ENTER)

WebUI.click(findTestObject('RESERVATION_ALLER_OR/Page_00_Billets davion rservation de v/button_24 dc. 2018'))

WebUI.waitForElementClickable(findTestObject('RESERVATION_ALLER_OR/Page_00_Billets davion rservation de v/td_31'), 0)

WebUI.click(findTestObject('RESERVATION_ALLER_OR/Page_00_Billets davion rservation de v/td_31'))

WebUI.click(findTestObject('RESERVATION_ALLER_OR/Page_00_Billets davion rservation de v/06_button_RECHERCHER'))

WebUI.waitForElementVisible(findTestObject('RESERVATION_ALLER_OR/Page_01_Rserver un billet - Liste des/li_tape en cours    Horaires'), 
    0)

assert true

