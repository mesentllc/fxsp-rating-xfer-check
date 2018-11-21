package com.fedex.smartpost.utilities.dao;

import com.fedex.smartpost.utilities.model.PackageDetail;

import java.util.List;
import java.util.Map;

public interface PackageDetailXref {
	Map<String, PackageDetail> retrievePackageDetails(List<String> packageIds);
}
