set ProjectPath=C:\Users\Duggu\eclipse-workspace\Swathi\new\Scenario1
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\Lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml
pause