
https://theory.stanford.edu/~amitp/GameProgramming/AStarComparison.html

## Formula:
f(n) = g(n) + h(n).

__If h(n) is exactly equal to the cost of moving from n to the goal, then A* will only follow the best path and never expand anything else, making it very fast. Although you can’t make this happen in all cases, you can make it exact in some special cases. It’s nice to know that given perfect information, A* will behave perfectly__

That's what A* capability. NextGen starts from here:- The rest of the algorithm is being developed in private mode.


### Primary Real-World Applications of A*:

* Video games: A* is the engine running behind a unit moving around in a jungle filled with trees and evading enemies, or an enemy character chasing the player through a complex building.

* GPS and Navigation: While massive apps like Google Maps use complex, highly optimised variations of these algorithms to handle the entire globe, the core concepts of A* are used to find the fastest route between two locations while factoring in avoiding roadblocks.

* Robotics: Autonomous machines ( like automated warehouse robots or robotic vacuums ) use A* to plot a physical path across a factory floor or a living room without crashing into walls or unexpected obstacles.

<p align="center">
  <h2>A* Pic:</h2>
  <img src="https://github.com/user-attachments/assets/2bcb2541-3d9b-428f-8600-35b860db2844" width="600" alt="PictureA">
</p>

<p align="center">
  <h2>NextGen Pic (Searching): Zero Expansion</h2>
  <img src="https://github.com/user-attachments/assets/1fba415a-085d-49f5-8257-9a4efe87695d" width="600" alt="Searcher">
</p>

<p align="center">
  <h2>NextGen Pic (PathFound): To the point</h2>
  <img src="https://github.com/user-attachments/assets/717c62a5-9af7-4169-9ac0-7715dfc40063" width="600" alt="Found">
</p>
