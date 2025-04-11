🛠️ How to Build & Run the ChessRMI Project
📦 This is a Maven Project
This project uses Apache Maven — a powerful build tool for Java that handles:

Compiling the code

Managing dependencies

Packaging the app

Running Java files via command line

🔧 Installing Maven
If you don’t have Maven installed yet:

bash
Copy
Edit
sudo apt update
sudo apt install maven
Verify it worked:

bash
Copy
Edit
mvn -v
You should see the version info pop up like a friendly "Hello, Java!"

🏗️ Building the Project
Once inside the project directory:

bash
Copy
Edit
cd ChessRMI
mvn clean install
This will:

Clean old compiled files

Recompile your Java code

Install the dependencies listed in pom.xml

Package the compiled .class files into target/

▶️ Running the Project
You’ll run two components: the Server and the Client. Each has its own main class.

1. Start the Server (in one terminal)
bash
Copy
Edit
mvn exec:java -Dexec.mainClass="Server.ChessServer"
The Server.ChessServer corresponds to the file src/main/java/Server/ChessServer.java.

2. Start the Client (in another terminal)
bash
Copy
Edit
mvn exec:java -Dexec.mainClass="Client.ChessClient"
⚠️ Common Error Fix: NullPointerException with ImageIcon
If you get an error like:

csharp
Copy
Edit
java.lang.NullPointerException at javax.swing.ImageIcon.<init> ...
That usually means it's trying to load an image but can’t find it.

✅ Fix:
Move your image files (e.g. open.png) into:

css
Copy
Edit
src/main/resources
Then access them like this in your code:

java
Copy
Edit
ImageIcon openIcon = new ImageIcon(getClass().getResource("/open.png"));
The leading / ensures it looks in the resources root directory.

Maven will automatically include files from src/main/resources in the classpath.

✅ Final Checklist
 Maven installed

 Ran mvn clean install after any code change

 Server started with exec:java

 Client started in a separate terminal

 Images moved to resources/ and path fixed

### How to run the app:
1. Open in IDE
2. Run the server file
3. Run the client

----

### Main Menu
![Main Menu](screenshot/Game_GUI.png)

----

### Game Board
![Game Board](screenshot/chess.gif)

----
# chessRMI
