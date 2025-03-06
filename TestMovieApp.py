import unittest

class TestMovieApp(unittest.TestCase):
    
    def setUp(self):
        self.movies = {}
        
    def test_add_movie(self):
        add_movie(self.movies, "Inception")
        self.assertIn("Inception", self.movies)
        self.assertEqual(self.movies["Inception"], [])

    def test_rate_movie_existing(self):
        add_movie(self.movies, "Inception")
        rate_movie(self.movies, "Inception", 4)
        self.assertEqual(self.movies["Inception"], [4])
        
    def test_rate_movie_new(self):
        rate_movie(self.movies, "Interstellar", 5)
        self.assertIn("Interstellar", self.movies)
        self.assertEqual(self.movies["Interstellar"], [5])

    def test_view_average_rating(self):
        add_movie(self.movies, "Inception")
        rate_movie(self.movies, "Inception", 4)
        rate_movie(self.movies, "Inception", 5)
        self.assertEqual(sum(self.movies["Inception"]) / len(self.movies["Inception"]), 4.5)

    def test_view_average_rating_no_movies(self):
        # When no movies are added yet
        with self.assertRaises(KeyError):
            view_average_rating(self.movies)

    def test_invalid_choice(self):
        # Here we simulate an invalid choice to check if the menu correctly handles errors
        with self.assertRaises(ValueError):
            run_app("invalid choice")  # This test expects a wrong input handling

if __name__ == "__main__":
    unittest.main()