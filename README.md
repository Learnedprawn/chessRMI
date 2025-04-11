# ♟️ ChessRMI – Java RMI-based Chess Game

## 🛠️ How to Build & Run the ChessRMI Project

### 📦 About This Project

This is a **Maven-based Java RMI (Remote Method Invocation)** project. Maven handles everything from compiling and dependency management to packaging and running the application.

---

### 🔧 Installing Maven

If Maven isn’t installed yet, use:

```bash
sudo apt update
sudo apt install maven
```

Verify the installation:

```bash
mvn -v
```

# 🏗️ Building the Project
Once you're inside the project folder:

```bash
cd ChessRMI
mvn clean install
```
This command will:

🧹 Clean old compiled files

🛠️ Compile the source code

📦 Package the application inside the target/ folder

---

### ▶️ Running the Project

You’ll need **two terminals** open — one for the server and one for the client.

#### 1️⃣ Start the Server

```bash
mvn exec:java -Dexec.mainClass="Server.ChessServer"
```

This runs ChessServer.java located in src/main/java/Server/.

#### 2️⃣ Start the Client
```bash
mvn exec:java -Dexec.mainClass="Client.ChessClient"
```
This runs ChessClient.java located in src/main/java/Client/.




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
