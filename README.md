
A simple HelloWorld app based on the getting started app from the heroku website.

Go to 

https://niels-hello-world.herokuapp.com/

For the Hellow World message.

Go to 

https://niels-hello-world.herokuapp.com/(your-name-here)

(replace (your name here with a name))

for a personalized Hello World message

Issues encountered

I was not familiar with the frameworks for webservers, and had to learn how to set up and use spark. This made it difficult to determine where errors came from.

I have not yet succeed in setting up eclipse properly to support project development for this type of deployment.

Code that ran successfully in a local heroku deployment and through the deployment through github.heroku.com did not run when deployed through github. Apparently two lines of code are necessary for this type of deployment, but not in the other two types:

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");


To successfully locally compile server code, Java-8-jdk was necessary, while I only had Java-8-jre installed. This lead to confusing errors, but I eventually figured it out by googling the error messsage.

I could not find a complete description of what files are actually necessary to produce a running server. I therefore gave up on creating everything from scratch and instead reduced an example that was provided by the heroku guide to a minimal working application. This was done mostly through trial and error by removing individual parts.

Writing the commit messages for git requires you to use vim by default, which can be a stumbling block.
