package com.mori.mrfz.mapper;

import com.mori.mrfz.entity.BattleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BattleInfoMapper {
    List<BattleInfo> findAll(BattleInfo battleInfo);
    List<BattleInfo> findInfo(BattleInfo battleInfo);
    Integer add(BattleInfo battleInfo);
}
