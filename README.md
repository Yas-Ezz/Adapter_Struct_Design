# Adapter_Struct_Design
# Example Adapter Design Pattern

This project demonstrates the use of the **Adapter Design Pattern** to convert between incompatible interfaces. It includes the implementation of an `AudioPlayer` class that plays audio files, and an adapter (`MediaAdapter`) that allows it to play video files using an existing `VideoPlayer` interface.

The Adapter Pattern allows the `AudioPlayer` to work with the `MediaPlayer` interface, enabling different types of media to be played in a unified way.

## Purpose of the Adapter Pattern

The Adapter Design Pattern is used to allow classes with incompatible interfaces to work together. In this case, the `AudioPlayer` class is designed to play audio files, while the `VideoPlayer` interface handles video files. The `MediaAdapter` class is used to convert between these two incompatible interfaces, enabling the `AudioPlayer` to handle both audio and video playback through a unified interface.

## How the Adapter Works

- **MediaPlayer Interface**: Defines the general contract for playing media files (audio and video).
- **AudioPlayer Class**: Implements the `MediaPlayer` interface and is capable of playing audio files.
- **VideoPlayer Interface**: Defines the contract for playing video files.
- **MediaAdapter Class**: Implements the `MediaPlayer` interface and is used to convert calls to the `VideoPlayer` interface, making it compatible with the `AudioPlayer`.

When the `AudioPlayer` is asked to play a video, the `MediaAdapter` redirects the call to the `VideoPlayer` to play the video.

## How to Run the Project

1. **Clone the repository**

2. **Navigate to the project directory**

3. **Compile the Java files**:
javac -d out/production/classes src/main/java/org/example/*.java

4. **Run the application**:
java -cp out/production/classes org.example.Main

This will run the `Main` class, which demonstrates the use of the Adapter Design Pattern.

## Key Classes in the Adapter Pattern

- **MediaPlayer Interface**: 
Defines the `play()` method that all media players (audio/video) must implement.

- **AudioPlayer Class**: 
Implements the `MediaPlayer` interface and provides functionality to play audio files.

- **VideoPlayer Interface**: 
Defines the `playVideo()` method for video playback.

- **MediaAdapter Class**: 
Implements the `MediaPlayer` interface and delegates the `play()` method to the `VideoPlayer` class when playing a video.

- **Main Class**: 
The entry point of the program, where the `AudioPlayer` and `MediaAdapter` are instantiated and used to play both audio and video.

## Expected Output

When running the `Main` class, the following output will be displayed:


## Conclusion

The Adapter Design Pattern allows for the flexibility of using incompatible interfaces without changing the existing code. By using an adapter, we can extend the functionality of a class to support new types of media (audio and video) while maintaining a consistent interface. This pattern demonstrates how software components can be integrated more effectively without modifying their original design.
