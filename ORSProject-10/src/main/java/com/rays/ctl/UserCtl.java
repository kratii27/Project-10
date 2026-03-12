package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.common.UserContext;
import com.rays.dto.RoleDTO;
import com.rays.dto.UserDTO;
import com.rays.form.UserForm;
import com.rays.service.RoleServiceInt;
import com.rays.service.UserServiceInt;

@RestController
@RequestMapping(value = "User")
public class UserCtl extends BaseCtl<UserDTO, UserServiceInt, UserForm> {
	
	@Autowired
	RoleServiceInt roleService;
	
	@GetMapping(value = "preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);

		RoleDTO dto = new RoleDTO();		
		List<DropdownList> list = roleService.search(dto, userContext);
		res.addResult("roleList", list);
		
		return res;
	}

}
