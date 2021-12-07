import fr.cnam.pa.inf330.SquadControler;
import fr.cnam.pa.inf330.beans.Member;
import fr.cnam.pa.inf330.beans.Squad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SquadControlerTest {

    @DisplayName("On teste la duplication des noms des membres si duplication")
    @Test
    void checkDuplicateMemberNamesWhenDuplicatedNames() {
        Squad squad = new Squad();
        squad.setSquadName("SquadName");

        Member member1 = new Member();
        member1.setName("MemberA");
        Member member2 = new Member();
        member2.setName("MemberA");
        Member member3 = new Member();
        member3.setName("MemberB");

        squad.setMembers(new Member[]{member1,member2,member3});
        SquadControler squadControler = new SquadControler(squad);
        List<String> memberList = squadControler.checkDuplicateMemberNames();

        Assertions.assertEquals(memberList.size(),1);
        Assertions.assertEquals(memberList.get(0),"MemberA");
    }

    @DisplayName("On teste la duplication des noms des membres si pas de duplication")
    @Test
    void checkDuplicateMemberNamesWhenNoTDuplicatedNames() {
        Squad squad = new Squad();
        squad.setSquadName("SquadName");

        Member member1 = new Member();
        member1.setName("MemberA");
        Member member2 = new Member();
        member2.setName("MemberB");
        Member member3 = new Member();
        member3.setName("MemberC");

        squad.setMembers(new Member[]{member1,member2,member3});
        SquadControler squadControler = new SquadControler(squad);
        List<String> memberList = squadControler.checkDuplicateMemberNames();

        Assertions.assertEquals(memberList.size(),0);
    }
}
