# Design Bus Seat Booking System

🔗 https://leetcode.com/problems/design-bus-seat-booking-system/

## 📘 Problem
You are asked to design a seat booking system for a bus.

The bus has n rows. Each row has four seats labeled &quot;A&quot;, &quot;B&quot;, &quot;C&quot;, and &quot;D&quot;.

Seats &quot;A&quot; and &quot;D&quot; are window seats; seats &quot;B&quot; and &quot;C&quot; are middle seats. In each row, seat &quot;A&quot; is adjacent to seat &quot;B&quot;, and seat &quot;D&quot; is adjacent to seat &quot;C&quot;.

Booking rules:

	Booking a middle seat (&quot;B&quot; or &quot;C&quot;) always takes 1 second.
	Booking a window seat (&quot;A&quot; or &quot;D&quot;) takes 1 second if its adjacent middle seat is not booked, or 3 seconds (an extra delay of 2 seconds) if its adjacent middle seat is already booked.

A seat is identified by a string such as &quot;A1&quot; or &quot;D20&quot; (one letter from A to D followed by its row number).

Implement the BusBooking class:

	BusBooking(int n): Initializes the system with n empty rows.
	void toggle(string seat): Books seat if it is free, or frees it if it is already booked.
	int getTotalTime(): Returns the total time (in seconds) taken to book all currently booked seats, where the seats are booked in the order their toggle calls were made. If no seats are currently booked, return 0.
	int getMinTime(): Returns the smallest possible total time (in seconds) to book all currently booked seats, over every possible order of booking them. If no seats are currently booked, return 0.

Note: The time cost of a seat is fixed at the moment it is booked, based on the seats booked at that time. Booking or freeing other seats afterward does not change the cost of a seat that is already booked.

## 🧪 Examples
```
Example 1:
  Input:  [&quot;BusBooking&quot;, &quot;toggle&quot;, &quot;toggle&quot;, &quot;getTotalTime&quot;, &quot;getMinTime&quot;, &quot;toggle&quot;, &quot;toggle&quot;, &quot;getTotalTime&quot;, &quot;getMinTime&quot;]
  Output: [null, null, null, 4, 2, null, null, 8, 4]

Example 2:
  Input:  [&quot;BusBooking&quot;, &quot;toggle&quot;, &quot;toggle&quot;, &quot;getTotalTime&quot;, &quot;toggle&quot;, &quot;toggle&quot;, &quot;toggle&quot;, &quot;getTotalTime&quot;, &quot;getMinTime&quot;]
  Output: [null, null, null, 4, null, null, null, 1, 1]
```

## 📐 Constraints
```
1 <= n <= 105​​​​​​​
	seat[0] is one of &#39;A&#39;, &#39;B&#39;, &#39;C&#39;, &#39;D&#39;.
	The remaining characters of seat form an integer row with 1 <= row <= n.
	The total number of calls to toggle, getTotalTime, and getMinTime does not exceed 105.
```

## 🧠 Approach
- Identify core logic
- Use proper data structure
- Optimize traversal
- Return result

## ⏱️ Complexity
- Time: O(N)
- Space: O(1)

## 📊 Stats
- Runtime: 256 ms
- Memory: 182.44 MB
