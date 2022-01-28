package fr.cnam.pa.inf330;

import fr.cnam.pa.inf330.beans.Member;
import fr.cnam.pa.inf330.beans.Squad;

import java.util.*;
import java.util.stream.Collectors;


public class SquadControler {

    private final Squad squad;

    public SquadControler(Squad squad) {
        this.squad = squad;
    }

    public List<String> checkDuplicateMemberNames() {
        Member[] members = this.squad.getMembers();
        Map<String, List<Member>> duplicateNameMamber = new HashMap<>();

        for (Member m : members) {
            if (duplicateNameMamber.get(m.getName()) != null) {
                duplicateNameMamber.get(m.getName()).add(m);
            } else {
                duplicateNameMamber.put(m.getName(), new ArrayList<>(Arrays.asList(m)));
            }
        }
        return duplicateNameMamber.entrySet().stream().filter(m -> m.getValue().size() > 1).map(map -> map.getKey()).collect(Collectors.toList());
    }

    public List<Member> checkUnpoweredMember() {
        return Arrays.stream(this.squad.getMembers()).filter(m -> m.getPowers().length == 0).collect(Collectors.toList());
    }

}
