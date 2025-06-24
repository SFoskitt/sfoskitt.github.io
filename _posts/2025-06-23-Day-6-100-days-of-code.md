---
layout: post
title: "2025-06-23 - Day 6 - 100 Days of Code"
description: ""
category: 
tags: []
---
{% include JB/setup %}

Hello, Friends -

Today I spent time with [HackerRank String Compare](https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true). This is a "lexicography" problem. Lexicographically letters and words come before/after each other and the problem asks to find the lexicographically smallest and greatest string of length `k`. This should have been straightforward, and my submission passed 8 of the 10 tests, but the last two tests were trickier. My brain would not let go of the idea that I should find the lexicographically lowest (or greatest) letter and build my string by k characters from there. However, approach failed for weird strings with nothing but punctuation in it. When I changed the approach to instead compare substrings then all ten test cases succeeded. yay.

Next I think I'll work on the HackerRank Anagram problem. Stay tuned...