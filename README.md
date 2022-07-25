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
