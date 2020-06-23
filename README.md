# demoseed

Playground for trying out [seed](https://github.com/tindzk/seed). This project is set up to mimic a typical sbt/maven/gradle project.

## Commands

```bash
# Configure bloop
seed bloop

# configure everything (including .idea)
seed all

# Methods to run it
seed run demoseed
bloop run demoseed

# Run tests
bloop test demoseed

# build jar
seed package demoseed

# build a distribution
seed package demoseed --libs
```
