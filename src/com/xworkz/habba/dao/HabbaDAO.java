package com.xworkz.habba.dao;

import java.util.Collection;

import com.xworkz.habba.dto.HabbaDTO;
import com.xworkz.habba.search.HabbaSearch;

public interface HabbaDAO {
	HabbaDTO ondunsHuduku(HabbaSearch dto);

	Collection<HabbaDTO> yalavanuHuduku(HabbaSearch search);

	boolean save(HabbaDTO dto);

}
