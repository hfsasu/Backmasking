# SoundClipBackmasking
Author: Hafsa Alaparmak
Date: 04/29/2023

# Table of Contents
1. Introduction
2. Project Overview
3. Converting Media Files
4. Implementation Details


# Introduction
This project focuses on the implementation of Stack Abstract Data Types (ADTs) using both array and linked list structures. The main goal is to create a program that achieves sound clip reversal, inspired by the concept of backmasking used in music and film production. Backmasking involves playing audio tracks backward to uncover hidden messages.

The project involves developing a program that reads sound files in .dat format and generates a new .dat sound file containing the reversed version of the input audio.

# Project Overview
The project encompasses two implementations of the Stack ADT:

ArrayStack: This implementation employs an array-based approach to the BackMasking interface.

LinkedStack: This implementation utilizes a Linked List structure for the BackMasking interface, also implementing the Iterable interface. The enhanced for-loop is utilized to count elements in the stack.


# Converting Media Files
To facilitate program execution, the media files (.wav) need to be converted to the .dat format. Here's how to perform the conversion using SOX:
Download Homebrew (if not installed).
Make sure SOX is installed.
Navigate to the directory containing the media files (e.g., cd Desktop).
Run the following commands:
To convert .wav to .dat: sox ciphered.wav ciphered.dat
After running the code and getting the reversed files: sox ciphered.dat cipheredReverse.wav


# Implementation Details

ArrayStack
When the first argument specifies the stack type as "array," the program will execute the ArrayStack class.
ArrayStack uses an array to store stack elements.
Key functions and operations:
push(): Adds an item to the top of the stack.
pop(): Removes the top item from the stack.
peek(): Retrieves the top item without removing it.
count(): Returns the number of items in the stack.
isEmpty(): Checks if the stack is empty.

configuration: array ciphered.dat cipheredReverseArray.dat

Time
push, peek, and isEmpty only work on the top of the stack, they take O(1)
count is only counting the number of elements so it take O(1)
resize creates a new array with doubling size, and copies all existing elements to the new array using a for loop so O(n)
so total: 0(n) time


LinkedStack
When the first argument specifies the stack type as "list," the program will execute the LinkedStack class.
LinkedStack uses a linked list to store stack elements.
Key functions and operations (similar to ArrayStack):
push(), pop(), peek(), count(), isEmpty().
LinkedStack also implements the Iterable interface for efficient iteration through elements.
The time complexity for key operations remains O(1).
Based on time complexity comparisons, LinkedStack appears to be more efficient.

Time
push, pop, peek, and isEmpty only work on the top of the stack, they take O(1)
count is only counting the number of elements, so it take O(1)
iterator method is also O(1), since it only return a new StackIterator object
StackIterator class has a function called next()
-next returns the next element in the stack and advances the iterator to the next position and it only accesses element at current index, so O(1)
-constructor and hasNext also has O(1)
so total: O(1) time

According to my program and comparisons of time complexities, LinkedStack seems more efficient with time.
