---
layout: post
title: "Post Wakatime Data to Beeminder"
description: ""
category: Coding
tags: [JavaScript]
date: 2017-05-14 16:08
---
{% include JB/setup %}

## This is one of the coolest things I've ever started.  And finished!

Yesterday I finished a project.  Finished!  Previously, my only coding goal on [Beeminder](http://www.beeminder.com) tracked my number of Github commits.  This would be okay if I spent a lot of time making commits, but I'm not that kind of girl.  And my new employer uses Gitlab instead of Github so my work commits are not being tracked.  I was more interested in tracking the actual amount of time I spent staring at, poking at, debugging code (and occassionally making things work).  The Wakatime service does this brilliantly.  Unfortunately, at this time, there are no automatic integrations for passing data from Wakatime to Beeminder.  But I'm a developer and there are APIs.  Surely I can come up with something!  Hooray Confidence!  :-)

## The short version

My solution was to use plain, ordinary Node/Express server deployed to Heroku.  For each GET request made toward the Node server in the Heroku deployment, the server then makes a subsequent outgoing GET request to Wakatime, formats the data, and then makes a POST request to Beeminder.  The Heroku project URL is loaded into a Zapier zap with a timed daily trigger to call the URL of the Heroku project.  Et voila, a once-daily GET/POST combo making a daily Beeminder datapoint.  

## The long version

I started with Heroku's recommended Github repository for Node projects called [node-js-getting-started](https://github.com/heroku/node-js-getting-started).  Most of this was superflous for my needs, so all I kept was the main index.js for the server, and a single page view.  My repository is [here](https://github.com/SFoskitt/wakaToBee).

The only thing missing from my repository is the .env file.  This is ignored in the .gitignore because it contains the private keys needed to access data through the APIs.  If you have a Wakatime account and a Beeminder account, you can get your own private keys.  Thankfully, the APIs for these services do not require you to register your application first (like some others) so all user accounts come with access to the private keys necessary to access their data.  The Heroku repository .env file comes with the following information, don't remove it:

```
TIMES=2
```

But add these in there too:

```
PORT=5000
WAKAKEY= your Wakatime key here as string 
BEEKEY= your Beeminder auth_token here as string 
```

Your Wakatime private key is in your account here: https://wakatime.com/settings/account  

Your Beeminder auth\_token can be found here: https://www.beeminder.com/api/v1/auth_token.json

My only addition to the project was the npm package dotenv.  I couldn't get the project to run locally without this when the private keys are in the .env file.  There is supposed to be a way to get a Heroku project to run locally with a different set of command line operations, using the private keys loaded into Heroku, but I completely ignored this.  It seemed like a workaround to me.

If you're interested in replicating this setup yourself, here are a couple more useful links:  
https://devcenter.heroku.com/articles/getting-started-with-nodejs#introduction  
https://devcenter.heroku.com/articles/config-vars

Zapier offers a terrific option for devs to add their own code into a zap using either JavaScript or Python.  I tinkered with this for literally two weeks without success.  The code we can develop for this service runs on top of AWS and so there is a lot of stuff happening in the background that we don't have access to.  I kept running into the same 'NoneType' error over and over again using the Zapier recommended 'fetch' request.  I think if we had access to debugging tools, I would have finished this solution entirely on Zapier.  But instead I made a zap to trigger the GET request to my Heroku deployment, so in the end this service was very useful.

IFTTT is another terrific automation tool that offers a webhook trigger and IFTTT integrates fantastically with Beeminder.  I was going to use this service to post my Beeminder datapoint after retrieving data from Wakatime.  But I found the webhook trigger to be a little unreliable; and it seemed to cache multiple requests and only perform them about once an hour so it is a huge pain to test.

## SHOUTOUTS!

Shoutout to Bethany for her help debugging my POST requests on Beeminder.  
Shoutout to David for his help understanding the issues with my code on Zapier.