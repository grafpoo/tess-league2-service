package io.tess.league2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Table( name = "RESULTS" )
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private String division;
    private Date gameDate;
    private String homeTeam;
    private String awayTeam;
    private Integer homeGoals;
    private Integer awayGoals;
//    private ResultEnum result;
    private Integer htHomeGoals;
    private Integer htAwayGoals;
//    private ResultEnum htResult;

    private Integer attendance;

    private String referee;
    private Integer homeTeamShots;
    private Integer awayTeamShots;
    private Integer homeTeamShotsOnTarget;
    private Integer awayTeamShotsOnTarget;
    private Integer homeTeamCorners;
    private Integer awayTeamCorners;
    private Integer homeTeamFouls;
    private Integer awayTeamFouls;
    private Integer homeTeamYellowCards;
    private Integer awayTeamYellowCards;
    private Integer homeTeamRedCards;
    private Integer awayTeamRedCards;
    private Integer homeTeamPoints;
    private Integer awayTeamPoints;

    private Integer homeTeamShotsWoodwork;
    private Integer awayTeamShotsWoodwork;
    private Integer homeTeamFreeKicksConceded;
    private Integer awayTeamFreeKicksConceded;
    private Integer homeTeamOffsides;
    private Integer awayTeamOffsides;
}

/*
Div = League Division
Date = Match Date (dd/mm/yy)
HomeTeam = Home Team
AwayTeam = Away Team
FTHG and HG = Full Time Home Team Goals
FTAG and AG = Full Time Away Team Goals
FTR and Res = Full Time Result (H=Home Win, D=Draw, A=Away Win)
HTHG = Half Time Home Team Goals
HTAG = Half Time Away Team Goals
HTR = Half Time Result (H=Home Win, D=Draw, A=Away Win)

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