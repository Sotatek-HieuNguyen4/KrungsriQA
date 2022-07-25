## Prerequisites
- Browser: Google Chrome version > 98.0
- Java 11 
- Intellij IDE 

## Folder Structure
```
src/main
    |
    \-- java
    |   |
    |   +--actions
           |
           +--commons 
              +--BasePage -> contains Core and Common methods
              +--BaseTest -> Contains testSet-up : Init Browsers, Init Test sesstion
           +--pageObjects -> contains method used for testing page
        +--interfaces
           |
           +--pageUIs -> contains WebElements
        +--reports -> report configs
        +--test
           |
           +--testCases -> contains all testcases
    |
    \-- resources
        |
        +-- allure.properties
        +-- runTest.xml 
```
 ## How to run the test: 
- Clone project to local machine
  - Install dependencies: run command `mvn clean install`
  - Run Test: point to src/runTest.xml -> right click -> run with TestNG 
  - report view: `allure serve src/output/allure-json`

## TestCases: 
- You can change the filter option by input data on src/main/java/test/FindCarTestCases.java -> point to DataProvider
-                 {"รถเก๋ง", "TOYOTA", "CAMRY", "CAMRY 2.0", "2565 (2022)","กาญจนบุรี","ชั้น 1"} -> corespond with: 
     ->  { carType, carBrand, carModel, carSubModel, carRegisYear,carRegisProvince, carInsurance }
 so that you can perform as many testcases as you want for the scenario without adding any code 

## Framework expand ( if needed): 
- Add Log for reporting
- Add Data CSV and Json for seperate class
- Add details instruction for README.md