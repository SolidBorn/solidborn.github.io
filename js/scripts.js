///<reference path="/alt1lib.js">
///<reference path="/runeappslib.js">
///<reference path="/imagedetect.js">
///<reference path="/apps/alt1/alt1doc.js">


function start() {
	a1lib.identifyUrl("appconfig.json");
	var wh = alt1.rsHeight;
        var ww = alt1.rsWidth;
        var textSize = 16
        var timeToShow = 60000;
        var x = 20;//(wh - textSize) - (textSize+20);
        var y = parseInt((ww/2) - ((text.length*textSize)/3.15));

        var color = 0000
            alt1.overLayText('Solid Born testing some text on screen because he wants too', parseInt('0xFF' + color), textSize, y, x, timeToShow);
}
