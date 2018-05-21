Working Through the Creation of the "Android_Me" app:

This repository stores my code for the Advanced Android Udacity Lesson about Fragments, which creates an app that modifies a UI to display a custom "Android" figure that has choosable presets for "upper body", "middle body", and "lower body". The user can specify different selections for each of these body parts and immediately see an updated figure. This project creates the app by creating 4 different fragments and then piecing them together to create the completed UI.

The four fragments are:

Upper Body Image
Middle Body Image
Lower Body Image
Gridview for selecting preset body parts.
To see a fuller description of this lesson, view the README.md from the First Commit.

This third commit adds the new Java Class BodyPartFragment (which extends Fragment), creates the new layout file fragment_body_part.xml, creates a new BodyPartFragment instance, inflates the view, and displays it in its host activity (AndroidMeActivity) using a FragmentManager and a transaction.
