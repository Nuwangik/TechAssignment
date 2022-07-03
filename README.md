# Assignment
Using the API given below create an automated test with the listed acceptance criteria:

API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

### Acceptance Criteria:
Name = "Carbon credits"
CanRelist = true
The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"

# Technologies/Tools used in building the framework
* Java – Base language for the test framework.
* TestNG – Test framework
* Rest Assured – API client test library
* Maven – Build tool
* Allure Reports -Reporting framework
* GitHub – Source code repository
* IntelliJ IDEA : IDE for developing the test code. 


# Steps to be followed to execute the TestCase:

## Prerequisites:
* Java 18 , Maven 3.8.6 , [Allure](https://docs.qameta.io/allure) should be installed. Java and Maven paths should be set.
* Clone / Download the project into your local
* Open the Command prompt and navigate to the project folder.
* To execute the test from the command line run the command: **c:\>mvn test** 
* To execute the test from IntelliJ IDEA , Open the project through the IDE, right clicking on the Test CategoryDetail.java and click Run 
* For Test Report : Execute command in **allure serve allure-results** (Test Report will open in a browser )



# Structure:
<img width="771" alt="Screenshot 2022-07-03 at 12 05 46" src="https://user-images.githubusercontent.com/30390455/177028167-bd30bd9b-115a-49df-86fd-4bef61400053.png">
