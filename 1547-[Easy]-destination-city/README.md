# Destination City

🔗 https://leetcode.com/problems/destination-city/

## 📘 Problem
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

## 🧪 Examples
```
Example 1:
  Input:  paths = [[&quot;London&quot;,&quot;New York&quot;],[&quot;New York&quot;,&quot;Lima&quot;],[&quot;Lima&quot;,&quot;Sao Paulo&quot;]]
  Output: &quot;Sao Paulo&quot;
  Explanation: Starting at &quot;London&quot; city you will reach &quot;Sao Paulo&quot; city which is the destination city. Your trip consist of: &quot;London&quot; -> &quot;New York&quot; -> &quot;Lima&quot; -> &quot;Sao Paulo&quot;.

Example 2:
  Input:  paths = [[&quot;B&quot;,&quot;C&quot;],[&quot;D&quot;,&quot;B&quot;],[&quot;C&quot;,&quot;A&quot;]]
  Output: &quot;A&quot;
  Explanation: All possible trips are: 
&quot;D&quot; -> &quot;B&quot; -> &quot;C&quot; -> &quot;A&quot;. 
&quot;B&quot; -> &quot;C&quot; -> &quot;A&quot;. 
&quot;C&quot; -> &quot;A&quot;. 
&quot;A&quot;. 
Clearly the destination city is &quot;A&quot;.

Example 3:
  Input:  paths = [[&quot;A&quot;,&quot;Z&quot;]]
  Output: &quot;Z&quot;
```

## 📐 Constraints
```
1 <= paths.length <= 100
	paths[i].length == 2
	1 <= cityAi.length, cityBi.length <= 10
	cityAi != cityBi
	All strings consist of lowercase and uppercase English letters and the space character.
```

## 🧠 Approach
- Initialize a HashSet to store the cities that are sources in the paths.
- Iterate through the paths and add the source city of each path to the HashSet.
- Iterate through the paths again and check if the destination city of each path is not in the HashSet.
- Return the first destination city that is not in the HashSet.

## ⏱️ Complexity
- Time: O(n), where n is the number of paths.
- Space: O(n), where n is the number of paths.

## 📊 Stats
- Runtime: 2 ms
- Memory: 43.21 MB
