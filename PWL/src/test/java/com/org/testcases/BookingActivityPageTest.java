package com.org.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.org.pages.BaseClass;
import com.org.pages.BookingActivityPage;

public class BookingActivityPageTest extends BaseClass
{
	
	public BookingActivityPage baPage;
	
   @Test(priority=1)
   public void loginApp() 
   {
	  
	   baPage = PageFactory.initElements(driver, BookingActivityPage.class);
	   baPage.login(config.getUsername(),config.getPassword()); 
   }
   
   @Test(priority=2)
   public void searchItemTest() throws InterruptedException 
   {
	   baPage.searchItem(config.getItemFromCofigFile());
	   Thread.sleep(2000);

   }
   
   @Test(priority=3)
   public void invoiceSearchTextBoxStringDataTest() throws Exception 
   {
	    baPage.invoiceSearchTextBoxData(config.getStringValueFromCofigFile());
   }
   @Test(priority=4)
   public void invoiceSearchTextBoxIntegerDataTest() throws Exception 
   {
	   baPage.invoiceSearchTextBoxData(config.getNumericValueFromCofigFile());
   }
   @Test(priority=5)
   public void SearchTextBoxBlankDataTest() throws Exception 
   {
	   baPage.SearchTextBoxBlankData();
   }
  
   
   @Test(priority=6)
   public void invoiceSearchTextBoxSpecialCharacterTest() throws Exception 
   {
	  baPage.invoiceSearchTextBoxData(config.getSpecialCharacterValueFromCofigFile());
   }
   @Test(priority=7)
   public void invoiceSearchTextBoxCorrectDataTest() throws Exception 
   {
	  baPage.SearchTextBoxCorrectData(config.getCorrectValueFromCofigFile());
   }
   @Test(priority=8)
   public void generateInvoiceTest() throws Exception 
   {
	  baPage.generateInvoice(config.getChargeName());

	}
   @Test(priority=9)
   public void  generateCreditNotesTest() throws Exception 
   {
	   Thread.sleep(3000);
	   baPage.generateCreditNotes();
	   Thread.sleep(3000);
	   		  
   }
   
}
