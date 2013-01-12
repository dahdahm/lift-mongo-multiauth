lift-mongo-multiauth
====================

Authentication sample similar foursquare in lift. It allows to login using Facebook, and email sign-up using MongoDB.

References
====================
Initial code is based on [lift-mongo-auth](https://github.com/Otann/lift-mongo-auth),
which in turn is based on [lift-mongoauth](https://github.com/eltimn/lift-mongoauth) module.

Also using [lift-omniauth](https://github.com/ghostm/lift-omniauth) module for oauth.

Goals
====================
A full and simple authentication sample similar to login at foursquare.com.
Additional features include:

* Adding openid authentication.
* Adding more oauth providers (Twitter, LinkedIn, etc).
* Users who login through facebook can reauthenticate through email sign-up.
* Username field.

Contributions
====================
Contributions are welcome. Please submit your pull requests, or bug reports on github.

Running the project
====================
This project can be run from SBT, or from IDE like Eclipse, or IntelliJ IDEA.

If you use SBT simply cd to this directory and type './sbt'.
After this you can issue commands in sbt prompt:

    ; clean; compile; test

Alternatively you can type in shell: 

    sbt update clean compile test

Eclipse project can be generated with:

    sbt eclipse
    
Use 'Import New Projects' in eclipse to open it.

You can generate an IntelliJ project by running this command in sbt:

    sbt gen-idea
    
Some available options are: no-classifiers no-sbt-classifiers.
