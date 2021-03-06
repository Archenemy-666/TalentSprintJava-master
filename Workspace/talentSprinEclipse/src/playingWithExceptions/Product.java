package playingWithExceptions;

public class Product {

		private int id ;
		private double weight ;
		private double price ;
		public Product() {}
		
		public Product(int id,double weight, double price) {
			super();
			this.id = id;
			this.price = price;
			this.weight = weight;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", price=" + price + ", weight=" + weight + "]";
		}
		
		
		 
	}



