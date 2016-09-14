[![Build Status](https://travis-ci.org/mecharz/eval-last60seconds.com.svg?branch=master)](https://travis-ci.org/mecharz/eval-last60seconds.com)
[![codecov](https://codecov.io/gh/mecharz/eval-last60seconds.com/branch/master/graph/badge.svg)](https://codecov.io/gh/mecharz/eval-last60seconds.com)
# eval-last60seconds.com
Technical skills evaluation (online travel company)

Some notes about CI:
- Missed lines in code coverage is non-tested code (a catch, a constructor...): tips to improve tests or remove unreachable code.
- Travis (and other CI tools) can be configured to start on some branches' changes, not on every branch' change. That's little configuration.
- Documentation branch can be merged on master, only if visibility requires it.
