package io.tess.league2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "EPL" )
public class Match implements Serializable {
    private static final long serialVersionUID = 1L;

    public enum Result {
        HOME_WIN('H'), AWAY_WIN('A'), DRAW ('D');

        private char value;

        Result(char value) { this.value = value; }

        public char getValue() { return value; }

        public static Result parse(char id) {
            Result result = null; // Default
            for (Result item : Result.values()) {
                if (item.getValue()==id) {
                    result = item;
                    break;
                }
            }
            return result;
        }

    };

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Div")
    private String division;
    @Column(name = "Date")
    private Date date;
    @Column(name = "HomeTeam")
    private String homeTeam;
    @Column(name = "AwayTeam")
    private String awayTeam;
    @Column(name = "FTHG")
    private Integer fullTimeHomeGoals;
    @Column(name = "FTAG")
    private Integer fullTimeAwayGoals;
    @Column(name = "FTR")
    private Result fullTimeResult;
    @Column(name = "HTHG")
    private Integer halfTimeHomeGoals;
    @Column(name = "HTAG")
    private Integer halfTimeAwayGoals;
    @Column(name = "HTR")
    private Result halfTimeResult;
    @Column(name = "Referee")
    private String referee;
    @Column(name = "HS")
    private Integer homeTeamShots;
    @Column(name = "AS")
    private Integer awayTeamShots;
    @Column(name = "HST")
    private Integer homeTeamShotsOnTarget;
    @Column(name = "AST")
    private Integer awayTeamShotsOnTarget;
    @Column(name = "HF")
    private Integer homeTeamFouls;
    @Column(name = "AF")
    private Integer awayTeamFouls;
    @Column(name = "HC")
    private Integer homeTeamCorners;
    @Column(name = "AC")
    private Integer awayTeamCorners;
    @Column(name = "HY")
    private Integer homeTeamYellowCards;
    @Column(name = "AY")
    private Integer awayTeamYellowCards;
    @Column(name = "HR")
    private Integer homeTeamRedCards;
    @Column(name = "AR")
    private Integer awayTeamRedCards;
    @Column(name = "B365H")
    private String bet365HomeWinOdds;
    @Column(name = "B365D")
    private String bet365DrawOdds;
    @Column(name = "B365A")
    private String bet365AwayWinOdds;
    @Column(name = "BWH")
    private String blueSquareHomeWinOdds;
    @Column(name = "BWD")
    private String blueSquareDrawOdds;
    @Column(name = "BWA")
    private String blueSquareAwayWinOdds;
    @Column(name = "IWH")
    private String interwettenHomeWinOdds;
    @Column(name = "IWD")
    private String interwettenDrawOdds;
    @Column(name = "IWA")
    private String interwettenAwayWinOdds;
    @Column(name = "LBH")
    private String ladbrokesHomeWinOdds;
    @Column(name = "LBD")
    private String ladbrokesDrawOdds;
    @Column(name = "LBA")
    private String ladbrokesAwayWinOdds;
    @Column(name = "PSH")
    private String pinnacleHomeWinOdds;
    @Column(name = "PSD")
    private String pinnacleDrawOdds;
    @Column(name = "PSA")
    private String pinnacleAwayWinOdds;
    @Column(name = "WHH")
    private String williamHillHomeWinOdds;
    @Column(name = "WHD")
    private String williamHillDrawOdds;
    @Column(name = "WHA")
    private String williamHillAwayWinOdds;
    @Column(name = "VCH")
    private String vcBetHomeWinOdds;
    @Column(name = "VCD")
    private String vcBetDrawOdds;
    @Column(name = "VCA")
    private String vcBetAwayWinOdds;
    @Column(name = "Bb1X2")
    private Integer bb1X2;
    @Column(name = "BbMxH")
    private String bbMxH;
    @Column(name = "BbAvH")
    private String bbAvH;
    @Column(name = "BbMxD")
    private String bbMxD;
    @Column(name = "BbAvD")
    private String bbAvD;
    @Column(name = "BbMxA")
    private String bbMxA;
    @Column(name = "BbAvA")
    private String bbAvA;
    @Column(name = "BbOU")
    private Integer bbOU;
    @Column(name = "BbMx>2.5")
    private String bbMxGT25;
    @Column(name = "BbAv>2.5")
    private String bbAvGT25;
    @Column(name = "BbMx<2.5")
    private String bbMxLT25;
    @Column(name = "BbAv<2.5")
    private String bbAvLT25;
    @Column(name = "BbAH")
    private Integer bbAH;
    @Column(name = "BbAHh")
    private String bbAHh;
    @Column(name = "BbMxAHH")
    private String bbMxAHH;
    @Column(name = "BbAvAHH")
    private String bbAvAHH;
    @Column(name = "BbMxAHA")
    private String bbMxAHA;
    @Column(name = "BbAvAHA")
    private String bbAvAHA;
    @Column(name = "PSCH")
    private String pinnacleClosingHomeWinOdds;
    @Column(name = "PSCD")
    private String pinnacleClosingDrawOdds;
    @Column(name = "PSCA")
    private String pinnacleClosingAwayWinOdds;;
    @Column(name = "Attendance")
    private String attendance;
    @Column(name = "HHW")
    private Integer homeTeamHitWoodwork;
    @Column(name = "AHW")
    private Integer awayTeamHitWoodwork;
    @Column(name = "HO")
    private Integer homeTeamOffsides;
    @Column(name = "AO")
    private Integer awayTeamOffsides;
    @Column(name = "HBP")
    private Integer homeTeamBookingPoints;
    @Column(name = "ABP")
    private Integer awayTeamBookingPoints;
    @Column(name = "GBH")
    private String gameBookersHomeWinOdds;
    @Column(name = "GBD")
    private String gameBookersDrawOdds;
    @Column(name = "GBA")
    private String gameBookersAwayWinOdds;
    @Column(name = "SBH")
    private String sportingBetHomeWinOdds;
    @Column(name = "SBO")
    private String sportingBetOdds;
    @Column(name = "SBA")
    private String sportingBetAwayWinOdds;
    @Column(name = "SBD")
    private String sportingBetDrawOdds;
    @Column(name = "GB>2.5")
    private String gbGT25;
    @Column(name = "GB<2.5")
    private String gbLT25;
    @Column(name = "B365>2.5")
    private String b365GT25;
    @Column(name = "B365<2.5")
    private String b365LT25;
    @Column(name = "GBAHH")
    private String gameBookersAsianHandicapHomeWinOdds;
    @Column(name = "GBAH")
    private String gameBookersAsianHandicapAwayWinOdds;
    @Column(name = "LBAHH")
    private String ladbrokesAsianHandicapHomeWinOdds;
    @Column(name = "LBAHA")
    private String ladbrokesAsianHandicapAwayWinOdds;
    @Column(name = "LBAH")
    private String ladbrokesAsianHandicapSize;
    @Column(name = "B365AHH")
    private String betting365AsianHandicapHomeWinOdds;
    @Column(name = "B365AHA")
    private String betting365AsianHandicapAwayWinOdds;
    @Column(name = "B365AH")
    private String betting365AsianHandicapSize;
    @Column(name = "Season")
    private String season;
    @Column(name = "MatchDate")
    private Date matchDate;
}

