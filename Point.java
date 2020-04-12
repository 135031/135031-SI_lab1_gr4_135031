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