# Hypixel Summoning Eye Simulator
Simple java program to simulate how many summoning eye drops each player gets from a farming session.

The NUMBER_OF_PLAYERS determines how many players will be simulated and<br />
The ZEALOTS_PER_PLAYER determines how many zealots each player kills in each session.

The output file will contain the player number and the number of eyes they got in that session, separated by a tab.<br />
Each player will be outputted on their own line, for easy copy/pasting into Excel or Google Sheets.

Assumes the chance of an eye drop is 1/420, and that the rate becomes 1/210 after 420 zealots are killed and no eye is dropped. Chance resets to 1/420 after an eye is dropped.

More information here: http://www.sirknightj.com/blog/2020/02/23/summing-eye-drop-rates-hypixel-skyblock/
