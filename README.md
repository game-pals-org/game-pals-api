# Game Pals

<p align="center">
  <img src="https://github.com/game-pals-org/game-pals-client/blob/main/src/assets/game-pals-logo.png?raw=true" alt="Game Pals logo"/>
</p

Game Pals is a simple website used for posting announcements saying that you need somebody to play online games with. It was made as a final group project on Java course in [Software Developement Academy](https://sdacademy.dev/). Frontend was made with Angular - deployed online using [Netlify](https://www.netlify.com/), backend was made using Spring - deployed using [Heroku](https://heroku.com). Frontend is comunicating with backend using HTTP requests.

## Technologies used

- Java 11
- Maven
- Spring Boot
- Hibernate
- H2 Database
- JUnit 5
- Angular

**NOTE:** We have implemented fully functional and tested services and repositories based on databases, but in the project version you can experience in the demo we deliberately connected our controllers to services based on Java collections for demontration purposes.

## Repos

Whole project is divided into 2 repositories - frontend and backend:
- [Frontend repository](https://github.com/game-pals-org/game-pals-client)
- [Backend repository](https://github.com/game-pals-org/game-pals-api) (you are currently here)

## Demo

Project demo is available online at: [Game Pals](https://gamepals.netlify.app/home)

**NOTE:** Because our project is using free Heroku hosting, backend of our website may need about 30 seconds to start. If you see no announcements on home page, please wait about 30 seconds and refresh the website.

## Basic functionality

After you give backend few seconds to start you should be greeted with the main page:

![Main page screen](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img1.png?raw=true)

Here you can see and go through a list of announcements we hardcoded for demonstration purposes.
You can change the way they are displayed by pressing one of the 6 buttons at the top of the list. In addition you can search announcements that match game name you enter. It can be either full game name or first letters.

If you want to try adding your announcement, click on the Add Announcement located on the left side of navigation bar between Home and Log in.

![Add Announcement screen](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img2.png?raw=true)

Here you can create your announcement. Initially button at the bottom will be diactivated. In order to activate it and properly add announcements all the fields except for Additional Info must contain something. If you don't pick whether your game is casual or ranked, the casual will be set by default.

![Example announcement form with content](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img3.png?raw=true)

After you press Add Announcement button you should be redirected to home page where you will see your announcement on the list. If you don't see it try changing sorting method at the top, list will then refresh.

![Main page with example announcement added](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img4.png?raw=true)

## Account system

In our project we decided to implement simple account system. It is mainly used to give users ability to delete theirs announcements.

To register new account press Sign In located in the top left corner, you will be redirected to Sign In page:

![Sign in page screen](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img5.png?raw=true)

In case something goes wrong during signing in a message should appear:

![Message screen](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img6.png?raw=true)

After correct registration you will be redirected to log in page where you should enter username and password of the account you registered before:

![Log in page screen](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img7.png?raw=true)

Please note that in case of ragistration as well as logging in, username and password can't be left empty.

After succesfull log in you will be redirected to Home page. Sign In and Log In buttons in the top left corner should be replaced with your username and avatar generated from your username using online avatar generation API [RoboHash](https://robohash.org/):

![Page after log in](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img8.png?raw=true)

After clicking on either one of them you will be redirected to your account page. Here you will see bigger version of your avatar and a list of announcements added from your account with option of deleting them. In your case it will be empty.

![Account view](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img9.png?raw=true)

If you want to try operating on an active account, please use one prepared by us for this purpose:

username - ShadowWarrior

password - shadow123
  
![ShadowWarrior user page](https://github.com/game-pals-org/game-pals-api/blob/master/readme_images/img10.png?raw=true)

## Authors and acknowledgement

Authors:
- Kamil Wiśniewski - [github](https://github.com/wisniewski-kamil) - [linkedin](https://www.linkedin.com/in/wisniewski-kamil/)
- Mateusz Piwowarski - [github](https://github.com/MateuszPivek) - [linkedin](https://www.linkedin.com/in/mateusz-piwowarski-92488b1b0/)
- Jan Solski - [github](https://github.com/MonsterIsLegend) - [linkedin](https://www.linkedin.com/in/janeksolski/)
- Artur Bartoszewski - [github](https://github.com/ibnsayd) - linkedin

Special thanks to our teacher Tomasz Owczarek - [github](https://github.com/towczare) - for advices and help with some errors
