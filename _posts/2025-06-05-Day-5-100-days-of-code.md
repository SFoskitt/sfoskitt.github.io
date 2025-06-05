---
layout: post
title: "2025-06-05 - Day 5 - 100 Days of Code"
description: "Wherein I re-learn how to math"
category: 
tags: []
---
{% include JB/setup %}

Hello, Friends -

Day 5, you say? Leetcode, I say.

As explained yesterday, it's a Leetcode kind of day. And you're probably asking, "Okay, but did it really take you an hour to work through a Leetcode medium problem?". And the answer is - YES. Just yes, it really did.

Today's LC was number 11 - "Container with most water". And it was kind of fun. My intuition about this was correct, but my implementation benefitted from hint number two: Always move the pointer that points to the lower line.

Math also tripped me up a little. For some reason it made perfect sense to subtract the two lines and multiply that value by the distance between them to get the area (what a weirdo!). It's not necessary at all. It only requires FINDING the min of the two and using that in the area calculation.

In any case, I got there in the end. Also, must add here, huge shout out to VS Code Java debugger and launch configs. Being able to debug the function, even these tiny little LC functions, has saved my bacon.  If you're curious about my solution, here it is. This is both the solution and the driver function:

```java
class LC_11 {
    static int maxArea(int[] height) {
        int len = height.length;
        int max = 0;

        for(int i = 0, j = len-1; i <= j;) {
            int dist = j - i;
            int hi = height[i];
            int hj = height[j];
            int minHt = hi < hj ? hi : hj;
            int vol = dist * minHt;
            if (vol > max) max = vol;
            if(hi > hj) { 
              j--;
            } else {
              i++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
      int len = args.length;
      int[] height = new int[len];
      for (int i = 0; i < len; i++){
        height[i] = Integer.parseInt(args[i]);
      }
      
      System.out.println(maxArea(height));
    }
}
```

What about tomorrow? That's a good question. In the process of writing that little git blame script, I re-discovered some work I did two companies ago. It's not okay for me to post the code verbatim to any site. However, I should be able to rewrite it and obfuscate it enough to post onto my Github profile. That's my goal for tomorrow. And, it would be a huge bonus if I can make it do tricks too.

Stay tuned!