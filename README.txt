Module 1: Arrays and Strings:

Task 1.1 - Is Unique: Implement an algorithm to determine if a string has all unique characters.
Task 1.2 - Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
Task 1.3 - URLify: Write a method to replace all spaces in a string with '%20'.
Task 1.4 - Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
            A palindrome is a word or phrase that is the same forwards and backwards. A permutation
            is a rea rrangement of letters. The palindrome does not need to be limited to just dictionary words.
Task 1.5 - One Away: There are three types of edits that can be performed on strings: insert a character,
            remove a character, or replace a character. Given two strings, write a function to check if they are
            one edit (or zero edits) away.
Task 1.6 - String Compression: Implement a method to perform basic string compression using the counts
            of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
            "compressed" string would not become smaller than the original string, your method should return
            the original string. You can assume the string has only uppercase and lowercase letters (a - z).
Task 1.7 - Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
            bytes, write a method to rotate the image by 90 degrees. (an you do this in place?
Task 1.8 - Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
            column are set to O.
Task 1.9 - String Rotation: Assume you have a method isSubstring which checks if one word is a substring
            of another. Given two strings, S1 and S2, write code to check if S2 is a rotation of S1 using only one
            call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").

Module 2: Linked lists:

Task 2.1 - Remove Dups: Write code to remove duplicates from an unsorted linked list.
            FOLLOW UP
            How would you solve this problem if a temporary buffer is not allowed?
Task 2.2 - Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
Task 2.3 - Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
           the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
           that node.
Task 2.4 - Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
           before all nodes greater than or equal to x. lf x is contained within the list, the values of x only need
           to be after the elements less than x (see below). The partition element x can appear anywhere in the
           "right partition"; it does not need to appear between the left and right partitions.
Task 2.5 - Sum Lists: You have two numbers represented by a linked list, where each node contains a single
            digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
            function that adds the two numbers and returns the sum as a linked list.
Task 2.6 - Palindrome: Implement a function to check if a linked list is a palindrome.
Task 2.7 - Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting
           node. Note that the intersection is defined based on reference, not value. That is, if the kth
           node of the first linked list is the exact same node (by reference) as the jth node of the second
           linked list, then they are intersecting.
Task 2.8 - Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
            beginning of the loop.
            Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
            as to make a loop in the linked list.

Module 3: Stacks and Queues:

Task 3.3 - Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
            Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
            threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
            composed of several stacks and should create a new stack once the previous one exceeds capacity.
            SetOfStacks. push () and SetOfStacks. pop () should behave identically to a single stack
            (that is, pop ( ) should return the same values as it would if there were just a single stack).
           FOLLOW UP
            Implement a function popAt (int index) which performs a pop operation on a specific sub-stack.
Task 3.4 - Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.
Task 3.5 - Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
           an additional temporary stack, but you may not copy the elements into any other data structure
           (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
Task 3.6 - Animal Shelter: An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
            out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
            or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
            that type). They cannot select which specific animal they would like. Create the data structures to
            maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
            and dequeueCat. You may use the built-in Linked List data structure.

Module 4: Trees and Graphs:

Task 4.1 - Route Between Nodes: Given a directed graph, design an algorithm to find out whether there is a
           route between two nodes.
Task 4.2 - Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an algorithm
           to create a binary search tree with minimal height.
Task 4.3 - List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the nodes
           at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
Task 4.4 - Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of
           this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
           node never differ by more than one.