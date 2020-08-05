$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Login.feature");
formatter.feature({
  "name": "Zoom Car",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Start Journey",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the ZoomCar Instance",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "load the URL",
  "keyword": "And "
});
formatter.match({
  "location": "Login.loadTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on start your wonderful journey",
  "keyword": "When "
});
formatter.match({
  "location": "Login.userStartJourney()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the popular pickup point as Porur",
  "keyword": "And "
});
formatter.match({
  "location": "Login.userSelectPickUpPoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on NEXT",
  "keyword": "And "
});
formatter.match({
  "location": "Login.userClickOnNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "NEXT should success",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.nextShouldSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select start date as tomorrow",
  "keyword": "When "
});
formatter.match({
  "location": "Login.selStartDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on next button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickOnNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "next button should success",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.nextSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the last day",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickOnLastDay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on DONE",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickOnDone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "DONE should success",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.doneSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user find no of cars available",
  "keyword": "And "
});
formatter.match({
  "location": "Login.findNoOfCars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "find the highest car price and car name",
  "keyword": "And "
});
formatter.match({
  "location": "Login.selectSubCategory()"
});
formatter.result({
  "error_message": "java.lang.NumberFormatException: For input string: \"OFFER APPLIED\n- YOU SAVE \n1739\n\n17399\n\n15660\"\n\tat java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)\n\tat java.base/java.lang.Integer.parseInt(Integer.java:652)\n\tat java.base/java.lang.Integer.parseInt(Integer.java:770)\n\tat stepdefinition.Login.selectSubCategory(Login.java:116)\n\tat ✽.find the highest car price and car name(src/test/resources/feature/Login.feature:19)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});