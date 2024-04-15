package lxj.engineering.demos.web.util;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvUtil;
import lxj.engineering.demos.web.entity.MobileFoodFacilityPermit;

import java.util.List;
 
public class CSVReader {

    private CSVReader(){

    }

    // 内部类，用于懒加载
    private static class CSVReaderHolder {
        // 初始化单例
        private static final CSVReader INSTANCE = new CSVReader();

        private static final List<MobileFoodFacilityPermit> CSV_DATA = INSTANCE.readCSV("Mobile_Food_Facility_Permit.csv");
    }

    // 提供公有的静态方法，用于获取唯一可用的对象实例
    public static CSVReader getInstance() {
        return CSVReaderHolder.INSTANCE;
    }

    public static List<MobileFoodFacilityPermit> getListData(){
        return CSVReaderHolder.CSV_DATA;
    }

    /**
     * csv数据加载到内存中
     * @param filePath
     * @return
     */
    private List<MobileFoodFacilityPermit> readCSV(String filePath) {
        CsvReader reader = CsvUtil.getReader();
        return reader.read(ResourceUtil.getUtf8Reader(filePath), MobileFoodFacilityPermit.class);
    }
}