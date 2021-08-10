# Visual Studio App Center Sample App for Android

The Android application in this repository and its corresponding tutorials will help you quickly and easily onboard to Visual Studio App Center.

## About this repository

The App Center SDK modules are already integrated within the application. Simply follow the tutorials to learn how to use each service.

### Build status (master branch)

| Build Service   | Status                                                                                                                                                                                                                                                           |
| --------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| App Center      | [![Build status](https://build.appcenter.ms/v0.1/apps/36bd9b11-9076-42cf-af68-05beeaa070f9/branches/master/badge)](https://appcenter.ms)                                                                                                                         |
| Azure Pipelines | [![Build Status](https://dev.azure.com/msmobilecenter/Mobile-Center/_apis/build/status/sampleapp/microsoft.appcenter-sampleapp-android?branchName=master)](https://dev.azure.com/msmobilecenter/Mobile-Center/_build/latest?definitionId=3725&branchName=master) |

## Tutorials

First navigate to the **Getting Started** tutorial linked below. After following that tutorial, you can choose which App Center service to explore.

## Contents

| Tutorial                                                                                          | Description                                |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------ |
| [Getting Started](https://docs.microsoft.com/en-us/appcenter/quickstarts/android/getting-started) | Set up the app                             |
| [Build](https://docs.microsoft.com/en-us/appcenter/quickstarts/android/build)                     | Build the app                              |
| [Test](https://docs.microsoft.com/en-us/appcenter/quickstarts/android/test)                       | Run automated UI tests on real devices     |
| [Distribute](https://docs.microsoft.com/en-us/appcenter/quickstarts/android/distribute)           | Distribute application to a group of users |
| [Crashes](https://docs.microsoft.com/en-us/appcenter/quickstarts/android/crashes)                 | Monitor application crashes                |
| [Analytics](https://docs.microsoft.com/en-us/appcenter/quickstarts/android/analytics)             | View user analytics                        |

### Added functionality

Using Gradle you can pass environment variables into your Build Configuration and use them as variables within your application.

For more information on how to do so, visit our docs here: [Build time environment variables using Gradle](https://docs.microsoft.com/en-us/appcenter/build/custom/variables/#buildgradle-for-android)

And if you want to try it out, you can fork this repository and add your App Secret by adding the APPCENTER_APP_SECRET environment variable in hte App Center Build configuration.
