package com.fedex.smartpost.utilities.dao;

import com.fedex.smartpost.utilities.helper.ResourceHelper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

public class ECustomerDaoImpl extends NamedParameterJdbcTemplate implements ECustomerDao {
	private static final String retreiveCustomer = ResourceHelper.classPathResource("sql/retrieveCustomer.sql");

	public ECustomerDaoImpl(DataSource dataSource) {
		super(dataSource);
	}

	public String retrieveCustomerName(String mailerId) {
		MapSqlParameterSource params = new MapSqlParameterSource("mailerId", mailerId);

		return queryForObject(retreiveCustomer, params, String.class);
	}
}
