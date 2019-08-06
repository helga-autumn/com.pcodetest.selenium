# Pecode test 
## Disclaimer
This project contains browser drivers compiled for Windows and is preferably to run on Windows machine.
Also Java executable in pom.xml has hardcoded fullpath (needed to do that as was getting some strange errors during the build)

## Task
Write an automation script using Selenium WebDriver and Maven with Java or C# as language which will open google start page and make a search request with random word. Print the response title as a result of the execution. Use as many OOP paradigms as you can.   

## Description 
I'm quite new to Java (Python is my favourite :) ), so tried to solve this after reading lots of documentation and example tutorials. The structure for automation test cases was built around having access to different drivers and browsers. Tried to use Factory Pattern for Driver manager in order to load dynamically the desired web browser (Firefox 68, Chrome ver.76).

The google search request task is performed in Firefox web browser can be found in test/java/FirefoxTest.java 

Also there is test example from question 7 for writing proper selector for element by XPath. This test can be found in test/java/ChromeTest.java   

## Build Project via Maven
In order to build project and observe test results, clone the repo, make sure that latest java jdk and maven are installed and PATH variables defined properly, open terminal, navigate to project root directory and run: 
```sh
mvn test
```
