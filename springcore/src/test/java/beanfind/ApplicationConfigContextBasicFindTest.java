package beanfind;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class ApplicationConfigContextBasicFindTest {
	AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);
	
	
	@Test
	@DisplayName("빈 이름으로 조회")
	void findBeanName() {
		MemberService memberService = ac.getBean("memberService",MemberService.class);
		Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
	}
	
	
//	
	@Test
	@DisplayName("구체 타입으로 조회")
	void findBeanName2() {
		MemberServiceImpl memberService = ac.getBean("memberService",MemberServiceImpl.class);
		Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
	}
	
	@Test
	@DisplayName("빈 이릅으로 조회x")
	void findBeanNameX() {
//		MemberServiceImpl memberService = ac.getBean("xxxx",MemberServiceImpl.class);
		MemberService memberService = ac.getBean("xxxx",MemberService.class);
		org.junit.jupiter.api.Assertions.assertThrows(NoSuchBeanDefinitionException.class, 
				() ->ac.getBean("xxxx",MemberService.class));
	}
	
}
