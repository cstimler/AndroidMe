Working Through the Creation of the "Android_Me" app:

This repository stores my code for the Advanced Android Udacity Lesson about Fragments, which creates an app that modifies a UI to display a custom "Android" figure that has choosable presets for "upper body", "middle body", and "lower body". The user can specify different selections for each of these body parts and immediately see an updated figure. This project creates the app by creating 4 different fragments and then piecing them together to create the completed UI.

The four fragments are:

Upper Body Image Middle Body Image Lower Body Image Gridview for selecting preset body parts. To see a fuller description of this lesson, view the README.md from the First Commit.

The third commit adds the new Java Class BodyPartFragment (which extends Fragment), creates the new layout file fragment_body_part.xml, creates a new BodyPartFragment instance, inflates the view, and displays it in its host activity (AndroidMeActivity) using a FragmentManager and a transaction.

The fourth commit develops fragment instances for body and leg views.

The fifth commit adds an OnClickListener to the BodyPartFragment class in order to allow all body parts (head, body, legs) to be click-selectable. In addition, it ensures proper saved state on rotation by saving the integer list structure that contains the resource id's of the drawable body parts, as well as by saving the list index. It loads these back for the BodyPartFragment view in "onCreate" whenever savedInstanceState is not null.

The sixth commit creates a new start activity (entered into the Android Manifest) - Main Activity - which in turn launches a static fragment that displays a gridview that holds the head, body, and leg images.  Main Activity is set to display activity_main.xml (of course) which in turn launches a fragment defined in MasterListFragment class which is displayed in the gridview via the MasterListAdapter (which is a typical adapter extending BaseAdapter).  At the end of this exercise the gridview is visible on the main screen.

This seventh commit creates an interface OnImageClickListener that has one abstract method onImageSelected; this interface is declared in the MasterListFragment class together with a callback that will be passed to the MainActivity and is set on the GridView.  onAttach is overwritten in the MasterListFragment class to ensure that when the attached context is casted to OnImageClickListener there is no error; an error would indicate that the MainActivity has not implemented the interface.  The MainActivity implements the interface and calls the onImageSelected method which receives the position of the image in the ArrayAdapter, displaying it with a toast.