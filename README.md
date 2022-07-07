# ssf-workshop11


SSF - Day 11 Workshop

setup:
    1. Generate a SpringBoot application with   Spring Initializr with the following dependencies:
        - Spring Boot DevTools
        - Spring Web
        - Thymeleaf
tasks:
    1: 
    Create a directory for your static HTML documents and resources. You can create 1 or 2 HTML document. Make sure that there is a HTML file called index.html; this is your ‘landing page’. ✓
    2: 
    Add an error page error.html ✓
    3: 
    Make the port that the application listens on configuration. The port should be configurable via the command line option as well as environment variable. When the application starts, it should check for the port in the following order of preference 
            i. Check if the option --port <port number> is set, if it is set, use the provided port number ✓
            ii. Check if the environment variable PORT (case sensitive) is set, if it is set use the provided port number
            iii. If none of the above are set, default to port 3000
    4: 
    Login to Heroku with heroku command line and deploy the application. ✓
