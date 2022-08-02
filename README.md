# scala-lib.g8

[Giter8] skeleton for scala libraries with an opinionated structure.

## Features

* [GitHub Actions](https://docs.github.com/en/actions) for automated builds and tests.

* [liancheng/scalafix-organize-imports](https://github.com/liancheng/scalafix-organize-imports) for imports organization

* [MUnit](https://github.com/scalameta/munit) used as test framework

* [Metals](https://github.com/scalameta/metals) support for VSCode as Scala IDE

* [scala-compiler-options](https://github.com/janjaali/scala-compiler-options) to setup compiler options

* [scalameta/scalafmt](https://github.com/scalameta/scalafmt) for formatting

* [Scala Steward GitHub Actions](https://github.com/scala-steward-org/scala-steward-action) to keep your project up to date

## Usage

Apply the template with SBT:

```shell
sbt new janjaali/scala-lib.g8
```

## Test

### Scripted test

To run scripted test (provided by [Giter8Plugin](https://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin)) execute:

```shell
sbt g8Test
```

### Test template locally

To test the template locally create a new directory (not in this project folder) and run:

```shell
mkdir testDir
cd testDir
sbt new file://../scala-lib.g8/
```

## Release

1. Update [CHANGELOG](./CHANGELOG.md) on your branch

2. Update this [README](./README.md) on your branch

3. Merge changes back into the main branch

4. Tag version ```git tag -a v1.5.2 -m "Release version `v1.5.2`."```

5. Publish the new release `git push --tags`

6. Create a new release on GitHub

[Giter8]: http://www.foundweekends.org/giter8/
