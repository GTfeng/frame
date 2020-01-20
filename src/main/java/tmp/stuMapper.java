package tmp;

import tmp.stu;

public interface stuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(stu record);

    int insertSelective(stu record);

    stu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(stu record);

    int updateByPrimaryKey(stu record);
}