package com.cpan228.World.Cup.Event.Hub.service;

import com.cpan228.World.Cup.Event.Hub.model.Team;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class TeamService {

    private List<Team> teams;

    public TeamService(){

        teams = new ArrayList<>();

        // Hosts (CONCACAF)
        teams.add(new Team(1L, "USA", "M", "CONCACAF", 13, "https://flagcdn.com/w320/us.png"));
        teams.add(new Team(2L, "Canada", "M", "CONCACAF", 39, "https://flagcdn.com/w320/ca.png"));
        teams.add(new Team(3L, "Mexico", "M", "CONCACAF", 15, "https://flagcdn.com/w320/mx.png"));
        
        // CONCACAF (Others)
        teams.add(new Team(4L, "Costa Rica", "M", "CONCACAF", 40, "https://flagcdn.com/w320/cr.png"));
        teams.add(new Team(5L, "Panama", "M", "CONCACAF", 41, "https://flagcdn.com/w320/pa.png"));
        teams.add(new Team(6L, "Jamaica", "M", "CONCACAF", 42, "https://flagcdn.com/w320/jm.png"));

        // CONMEBOL
        teams.add(new Team(7L, "Argentina", "M", "CONMEBOL", 3, "https://flagcdn.com/w320/ar.png"));
        teams.add(new Team(8L, "Brazil", "M", "CONMEBOL", 6, "https://flagcdn.com/w320/br.png"));
        teams.add(new Team(9L, "Uruguay", "M", "CONMEBOL", 11, "https://flagcdn.com/w320/uy.png"));
        teams.add(new Team(10L, "Colombia", "M", "CONMEBOL", 14, "https://flagcdn.com/w320/co.png"));
        teams.add(new Team(11L, "Ecuador", "M", "CONMEBOL", 29, "https://flagcdn.com/w320/ec.png"));
        teams.add(new Team(12L, "Chile", "M", "CONMEBOL", 31, "https://flagcdn.com/w320/cl.png"));

        // UEFA
        teams.add(new Team(13L, "France", "M", "UEFA", 1, "https://flagcdn.com/w320/fr.png"));
        teams.add(new Team(14L, "Germany", "M", "UEFA", 10, "https://flagcdn.com/w320/de.png"));
        teams.add(new Team(15L, "Spain", "M", "UEFA", 2, "https://flagcdn.com/w320/es.png"));
        teams.add(new Team(16L, "England", "M", "UEFA", 4, "https://flagcdn.com/w320/gb-eng.png"));
        teams.add(new Team(17L, "Portugal", "M", "UEFA", 5, "https://flagcdn.com/w320/pt.png"));
        teams.add(new Team(18L, "Netherlands", "M", "UEFA", 7, "https://flagcdn.com/w320/nl.png"));
        teams.add(new Team(19L, "Italy", "M", "UEFA", 16, "https://flagcdn.com/w320/it.png"));
        teams.add(new Team(20L, "Croatia", "M", "UEFA", 12, "https://flagcdn.com/w320/hr.png"));
        teams.add(new Team(21L, "Belgium", "M", "UEFA", 9, "https://flagcdn.com/w320/be.png"));
        teams.add(new Team(22L, "Denmark", "M", "UEFA", 21, "https://flagcdn.com/w320/dk.png"));
        teams.add(new Team(23L, "Switzerland", "M", "UEFA", 19, "https://flagcdn.com/w320/ch.png"));
        teams.add(new Team(24L, "Serbia", "M", "UEFA", 25, "https://flagcdn.com/w320/rs.png"));
        teams.add(new Team(25L, "Poland", "M", "UEFA", 26, "https://flagcdn.com/w320/pl.png"));
        teams.add(new Team(26L, "Sweden", "M", "UEFA", 27, "https://flagcdn.com/w320/se.png"));
        teams.add(new Team(27L, "Wales", "M", "UEFA", 28, "https://flagcdn.com/w320/gb-wls.png"));
        teams.add(new Team(28L, "Ukraine", "M", "UEFA", 24, "https://flagcdn.com/w320/ua.png"));

        // CAF
        teams.add(new Team(29L, "Morocco", "M", "CAF", 8, "https://flagcdn.com/w320/ma.png"));
        teams.add(new Team(30L, "Senegal", "M", "CAF", 17, "https://flagcdn.com/w320/sn.png"));
        teams.add(new Team(31L, "Egypt", "M", "CAF", 32, "https://flagcdn.com/w320/eg.png"));
        teams.add(new Team(32L, "Nigeria", "M", "CAF", 33, "https://flagcdn.com/w320/ng.png"));
        teams.add(new Team(33L, "Cameroon", "M", "CAF", 34, "https://flagcdn.com/w320/cm.png"));
        teams.add(new Team(34L, "Algeria", "M", "CAF", 35, "https://flagcdn.com/w320/dz.png"));
        teams.add(new Team(35L, "Tunisia", "M", "CAF", 36, "https://flagcdn.com/w320/tn.png"));
        teams.add(new Team(36L, "Ivory Coast", "M", "CAF", 37, "https://flagcdn.com/w320/ci.png"));
        teams.add(new Team(37L, "Ghana", "M", "CAF", 47, "https://flagcdn.com/w320/gh.png"));

        // AFC
        teams.add(new Team(38L, "Japan", "M", "AFC", 18, "https://flagcdn.com/w320/jp.png"));
        teams.add(new Team(39L, "South Korea", "M", "AFC", 22, "https://flagcdn.com/w320/kr.png"));
        teams.add(new Team(40L, "Iran", "M", "AFC", 20, "https://flagcdn.com/w320/ir.png"));
        teams.add(new Team(41L, "Australia", "M", "AFC", 23, "https://flagcdn.com/w320/au.png"));
        teams.add(new Team(42L, "Saudi Arabia", "M", "AFC", 43, "https://flagcdn.com/w320/sa.png"));
        teams.add(new Team(43L, "Qatar", "M", "AFC", 44, "https://flagcdn.com/w320/qa.png"));
        teams.add(new Team(44L, "UAE", "M", "AFC", 45, "https://flagcdn.com/w320/ae.png"));
        teams.add(new Team(45L, "Iraq", "M", "AFC", 46, "https://flagcdn.com/w320/iq.png"));

        // OFC & Additional
        teams.add(new Team(46L, "New Zealand", "M", "OFC", 48, "https://flagcdn.com/w320/nz.png"));
        teams.add(new Team(47L, "Peru", "M", "CONMEBOL", 30, "https://flagcdn.com/w320/pe.png"));
        teams.add(new Team(48L, "Mali", "M", "CAF", 38, "https://flagcdn.com/w320/ml.png"));
    }


}
