package com.fedex.smartpost.utilities.model;

public class Difference {
	private String packageId;
	private String ratingField;
	private String pfiValue;
	private String dbValue;

	public Difference(String packageId, String ratingField, String pfiValue, String dbValue) {
		this.packageId = packageId;
		this.ratingField = ratingField;
		this.pfiValue = pfiValue;
		this.dbValue = dbValue;
	}

	public String getPackageId() {
		return packageId;
	}

	public String getRatingField() {
		return ratingField;
	}

	public String getPfiValue() {
		return pfiValue;
	}

	public String getDbValue() {
		return dbValue;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("[Package Id: ").append(packageId)
		  .append("][Field: ").append(ratingField)
		  .append("][PFI Value: ");
		if (pfiValue == null) {
			sb.append("{null}");
		}
		else {
			sb.append(pfiValue.trim());
		}
		sb.append("][DB Value: ");
		if (dbValue == null) {
			sb.append("{null}");
		}
		else {
			sb.append(dbValue.trim());
		}
		sb.append("]");
		return sb.toString();
	}
}