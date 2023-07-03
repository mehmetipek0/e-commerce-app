# e-commerce-app

The project consists of 3 main folders: 
01-db-scripts: It is the file that contains the SQL files to create the database of the project.
02-backend: It is the folder where the Java spring boot files are located.
03-frontend: It is the folder where Angular source codes are located.

## Running the application
To run the project locally, the database is first created by running existing scripts. Then, on the backend, the Spring Boot application is run with the Java IDE. Finally, the frontend application is run with Angular CLI.

## Database installation
To create a local root user in MySQL Workbench and subsequently create a   database using a script, follow these steps:
1. Installing MySQL Workbench: The developer needs to download and install MySQL Workbench from the official website.
2. Launching MySQL Workbench: Once installed, the developer can launch MySQL Workbench.
3. Creating a Local Root User:
a.	In MySQL Workbench, the developer should select the "Administration" tab in the home screen.
b.	Under the "Users and Privileges" section, the developer can click on the "Add Account" button.
c.	The necessary user information should be provided, such as the login name (e.g., "root") and a strong password.
d.	For the authentication type, the developer should choose the "Standard" option.
e.	It is recommended to limit the user access to "localhost" in the "Limit to Hosts Matching" section.
f.	After entering the required details, the developer can click "Apply" or "OK" to create the local root user. Then connects to local root user.

4. Creating a Database and ecommerce app using scripts:
a.	Click on the "file" section in the upper left. Open SQL script is clicked and 01-create-user sql script is selected.
b.	Click on the lightning icon and run the script.
c.	These first two operations should be done to all scripts in order.

By following these steps, the local root user can be created in MySQL Workbench, and a database can be created using scripts.
                             

## Running the Backend 
To run the backend of the GeekNook project, an Integrated Development Environment (IDE) can be used, such as IntelliJ IDEA or Eclipse. Here is a step-by-step guide explaining how to run the SpringBootApplication.java file using an IDE:
a.	Installing an IDE: The developer needs to download and install an IDE such as IntelliJ IDEA or Eclipse from their official websites.
b.	Importing the Project: Open the IDE and select the option to import an existing project.
c.	Navigate to the location where the GeekNook project folder is saved and select the “02-backend/spring-boot-backend/” folder. Follow the prompts to import the project into the IDE.
d.	Resolving Dependencies: The IDE will automatically detect the project's dependencies based on the configuration files (e.g., pom.xml for Maven or build.gradle for Gradle). Allow the IDE to download and resolve the required dependencies by syncing the project.
e.	Configuring the Run Configuration: In the IDE, locate the SpringBootApplication.java file, which serves as the entry point for the backend application. Right-click on the file and select the option to create a run configuration specific to the file. Configure the necessary settings, such as the Java version and program arguments if required. By default, the IDE will use the main class specified in the SpringBootApplication.java file.
f.	Running the Application: Once the run configuration is set up, the developer can run the backend application by clicking on the "Run" or "Debug" button in the IDE.The IDE will compile the code, start the Spring Boot server, and deploy the backend application.

By following these steps, the developer can use an IDE to run the backend of the GeekNook project by executing the SpringBootApplication.java file. The application will run at http://localhost:8080/. The IDE provides a convenient and efficient environment for development, debugging, and monitoring the backend application.

## Running the Frontend

First, ensure that Node.js is installed on the developer's machine by downloading it from the official website (https://nodejs.org) and following the installation instructions. Open a terminal or command prompt and install the Angular CLI globally by running the command “npm install -g @angular/cli”.
a.	Setting up the Project: Open the IDE (e.g., Visual Studio Code) and navigate to the folder where the "03-frontend/angular-ecommerce" project is saved. Open a new terminal or command prompt within the IDE.
b.	Installing Project Dependencies: In the terminal, navigate to the project folder by using the cd command (e.g., cd /03-frontend/angular-ecommerce). Run the command “npm install” to install the project dependencies specified in the package.json file.This command will download and install all the necessary packages required for the Angular project.
c.	Running the Angular Development Server: Once the dependencies are installed, use the command “ng serve” to start the Angular development server. The server will compile the project, build the necessary files, and start a local development environment at http://localhost:4200. The IDE may also provide an option to start the server from a graphical interface.
d.	Accessing the Frontend: Open a web browser and navigate to http://localhost:4200. The Angular e-commerce project will be displayed in the browser, and any changes made to the code will be automatically reloaded by the development server.
e.	Verifying the Frontend: Ensure that the Angular e-commerce project loads successfully in the browser without any errors or exceptions. Interact with the application to test its functionality, such as navigating through different pages, adding items to the cart, or placing orders. By following these steps, the developer can use an IDE (e.g., Visual Studio Code) to run the Angular e-commerce project using Angular. The Angular CLI simplifies the process of setting up the project and starting a development server for quick testing and previewing of the frontend application.
