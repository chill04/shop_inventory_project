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


Prompt G)
com/example/demo/domain/Part.java, lines 31-34, creates minInv and maxInv class variables for Part;
-Part.java, lines 49-50, adds minInv and maxInv to constructor;
-Part.java, lines 59-59, adds minInv and maxInv to constructor;
-Part.java, lines 94-103, creates setter and getter methods for minInv and maxInv;
-mainscreen.html, lines 38-39, adds table columns for min/max attributes;
-mainscreen.html, lines 48-49, adds min/max attributes to table;

-BootStrapData.java, lines 49-50, add minimum and maximum to sample inventory part o1;
-BootStrapData.java, lines 58-59, add minimum and maximum to sample inventory part o2;
-BootStrapData.java, lines 67-68, add minimum and maximum to sample inventory part o3;
-BootStrapData.java, lines 76-77, add minimum and maximum to sample inventory part o4;
-BootStrapData.java, lines 85-86, add minimum and maximum to sample inventory part o5;
-templates/InhousePartForm.html, lines 25-28, add form fields for minInv and maxInv;
-templates/OutsourcedPartForm.html, lines 25-28, add form fields for minInv and maxInv;

src/main/resources/application.properties, line 6, renamed storage file as: "spring-boot-h2-db102-RENAMED"

new file: src/main/java/com/example/demo/validators/InventoryMinMaxValidator.java
new file: src/main/java/com/example/demo/validators/ValidPartsInventory.java
-part.java, line 4, adds import of ValidPartsInventory;
-part.java, line 20, adds validation annotation to the Part class;








