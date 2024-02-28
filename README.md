Github link: https://github.com/samcb234/cs4520-assg3
it should be possible to open this project in android studio and run it as is.

Since the buisness logic (doing calculations, error checking) is the same for both fragments, I used
the same model and data to avoid repetitve code and make it easier to debug. the same can be said for the calculator_layout.xml file,
since we aren't using data binding for the mvvm fragment (I asked in class) so all differences in UI
could be done from the View class. I used the OperationResult class to easily pass both valid results and errors to the Presenter/ViewModel