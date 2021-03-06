package app.skillblazer;

public class Llama {
    Llama() {}

    private String llamaArt = ".........................................................     .......,********************************,,,,*,,,,,,,.,,,......................................,,,\n" +
            "......................................................               .,,**************************************,,,,,,,,....................,.................,,*\n" +
            ".......................................................                .....,,********************************,,,,,,,,,,,,.........,,.,,,,,,,,,....,,,,,,,,,,,*\n" +
            "   .....................................................                     .,,,,****************************,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*\n" +
            "    .....................................................                      ....,,,*****************,,****,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
            "              .................................   ...                               ...,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
            ".                    .......    ..                                                       ..,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,,,,,,,,,,,,\n" +
            "...                                                                                         ..,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,....,,,,,,,,,,,,\n" +
            "...                                                                                            .,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.......,,,,,,,,,,,\n" +
            "......                                                                                           ....,,,,,,,,....,,,,,,,,,,,,,,,,,,,,,,,,,,,,.........,,,,,,,,,\n" +
            "........                                                                  .....                   .................,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.....,,,,,,,,\n" +
            "...........                                                               ..,,,,..                           ...    ..,,,,,,,,.,,,,,,,,,,,..,,.........,,,,,,,,\n" +
            "...........                                                               .,,,,,,,.                                   ............,,,,.................,,,,,,,,\n" +
            "..............                                                            .,,,,**/,.                                      ..   ...........    ......,,,,,,,,,,,\n" +
            "....................               ...                                    .,,,*((((*,                                              ......     ......,,,,,,,,,,,\n" +
            "......,,,,,,......,,,..........   ..,,..                                  .,,,,**(#/*,                                                         .....,,,,,,,,,,,\n" +
            " ..,,,,,,,,,,.,,,,..,,,,,,,,,......,,,,..                                 ..,,*/((#//*.                                                       ...............,,\n" +
            "   ....,,,,,,,,,,............... .,,,,,,.                                  .,,***/((//*                                .                       ................\n" +
            "     ....,,,,,,,,.....          ..*/*,,,,.                                 .,,*((((#(//.                                                                  .....\n" +
            "      ....,,,,,,,..             .,/*,,,,,,.                                .,,,**//(#(/,.                                                         .   ...    . \n" +
            "      .....,,,......            .,/(/**,,,,                                .,,,,*/(%%(/,.                    ....         ...                        ......... \n" +
            "         .....      ..          .,/%#(/*,,,,                               .*,,**#%%%#/,..  ......            .         .......        ....     ...............\n" +
            "            .                   .,*/(#(/**,,,                              .**,*/%%%##/..................         ................   ..........................\n" +
            "                                .,//(#(/***,*,.                           .,/*,**/((((*.......  ...............................................................\n" +
            "                                 ,*/*(##(/*,**,                           .,**,**(#((/,.            ........................................................  .\n" +
            "                                 .*//(((/*,,,**,.                         ..,,,,*//***.                          ........ ..............       ........        \n" +
            "                                  .//##%%#/*,*/*,,.                          .....,**,                                            .                            \n" +
            "                                   .*/(##((/*,,*,.....         .      .          ..,,.                                                                         \n" +
            "                                    .///(((/*,,,,...      .                        ...                                                                         \n" +
            "                                     .,*////*,...                                                                                                              \n" +
            "  ...                                  ,*,,**,..                                          ..                                                                   \n" +
            "..........                               .,...                                    ..,,,**,. .                                                                  \n" +
            "........                                  ...                             ....  ..,*(%(*,.                                                                   \n" +
            "......                                                                 ..........,/%%(/%%#*.                                                                   \n" +
            ".....                                                                  ........,,*/%%#@@@%...                                                                  \n" +
            ".....                                          ......                   ...,,..,..,*/%%%(,.......                                                              \n" +
            "....                                         .,//((*,...                ..........,,*/##(,,.......                                                             \n" +
            "                                            .,#(*,*#(*,...              .. ......,,,,,*/*,,,,,.......                                                          \n" +
            "                                            .(#%%%/(/.                      ....,.,,,,,,,,,,,,,......                                                          \n" +
            "                                              /%%(/(.             .....,,,***,,,,,,,,,,,,,,,,,,........                                                        \n" +
            "                                               .*(#*.           .,******//(%%(/,,,,,*,,,,,,,,,,.........                                                       \n" +
            "                                                 .,,.         .,*(#((((/(#&@@&%(*,,,,,,,,,,,,,,,,........                                                      \n" +
            "                                                   ...... .  .*(#%&@#((%&%#*,,,,,,,,,,,,,,*,,,,,........                                                     \n" +
            "                                                    ........  ....,*(#(((%&(*,,,,,,,,,,,,,,.,,,,,..........                                                    \n" +
            "                                                     .. ...    ..,,,,*#%%*,,,,,,,,,,,,,,,.,,,...,..........                                                  \n" +
            "              .................   ...........                   .....,*#%#/*.,,,,,,,,,**,,,..,,,,,.............                                                \n" +
            ".  ...........................................         ..       ......*(#%#/,,,***,,*,,,,,...,,,,,,..,,........                                    ...,........\n" +
            "..............................................         ...      ....,,/(#&%#(/*///*,,,,,,....,,,.......,,........                              ....   ,*.  ... \n" +
            "..............................................         .......  ...,,*/##%#((///*,,,,,,..,,,,,,................                                 ... .,... ,*.\n" +
            "...............................................             ..   ..,*/#&&%%(#%###/*,,,,,,,,,,,,,,.,,,..,,,........                                 ..,,*.. ../*\n" +
            "...............................................              .  ...,*(#@@@@@@@%##(*,,,,,,,,,,,,,,,..,.,,,,,......                            ..   .. .*.    ..,\n" +
            "................................................              ..  .,#&&%%&&&@@@&%(*,,..,,,,,,,,,,...,,,.....,,.....                             .,,.  ,    ..  \n" +
            ",,,,............................................                  .,/&@%%%&&@&%/*,,,..,,,,,,,,...................                               .. .*        \n" +
            ",,,,,,,,,,,............,,,,,,,,,,,...,...........         ...     ..,%@%%%%%#%#((//*,,,,,****,,**,,,......,,........                               , .,        \n" +
            ",,,,,,,,,,,,,,,,,,,,,,,,,,,,......................          .     .,,**////(%%((///*,,,,***,,,,,,,*,,,,,,,,,,.......                                ...        \n" +
            "........,,,,,,...,................................                ...,/###%%%##(((/******,,,,,,,,,,*,,,,,,,,,,,......                                **        \n" +
            "...................................................               ..,,,/((((#####(////***,,,*,,,,,,,,,,,,,,,,,,,.....                                *,     .  \n" +
            "..................................,,,,,,,,,,,,,,,,,.               ..,**/(#%%%#((/((//**,,,,,,,,*,,,,,,,,,*,,,,,......                               ,,     .  \n" +
            ".......................,,,*//////////(((((((((///(/*...            ..,,**/((((/((((/***,,,,,,*****,,,,,**,,,,,,,......                               .,        \n" +
            ",,,,,,,,,,,,,,,,,,,*//(((((((((((((((((((((((((((((//,......      .....,,,*////////*********,,*/*****,,,***,,,,,,......                               /        \n" +
            ",,,,,,,,,,,***///((((((((((((((((((((((((((((((((((((/......    .......,,,***/*******************/****,,,,,,,,,,,,.....                               /.       \n" +
            "#(((((((((########(((##(((((((((((((((((((((((((((((((*.     ...  ....,..,,,,*****,*,,***********,********,,,,,,,..........,**/**,..                  .. ..   .\n" +
            "##########(((((#########(((##(((((((((((((((##########(,...  . .............,,*****,,,,,,***,,*****,,,****,,,,,,,,........,,*////////**...    .       .........\n" +
            "######################(((((((((#####((((((((((((((((((((/....  ...............,,,,,,,,,,,,,**,,*****,,,,,***,,,,,,,.......,,********/***,..  ..................\n" +
            "###################################(#((((###((((((((((((/,,.....................,,,,,,,,,,,,,**,*****,,,,,,,,,,,,,,,,,...,,,*****,,,*,.........................\n" +
            "%%%%%##(((((((#(((((###########((((###((((((///(((///(/((/**.....................,,,,,,,,,,,,,,,,,**,,,**,,,,,,,,,,...,,,,,.,,,................................\n" +
            "######(####(((/////**///(((((##((###(##((((###(((((((//////*,.............................,,,,,,,,,,,,,,,**,,,,,,,,......,,,,,,.... ...........................\n" +
            "((((/////((((//*****/(#//((########%%##################(((((/*......................,.,,,,,,,,,,,,,,,,,,,**,,,.............,,,............,,,..................\n" +
            "//*******//((((((((((####%%%%%%%%%%#(//(((###(((((((((((((////*,.......................,,.,,,,,,,,.,.,,,,,,,,,,..............,,..............,,................\n" +
            "#((((((((//(((((((((((((((/////////////((//////////////////////**,.......................,,.,,,,.,,,,..,,,..,,..................,,,............................\n" +
            "((((/////***********////////////////**///////////////////////////*,...........,.,,,,.....,,,,,,,,,,,,,,,,.,,,....................,,,,,.........................\n" +
            "&&&%#(#(((####(######(///////////////////////*********************,................,.....,,.,,,,,,,,...,,,,...,**,................,,,,,,,,,,,,,................\n" +
            "####(#%##%%%%%##%&&%%#////**///******,,***//,,..................,,*,......................,..,,,,..,,,....,......,**,,.............,,,,,,,,,,.,..,.............\n" +
            "//**//****************,**//((#%%(********//(/**,,,,,,,,,,****///////*,..........................,,....,...,,......,,,,,,,............,,,,,,,,,,,,,,,,,.........\n" +
            "((/***////(((((((((((((((((((((((///////((####%##((((((//////((((((((/,................,...............,,,..,......,,....,,..,,,,,.,,......,,,,,,.,,,,,........\n" +
            "((((((((((((((((((((((((((((((((((((//(((((#########(((((((((((((((((/,,................,,......,,....,...,,........,,,..............,.........,,,,,,,,,,......\n" +
            "#((#((#((((((((((((((((((((##((((((((((((((((((((((((((###(((((((((((/*,.................,.......,,,.....,.,,....................................,...,,........\n" +
            "######(((#((########(((#####################(####((((((((((((((((((#(((/*.............,...,.........,......,,,,,...,,.,,,.........,....................,,......\n" +
            "###############(((#((############((((((((((((((((((((((((((((((((((((((((*,.........,.....,.................,,,.,*................,,.....................,.....\n";

    @Override
    public String toString() {
        return ("\n" + llamaArt + "\n");
    }
}
