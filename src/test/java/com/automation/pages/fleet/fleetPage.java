package com.automation.pages.fleet;

import com.automation.pages.AbstractPageBase;
import com.automation.utulities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class fleetPage extends AbstractPageBase {


  @FindBy(className ="grid-header-cell__label" )
   private List<WebElement> infoTableLst;

@FindBy(className = "action btn mode-icon-only dropdown-toggle")
  private WebElement gridSettingBtn;


  public void GetGridTableHeaders(){
      BrowserUtils.TextFromWebElement(infoTableLst);
  }

public void clickGritSettingBtn(){
    wait.until(ExpectedConditions.elementToBeClickable(gridSettingBtn)).click();
}







}
