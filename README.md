https://theory.stanford.edu/~amitp/GameProgramming/AStarComparison.html

Formula:
f(n) = g(n) + h(n).

In the standard terminology used when talking about A*:
g(n) represents the exact cost of the path from the starting point to any vertex n, and h(n) represents the heuristic estimated cost from vertex n to the goal. In the above diagrams, the yellow (h) represents vertices far from the goal and teal (g) represents vertices far from the starting point. A* balances the two as it moves from the starting point to the goal. Each time through the main loop, it examines the vertex n that has the lowest f(n) = g(n) + h(n).
