
https://theory.stanford.edu/~amitp/GameProgramming/AStarComparison.html

## Formula:
f(n) = g(n) + h(n).

Each time through the main loop, it examines the vertex n that has the lowest f(n) = g(n) + h(n). It is heuristic in its nature.

$g(n)$ (The known past): This acts like Dijkstra's Algorithm. It keeps the algorithm grounded in reality by tracking the actual cost already spent, ensuring you don't commit to a path that has already become too expensive.

__If h(n) is exactly equal to the cost of moving from n to the goal, then A* will only follow the best path and never expand anything else, making it very fast. Although you can’t make this happen in all cases, you can make it exact in some special cases. It’s nice to know that given perfect information, A* will behave perfectly__

$h(n)$ (The estimated future): This acts like Greedy Best-First Search. It provides a "best guess" that actively pulls the search direction toward the goal, rather than just expanding blindly in a circle.

what is $f(n)?$ The best B+D First Search !

## Primary Real-World Applications:

* Video games: A* is the engine running behind a unit moving around in a jungle filled with trees and evading enemies, or an enemy character chasing the player through a complex building.

* GPS and Navigation: While massive apps like Google Maps use complex, highly optimised variations of these algorithms to handle the entire globe, the core concepts of A* are used to find the fastest route between two locations while factoring in avoiding roadblocks.

* Robotics: Autonomous machines ( like automated warehouse robots or robotic vacuums ) use A* to plot a physical path across a factory floor or a living room without crashing into walls or unexpected obstacles.


That's what A* capability. NextGen starts from here:-
The rest of the algorithm is being developed in a private mode.
