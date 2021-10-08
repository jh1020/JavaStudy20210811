package User.dao;

public interface SignUpDao {
	public int idCheck(String id);
	public boolean signUp(String[] values);
}
