class Point {
	String id, pColor;
	double x,y;

	public Point(String id, double x, double y, String pointsColor) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.pointsColor = pointsColor;
	}


	public void setId(String id) {
		this.id = id;
	}

	public void setPcolor(String pColor) {
		this.pColor = pColor;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getId() {
		return id;
	}

	public String getPcolor() {
		return pointsColor;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}


	public void move (char xDirection, char yDirection) {
		if(xDirection=='L'){
            x--;
        }
		else if(xDirection=='R'){
            x++;
        }

        if(yDirection=='U'){
            y++;
        }
		else if(yDirection=='D'){
            y--;
        }
	}

	public void draw () {
		System.out.println(String.format("Point coordnates: x = %f y = %f", x, y));
	}

}

class Canvas {
	List<Point> points;
	String id, pColor;
	double x,y;

	public Canvas(String id, String pColor, double x, double y) {
		this.points = new ArrayList<>();
		this.id = id;
		this.pColor = pColor;
		this.x = x;
		this.y = y;
	}
	public void addPoint(String id,double x,double y,String pColor){
		points.add(new Point(id,pColor,x,y));
		System.out.println("("+id+","+pColor+","+x+","+y+")");
	}

	public void removePoint(int i){
		points.remove(points.get(i));
	}

	public void drawPoints(){
		for (Point p:points){
			p.draw();
		}
	}
	
	public void movePoints(char xD,char yD){
		for(Point p:points){
			p.move(xD,yD);
		}
	}

	public void total(){
		System.out.println(points.size());
	}
}