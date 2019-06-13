/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.api.config.sharding;

import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.api.config.RuleConfiguration;
import org.apache.shardingsphere.api.config.encryptor.EncryptRuleConfiguration;
import org.apache.shardingsphere.api.config.masterslave.MasterSlaveRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.ShardingStrategyConfiguration;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Sharding rule configuration.
 *
 * 分片规则配置类
 * 
 * @author zhangliang
 * @author maxiaoguang
 * @author panjuan
 */
@Getter
@Setter
public final class ShardingRuleConfiguration implements RuleConfiguration {

    /**
     * 表规则配置列表
     */
    private Collection<TableRuleConfiguration> tableRuleConfigs = new LinkedList<>();

    /**
     * 绑定表组列表
     */
    private Collection<String> bindingTableGroups = new LinkedList<>();

    /**
     * 表广播列表
     */
    private Collection<String> broadcastTables = new LinkedList<>();

    /**
     * 默认数据源名称
     */
    private String defaultDataSourceName;

    /**
     * 默认数据库分片策略配置
     */
    private ShardingStrategyConfiguration defaultDatabaseShardingStrategyConfig;

    /**
     * 默认数据表分片策略配置
     */
    private ShardingStrategyConfiguration defaultTableShardingStrategyConfig;

    /**
     * 默认主键生成器配置
     */
    private KeyGeneratorConfiguration defaultKeyGeneratorConfig;

    /**
     * 主从配置列表
     */
    private Collection<MasterSlaveRuleConfiguration> masterSlaveRuleConfigs = new LinkedList<>();

    /**
     * 加密规则配置
     */
    private EncryptRuleConfiguration encryptRuleConfig;
}
