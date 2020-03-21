package org.mybatis;

import org.mybatis.generator.api.ShellRunner;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author yanhaizhe
 * @create 2017-05-22 下午 11:13
 **/
public class DD {
//    private static Logger logger = Logger.getLogger(DD.class);

    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
//        logger.info("Start generator ...");
        ShellRunner.main(new String[]{"-configfile", DD.class.getResource("/mybatis-generator-config.xml").getPath(), "-overwrite"});
//        List<String> warnings = new ArrayList<String>();
//        boolean overwrite = true; // 是否覆盖原来的文件
//        File configFile = new File("I:\\workspace\\personal\\workspace\\mybatis-generator-core-fix\\src\\main\\resources\\");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(configFile);
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        myBatisGenerator.generate(null);
//        logger.info("Finish generator");
    }

}
