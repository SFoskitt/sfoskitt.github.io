---
layout: posts
title: Years
permalink: /years
---

{% assign postsByYear = site.posts | group_by_exp:"post", "post.date | date: '%Y'" %}
{% for year in postsByYear %}
<h2>{{ year.name }}</h2>

<div class="post-list">
  {% for post in year.items %}
  <p>
    <a href="{{ site.baseurl }}{{ post.url }}" class="post-title">{{ post.title }}</a>
    <br>
    <span class="post-description">{{ post.summary }}</span>
  </p>
  {% endfor %}
</div>
{% endfor %}