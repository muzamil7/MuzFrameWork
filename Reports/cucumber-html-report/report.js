$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SlideshareLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PracticeTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Login into Home page",
  "description": "",
  "id": "login-functionality;login-into-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the Google Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter user name and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see page logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "SlideshareLogintest.i_am_on_the_Google_Page()"
});
formatter.result({
  "duration": 82145254,
  "error_message": "java.lang.NullPointerException\r\n\tat java.util.Hashtable.put(Hashtable.java:460)\r\n\tat java.util.Properties.setProperty(Properties.java:166)\r\n\tat java.lang.System.setProperty(System.java:796)\r\n\tat dataProviders.ConfigFileReader.getBrowser(ConfigFileReader.java:70)\r\n\tat stepDefination.SlideshareLogintest.i_am_on_the_Google_Page(SlideshareLogintest.java:25)\r\n\tat ✽.Given I am on the Google Page(SlideshareLogin.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SlideshareLogintest.i_enter_user_name_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SlideshareLogintest.i_see_page_logged_in()"
});
formatter.result({
  "status": "skipped"
});
});