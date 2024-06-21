package org.No.4.bms.service;

import org.No.4.bms.domain.Vo.BookVo;
import org.No.4.bms.page.Page;

import java.util.List;

public interface IBookService {

    /**
     * 根据 书籍的部分信息 去数据库中查找书籍
     *
     * @param partInfo
     * @return
     */
    List<BookVo> selectBooksByBookPartInfo(String partInfo);

    /**
     * 根据书籍种类id查找书籍,分页查找
     *
     * @param categoryId
     * @return
     */
    Page<BookVo> findBooksByCategoryId(int categoryId, int pageNum);
}
