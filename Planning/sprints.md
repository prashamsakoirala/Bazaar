TO: CEOs <br>
FROM: Prashamsa Koirala, Angela Predolac <br>
DATE: 26 September 2024 <br>
SUBJECT: Bazaar Game Milestone Outline <br>

**Introduction** <br>
This memo outlines the key milestones for implementing the game "Bazaar," organized so that the first sprint focuses on developing independent game components, with subsequent sprints building on the components completed in earlier sprints. Each sprint is expected to take 16 hours of work. <br>

**Sprint Descriptions** <br>
Sprint 1 focuses on developing the game's core components without user interactions. The key elements are: <br>

- Bank: manage pebbles of different colors, tracking and modifying counts
- Card Deck: initialize and manages a deck of 20 cards, including star cards, tracking usage and modifying counts
- Equation Generator: create 10 random, valid equations at game start
- Points Module: track player points, checks for game-ending conditions

Sprint 2 focuses on developing the Referee component, which acts as a controller for the core game elements developed in Sprint 1. The Referee manages three key interactions: <br>

- Referee Bank Interaction: handle pebble transactions between players and the bank
- Referee Card Interaction: control card purchases, exchanges, and displays
- Referee Equation Generation: generate a set of 10 valid equations for each round
- Points Interaction: allocate points to players per the rules

Sprint 3 focuses on building the Player component and developing Referee-Player interactions. The key elements are: <br>

- Referee Player Interaction: facilitate actions a player can take during their turn such as purchasing cards or exchanging pebbles
- Referee Point Assignment: award points to players based on their card purchases and remaining pebbles
- Referee Turn Management: correctly switch turns between players to maintain game flow
