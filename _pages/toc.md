---
toc: true
toc_label: "SF Table of Contents"
toc_icon: "cog"
permalink: /toc
---

<!-- {% include toc icon="cog" title="My Table of Contents" %} -->
<!--     {% assign posts = group_items[forloop.index0] %}
 -->
<ul>
  {% assign sorted_posts = site.posts | sort: 'title' %}
  {% for post in sorted_posts %}
    <li>
      <a href="{{ post.url }}">{{ post.title }}</a>
    </li>
  {% endfor %}
</ul>