---
layout: post
title: "Day #5   100 Days of Code"
description: ""
category: Coding
tags: [100DaysOfCode]
date: 2017-01-13 17:35:00
---
{% include JB/setup %}

Almost a whole week done already!  This is really going fast.

At work we will implement a push notification system using websocket.  I'm working on the front-end portion of this using angular-websocket in our Angular app.  To test the front-end, before the Java people can finish the back-end, I will run a quickie Python websocket server.

Websocket is not a new concept to me.  We used it in one of our student projects at MakerSquare.  But setting up the server end is new.  And using Python is a bonus as I've been studying this a while.  

Today's big hurdle is this:  you know how a Python script will say "import"?  Where is it importing from?  How do I get these modules into Python for use in the script?  In JavaScript I would use a package.json file and many, many, many "npm install" commands (to get those deeply recursed dependencies out into daylight).

I'm using someone else's Gist as the Py server, so hopefully that doesn't cause any problems.


If this #100DaysOfCode is news to you, here’s day #1 with more information:
http://stephanietech.net/2017/01/06/100daysofcode/
https://github.com/SFoskitt/100-days-of-code/blob/master/log.md