/*
Div = League Division
Date = Match Date (dd/mm/yy)
HomeTeam = Home Team
AwayTeam = Away Team
FTHG and HG = Full Time Home Team Goals
FTAG and AG = Full Time Away Team Goals
FTR and Res = Full Time Match (H=Home Win, D=Draw, A=Away Win)
HTHG = Half Time Home Team Goals
HTAG = Half Time Away Team Goals
HTR = Half Time Match (H=Home Win, D=Draw, A=Away Win)

Match Statistics (where available)
Attendance = Crowd Attendance
Referee = Match Referee
HS = Home Team Shots
AS = Away Team Shots
HST = Home Team Shots on Target
AST = Away Team Shots on Target
HHW = Home Team Hit Woodwork
AHW = Away Team Hit Woodwork
HC = Home Team Corners
AC = Away Team Corners
HF = Home Team Fouls Committed
AF = Away Team Fouls Committed
HFKC = Home Team Free Kicks Conceded
AFKC = Away Team Free Kicks Conceded
HO = Home Team Offsides
AO = Away Team Offsides
HY = Home Team Yellow Cards
AY = Away Team Yellow Cards
HR = Home Team Red Cards
AR = Away Team Red Cards
HBP = Home Team Bookings Points (10 = yellow, 25 = red)
ABP = Away Team Bookings Points (10 = yellow, 25 = red)

Note that Free Kicks Conceeded includes fouls, offsides and any other offense commmitted and will always be equal to or higher than the number of fouls. Fouls make up the vast majority of Free Kicks Conceded. Free Kicks Conceded are shown when specific data on Fouls are not available (France 2nd, Belgium 1st and Greece 1st divisions).

Note also that English and Scottish yellow cards do not include the initial yellow card when a second is shown to a player converting it into a red, but this is included as a yellow (plus red) for European games.


Key to 1X2 (match) betting odds data:

B365H = Bet365 home win odds
B365D = Bet365 draw odds
B365A = Bet365 away win odds
BSH = Blue Square home win odds
BSD = Blue Square draw odds
BSA = Blue Square away win odds
BWH = Bet&Win home win odds
BWD = Bet&Win draw odds
BWA = Bet&Win away win odds
GBH = Gamebookers home win odds
GBD = Gamebookers draw odds
GBA = Gamebookers away win odds
IWH = Interwetten home win odds
IWD = Interwetten draw odds
IWA = Interwetten away win odds
LBH = Ladbrokes home win odds
LBD = Ladbrokes draw odds
LBA = Ladbrokes away win odds
PSH and PH = Pinnacle home win odds
PSD and PD = Pinnacle draw odds
PSA and PA = Pinnacle away win odds
SOH = Sporting Odds home win odds
SOD = Sporting Odds draw odds
SOA = Sporting Odds away win odds
SBH = Sportingbet home win odds
SBD = Sportingbet draw odds
SBA = Sportingbet away win odds
SJH = Stan James home win odds
SJD = Stan James draw odds
SJA = Stan James away win odds
SYH = Stanleybet home win odds
SYD = Stanleybet draw odds
SYA = Stanleybet away win odds
VCH = VC Bet home win odds
VCD = VC Bet draw odds
VCA = VC Bet away win odds
WHH = William Hill home win odds
WHD = William Hill draw odds
WHA = William Hill away win odds

Bb1X2 = Number of BetBrain bookmakers used to calculate match odds averages and maximums
BbMxH = Betbrain maximum home win odds
BbAvH = Betbrain average home win odds
BbMxD = Betbrain maximum draw odds
BbAvD = Betbrain average draw win odds
BbMxA = Betbrain maximum away win odds
BbAvA = Betbrain average away win odds

MaxH = Oddsportal maximum home win odds
MaxD = Oddsportal maximum draw win odds
MaxA = Oddsportal maximum away win odds
AvgH = Oddsportal average home win odds
AvgD = Oddsportal average draw win odds
AvgA = Oddsportal average away win odds



Key to total goals betting odds:

BbOU = Number of BetBrain bookmakers used to calculate over/under 2.5 goals (total goals) averages and maximums
BbMx>2.5 = Betbrain maximum over 2.5 goals
BbAv>2.5 = Betbrain average over 2.5 goals
BbMx<2.5 = Betbrain maximum under 2.5 goals
BbAv<2.5 = Betbrain average under 2.5 goals

GB>2.5 = Gamebookers over 2.5 goals
GB<2.5 = Gamebookers under 2.5 goals
B365>2.5 = Bet365 over 2.5 goals
B365<2.5 = Bet365 under 2.5 goals


Key to Asian handicap betting odds:

BbAH = Number of BetBrain bookmakers used to Asian handicap averages and maximums
BbAHh = Betbrain size of handicap (home team)
BbMxAHH = Betbrain maximum Asian handicap home team odds
BbAvAHH = Betbrain average Asian handicap home team odds
BbMxAHA = Betbrain maximum Asian handicap away team odds
BbAvAHA = Betbrain average Asian handicap away team odds

GBAHH = Gamebookers Asian handicap home team odds
GBAHA = Gamebookers Asian handicap away team odds
GBAH = Gamebookers size of handicap (home team)
LBAHH = Ladbrokes Asian handicap home team odds
LBAHA = Ladbrokes Asian handicap away team odds
LBAH = Ladbrokes size of handicap (home team)
B365AHH = Bet365 Asian handicap home team odds
B365AHA = Bet365 Asian handicap away team odds
B365AH = Bet365 size of handicap (home team)


Closing odds (last odds before match starts)

PSCH = Pinnacle closing home win odds
PSCD = Pinnacle closing draw odds
PSCA = Pinnacle closing away win odds

 */

