# SwiftProwl

SwiftProwl is a cutting-edge Computer Vision-based Automated GUI Testing tool designed for maximum flexibility and seamless integration. Built on the robust SikuliX framework, SwiftProwl extends its capabilities, providing enhanced flexibility and out-of-the-box integration with Cucumber for behavior-driven development (BDD) testing.

## Features

- **Advanced Computer Vision**: Leverages SikuliX's powerful CV engine for precise GUI interactions.
- **Flexible Testing**: Enhanced flexibility in test creation and execution.
- **Cucumber Integration**: Out-of-the-box integration with Cucumber for BDD testing.
- **Cross-Platform Support**: Compatible with Windows, macOS, and Linux.
- **User-Friendly**: Intuitive interface and easy-to-write scripts.

## Installation

### Prerequisites

- Java Development Kit (JDK) 21 or higher
- Maven

### Steps

1. **Clone the Repository**
   ```sh
   git clone https://github.com/octanewolf/swiftprowl.git
   cd swiftprowl
   ```

2. **Build the Project**
   ```sh
   mvn clean install
   ```

## Getting Started

### Writing Your First Test

1. **Create a Feature File**
   Create a `.feature` file in the `src/test/resources/features` directory:
   ```gherkin
   Feature: Example Feature
     Scenario: Example Scenario
       Given the application is open
       When I click the "Login" button
       Then I should see the "Dashboard"
   ```

2. **Create Step Definitions**
   Create a step definition file in the `src/test/java/steps` directory:
   ```java
   package steps;

   import org.sikuli.script.Screen;
   import io.cucumber.java.en.*;

   public class ExampleSteps {
       Screen screen = new Screen();

       @Given("the application is open")
       public void theApplicationIsOpen() {
           // Code to open the application
       }

       @When("I click the {string} button")
       public void iClickTheButton(String button) {
           screen.click("path/to/" + button + ".png");
       }
   }
   ```

3. **Run the Tests**
   ```sh
   mvn test
   ```

## Contributing

We welcome contributions to SwiftProwl! To contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch.
3. Make your changes.
4. Submit a pull request.

## License

SwiftProwl is licensed under the MIT License.

## Contact

For any inquiries or support, please contact at eric.pereyra@octanewolf.com.

---

Thank you for using SwiftProwl! We hope it enhances your testing experience. Happy testing!

---
