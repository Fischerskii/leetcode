package org.example;

public class VersionComparator {
    public int compareVersion(String version1, String version2) {
        String[] version1Split = version1.split("\\.");
        String[] version2Split = version2.split("\\.");

        int maxLength = Math.max(version1Split.length, version2Split.length);

        for (int i = 0; i < maxLength; i++) {
            int version1Int = i < version1Split.length ? Integer.parseInt(version1Split[i]) : 0;
            int version2Int = i < version2Split.length ? Integer.parseInt(version2Split[i]) : 0;

            if (version1Int < version2Int) {
                return -1;
            } else if (version1Int > version2Int) {
                return 1;
            }
        }

        return 0;
    }
}
