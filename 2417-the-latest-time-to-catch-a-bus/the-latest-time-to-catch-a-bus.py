class Solution:
    def latestTimeCatchTheBus(self, buses: List[int], passengers: List[int], capacity: int) -> int:
        buses.sort()
        passengers.sort()
        ans = 0
        i = 0
        for bus in buses:

            cnt = 0
            while i < len(passengers) and passengers[i] <= bus and cnt < capacity:
                i += 1
                cnt += 1

            if cnt < capacity:
                ans = bus
            else:
                ans = passengers[i-1]

        seen = set(passengers)
        while ans in seen:
            ans -= 1

        return ans