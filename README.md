Because Dijkstra's is perfectly accurate but slow, and Greedy BFS is fast but inaccurate, computer scientists combined them to create A (A-Star) Search*. A* calculates both the actual cost from the start ($g(n)$) and the estimated cost to the goal ($h(n)$) to efficiently find the guaranteed shortest path.


https://theory.stanford.edu/~amitp/GameProgramming/AStarComparison.html

Formula:
f(n) = g(n) + h(n).

In the standard terminology used when talking about A*:
g(n) represents the exact cost of the path from the starting point to any vertex n, and h(n) represents the heuristic estimated cost from vertex n to the goal. 
