package com.example.testing.service;

import com.example.testing.entity.BaseEntity;
import com.example.testing.entity.FunctionalTest;

import java.util.List;
import java.util.function.Function;

public class TestService {
    public static void main(String[] args) {
        TestService testService = new TestService();
        testService.streamFlatMap().forEach(System.out::println);
    }

    public List<String> streamFlatMap() {
        return getEntities().stream()
                .flatMap(baseEntity -> baseEntity.getStrings().stream())
                .toList();
    }

    public List<BaseEntity> getEntities() {
        return List.of(
                new BaseEntity(
                        1L, "name 1", List.of("str1b1", "str2b1", "str3b1")
                ),
                new BaseEntity(
                        2L, "name 2", List.of("str10b2", "str11b2", "str12b2")
                ),
                new BaseEntity(
                        3L, "name 3", List.of("str20b3", "str21b3", "str22b3")
                ),
                new BaseEntity(
                        4L, "name 4", List.of("str30b4", "str31b4", "str32b4")
                )
        );
    }

    public <T> List<T> getAvailable(Function<FunctionalTest, List<T>> mapper) {
        return mapper.apply(new FunctionalTest());
    }
}
