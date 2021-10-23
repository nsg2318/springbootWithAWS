package springboot.domain.sunbastudy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MemberTest {

    @Test
    public void 멤버테스트(){
        Member member = new Member.MemberBuilder()
                .name("순바").height(185).build();
        Assertions.assertThat(member.getHeight()).isEqualTo(185);
    }
}
