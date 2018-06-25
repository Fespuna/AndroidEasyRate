# AndroidEasyRate

This library will make easier asking for an user rating on an Android App

--------------------
How to use the library?

You can download the AndroidEasyRate.aar and use it like I show below in the gradle file of your project.

 compile(name: 'AndroidEasyRate', ext: 'aar')

 repositories {
        flatDir {
            dirs 'libs'
        }
    }
    
Or getting the repository via Maven like this

...

--------------------
How to call it?

There are 3 methods to call the rating dialog:

1) AndroidEasyRate.ShowDialog(this);

2) AndroidEasyRate.ShowCustomDialog(this,
                "Hey! would you like to rate this App?",
                "Please give 5 stars",
                R.color.colorPrimary);

3) AndroidEasyRate.ShowCustomDialogWithCustomStars(this,
                "Hey! would you like to rate this App?",
                "Please give 5 stars",
                R.color.colorPrimary,
                R.drawable.starb);

--------------------
