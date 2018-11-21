package com.fedex.smartpost.utilities.dao;

import com.fedex.smartpost.utilities.model.Package;

import java.util.Collection;
import java.util.List;

public interface PackageDao {
	List<Package> retrievePackages(Collection<String> packageIds);
}
