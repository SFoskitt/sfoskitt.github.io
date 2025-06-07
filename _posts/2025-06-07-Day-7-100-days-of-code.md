---
layout: post
title: "2025-06-07 - Day 7 - 100 Days of Code"
description: ""
category: 
tags: []
---
{% include JB/setup %}

Hello, Friends -

This morning I started - AND FINISHED - a medium Leetcode problem, number 12, "Integer to Roman". I'm starting to notice that almost all Leetcode problems have a "trick" to them. And this one is the same.

When you're managing Roman numerals in your head, you'll probably start from the left and work your way toward the right. And that's how the algorithm works as well. However, when you encounter a numeral character that represents a number smaller than the one following it to the right - what then? And how to represent that in the algorithm? In this case, the trick is to manage those "smaller before larger" situations explicitly. 

No matter how you choose to solve this problem there will have to be a lookup of some kind - something that says "50 is a L" and "100 is a C" etc. For this algorithm to work then there also has to be lookup values for the "smaller before larger" situations. For example - XC. X is 10 and is smaller than C which is 100. And situations like this are included in the lookup. In the end my lookup arrays were like this:

```java
    int[] lookupNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] lookupLet = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
```

Notice those "smaller before larger" situations are represented: "CM" for 900, "CD" for 400, "XC" for 90, etc. With these special cases included in the lookup then the algorithm doesn't have to bend over backwards to manage these situations. TADA!

Anyway, it's another family day today and tomorrow I'll be driving home ten hours. I've been stealing time here and there to continue with rewriting/obfuscating something I worked on two companies ago. It's going to be fun when it's done. Stay tuned!