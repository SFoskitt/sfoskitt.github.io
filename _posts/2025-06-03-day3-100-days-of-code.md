---
layout: post
title: "2025-06-03 - Day3 - 100 Days of Code"
description: ""
category: 
tags: []
---
{% include JB/setup %}

Hello, Friends!

Day 3 of this challenge and I'm doing something a little different.

Today I cobbled together -- with help from SO and other interweb sources -- a small shell script which will collect all my contributions to a repo. And these are not the commits made over time because we all know that hot dog who will come in behind you and refactor your work and obliterate any contribution you made at all. Rather, this will look at git blame on the main branch to see how much of your work remains.

```shell
for file in $(git ls-files)
do
    contents=$(git blame $file | grep "YOUR NAME HERE")
    if [[ "$contents" ]]
    then
        echo "*.*.*  $file  *.*.*"
        echo "$contents"
        echo "============="
    fi
done;
```

Run this on the command line from the root directory of the repo (where the .git lives) and redirect it into a text file for posterity.


```shell
my-repo:git(main) $ ./blame.sh > my-contributions.txt
```

This project came to me last week when I was feeling like I hadn't made enough contributions to my last team. It occurred to me that I could find out exactly how much of "me" was still in the code by searching either commits or blame. Sometime later this week I will run this script through the repos I have and hopefully find that actually I did contribute a lot more than I remembered. Memory is tricky.