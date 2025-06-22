---
layout: post
title: "2025-06-21 - Day 4 - 100 Days of Code"
description: ""
category: 
tags: []
---
{% include JB/setup %}

Hello, Friends -

Today's hour of code was spent on HackerRank again. I worked on three problems but only finished two. The third I'll have to leave for tomorrow.

[HackerRank Java Regex](https://www.hackerrank.com/challenges/java-regex/problem) was an introduction to two Java Util classes - Pattern and Matcher. Pattern sets up the regular expression and Matcher compares the string to the pattern. This is a *very* loosey-goosey description because there is more involved in these classes than just pattern/match, but that's the gist. This was my first exposure to these two classes and it went well. This was a straight-forward problem, no tricks. And it confirmed for me that I'm unlikely to ever EVER memorize how to write a regular expression without help. Not sad, really. Regular expressions are the reason SO exsits. *wink*

[HackerRank Tag Content Extractor](https://www.hackerrank.com/challenges/tag-content-extractor/problem) problem wants to pass a tag-formatted string (HTML, XML) and get the content between two correctly formatted tags returned. For example, `<h1>Header content here</h1>` is correctly formatted; `<h1>Header content here<h2>` is not correctly formatted. The content between two incorrectly formatted tags is not to be returned. This was another problem that required a regular expression. And again I went to SO for this.

[HackerRank Stack](https://www.hackerrank.com/challenges/java-stack/problem) In this problem the question is: How do I know if this string has balanced brackets/parenthesis? Balanced brackets means that: 1. for each open bracket/parens there is a corresponding closing bracket/parens, and 2. they are all in the correct order. For example, these are in the correct order: `(){}[]` and `({[]})`. These are *not* in the right order: `({[}])`. This is a very familiar problem and I've even asked candidates to solve it during interviews. I've noticed that HackerRank will give a title to a problem which suggests to us how to solve the problem. Guess how to solve the balanced brackets problem? Could it be a Stack? I started solving this problem and realized how late it was tonight so I'll finish it tomorrow.

Stay tuned...
