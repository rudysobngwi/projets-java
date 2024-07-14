package depuis_c_plus_plus;

class Point {
	   /*Variables d'instance*/
	  private  int x; int y; int z;
	   
	   public Point( int x, int y, int z) {
		   
		  this.x = x ;
		  this.y = y;
		  this.z = z; 
	   }
	   public Point() {
		  this.x = 1; 
		  this.y = 1;
		  this.z = 1;
	   }
	   /*méthodes*/
	  public  void Saisie () {
	  /*cout << " Saisir l'abscisse du point " << endl;
	  cin >> this->x;
	  cout << " Saisir l'ordonnee du point " << endl;
	  cin >> this->y;
	  cout << " Saisir la cote du point " << endl;
	  cin >> this->z; */
	 
	  }
	  public  void Affiche () {
	  System.out.println("Abscisse : " +  this.x  );
	  System.out.println("Ordonnee : "  + this.y  );
	  System.out.println("Cote : " +  this.z );
	  }
	 
	  double Somme (int a, int b) {
		  return (double) a+b;
		  }

		  double Somme (double a, double b) {
		  return a+b;
		  }
		  double Somme (int a, int b , int c) {
			  return (double) a+b+c;
		  }
		  
		
	  
	 public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getZ() {
			return z;
		}
		public void setZ(int z) {
			this.z = z;
		}
	public static  void main(String[] args) {
		  //Déclaration d'une instance de la classe
		  Point Omega = new Point(2, 4, 3);
		  //appel des méthodes
		  Omega.Saisie();
		  Omega.Affiche();
		  
		  System.out.println(Omega.Somme(100, 200));
		  System.out.println();
		  Point alain = new Point(6, 7, 8);
		  alain.Affiche();
		  alain = new Point(10, 11, 12);
		  alain.Affiche();
		  alain = new Point();
		  alain.Affiche();
		  

		  
		  }
	  } /*fin de la classe point*/
	 
