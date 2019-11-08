# Pandorica

## Summary
A Nether improvement mod for Minecraft 1.14+

## Contributing
- You can contribute ideas at [our Discord](https://discord.gg/ftzwyrA) or through [issues](https://github.com/pandorica-mod/pandorica/issues) and [pull requests](https://github.com/pandorica-mod/pandorica/pulls).

## Features
- **Blocks**
    - *Eruption Block*
        * [x] Crafted with 2 *Crusted Magma* and 2 *Netherrack* in a chequerboard pattern
        * [ ] Works like the *Magmator*, but the area changes depending on the height
            - 3-4 blocks height-1
            - 5-7 blocks height-2x2
            - 8-9 blocks height-3x3
            - 10-12 blocks height-5x5
            - 13-15 blocks height-8x8
            - 16-20 blocks height-10x10 (max)
    - *Nether Gold Ore*
- **Entities**
    * [ ] *Liquefied Skeleton*
        * [ ] A *skeleton* variant that spawns in lava oceans
        * [x] Can only survive while in lava
        * [ ] *Liquefied Skeletons* will try to pull players into their lava pool
        * [x] Drops 0-3 *Nether Wart*, *Liquefied Bone* and rarely *Crusted Magma*
    * [ ] *Magmator*
        * [ ] Spawns rarely
            - Hostile
        * [ ] Attacks:
            - Charge, kick, pound
            - Pound special attack: a high jump where, within a 10x10 area, Stone becomes *Netherrack*, *Netherrack* becomes a Magma Block, and Magma Blocks become lava
        * [ ] Drops 0-2 *Crusted Magma*
        * [ ] Models
            - [/magmator](https://lh6.googleusercontent.com/0nG8YggwxWYns45eAFWo4kPGgV_xyenaIeizrULzOm_cts-uRBfc9jZcHk8Az6P203SpfhsNe-Gnd4IuYq_ljFHrv4EYaOqBwsOwHQjT=s440)
    * [ ] *Fire Spirit*
        * [ ] Spawns in groups of 1-3
        * [ ] Spawns from *Magma Blocks* occasionally?
        * [ ] Charges at the player (through the ground invisibly too!)
        * [ ] Sets the player on fire
        * [ ] In *Soul Valley*, they will be blue - like fire - but, instead of of burning the player, they deal 4HP damage and effect the player with '*Soul Drain*' for 5 seconds!
            - https://twitter.com/IslaMinecraft/status/1179126648509227008
        * [ ] The player could catch a *Fire Spirit* in a bottle ('*Captured Fire Spirit*') and perhaps be able to convert it into splash potion, which can be thrown at enemies to set them and the ground on fire
        * [ ] Takes damage in water
    * [ ] *Baby Ghast*
        * [ ] Spawns rarely like *Ghasts*
        * [ ] Peaceful to the extent that they fly away from the player and don't shoot
        * [ ] If there is a normal *Ghast* nearby, it will hide in its tentacle thingies
        * [ ] If player attacks a *Baby Ghast*, it will start shrieking for help. This will spawn a normal *Ghast* nearby. The spawning mechanism for this would be similar to `generic.spawnReinforcements`
        * [ ] *Baby Ghasts* can be tamed! Taming one is similar to that of a *Cat*
        * [ ] *Players* with tamed *Baby Ghasts* can float along with their pet using their tentacles
        * [ ] Wild *Baby Ghasts* will grow into adults, whereas tamed ones will not
        * [ ] Drops `entities/ghast`
        * [ ] Models
            - [/baby_ghast](https://lh4.googleusercontent.com/D-LrWPL6FUrhIMJgX5ZYioqaT69IWFCj4onW6Vw4cIyAss2pCqfC7Fg_WGO1OAGLECl26BFeWQEz9lUhum8kGN9mAKBHSyJMsqF9Cr8)
            - [/shrieking](https://lh3.googleusercontent.com/fBO1et5ULK7-AlKRosm-b4WsraTLH-4ctnfI0MFmtBZJQTZRg0VlvWwktexMwj1VSKE3_NyZwApHA_mnSDPJOboe-RuiwCIdNq_vyfhn)
    * [ ] *Nethermancer*
        * [ ] Spawns rarely near *Wither Skeletons*
        * [ ] Supports hostile mobs nearby
        * [ ] The *Nethermancer* will shoot smoke particle entities at the player - similar to *Shulker Bullets*. These will inflict the *Wither* effect and *Blindness*.
        * [ ] Drops `entities/wither_skeleton` and *Wither Staff* (tbd, renamer)
