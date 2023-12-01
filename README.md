<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS



Prompt C)
    src/main/resources/templates/mainscreen.html, line 14, changes title to "My Soccer Shop";
    -mainscreen.html, line 19, changes header to "Soccer Shop";


Prompt D)
    new file: src/main/resources/templates/about.html;
    -mainscreen.html, line 91, adds link to "About Us" page;
    -about.html, line 5, adds "About Us" title
    -about.html, line 8, adds "About Us" header
    -about.html, line 9, adds description of business
    -about.html, line 10, adds linebreak
    -about.html, line 11, adds return link to mainscreen;
    new file: src/main/java/com/example/demo/controllers/AboutController.java;
    -AboutController.java, line 6-11, creates new class AboutController for page links;

Prompt E)
    com/example/demo/bootstrap/BootStrapData.java, lines 42-96, creates 5 new parts;
    -BootStrapData.java, lines 79, creates 'inventoryCheck' boolean set to false;
    -BootStrapData.java, lines 80-82, iterates through parts repository; changes inventoryCheck to true if any are found;
    -BootStrapData.java, lines 108-110, iterates through products repository; changes inventoryCheck to true if any are found;
    -BootStrapData.java, lines 119-130, if inventoryCheck is false, products & parts are added to repositories.  

Prompt F)
    new file: src/main/resources/templates/buy-now.html;
    -controllers/AddProductController.java, line 171-191, creates new controller and method for buy-now . Checks product inventory and if zero, creates failure message.  If >0, creates success message and reduces item inventory by 1.
    -buy-now.html, line 9, creates display for success/failure message from controller;
    -mainscreen.html, line 86, adds button for 'buy now' to product table;