/*
Div = League Division
Date = Match Date (dd/mm/yy)
HomeTeam = Home Team
AwayTeam = Away Team
FTHG and HG = Full Time Home Team Goals
FTAG and AG = Full Time Away Team Goals
FTR and Res = Full Time Match (H=Home Win, D=Draw, A=Away Win)
HTHG = Half Time Home Team Goals
HTAG = Half Time Away Team Goals
HTR = Half Time Match (H=Home Win, D=Draw, A=Away Win)

Match Statistics (where available)
Attendance = Crowd Attendance
Referee = Match Referee
HS = Home Team Shots
AS = Away Team Shots
HST = Home Team Shots on Target
AST = Away Team Shots on Target
HHW = Home Team Hit Woodwork
AHW = Away Team Hit Woodwork
HC = Home Team Corners
AC = Away Team Corners
HF = Home Team Fouls Committed
AF = Away Team Fouls Committed
HFKC = Home Team Free Kicks Conceded
AFKC = Away Team Free Kicks Conceded
HO = Home Team Offsides
AO = Away Team Offsides
HY = Home Team Yellow Cards
AY = Away Team Yellow Cards
HR = Home Team Red Cards
AR = Away Team Red Cards
HBP = Home Team Bookings Points (10 = yellow, 25 = red)
ABP = Away Team Bookings Points (10 = yellow, 25 = red)
*/