
public class MarioZurbanoMusica {

	public String nombreGrupo;
	public String nombreAlbum;
	public String nombreHobby;
	
	public MarioZurbanoMusica(String nombreGrupo, String nombreAlbum, String nombreHobby){
		super();
		this.nombreGrupo=nombreGrupo;
		this.nombreAlbum=nombreAlbum;;
		this.nombreHobby=nombreHobby;
		
	}
		public String getNombreGrupo() {
			return nombreGrupo;
		}
		public void setNombreGrupo(String nombreGrupo) {
			this.nombreGrupo=nombreGrupo;
		}
		
		public String getNombreAlbum() {
			return nombreAlbum;
		}
		public void setNombreAlbum(String nombreAlbum) {
			this.nombreAlbum=nombreAlbum;
		}
		
		public String getNombreHobby() {
			return nombreHobby;
		}
		public void setNombreHobby(String nombreHobby) {
			this.nombreHobby=nombreHobby;
		}
		public static void nombreGrupo(String nombreGrupo) {
			for (int i= 0;i<1000;i++) {
				System.out.println("Metallica");
			}
		}
}		

