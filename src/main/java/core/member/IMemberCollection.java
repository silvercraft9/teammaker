/**
 * 
 */
package core.member;

import java.util.ArrayList;

/**
 * @author admin
 *
 */
public interface IMemberCollection {

	/**
	 * 
	 * @param member the member to check in the collection
	 * @return if the member belongs to the collection
	 */
	public boolean contains(IMember member);
	
	/**
	 * If the member does not belongs to the collection, add that member to the collection
	 * @param member the member to add
	 */
	public void addMember(IMember member);
	
	/**
	 * If the member belongs to the collection, remove that member from the collection
	 * @param member the member to remove
	 */
	public void deleteMember(IMember member);

	/**
	 * 
	 * @return the list of participants
	 */
	public ArrayList<IMember> getMembers();
	
	/**
	 * 
	 * @param members the list of members to set for the collection
	 */
	public void setMembers(ArrayList<IMember> members);
	
	/**
	 * 
	 * @param member the member to exclude from the list of participants
	 * @return the list of participants except an excluded one
	 */
	public ArrayList<IMember> getOtherMembers(IMember member);
	
	/**
	 * 
	 * @return the list of members in the collection sorted by ascending score
	 */
	public ArrayList<IMember> getSortAscByScore();
	
	/**
	 * 
	 * @return the list of members in the collection sorted by descending score
	 */
	public ArrayList<IMember> getSortDescByScore();
	
	/**
	 * 
	 * @return the member with the lowest score. If multiple members have the lowest score in the collection, the first in the collection is returned.
	 */
	public IMember getMinMemberByScore();
	
	/**
	 * 
	 * @return the member with the highest score. If multiple members have the highest score in the collection, the first in the collection is returned.
	 */
	public IMember getMaxMemberByScore();
}
