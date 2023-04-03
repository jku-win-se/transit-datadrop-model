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
### Further Steps
1. Import the repo into your local workspace
2. Restart eclipse
3. Probably some errors pop up that some ```src``` folders are missing. Create a folders named ```src``` in the root of ```at.jku.se.datadrop.editor.product``` and ```DatadropModel```
4. Clean all projects - now the erros should be gone
___
### Execute the Editor
#### With shipped product export
The editor comes with an exported eclipse product configuration (this one in turn can be turned into an executable like a jar).
To execute the product, open the eclipse project ```at.jku.se.datadrop.editor.product```. In this project you find a file named ```at.jku.se.datadrop.editor.product.product```. Open this file and at the bottom left (default eclipse view) is a "Launch an Eclipse application" button.
This starts the editor.

Last tested: 23-04-03 on
- Windows 10 Pro
- 64-bit operating system, x64-based processor
- Intel(R) Core(TM) i5-10210U CPU @ 1.60GHz   2.11 GHz
- 16,0 GB (15,8 GB usable)
___
#### From Source
The project is shipped with a predefined run configuration ("Custom Config"). 

Eclipse should notice this per default. If not, the config is located in DatadropModel.plugin/runconfig/Custom Config.launch and can be added manually

## How to use the Editor
* The editor yields two main features: Creating new configs and editing existing configs. These can be reached by clicking the respective button in the main Menu.
* In the editing view, one can add/remove entities with the tree viewer on the left side (right click) and specify the details with the forms.
* Per default, a configuration is exported as XMI file. If additionally a JSON file is required, check the respective box in the export menu. JSON files are meant to be imported in the DataDrop Platform web-page while the XMI files are required to edit a config again in the editor. The editor cannot import a JSON file to edit the config again in the editor!
