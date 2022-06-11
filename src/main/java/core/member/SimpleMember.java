/**
 * 
 */
package core.member;

/**
 * @author admin
 *
 */
public class SimpleMember implements IMember {

	private String name;
	private String address;
	private Integer score;
	
	public SimpleMember(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public SimpleMember(String name, String address, Integer score) {
		this.name = name;
		this.address = address;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	@Override
	public boolean equals(Object o) {
		IMember member = (IMember) o;
		return (this.name.equalsIgnoreCase(member.getName()) && this.address.equalsIgnoreCase(member.getAddress()));
	}

	public int compareTo(IMember o) {
		int compareScore = ((IMember)o).getScore();
		return this.score - compareScore;
	}
}
