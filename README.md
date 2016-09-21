[![Build Status](https://travis-ci.org/mecharz/eval-last60seconds.com.svg?branch=master)](https://travis-ci.org/mecharz/eval-last60seconds.com)
[![codecov](https://codecov.io/gh/mecharz/eval-last60seconds.com/branch/master/graph/badge.svg)](https://codecov.io/gh/mecharz/eval-last60seconds.com)

# eval-last60seconds.com
Technical skills evaluation (online travel company)

Some notes about CI, codecov:
- Missed lines in code coverage means some code hasn't been tested, whether it be an Exception, so we have tips to write better Tests.
- Code in constructors may not be covered, but it should.
- Documentation branch can be merged to master, only if visibility requires it.
- If github repo is deleted, recreating it has no chances of keeping the old build history. The same applies to other integrations since lots of id's and tokens will change
