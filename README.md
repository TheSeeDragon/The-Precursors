# The-Precursors
Hackatown 2021 Eco-Parking Montreal project

## Inspiration

What inspired us was the frustration we feel every time we find an open parking spot only to find out there is a sign that says you can't park there. 

## What it does

Creates a series of points on a map which correspond with a parking sign that at the time inputted is available to park in front of.

## How we built it

We used java to filter out the parking signs into 3 different .geojson files so that we can output them to the Maps API depending on the inputted time. We then used the Google maps API in an online IDE to visualize our .geojson files onto Google maps.

## Challenges we ran into

As a team of mostly novice programmers we encountered many problems but luckily we were able to fix them while only asking a mentor for guidance once. One of our biggest problems during the weekend was creating the filter for the .geojson files, we eventually settled on using many conditional statements to exclude the unwanted lines thus filtering the file. Another big problem was that none of us knew how to use APIs so to implement the Google Maps API we had to learn how to use it and fix the smaller problems we encountered while using it.  One problem we were not able to fix in time was that our filter code keeps cutting the last line of the .geojson file in half. We weren't able to find the cause of the problem but I'm sure we can figure it out if we keep working on it.

## What we learned

We learnt how APIs work and a bit of how the Google Maps API works. We also learnt how to properly work as a team and divide our objective into different tasks that each of us could work on. We also expanded our knowledge of Java and for some learnt how to use it for the first time.

## What's next for Precursors

We plan to participate in more hackathons in the future and continue working on the project we started this weekend and maybe turn it into an actual usable product.
