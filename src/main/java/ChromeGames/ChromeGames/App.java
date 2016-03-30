package ChromeGames.ChromeGames;


/*import static jsweet.dom.Globals.console;
import static jsweet.dom.Globals.document;
import static jsweet.dom.Globals.requestAnimationFrame;
import static jsweet.dom.Globals.window;
import jsweet.dom.KeyboardEvent;
import jsweet.dom.CanvasRenderingContext2D;
import jsweet.dom.Element;
import jsweet.dom.HTMLCanvasElement;
import jsweet.lang.Math;
import jsweet.util.StringTypes;*/

import static jsweet.dom.Globals.console;
import static jsweet.dom.Globals.document;
import static jsweet.dom.Globals.window;


import jsweet.dom.CanvasRenderingContext2D;
import jsweet.dom.Element;
import jsweet.dom.Event;
import jsweet.dom.EventListener;
import jsweet.dom.HTMLCanvasElement;
import jsweet.lang.Math;
import jsweet.util.StringTypes;

public class App {

	public static void main(String[] args) {
		window.onload = (e) -> {
			return new App();
		};
	}
	
	private HTMLCanvasElement canvas;
	private CanvasRenderingContext2D ctx;
	private double angle = 0;

	public App() {
		console.info("creating canvas drawing example");
		canvas = (HTMLCanvasElement) document.getElementById("canvas");

		Element body = document.querySelector("body");
		double size = Math.min(body.clientHeight, body.clientWidth);
		canvas.width = size - 20;
		canvas.height = size - 20;
		canvas.style.top = (body.clientHeight / 2 - size / 2 + 10) + "px";
		canvas.style.left = (body.clientWidth / 2 - size / 2 + 10) + "px";

		ctx = canvas.getContext(StringTypes._2d);
	   	//document.addEventListener("keydown", monActionListener, false);
		draw();
	}
	EventListener monActionListener = new EventListener() {

		@Override
		public void apply(Event evt) {
			 System.out.println("Hello, World");
			// TODO Auto-generated method stub
			
		}

	};
int xsnake=0;
int ysnake=0;
	
	private void draw() {

		int color1 = (int)Math.random()*255;
		int color2 = (int)Math.random()*255;
		int color3 = (int)Math.random()*255;
		//ctx.fillStyle = "rgb(" + (color1 & 0xFF) + "," + (color2 & 0xFF) + "," + (color3 & 0xFF) + ")";
		ctx.fillStyle = "rgb(" + (color1 ) + "," + (color1 ) + "," + (color1 ) + ")";
		ctx.clearRect(0, 0, canvas.width, canvas.height);
		ctx.beginPath();
    	ctx.fillRect(xsnake, ysnake, canvas.width/10, canvas.height/10);
    	xsnake++;
		//ctx.fill();
 


		if (angle < Math.PI * 2) {
			angle += 0.05;
			window.requestAnimationFrame((time) -> {
				this.draw();
			});
		}
	}

	private void snake(int xsnake,int ysnake) {
		 //window.requestAnimationFrame(APP.core.frame); 
        if (xsnake<800)
        {
        	//ctx.wait();

        }}
}
/*public class App {
	

	public static void main(String[] args) {
		window.onload = (e) -> {
			return new App();
		};
	}
	
	private HTMLCanvasElement canvas;
	private CanvasRenderingContext2D ctx;
	private double angle = 0;

	public App() {
		console.info("creating canvas drawing example");
		canvas = (HTMLCanvasElement) document.getElementById("canvas");

		Element body = document.querySelector("body");
		double size = Math.min(body.clientHeight, body.clientWidth);
		canvas.width = size - 20;
		canvas.height = size - 20;
		canvas.style.top = (body.clientHeight / 2 - size / 2 + 10) + "px";
		canvas.style.left = (body.clientWidth / 2 - size / 2 + 10) + "px";

		ctx = canvas.getContext(StringTypes._2d);
		draw();
	}
int xsnake=10;
int ysnake=5;
	private void draw() {
		//int color = (int) (Math.pow(2, 8 * Math.floor(angle / Math.PI * 2) - 1));
		int color1 = (int)Math.random()*255;
		int color2 = (int)Math.random()*255;
		int color3 = (int)Math.random()*255;
		ctx.fillStyle = "rgb(" + (color1 & 0xFF) + "," + (color2 & 0xFF) + "," + (color3 & 0xFF) + ")";
		ctx.clearRect(0, 0, canvas.width, canvas.height);
		ctx.beginPath();
		//ctx.moveTo(canvas.width / 2, canvas.height / 2);
		//ctx.lineTo(canvas.width, canvas.height / 2);
		//ctx.arc(canvas.width / 2, canvas.height / 2, canvas.width / 2, 0, angle);
		//ctx.fill();
		snake(xsnake,ysnake);
		/*if (angle < Math.PI * 2) {
			angle += 0.05;
			window.requestAnimationFrame((time) -> {
				this.draw();
			});
		}*/
	/*}
	
	int start=0;
	int timestamp=10000;
	int progress=0;


	private void callback ()
	{
        if (xsnake<800)
        {
        	//ctx.wait();
        	ctx.clearRect(0, 0, canvas.width, canvas.height);
        	xsnake++;
			snake(xsnake,ysnake);	
        }
	}
	private void snake(int xsnake,int ysnake) {
		AnimationScheduler.get().requestAnimationFrame();
		 //window.requestAnimationFrame(APP.core.frame); 
        if (xsnake<800)
        {
        	//ctx.wait();
        	ctx.clearRect(xsnake, ysnake, canvas.width, canvas.height);
        	xsnake++;
			snake(xsnake,ysnake);	
        }
        else {
            cancelAnimationFrame(requestID);
          }
		 
		}
	
}*/