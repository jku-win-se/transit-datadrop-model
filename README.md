# transit-datadrop-model

## Project Setup

### Plugins and Extensions
Starting from a plain Eclipse IDE for Java developers (https://www.eclipse.org/downloads/packages/release/2021-03/r/eclipse-ide-java-developers), this project requires some additional libraries and extensions:

1. **EMF**
   
   In eclipse workspace go to Help > Install New Software > Work with: 2021-03 - http://download.eclipse.org/releases/2021-03 > Select *EMF - Eclipse Modeling Framework SDK SDK* > Next > ... > Finish
2. **Eclipse Plugin Development Tools**

   In eclipse workspace go to Help > Install New Software > Work with: https://download.eclipse.org/eclipse/updates/4.19/ > Select *Eclipse Plugin Development Tools* > Next > ... > Finish
3. **EMF Json**

   In eclipse workspace go to Help > Install New Software > Work with: http://ghillairet.github.io/p2 > Select *EMF Json*, *Jackson-core* and *jackson-databind* > Next > ... > Finish

   In case of issues the documentation of EMF Json can be found here: https://emfjson.github.io/projects/jackson/latest/
   Tested with the following versions: EMF Json (0.13.0), Jackson-core (2.3.1) and jackson-databind (2.3.1)
4. **EMF Forms**

   In eclipse workspace go to Help > Install New Software > Work with: http://download.eclipse.org/ecp/releases/releases_126/ > Select *EMF Forms SDK* > Next > ... > Finish

The project and it's components have been tested with the versions mentioned or linked above. Newer/Older versions of eclipse and/or the plugins may require additional or less extensions.
___
### Run Configuration
The project is shipped with a predefined run configuration ("Custom Config"). 

Eclipse should notice this per default. If not, the config is located in DatadropModel.plugin/runconfig/Custom Config.launch and can be added manually


## About the Editor
* Exported xmi files can be imported and edited
* Profiles mandatory files edit... (*TODO*)
