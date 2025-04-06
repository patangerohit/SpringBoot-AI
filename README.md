Spring Boot with Gemini AI 🤖🌟
This is a simple Spring Boot application integrated with Gemini AI. The application takes a user’s question as input and returns a response powered by Gemini AI.

Features ✨
A single controller that accepts a question as input and returns a response using the Gemini AI API.

Simple integration with Gemini AI via a GET endpoint.

Technology Stack 🛠️
Spring Boot: Framework for building Java-based web applications.

Gemini AI: Provides AI-powered responses to the user’s questions.

Spring Web: To create the REST API.

Spring WebFlux: Used for reactive programming.

Setup Instructions 📝
Prerequisites 📦
Java (JDK 17 or higher)

Maven for dependency management

Gemini API Key (Make sure you set this up in your environment variables)

Cloning the Project 🔄
Clone the repository to your local machine:

bash
Copy
git clone https://github.com/patangerohit/SpringBoot-AI.git
cd SpringBoot-AI
Set up your Gemini API Key as an environment variable:

In Linux/macOS:

bash
Copy
export GEMINI_API_KEY=your_api_key
In Windows:

bash
Copy
set GEMINI_API_KEY=your_api_key
Running the Application 🚀
You can run the application either from your IDE or from the command line.

Using IDE: Import the project into your IDE (IntelliJ IDEA, Eclipse, etc.) and run the main class.

Using Maven:

bash
Copy
mvn spring-boot:run
This will start the application on http://localhost:8080.

API Endpoint 📡
GET /ask
This endpoint accepts a question as a query parameter and returns a response from Gemini AI.

Request Parameter:

question (required): The question you want to ask.

Example Request:

bash
Copy
GET http://localhost:8080/ask?question=What%20is%20Spring%20Boot?
Response: The response will be a string returned from Gemini AI.

Example Response:

json
Copy
{
  "response": "Spring Boot is a Java-based framework used to create stand-alone, production-grade applications."
}
Dependencies 📚
The project uses the following dependencies:

Spring Boot Starter Web: For building the web application.

Spring Boot Starter WebFlux: For reactive programming.


License 📝
This project is open-source, and there is no specific license attached.
