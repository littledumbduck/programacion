package boletin_9;

public class TikTokVideo {

	String videoId;
	String usuario;
	float duracion;
	int likes;
	int comentarios;
	String descripcion;
	String hashtags;

	// Constructor
	public TikTokVideo(String videoId, String usuario, float duracion, int likes, int comentarios, String descripcion,
			String hashtags) {
		this.videoId = videoId;
		this.usuario = usuario;
		this.duracion = duracion;
		this.likes = likes;
		this.comentarios = comentarios;
		this.descripcion = descripcion;
		this.hashtags = hashtags;
	}

	// getters
	public String getVideoId() {
		return videoId;
	}

	public String getUsuario() {
		return usuario;
	}

	public float getDuracion() {
		return duracion;
	}

	public int getLikes() {
		return likes;
	}

	public int getComentarios() {
		return comentarios;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getHashtags() {
		return hashtags;
	}

	// setters
	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void setComentarios(int comentarios) {
		this.comentarios = comentarios;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setHashtags(String hashtags) {
		this.hashtags = hashtags;
	}

	// methods
	public void darLike() {
		this.likes++;
	}

	public void comentar() {
		this.comentarios++;
	}

	public void mostrarEstadisticas() {
		System.out.println("Likes: " + this.likes);
		System.out.println("Comentarios: " + this.comentarios);
	}

	public boolean esPopular() {
		if (likes >= 10000) {
			return true;
		} else {
			return false;
		}
	}
	
	public void actualizarHashtags (String value) {
		this.hashtags = value;
	}

	//toString
	public String toString() {
		return "TikTokVideo [videoId=" + videoId + ", usuario=" + usuario + ", duracion=" + duracion + ", likes="
				+ likes + ", comentarios=" + comentarios + ", descripcion=" + descripcion + ", hashtags=" + hashtags
				+ "]";
	}
	
	
}