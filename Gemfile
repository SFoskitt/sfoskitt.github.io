source "https://rubygems.org"
# Hello! This is where you manage which Jekyll version is used to run.
# When you want to use a different version, change it below, save the
# file and run `bundle install`. Run Jekyll with `bundle exec`, like so:
#
#     bundle exec jekyll serve
#
# This will help ensure the proper Jekyll version is running.
# Happy Jekylling!

# 2026-06-13 remove this as per line 18+ here
# gem "jekyll", "~> 4.4.1"

# 2026-06-13 add this per the theme designer, Mike Rose
# https://github.com/mmistakes/minimal-mistakes
# https://mmistakes.github.io/minimal-mistakes/docs/quick-start-guide/
gem "jekyll-include-cache"
gem "minimal-mistakes-jekyll"

# This is the default theme for new Jekyll sites. You may change this to anything you like.
# gem "minima", "~> 2.5"

# If you want to use GitHub Pages, remove the "gem "jekyll"" above and
# uncomment the line below. To upgrade, run `bundle update github-pages`.
gem "github-pages", group: :jekyll_plugins
# If you have any plugins, put them here!
group :jekyll_plugins do
  gem "jekyll-feed", "~> 0.12"
end


# 2026-06-13 these prevent a csv dependency error which appears and prevents the server from running
gem 'base64'
gem 'csv', '~> 3.0'
gem 'logger', '~> 1.7'


# Windows and JRuby does not include zoneinfo files, so bundle the tzinfo-data gem
# and associated library.
platforms :mingw, :x64_mingw, :mswin, :jruby do
  gem "tzinfo", ">= 1", "< 3"
  gem "tzinfo-data"
end


# Performance-booster for watching directories on Windows
gem "wdm", "~> 0.1", :platforms => [:mingw, :x64_mingw, :mswin]


# Lock `http_parser.rb` gem to `v0.6.x` on JRuby builds since newer versions of the gem
# do not have a Java counterpart.
gem "http_parser.rb", "~> 0.6.0", :platforms => [:jruby]

gem "bigdecimal", "~> 4.1"
