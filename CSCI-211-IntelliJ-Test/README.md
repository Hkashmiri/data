Code provided: SongBoard Implementation.

The SongBoard object represents the top 200 songs as requested by Shazam site users (these are read from a .csv file provided by Shazam, with entries for numeric rank, artist, and song). The code illustrates many features described in Chapter 1 and Chapter 2 of "Data Structures & Algorithms in Java, 6th Edition." The code also shows how .csv files are read, a commonly provided store of data from third party Web Sites.

Initial assignment:
Part 1: Review chapters 1 and 2 from the book.

Part 2: Download the code items (SongBoard.java, SongBoardInterface.java, and SongEntry.java) and the Shazam song file (input.csv).
Compile the java files (Intellij with do automatically; manual is javac SongEntry.java; javac SongBoard.java.
Run the main block in SongBoard.java (javac SongBoard). Verify that the top ten songs are displayed and show the output. 
Look over the .java files and gain an understanding that the primary component of the SongBoard.java object is an array of SongEntry objects; each SongEntry object (for now) represents a single line in the input.csv file.

Part 3: Modify the SongBoardInterface.java and SongBoard.java files to add a new method called "printSongsTenToTwenty()" that will step through the array of SongEntry objects and print songs 11-20. Add the call to "printSongsTenToTwenty" to the main method (used for tests) to display songs 11-20. Use the method "SongEntryToString()" instead of making separate calls to GetRank, GetArtist, and GetSongName as is done in the current printTopTen method.

We will add many new features to this code to align with the new material starting in Chapter 3 of the textbook next (sorting, recursion, random numbers, benchmark timing, ...)
