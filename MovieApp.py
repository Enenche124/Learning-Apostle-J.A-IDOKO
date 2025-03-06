def add_movie(movies, movie_name):
    movies[movie_name] = []
    print(f"Movie {movie_name} added!")

def rate_movie(movies, movie_name, rating):
    if movie_name in movies:
        movies[movie_name].append(rating)
    else:
        movies[movie_name] = [rating]

def view_average_rating(movies):
    if not movies:
        print("No movies added yet.")
        return
    for title, ratings in movies.items():
        average_rating = sum(ratings) / len(ratings)
        print(f"{title}: {average_rating:.2f}")
        break
def main():
    movies = {}
    while True:
        print("\n1. Add a Movie \n2. Rate a Movie \n3. View Average Rating \n4. Exit")
        try:
            user_choice = int(input("\nEnter your choice: "))
        except ValueError:
            print("Invalid choice! Please enter a number between 1 and 4.")
            continue

        if user_choice == 1:
            movie_name = input("Enter the movie name: ")
            add_movie(movies, movie_name)

        elif user_choice == 2:
            title = input("Enter the movie name: ")
            try:
                rating = int(input("Enter your rating (1-5): "))
                if rating < 1 or rating > 5:
                    print("Invalid rating! Please enter a number between 1 and 5.")
                    continue
                rate_movie(movies, title, rating)
            except ValueError:
                print("Invalid input! Please enter a valid rating.")
        
        elif user_choice == 3:
            view_average_rating(movies)

        elif user_choice == 4:
            print("Exiting the application. Goodbye!")
            break
        else:
            print("Invalid choice! Please choose between 1 and 4.")

if __name__ == "__main__":
    main()