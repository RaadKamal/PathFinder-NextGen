Because Dijkstra's is perfectly accurate but slow, and Greedy BFS is fast but inaccurate (Both approaches are built on BFS), computer scientists combined them to create A (A-Star) Search*. A* calculates both the actual cost from the start g(n) and the estimated cost to the goal h(n) to efficiently find the guaranteed shortest path.


https://theory.stanford.edu/~amitp/GameProgramming/AStarComparison.html

## Formula:
f(n) = g(n) + h(n).

Each time through the main loop, it examines the vertex n that has the lowest f(n) = g(n) + h(n).

$g(n)$ (The known past): This acts like Dijkstra's Algorithm. It keeps the algorithm grounded in reality by tracking the actual cost already spent, ensuring you don't commit to a path that has already become too expensive.

$h(n)$ (The estimated future): This acts like Greedy Best-First Search. It provides a "best guess" that actively pulls the search direction toward the goal, rather than just expanding blindly in a circle.

what is $f(n)?$ The best Breadth First Search!

## Primary Real-World Applications:

* Video games: A* is the engine running behind a unit moving around in a jungle filled with trees and evading enemies, or an enemy character chasing the player through a complex building.

* GPS and Navigation: While massive apps like Google Maps use complex, highly optimised variations of these algorithms to handle the entire globe, the core concepts of A* are used to find the fastest route between two locations while factoring in avoiding roadblocks.

* Robotics: Autonomous machines ( like automated warehouse robots or robotic vacuums ) use A* to plot a physical path across a factory floor or a living room without crashing into walls or unexpected obstacles.
