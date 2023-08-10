# SoundClipBackmasking
Hafsa Alaparmak
04/29/2023

# Table of Contents
1. Introduction
2. Project Overview
4. Converting Media Files
5. Implementation Details

# Introduction
This project aims to explore the implementation of Stack Abstract Data Types (ADTs) using both array and linked list structures. The primary objective is to create a program that performs sound clip reversal, inspired by the concept of backmasking used in the music and film industry. Backmasking involves playing audio tracks backward to reveal hidden messages.

The project entails the development of a program that reads a sound file in .dat format, and subsequently generates another .dat sound file containing the reversed version of the input file. 

# Project Overview
The project involves the implementation of two variations of the Stack ADT:
ArrayStack: This implementation employs an array-based approach to the BackMasking interface.
ListStack: This implementation utilizes a Linked List structure for the BackMasking interface, also implementing the Iterable interface. It utilizes the enhanced for-loop to count the elements in the stack.

# Converting Media Files
To facilitate running the program, media files (.wav) need to be converted to the .dat format. 
1. First download homebrew
2. Make sure sox is installed inside
3. cd to pathway (cd Desktop)
4. sox ciphered.wav ciphered.dat to turn .wav files to .dat files
5. after running the code and getting the reversed files, used sox ciphered.dat cipheredReverse.wav to get the sound files


# Implementation Details
-ArrayStack-
if the first argument as the type of stack is array, this program will run
ArrayStack class uses an array to implement the stack
configuration: array ciphered.dat cipheredReverseArray.dat

keeps a list of doubles that hold the stack's elements
resize() method is used to double the size of the array when the stack is full
when an element is popped off stack, top index is decremented by one

push() adds an item to top of the stack
pop() removes the item at top of the stack
peek() provides back the top item on stack without removing it
count() tells how many items are in the stack
isEmpty() tells whether the stack is empty or not

push, peek, and isEmpty only work on the top of the stack, they take O(1)
count is only counting the number of elements so it take O(1)
resize creates a new array with doubling size, and copies all existing elements to the new array using a for loop so O(n)
so total: 0(n) time


-LinkedStack-
if the first argument as the type of stack is list, this program will run
LinkedStack class uses a linked list to implement the stack
configuration: list ciphered.dat cipheredReverseList.dat

This class also uses the same five functions as arrayStack:
push() adds an item to top of the stack
pop() removes the item at top of the stack
peek() provides back the top item on stack without removing it
count() tells how many items are in the stack
isEmpty() tells whether the stack is empty or not

additionally LinkedStack implements Iterable interface
next() does the job of iteration. this allows to access each element in stack one by one and time complexity isn't affected

push, pop, peek, and isEmpty only work on the top of the stack, they take O(1)
count is only counting the number of elements, so it take O(1)
iterator method is also O(1), since it only return a new StackIterator object
StackIterator class has a function called next()
-next returns the next element in the stack and advances the iterator to the next position and it only accesses element at current index, so O(1)
-constructor and hasNext also has O(1)
so total: O(1) time
According to my program and comparisons of time complexities, LinkedStack seems more efficient with time.
