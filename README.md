# Java Utilities Exercises – Level 1 

📎 GitHub Repository: [S1.05_JavaUtils_LV1](https://github.com/anaberod/S1.05_JavaUtils_LV1.git)

---

## 📄 Description – Exercise Statement

All exercises from the three levels must be executed from the command line and not only from the editor.  
Create a file named `readme.txt` to explain the commands required to compile Java source files (`.java`) into bytecode (`.class`) and run them.  
You must:

- Use Eclipse or IntelliJ
- Use either Maven, Gradle or simple Java projects
- Follow the good practices document from Sprint 0
- Write code in English
- Use **relative paths**, not absolute ones
- Use `File.separator` for portability across OSs

---

## 💻 Technologies Used

- Java 17+
- IntelliJ IDEA / Eclipse IDE
- Command Line (Windows CMD or Unix Terminal)
- `java.io` package
- `java.util` and `java.text` packages
- Java Properties (`.properties` files)

---

## 📋 Requirements

- JDK 17 or higher
- IntelliJ or Eclipse
- Git (optional for cloning)
- Proper file and directory structure inside `src/main/java` and `src/main/resources`

---

## 🛠️ Installation

1. Clone the project:
   ```bash
   git clone https://github.com/anaberod/S1.05_JavaUtils_LV1.git
   cd S1.05_JavaUtils_LV1
   ```

2. Open the project with your IDE (IntelliJ or Eclipse)

3. Ensure JDK is correctly configured

---

## ▶️ Execution

### 🔹 Ex1: List directory contents alphabetically

```bash
javac src\main\java\Ex1.java
java -cp src\main\java Ex1 src\main\resources
```

---

### 🔹 Ex2: Recursively list directory tree (alphabetically, show type and last modified)

```bash
javac src\main\java\Ex2.java
java -cp src\main\java Ex2 src\main\resources
```

---

### 🔹 Ex3: Write directory tree to a TXT file

```bash
javac src\main\java\Ex3.java
java -cp src\main\java Ex3 src\main\resources
```

Output: `directory_output.txt` in root directory

---

### 🔹 Ex4: Read and display a TXT file from any path

```bash
javac src\main\java\Ex4.java
java -cp src\main\java Ex4 "src\main\resources\message (1).txt"
```

---

### 🔹 Ex5: Serialize and deserialize a Java object

```bash
javac src\main\java\Animal.java
javac src\main\java\Ex5.java
java -cp src\main\java Ex5
```

Output: creates `animal.ser` and reads it back

---


## 🌐 Deployment

This is a local-only utility project. No external deployment is required.  
To package into a `.jar`, use IntelliJ > File > Project Structure > Artifacts > Build Artifact.

---

## 🤝 Contributions

- Follow the Sprint 0 standards
- Write code and comments in English
- Ensure platform compatibility (`File.separator`, no absolute paths)
- Structure your project clearly and follow naming conventions
