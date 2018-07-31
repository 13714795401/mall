package com.nmall.service;

import com.nmall.common.ServerResponse;
import com.nmall.pojo.Category;

import java.util.List;

public interface ICategoryService {

    ServerResponse addCategory(String categoruName, Integer parentId);

    ServerResponse updateCategoryName(String categoryName, Integer parentId);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
