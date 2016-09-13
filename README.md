[![Build Status](https://travis-ci.org/mecharz/eval-last60seconds.com.svg?branch=master)](https://travis-ci.org/mecharz/eval-last60seconds.com)
[![codecov](https://codecov.io/gh/mecharz/eval-last60seconds.com/branch/master/graph/badge.svg)](https://codecov.io/gh/mecharz/eval-last60seconds.com)
# eval-last60seconds.com
Technical skills evaluation (online travel company)

Some notes about CI:
- Missed lines in code coverage means some code hasn't been tested, whether it be an Exception, so we have tips to write better Tests.
- Code in constructors may not be covered, but it should.
- Travis (or any CI tool) can be configured to start on some branches' changes, not on every branch' change. That's little configuration.
- Documentation branch can be merged on master, only if visibility requires it.
