# Car Manage System

**Name:** Farhana Binta Shaheed  
**Matriculation Number:** 7216429

## Installation

Follow these detailed steps to set up the Car Manage System on your local machine:


### Prerequisites

Before you begin, ensure you have the following installed:
- **Java Development Kit (JDK)**: Java SE 17 or higher is recommended. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **Eclipse IDE**: This project was developed using Eclipse IDE for Java Developers. Download and install it from [Eclipse's official download page](https://www.eclipse.org/downloads/packages/).

### Setting Up the Project

1. **Install Git**:
   **macOS:** Install Git via Homebrew with:
     ```bash
     brew install git

2. **Clone the Repository**:
   - Open a terminal or command prompt.
   - Navigate to the directory where you want the project:
     ```
     cd path/to/your/folder
     ```
   - Clone the repository using:
     ```
     git clone git clone https://github.com/FarhanaShaheed/Car_Manage.git
     ```
   - This command downloads the project to your computer.

3. **Open the Project in Eclipse**:
   - Start Eclipse.
   - Select `File` > `Open Projects from File System...` from the menu.
   - Navigate to the directory where you cloned the project.
   - Select the project and click `Finish` to import it into Eclipse.

4. **Set Up JDK in Eclipse**:
   - In Eclipse, go to `Window` > `Preferences` > `Java` > `Installed JREs`.
   - Click `Add`, and then select `Standard VM`.
   - Navigate to the JDK installation path (e.g., /Library/Java/JavaVirtualMachines/jdk-17.jdk).
   - Ensure that the newly added JDK is checked, and click `Apply and Close`.

### Configuring the Environment

Ensure your environment is correctly set up to run Java applications:
- **Environment Variables**:
  - Set `JAVA_HOME` to your JDK installation path.
  - Update the `Path` variable to include `%JAVA_HOME%\bin;` to allow system-wide use of Java.

## Running the Application

To run the Car Management System within Eclipse:
1. **Navigate to the `Main.java` File**:
   - In Eclipse, expand the project tree in the `Project Explorer`.
   - Find `src` > `(default package)` > `Main.java`.
2. **Run the Application**:
   - Right-click on `Main.java`.
   - Select `Run As` > `Java Application`.
   - The application will execute and create output files in the project root directory, based on the predefined filters.

3. **Viewing Output Files**:
   - Refresh the project in Eclipse by right-clicking the project name and selecting `Refresh`.
   - Navigate to the project root directory in the `Project Explorer` to view the generated text files.
