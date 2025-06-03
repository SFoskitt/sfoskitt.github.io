---
layout: post
title: "2025-06-02 - Day 2 - 100 Days of Code"
description: ""
category: 
tags: []
---
{% include JB/setup %}

Good afternoon, Friends -

Yesterday's code challenge was a bit of a mess. I have a ten year old Github repository for the N-Queens problem. My memory says this repo contains both the problem and the solution. When I looked at this yesterday it turns out memory failed me. This was a Backbone repo built around the N-Queens problem to generate an interactive tool, so users can toggle a queen chess piece on a n x n board. There was way, way more stuff in there than I needed.

Today I made an executive decision to ignore literally all of the stuff in the repo and just start fresh. So there is a new branch called "javascript", and there is a new file called "all-in-one.js". This file contains a primary function and some small util functions. When the primary function is called with an integer argument then it will produce a solution and print it to console. This solution checks recursively column-wise but it could be done just as easily row-wise. There are many examples online showing how to solve this problem and I would not be able to do it justice so I'll leave it there.

In case you're unfamiliar with the N-Queens problem, here is a brief description: 
> The n-queens puzzle is the problem of placing n queens on an n x n chessboard so that no two queens can attack each other.
> https://neetcode.io/solutions/n-queens