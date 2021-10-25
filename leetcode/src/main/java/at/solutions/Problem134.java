package at.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0, start = 0, totalGasRemaining = 0;

        for(int i = 0; i < gas.length; i++) {
            int gasRemaining = gas[i] - cost[i];
            tank += gasRemaining;

            if(tank < 0) {
                tank = 0;
                start = i + 1;
            }

            totalGasRemaining += gasRemaining;
        }

        return totalGasRemaining < 0 ? -1 : start;
    }
}
