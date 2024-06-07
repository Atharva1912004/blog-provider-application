/*
 * Copyright © 2023-2024 Rohit Parihar and Bloggios
 * All rights reserved.
 * This software is the property of Rohit Parihar and is protected by copyright law.
 * The software, including its source code, documentation, and associated files, may not be used, copied, modified, distributed, or sublicensed without the express written consent of Rohit Parihar.
 * For licensing and usage inquiries, please contact Rohit Parihar at rohitparih@gmail.com, or you can also contact support@bloggios.com.
 * This software is provided as-is, and no warranties or guarantees are made regarding its fitness for any particular purpose or compatibility with any specific technology.
 * For license information and terms of use, please refer to the accompanying LICENSE file or visit http://www.apache.org/licenses/LICENSE-2.0.
 * Unauthorized use of this software may result in legal action and liability for damages.
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

package com.bloggios.blog.ymlparser.listparser;

import com.bloggios.blog.ymlparser.factory.YmlFileMapParserFactory;
import com.bloggios.elasticsearch.configuration.payload.YamlListDataProvider;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - user-provider-application
 * Package - com.bloggios.user.ymlparser.listparser
 * Created_on - 27 May-2024
 * Created_at - 13 : 08
 */

@PropertySource(value = "classpath:listdata/blog.yml", factory = YmlFileMapParserFactory.class)
@ConfigurationProperties(prefix = "blog")
@Configuration
@Getter
@Setter
public class BlogYmlFileParser {

    public Map<String, YamlListDataProvider> provider = new HashMap<>();
}
