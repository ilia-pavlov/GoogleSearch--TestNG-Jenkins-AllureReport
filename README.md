#  GoogleSearchTest
## purpose: testNG + Maven + Jenkins + Allure report by example of Google search
1. cross platform testing for MacOS and Windows10
2. cross browser testing on FireFox81 and Chrome86
3. implement testNg
4. implement log4j
5. setup continuous integration use Jenkins
6. setup Allure report 
### test plan:
#### before test:
1. set up multiple platform parameters : MacOS / Windows 10 
2. set up cross browser parameters FireFox81 and Chrome86
3. set up testNG
#### tc 01 (select prioriry and type of test):
1. open main page
2. sumbint query ("Selenium and Maven") 
3. verify result by stats on resul page
#### tc 02 (select prioriry and type of test):
1. open main page ("TestNg and prioritize")
2. sumbint query ("Selenium and Maven") 
3. verify result by stats on resul page
#### tc 03 (select prioriry and type of test):
1. open main page 
2. sumbint query ("In JAVA we trust!") 
3. verify result by stats on resul page

--------------------------------------------------------
### Download

You can use one of the following ways to get Allure:

* Grab it from [bintray](https://bintray.com/qameta/maven/allure2) (see Downloads section).
* Using Homebrew:

    ```bash
    $ brew install allure
    ```
* For Windows, Allure is available from the [Scoop](http://scoop.sh/) commandline-installer.
To install Allure, download and install Scoop and then execute in the Powershell:

    ```bash
    scoop install allure
    ```



=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-
### Extra materials
# Allure-report

1. [Allure Maven Plugin](https://github.com/allure-framework/allure-maven/tree/dependabot/maven/maven.version-3.6.3)
2. [Allure Report](https://github.com/allure-framework/allure2/blob/actions/README.md)
3. [results does not exists](https://github.com/allure-framework/allure2/issues/1133)
4. [The available latest version of allure-testng](https://docs.qameta.io/allure/#_testng)
5. [allure-framework/allure-core](https://gitter.im/allure-framework/allure-core?at=5e3c401fd9895b17c3d5d0e2)
6. [allure-results does not exists](https://github.com/jenkinsci/allure-plugin/issues/201)
