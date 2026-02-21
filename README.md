# Java-Console-based-Quiz-application
📌 Project Description

The Java Quiz Challenge is an interactive desktop quiz application developed using Core Java and Swing (JOptionPane).
Inspired by the KBC (Kaun Banega Crorepati) format, this application provides a structured multiple-choice quiz experience with progressive levels, lifelines, and prize tracking.

The application is designed to demonstrate how GUI-based desktop programs can be built using only standard Java libraries without external frameworks. It uses dialog-based interaction through JOptionPane to create a simple yet engaging user experience.

🎯 Objective

The primary goal of this project is to:

Build an interactive quiz using Java Swing

Demonstrate event-driven programming concepts

Implement real-time decision-making logic

Simulate a game-like environment using core Java constructs

This project serves as a practical implementation of core Java fundamentals combined with GUI interaction.

🚀 Application Overview

When the application starts, users are welcomed with a greeting screen and prompted to enter their name.
The quiz then begins, presenting 10 multiple-choice Java-related questions, each associated with a prize value.

Players progress through levels by answering questions correctly. Each correct answer increases their cumulative prize money, while a wrong answer ends the game immediately.

The application maintains state throughout the quiz, tracking:

Current level

Total winnings

Lifelines used

Player identity

✨ Key Features
🖥️ GUI-Based Interaction

Built entirely using JOptionPane dialogs

No command-line interaction required

Beginner-friendly desktop interface

❓ Multiple Choice Questions

10 structured quiz questions

Options displayed in formatted dialog layout

Input validation and answer comparison

💰 Prize Money System

Progressive reward levels

Cumulative winnings tracking

Final winning screen upon completion

🎁 Lifeline System

The game includes two interactive lifelines:

1️⃣ 50-50 Lifeline

Eliminates incorrect options

Helps the player make an informed decision

2️⃣ Audience Poll Lifeline

Simulates audience voting

Displays percentage-based hint

⚠️ Lifeline restrictions:

Each lifeline can be used only once

Lifelines are disabled for the final question

🧠 Concepts Demonstrated

This project showcases several important Java concepts:

Swing GUI using JOptionPane

Event-driven programming

Arrays and 2D arrays for data storage

Loops and conditional branching

Game logic implementation

Package-based Java structure

User interaction handling

🏗️ Technical Implementation

Questions are stored in a 2D array containing:

Question text

Four options

Correct answer index

A game loop controls quiz progression.

Conditional checks handle:

Answer validation

Lifeline usage

Game termination

Final victory state

The modular logic makes the application easy to extend with new features like external question loading or improved UI.

🎮 Game Flow

Welcome dialog appears

Player enters their name

Questions are presented one-by-one

Player can:

Select an answer (1–4)

Use a lifeline (option 5)

Correct answers increase winnings

Wrong answer ends the game

Final congratulatory screen if all levels are cleared

📚 Learning Outcome

By building this project, developers gain hands-on experience with:

Building GUI apps using Swing

Designing simple game logic

Managing user input via dialogs

Structuring Java projects with packages

Applying OOP and control flow effectively

This makes the project ideal for students learning Java GUI development or transitioning from console-based programs to desktop applications.

🔮 Future Enhancements

Replace dialogs with full Swing UI (JFrame)

Add timer-based questions

Load questions from JSON or database

Add sound effects and animations

Implement score history tracking

Create leaderboard system
