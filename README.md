# compass

MAMN01 individuell uppgift

För att bygga grunden av appen med knappar och aktiviteter användes:
- Android Developer: "Build your first app": https://developer.android.com/training/basics/firstapp 

Min app består av en huvudaktivitet med knappar som tar en vidare till antingen en kompassaktivitet eller en accelerometeraktivitet.

Accelerometer:

För att skapa accelerometern användes dessa kodexempel i kombination:
- https://examples.javacodegeeks.com/android/core/hardware/sensor/android-accelerometer-example/?fbclid=IwAR0y_coAgUjj3XRmau2fEP2PSoyTe9nzmku-QFm3812hvMHQuH3VsVSiyTE 
- https://www.youtube.com/watch?v=YrI2pCZC8cc 

Till accelerometern har jag lagt till en text som skriver ut om telefonen är tiltad åt höger eller vänster.

Kompass:

För att skapa kompassen användes detta kodexempel:
- https://www.wlsdevelop.com/en/2016/12/08/how-to-create-a-compass-app/ 

De modifikationer gjort på kompassen är:
- Ändrad bild
- Telefonen vibrerar när den är riktat i riktningen norr (https://stackoverflow.com/questions/13950338/how-to-make-an-android-device-vibrate-with-different-frequency)
- När telefonen är riktat mot norr ändras färgen på texten till grön.
- Lågpassfiltrering (https://www.built.io/blog/applying-low-pass-filter-to-android-sensor-s-readings)

I övrigt har jag använt stackoverflow för att förstå och lösa problem.
Dessa länkar har också använts för att öka förståelse:
- https://developer.android.com/reference/android/hardware/SensorEvent.html
- https://developer.android.com/reference/android/hardware/SensorManager.html
