# MovieWatchList-App

## Overview

Welcome to the **MovieWatchList-App**! Whether you're a movie enthusiast or just looking for something fun to watch, this application has got you covered.

The MovieWatchList-App is a Java Spring Boot project that provides a platform for users to manage their movie watchlists. It leverages various technologies such as Spring Boot, Spring Data, MVC architecture, Thymeleaf, and H2 Database to deliver a seamless experience for users. Additionally, the app integrates with the [OMDb API](https://www.omdbapi.com/) to fetch detailed movie information, allowing users to compare their ratings with those on the OMDb website and update their watchlist accordingly.

## Features

- **RESTful API**: The application provides a set of RESTful APIs for interacting with movie data. These APIs allow users to fetch existing movies and add new movies to their watchlists.

- **Spring Boot MVC**: The application follows the Model-View-Controller (MVC) architecture, where models represent the data, views display the data to the user, and controllers handle user requests and generate responses.

- **H2 Database**: The application uses an H2 Database, an in-memory database, to store and retrieve movie data. This allows for efficient data management without the need for external database setups.

- **Thymeleaf**: Thymeleaf is used as the template engine to create dynamic and responsive web pages for user interaction. It seamlessly integrates with Spring Boot to generate HTML content based on server-side processing.

- **OMDb API Integration**: The application integrates with the [OMDb API](https://www.omdbapi.com/) to fetch detailed movie information, including ratings, plot summaries, and more. This allows users to compare their ratings with those on the OMDb website and update their watchlist accordingly.


## 🖼️ Screenshots

### 🏠 Home Page
![image alt](https://github.com/ALOKKUMARSAW/MovieWatchList-App/blob/d2553f9fa03b016e910da639bceb18b0e57ea8e1/Screenshot%202025-07-16%20193353.png)

### 🎬 Watchlist Page
![image alt] (Screenshot 2025-07-16 194132.png)

### ➕ Submit a Movie
![Submit a Movie](assets/submit.png)
## Installation

1. **Clone the Repository**:

   Clone this repository to your local machine:

   ```bash
   git clone https://github.com/your-username/movie-watchlist.git
   ```

2. **Build the Project**:

   Build the project using Maven:

   ```bash
   mvn clean install
   ```

3. **Run the Application**:

   Run the application using the generated JAR file:

   ```bash
   java -jar target/movie-watchlist.jar
   ```

4. **Access the Application**:

   Access the application through your web browser:

   ```
   http://localhost:8080
   ```

## Usage

- **User Registration**: Create a new account to start managing your watchlist.

- **Browse and Manage**: Use the interface to browse movies and TV shows, and add them to your watchlist.

- **Rating Comparison**: Compare your ratings with those on the OMDb website and update your watchlist accordingly.

## Contributing

Contributions to the MovieWatchList-App are welcome! If you'd like to contribute, please fork the repository, make your changes, and submit a pull request. Before submitting a pull request, ensure that your changes adhere to the project's coding conventions and standards.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact

If you have any questions, suggestions, or feedback, feel free to contact the project maintainers at [aloksaw512@gmail.com].
```

Feel free to customize this further based on your project's specific requirements. Let me know if there's anything else I can assist you with! 
