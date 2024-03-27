Builds a tool that assesses the strength of a password based on criteria such as length, presence of uppercase and lowercase letters, numbers, and special characters. Provides feedback to users on the password's strength.

How it works: 
  1) User Input: The program prompts you to enter your password using Scanner. Remember, strong passwords are your secret weapon – don't share it in the post!
  2) Strength Calculation: The calculateStrength method analyzes your password based on various criteria:
      Length: Longer passwords are generally more secure. (e.g., 8+ characters)
      Character Variety: It checks for a mix of uppercase and lowercase letters, numbers, and special characters.
      Starting Uppercase: Having an uppercase letter at the beginning adds a layer of complexity.
  3) Strength Feedback: Based on the score (number of criteria met), the getFeedback method provides a clear assessment:
      Strong Password: Excellent! Your password incorporates various elements for robust security.
      Medium Password: It's a good start, but adding more complexity (e.g., special characters) would be beneficial.
      Weak Password: Consider making your password stronger to enhance your account protection.
