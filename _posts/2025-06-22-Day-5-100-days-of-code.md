---
layout: post
title: "2025-06-22 - Day 5 - 100 Days of Code"
description: ""
category: 
tags: []
---
{% include JB/setup %}

Hello, Friends -

Today's hour (hour-plus) of code was spent on two problems.

[HackerRank Java Stack](https://www.hackerrank.com/challenges/java-stack/problem) is the balanced brackets problem I started yesterday. I finished it today. For some reason the "closed bracket" branch of the logic had me tripped up for a little bit. Finally it occurred to me to negate the condition and **bam** it worked and passed all the tests. Yay!

[HackerRank Valid Username Checker](https://www.hackerrank.com/challenges/valid-username-checker/problem) is the one of the other problems I workd on today. This was a very straight-forward problem and required another regular expression. One of the requirements here was a character minimum and maximum. Building this requirement into the regular expression didn't seem like it should be tricky. Everything I read suggested that using this expression `{m, n}` (where `m` is the minimum number of characters and `n` is the maximum number of characters) was an inclusive. And when I try this in some regex tester it proved true. However when running this in the HackerRank interpreter that turned out to not be the case. For this problem the limit was "minimum 8 characters" and "maximum 30 characters" so this part of the expression should have been `{8, 30}`. But to make this work on the website it had to be `{7, 29}`. **shrug**

[HackerRank Abbr](https://www.hackerrank.com/challenges/abbr/problem) is a third problem I started working on. It looks to me like this should be solvable with yet another regular expression. I came up with something in a regex tester that looks like it would work, but I haven't tested it yet in code or locally so...

Stay tuned...
