package org.example;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel = 0;
        int currentFuel = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalFuel += gas[i] - cost[i];
            currentFuel += gas[i] - cost[i];
            if (currentFuel < 0) {
                startIndex = i + 1;
                currentFuel = 0;
            }
        }
        return (totalFuel >= 0) ? startIndex : -1;
    }
}