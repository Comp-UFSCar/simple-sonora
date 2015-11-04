![Simple Sonora logo](https://raw.githubusercontent.com/UFSCar-CS-011/simple-sonora/master/docs/simple-sonora-logo.png)

# Wiki
Our Wiki contains all information about Simple Sonora and guides on how to use the language and start composing.
Please access our Wiki [here](https://github.com/UFSCar-CS-011/simple-sonora/wiki).

# How to Run it

## Setting up the environment
Before we start it, there are a couple of things that you will need to install on your computer:
* [Java Development Kit 7+](http://www.oracle.com/technetwork/java/javase/downloads/index.html) (_We tried with both 7 and 8, both are working perfectly_)
* [Eclipse*](https://eclipse.org) (_We are using Mars.1_)
* [XText 2.8.0*](https://eclipse.org/Xtext/download.html)

*you can install XText inside Eclipse usign _update sites_ or download the full Eclipse from XText website that already contains XText in it.

Download and install everything, once you are done, open Eclipse and verify on "File > New > Other... " if there is a XText folder to create an XText Project, if there is - you are good to go. 

## Opening Simple Sonora
_The following steps will only clone this repository and run it as *Eclipse Application* if you have any problems we highly recommend you to do [5 Minutes Tutorial](https://eclipse.org/Xtext/documentation/101_five_minutes.html) from XText website for a better undestanding._

### Importing repository to Eclipse
* Clone this repository or download it as a zip and extract it to a folder on your computer;
* On Eclipse, click "File > Switch Workspace > Other.. " and select the folder where you have Simple Sonora (the root folder).
* Once Eclipse is reloaded on the new Workspace, click "File > Import.." and then "General > Existing Projects into Workspace" and Next.
* Now for _Select Root Directory_ it must be same as your Workspace folder, once it is selected 4 projects will appear:
  * org.xtext.simplesonora
  * org.xtext.simplesonora.sdk
  * org.xtext.simplesonora.tests  **[uncheck this one]**
  * org.xtext.simplesonora.ui
* Click Finish.

### Running Simple Sonora
On Package Explorer, simply right click on the project *org.xtext.simplesonora* and select "Run As" and finally "Eclipse Application". This will start a new instance of Eclipse running Simple Sonora behind it.

Now on this new instance of Eclipse:
* " File > New > Java Project "
* Fill _Project Name_ and complete the rest of the project as you want, and click Finish.
* Open the project folder on Package Explorer, right click on _src_ and " New > File "
* For the __file name__ you must use the extension __.sonora__ (_ex.: sample.sonora_)
* A pop-up message will appear asking if you want to add the Xtext nature to the project, click **Yes**.

There you have it, everything is done and you to start your musical programming adventure!
Samples are available [here](https://github.com/UFSCar-CS-011/simple-sonora/tree/master/samples) and for complete guides you can access the Wiki.
