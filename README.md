# Software Engineering Project - Chatbot

Where to find Individual Project files:
1. All code incorporating the APIs into the Chatbot are located in **Chat/Chat/src/Chatbot/Chatbot.java** (10 points)
2. Project Documentation is located in the file named **Documentation Report Individual Project.pdf** (7.5 points)
3. Video submission is located in the file named **Individual Project Video Submission.mp4** (2.5 points)

---

## A brief description of my project: <br>
My project is a simple and friendly chat-bot with which the user can talk about their hobbies, interests etc.  I am using the chat bot as a friend but in most cases these days these bots are used for customer service. Keeping in mind the recent pandemic and how it has changed everyone’s social lives. A virtual “friend” is able to make normal conversations and allows the user to chat to this bot anytime and share their experiences when their friends are busy or for the people who have a hard time socialising.
<br>
I have used the Java GUI to create an interface for the chat bot and used Java as the programming language that is used to develop this chat bot.
 
 ---
 ## Chosen SDLC: Waterfall Model
 
The software development cycle that I decided to work on is the waterfall model as for small deliverable projects waterfall model is convenient. As I am developing a small chat-bot whose requirements are clear, the project is short and simple, waterfall model seemed like a good fit for this project. This model is also very easy to understand as the steps are straightforward and avoids any confusion as it takes a more linear approach to the completion of the project.<br>
On the other hand, this model does slow down the process as the team needs to complete a step before moving on to the next one which often overlooks revision or any unexpected errors.

**WATER-FALL MODEL:**
1. PLANNING:
   -	Requirements
   - Project scope.
2.	DESIGN:
    -	User-friendly design
    -	User approval
    - Revision
3.	IMPLEMENTATION:
    - Developing phase
    -	Error-Handling
4. DEPLOYMENT:
5. MAINTAINENECE

---
## Updates after A3
1. Added a better GUI for the user to feel like the individual is having a normal conversation with the bot. (**Figure 1**)
2. Added another topic of discussion regarding the topic, our bot was a freindly bot which would suggest some plans for the weekned, we added arcade to the list. This would allow the conversation to be more immersive.(**Figure 2**)  
4. Before there were 3 responses given if the user entered something out of topic, now there are five responses that the bot can provide the user with. The responses before were more repetitive and now as there are more responses that the bot could give, so the uder feels like it is a more normal conversation rather than talking to a bot.(**Figure 3**)
5. On entering “Clear screen” our Code clears the conversation and sets the screen empty 
6. If the user input is not understood by the Code, our code opens google search to look up for solutions.
---
## Updates after Individual Project
### APIs incorporated:
 |API|How it was used in my chatbot|
 |---|---|
 |Wikipedia API|The Wikipedia API extracts knowledge about a celebrity or famous person, whose name the user inputs (in my program, the chatbot reads the portion placed between asterisks), and the Chatbot outputs certain information about them such as name, a summary of their work, and a link to the online URL so the user can learn more about them|
 |Google Translate API|The google translate API reads a portion of the user input (in my program, the portion placed between brackets), and then outputs a real time translation of the inputted word or phrase, into a desired language (in my case, French)|
---
## Added Files for API to work:
1. JWiki.jar: This is a .jar file that the ChatBot uses to extract data from the Wikipedia URL connection. This file works by reading the user input that is placed between asterisks ( as such: * bill gates * ), and then locates the Wikipedia page that is titled Bill Gates. The ChatBot then dislays in real-time the extracted data from that page, such as the title of the article (by using .getDisplayTitle()), summary of their work (by using .getExtractText()), URL of an image (by using .getImageURL()), etc.
2. Translate.java: This is a java file that contains the required information to establish a connection with the Google Translate API. This file enables the ChatBot to read the portion of the user's input between brackets ( as such: (How are you?) ), after which the ChatBot outputs the respective translation of the input into French.
---
## Data Flow Diagrams

I have also added two data flow diagrams for this project.
### Data Flow Diagram for Level 0:
![dfd0](https://github.com/aaliazoya/COSC-310-Assignment2/blob/main/images/Data%20Flow%20Diagram%20level%200%20.png)
<br>
### Data Flow Diagram for Level 1:
![dfd1](https://github.com/aaliazoya/COSC-310-Assignment2/blob/main/images/Data%20Flow%20Diagram%20level%201%20(1).png)
---

## Sample screenshot of Chatbot

![chatbot](https://github.com/mashadchowdhury/mashadchowdhury.github.io/blob/main/img/posts/chatbot.png)
