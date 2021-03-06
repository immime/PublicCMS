package com.publiccms.entities.system;

// Generated 2015-7-20 11:26:18 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SystemRoleMoudle generated by hbm2java
 */
@Entity
@Table(name = "system_role_moudle")
public class SystemRoleMoudle implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int roleId;
	private int moudleId;

	public SystemRoleMoudle() {
	}

	public SystemRoleMoudle(int roleId, int moudleId) {
		this.roleId = roleId;
		this.moudleId = moudleId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "role_id", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "moudle_id", nullable = false)
	public int getMoudleId() {
		return this.moudleId;
	}

	public void setMoudleId(int moudleId) {
		this.moudleId = moudleId;
	}

}
