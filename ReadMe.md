# 🚀 **TOMCAT SERVER - SERVLET PAGES**

This guide helps you set up and run a **Servlet-based web application** using **Apache Tomcat** with **Maven**.

## 📌 **Steps to Set Up Tomcat and Run Your Servlet Application**

### ✅ **Step 1: Install Tomcat Server**
🔹 Download **Apache Tomcat** from the [official site](https://tomcat.apache.org/download-10.cgi).  
🔹 Choose the version compatible with your **Java version**.

### ✅ **Step 2: Extract and Save**
🔹 Extract the downloaded `.zip` or `.tar.gz` file.  
🔹 Place it in a directory (e.g., `C:\Tomcat` or `/opt/tomcat`).

### ✅ **Step 3: Create a Maven-Based Project**
🔹 In **IntelliJ IDEA** / **VS Code** / **Eclipse**, create a new **Maven project**.  
🔹 Choose an **appropriate archetype** (`maven-archetype-webapp`).

### ✅ **Step 4: Install Smart Tomcat Plugin**
🔹 Install **Smart Tomcat** plugin for better integration.  
🔹 In **IntelliJ IDEA**, go to:
- `File` → `Settings` → `Plugins` → Search for **Smart Tomcat** → Install.

### ✅ **Step 5: Configure Smart Tomcat Runner**
🔹 Open **Run/Debug Configurations** (`Shift + Alt + F10`).  
🔹 Add a **new Tomcat configuration**.  
🔹 Set the **Tomcat Server path** (where you extracted it).  
🔹 Map the **artifact (WAR file)** to the deployment.

### ✅ **Step 6: Run the Application 🎉**
🔹 Start the server.  
🔹 Open your browser and visit:  locahost:8080/MyFirstServelet
