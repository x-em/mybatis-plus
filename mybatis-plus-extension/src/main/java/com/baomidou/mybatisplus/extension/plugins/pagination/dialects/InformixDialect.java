/*
 * Copyright (c) 2011-2022, baomidou (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baomidou.mybatisplus.extension.plugins.pagination.dialects;

import com.baomidou.mybatisplus.extension.plugins.pagination.DialectModel;
public class InformixDialect implements IDialect{
    @Override
    public DialectModel buildPaginationSql(String originalSql, long offset, long limit) {
        /*StringBuilder ret = new StringBuilder();
        ret.append(String.format("select skip %s first %s ", FIRST_MARK+"",SECOND_MARK+""));
        ret.append(originalSql.replaceFirst("(?i)select", ""));
        return new DialectModel(ret.toString(), offset, limit).setConsumerChain();*/
        StringBuilder ret = new StringBuilder();
        ret.append(String.format("select skip %s first %s ", offset+"",limit+""));
        ret.append(originalSql.replaceFirst("(?i)select", ""));
        return new DialectModel(ret.toString());
    }
}
