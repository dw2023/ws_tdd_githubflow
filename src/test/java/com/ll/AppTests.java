package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTests {

    @Test
    @DisplayName("스캐너에 키보드가 아닌 문자열을 입력으로 설정")
    public void t1() {
        Scanner sc = TestUtil.genScanner("안녕"); // 자동으로 문자열 생성하는 스캐너

        String cmd = sc.nextLine().trim(); // 직접 입력되는 것처럼 만들기
        assertThat(cmd).isEqualTo("안녕");
    }
}
