package br.loja.entidade;

public class Login {
	private int id_usuario;
	private String usuario;
	private String senha;

	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Login [id_usuario=" + id_usuario + ", usuario=" + usuario + ", senha=" + senha + "]";
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
