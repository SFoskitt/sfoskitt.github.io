---
layout: post
title: "Day 'How Many' - 100 Days of Code"
description: ""
category: Coding
tags: [100DaysOfCode, React]
date: 2017-04-05 13:37
---
{% include JB/setup %}

## Broken chain, and I'm not sure I care


The entire point of any kind of "X Days Challenge" is to not break the chain.  It's meant to be conducted every day, when physically possible, for X days.  It's hard!  Therein lies the challenge.  The hardest part isn't actually conducting the thing, it's conducting the thing every day.  My 100 Days of Code challenge chain of days is not broken - it's obliterated.  

Le sigh.  Oh well.  Moving on.

I was out of town drinking wine last weekend, so there was not a lot of progress on my React app.  However, the past few days things have really picked up.  I can finally get data into the Node server and push it into the client.  Yay!  The create-react-app comes with it's own react-scripts server which serves the source files from src, but which does NOT (inconveniently) re-build or re-compile the source files to a production folder.  The Node server must serve the static files from the build folder, it does not serve JS files from the source folder.  So there's a disconnect between these.

However, thankfully, I'm not the first person to run into this issue and someone has found a solution.  I'm looking at [this repository](https://github.com/fullstackreact/food-lookup-demo) and cribbing their answers to this question.  So far, so good.  At this point, after my last commit, it looks like Babel is re-compiling my source code changes, but the compiled file appears to be identical to the first so I'm not sure that's right.  More investigation is needed.

Since my last blog post, progress on this project:

1. Node/Express server added.
2. CORS issue resolved between client and Node server.
3. Checkvist API GET requests are working and returning data.
4. Node server is forwarding data to React client.
5. React client is getting the data and performing the JSON conversion neatly.
6. React is rendering the task title of each nicely.

Some more work on this:
1. Why is Babel not compiling this correctly?
2. Add the other task info (creation date, due date).
3. Make the CSS prettier as it is prison-grey right now and kind of bleak.

Other projects I'm working on (sporadically):
1. My personal blog, also on Github pages, also using Jekyll-Bootstrap.  It needs a nicer theme.
2. The other React app I'm working on, which started as an exercise in non-authenticated API, turns out could be a fun project (quiz questions).

Oh.  And - most importantly - I have a job!  Starting Monday, I will be gainfully employed again.  Hooray!