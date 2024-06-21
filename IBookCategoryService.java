package org.No.4.bms.service;

import org.No.4.bms.domain.BookCategory;
import org.No.4.bms.page.Page;

public interface IBookCategoryService {

    //图书类别分页查询
    public Page<BookCategory> selectBookCategoryByPageNum(int pageNum);

    int deleteBookCategoryById(int bookCategoryId);
}
