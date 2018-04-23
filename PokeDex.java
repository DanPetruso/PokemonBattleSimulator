public class PokeDex {
    MoveDex m = new MoveDex();
    Pokemon pikachu = new Pokemon("Pikachu",211, 146, 104, 218, 136, 279,
                                    Type.ELECTRIC, m.thunderbolt, m.surf, m.ironTail, m.thunder);
    Pokemon meowth = new Pokemon("Meowth",221, 207, 106, 104, 116, 279,
                                    Type.NORMAL, m.slash, m.aerialAce, m.nightSlash, m.shadowBall);
    Pokemon charmander = new Pokemon("Charmander",219, 171, 122, 188, 136, 229,
                                    Type.FIRE, m.brickBreak, m.dragonClaw, m.flamethrower, m.thunderPunch);
    Pokemon cubone = new Pokemon("Cubone", 304, 145, 289, 116, 136, 106,
                                    Type.GROUND, m.boneClub, m.rockSlide, m.ironHead, m.megaKick);

}
