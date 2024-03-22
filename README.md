Read Me: Magento UI Test Automation Framework

Welcome to the Magento UI Test Automation Framework! This document serves as a guide to help you understand the structure, functionality, and usage of this framework.

Purpose:
The primary purpose of this framework is to demonstrate your proficiency in test automation using Cucumber and Selenium WebDriver by automating UI test scenarios for the Magento software website. It's important to note that this project is intended solely for demonstration purposes and to showcase your skills to potential employers.

Features:

Cucumber Integration: The framework integrates seamlessly with Cucumber, a popular BDD (Behavior-Driven Development) tool, allowing you to write test scenarios in a human-readable format.

Selenium WebDriver: Selenium WebDriver is used for automating interactions with the Magento website, enabling robust UI test automation.

Page Object Model (POM): The framework follows the Page Object Model design pattern, promoting code reusability, maintainability, and readability.

Demo Store Environment: This framework is configured to interact with a demo store environment provided by Magento. It enables you to execute test scripts against a live website without impacting production environments.

Getting Started:

Prerequisites: Ensure that you have Java Development Kit (JDK) installed on your machine, along with Maven for project management.

Clone the Repository: Clone the repository containing the Magento UI Test Automation Framework to your local machine.

Install Dependencies: Run mvn clean install to install all the dependencies required for the framework.

Configuration: Update the configuration files, such as config.properties, with appropriate values according to your test environment. The ConfigurationProperties file manages your environment and configuration objects.

Write Test Scenarios: Create feature files under the src/test/resources/features directory to define your test scenarios using Gherkin syntax.

Implement Step Definitions: Write step definitions for your test scenarios under the src/test/java/stepDefinitions directory to define the actions to be performed for each step.

Execute Tests: Execute the test scenarios by running mvn test command. The test results will be displayed in the console, and detailed reports can be found in the target directory.

Project Structure:

src/main/java: Contains the core framework components, including pages, runners, steps, and utilities.
pages: Contains page object classes representing the web pages of the Magento website.
runner: Contains test runner classes for executing Cucumber tests.
steps: Contains step definition classes for defining actions to be performed for each step in the test scenarios.
utilities: Contains utility classes such as browserUtils, Driver, and ConfigReader for managing browser sessions, handling alerts, reading configuration properties, etc.
src/test/resources: Contains resources used in the tests, including configurations, feature files, screenshots, test data, and web drivers.
configurations: Contains configuration files such as config.properties.
features: Stores feature files defining test scenarios in Gherkin syntax.
screenshots: Stores screenshots captured during test execution.
testdata: Stores test data required for test scenarios.
webdrivers: Contains web driver executables required for browser automation.
Contributing:
Contributions to this framework are welcome! Feel free to submit pull requests for bug fixes, enhancements, or additional features.


Disclaimer:
This project is intended for demonstration purposes only and is not associated with Magento or any affiliated entities. The use of this framework should comply with all relevant terms and conditions of Magento's services.

Thank you for choosing the Magento UI Test Automation Framework. Happy testing!






