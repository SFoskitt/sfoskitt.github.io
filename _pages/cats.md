---
layout: categories
title: Categories
permalink: /cats
---

{% include group-by-array.html collection=site.posts field='categories' %}

<ul>
  {% for category in group_names %}
    {% assign posts = group_items[forloop.index0] %}
    <li>
      <h2>{{ category }}</h2>
      <ul>
        {% for post in posts %}
        <li>
          <a href='{{ site.baseurl }}{{ post.url }}'>{{ post.title }}</a>
        </li>
        {% endfor %}
      </ul>
    </li>
  {% endfor %}
</ul>
