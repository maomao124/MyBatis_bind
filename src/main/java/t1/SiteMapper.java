package t1;

import java.util.List;

/**
 * Project name(项目名称)：MyBatis_bind
 * Package(包名): t1
 * Interface(接口名): SiteMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/14
 * Time(创建时间)： 22:40
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface SiteMapper
{
    public List<Site> select(Site site);
}
