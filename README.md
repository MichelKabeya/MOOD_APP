REPORT
. Overview

The application is a flashcard-based quiz system built for Android using Kotlin. It is designed to test the user’s knowledge using true/false or statement-based questions (urban myths vs facts). After completing the quiz, the application displays a final score and a feedback stage.

The project also integrates GitHub for version control and GitHub Actions for automation (CI workflow).

2. Application Architecture
2.1 Main Components
The application is structured around two primary activities:
1. Card / Quiz Activity
Displays flashcard questions
Accepts user answers
Calculates score
Sends score to Score Activity using Intent
2.2 Score Activity
Receives final score
Displays:
Numeric score
Performance feedback (MASTER / NEWBIE)
Review section with explanations

2.3 Data Flow
Quiz Activity
   ↓ (Intent + SCORE)
Score Activity
   ↓
UI Display (Score + Feedback + Review)
3. Core Functionality
3.1 Quiz Logic
A list/array of questions (urban myths and facts)
User selects answers (Hack / Myth buttons)
Each correct answer increases score
Final score is calculated at the end
3.2 Feedback System
The application classifies performance:
Condition	Output
score < 4	"STAY SAFE ONLINE !!!"
score ≥ 4	"MASTER HACKER !!!"

Text color changes dynamically:
Red → low performance
Green → high performance
3.3 Review System
Button triggers full explanation of answers
Array stores explanations of myths vs facts
Loop concatenates all responses into one text view
4. UI Design
4.1 Score Screen Elements
TextView: score display
TextView: performance stage
TextView: review explanations
Button: review button
4.2 Visual Feedback
Color-coded performance indicator
Background image used for thematic UI
Dynamic visibility (button disappears after click)
5. Technical Stack
Component:	Technology
Language:	Kotlin
Framework:	Android SDK
UI System:	XML Layouts
Navigation:	Intents
Build System:	Gradle
6. GitHub Usage
6.1 Purpose
GitHub is used as:
Source code repository
Version control system
Collaboration platform
Backup system for project evolution
7. Conclusion
The application demonstrates a complete Android quiz system with:
Dynamic score calculation
Intent-based data transfer
Interactive feedback system
Basic UI state management
On the development side, the use of GitHub ensures structured version control, while GitHub Actions introduces automation and continuous integration, improving reliability and scalability of the project.

## DEMO VIDEO
https://youtu.be/rYIEAyiBSnc
## SCREENSHOT
![App Screenshot start activity](Screenshot_20260424_213720)
![App Screenshot card activity](Screenshot_20260424_213753)
![App Screenshot score activity](Screenshot_20260424_213820)

REFERENCES
Sarah Watts, 2025.Designed image for user interface. [image online]Available at: <https://i.pinimg.com/736x/0b/dd/1d/0bdd1d294cf71b2d2c745785bf2a899d.jpg/[Accessed 22 April 2026]. Card_Activity background 
Sarah Watts, 2025.Designed image for user interface. [image online]Available at: <https://i.pinimg.com/1200x/01/3c/a0/013ca0a8b6959c25a5a2934af5dd1ef9.jpg/[Accessed 22 April 2026]. Main_Activity background
Sarah Watts, 2025.Designed image for user interface. [image online]Available at: <https://i.pinimg.com/736x/ab/ae/68/abae68f2e0e757634db7d9c414efbd9f.jpg/[Accessed 22 April 2026]. Score_activity background   
Es.vecteezy, 2023 .Circle technology light blue. [image online]Available at: <https://static.vecteezy.com/system/resources/previews/010/451/653/non_2x/frame-border-circle-technology-perfect-for-artificial-intelligence-concept-design-free-vector.jpg/[Accessed 22 April 2026]. App icon

The Independent Institute of  Education, 2025. Array and Methods [IMAD5111]. nt. [online via internal VLE] The Independent Institute ofEducation. Available at: <LU6: Arrays - IMAD5111: lecture_20_2026> [Accessed Date 22 April 2026]. 

Disclosure of AI Usage in my Assessment.
Question 1; Part 2, Logic of the application.
ChatGPT (OpenAI): GPT-5.3-mini model.
Purpose/intention behind use:
I acknowledge the use of generative AI for sourcing ideas for structure, code clarity and consistency.
Date: from 23rd to 24th April 2026
Link to AI chat: 
[https://chatgpt.com/share/69ebcee4-4be8-83ea-a813-a50ad62a84ab]
[https://chatgpt.com/share/69e89c72-7344-83ea-aaa9-5a4998e80da2]
[https://chatgpt.com/share/69e8b4ae-b274-83ea-beca-97f1292c897c]

