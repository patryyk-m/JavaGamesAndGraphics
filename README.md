JavaGamesAndGraphics
Description
A collection of Java-based programs demonstrating various graphical and decision-making functionalities using JFrame, JPanel, and Graphics classes.

Features

Part 1 (Image Display Menu):
This part provides a main menu that allows the user to choose between displaying two images—Chess or Snakes and Ladders. When the user selects an option, an internal frame is launched that shows the image.

Part 2 (Image Viewer & Color Picker):
This part lets the user view a selected image from the main menu, either Chess or Snakes and Ladders. The image is displayed in an internal frame on the desktop pane.
Additionally, the user can click on a color label, which triggers a color chooser dialog (JColorChooser). Upon selecting a color, the background of the label changes to the chosen color, providing an interactive color-picking feature.

Part 3 (Decision-Making Sequence):
This part introduces a simple decision-making game where the user is prompted to explore a passage. The user’s decision will either lead them to discover a treasure or avoid the passage. A pop-up message will display the outcome based on their choice.

Part 4 (Snowman Drawing):
This part showcases a graphical snowman drawing created using Java’s Graphics class. The program draws the snowman’s head, body, limbs, and facial features with custom shapes and colors.

Running the Program

Load the code into your IDE of choice.
Run the main class in each part:
Part 1 launches the main menu for image display (Chess or Snakes and Ladders).
Part 2 allows the user to view the selected image in a separate internal frame and interact with the color picker to change the background color of a label.
Part 3 initiates the decision-making game with the treasure discovery sequence.
Part 4 draws a snowman using graphical methods.
Checklist

Implement menu functionality with JMenuBar and JMenuItem.
Handle user input and actions via event listeners.
Display images within internal frames using JDesktopPane and JInternalFrame.
Include a JColorChooser dialog for color selection, allowing users to change the label's background.
Design and draw custom shapes and figures using Java’s Graphics class.
