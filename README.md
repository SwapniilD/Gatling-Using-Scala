# Gatling Performance Testing with Scala

## Overview:
This repository contains a Gatling-based performance testing framework using Scala. It is designed to help you get started with load testing for APIs and web applications efficiently.

## Prerequisites:
Ensure you have the following installed before setting up the project:
* Java JDK 16+
* Apache Maven
* Scala (Version 2.13)
* IntelliJ IDEA (Recommended IDE)
* Gatling (Latest Version)

## Setup Instructions
1. Clone the Repository
<sub>
git clone https://github.com/your-username/your-gatling-project.git
cd your-gatling-project
</sub>

2. Configure IntelliJ IDEA
* Open IntelliJ IDEA and select Open Project.
* Navigate to the cloned repository and open it.
* IntelliJ will automatically detect the pom.xml file and import dependencies.
* Ensure that the Scala plugin is installed:
* Go to File > Settings > Plugins
* Search for Scala and install it.
* Set the Scala SDK:
* Go to File > Project Structure > Modules > Dependencies
* Select Scala SDK 2.13

3. Build the Project
Run the following command to build the project and ensure all dependencies are installed:
<sub>
mvn clean install
</sub>

## Running Gatling Tests

1. Execute the Demo Test
Run the following command to execute the test:
<sub>
mvn gatling:test
</sub>

2. View Test Reports
After execution, Gatling generates a detailed HTML report in the target/gatling directory. Open the latest test report in a browser:
<sub>
open target/gatling/<test-name>/index.html
</sub>

## Using Gatling Recorder
Gatling provides a built-in Recorder to capture HTTP requests and generate scripts automatically.
* Run the Recorder:
<sub>
mvn gatling:recorder
</sub>

* Configure the proxy settings and start recording your actions.

* Stop the recording, and Gatling will generate a test script in the user-files/simulations directory.

## Contributing

Contributions are welcome! Feel free to fork the repo, create a new branch, and submit a pull request.
