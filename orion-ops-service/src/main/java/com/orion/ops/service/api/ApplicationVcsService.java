package com.orion.ops.service.api;

import com.orion.lang.wrapper.DataGrid;
import com.orion.ops.entity.request.ApplicationVcsRequest;
import com.orion.ops.entity.vo.ApplicationVcsBranchVO;
import com.orion.ops.entity.vo.ApplicationVcsCommitVO;
import com.orion.ops.entity.vo.ApplicationVcsInfoVO;
import com.orion.ops.entity.vo.ApplicationVcsVO;
import com.orion.vcs.git.Gits;

import java.util.List;

/**
 * 应用版本控制仓库服务
 *
 * @author Jiahang Li
 * @version 1.0.0
 * @since 2021/11/26 23:22
 */
public interface ApplicationVcsService {

    /**
     * 添加appVcs
     *
     * @param request request
     * @return id
     */
    Long addAppVcs(ApplicationVcsRequest request);

    /**
     * 更新appVcs
     *
     * @param request request
     * @return effect
     */
    Integer updateAppVcs(ApplicationVcsRequest request);

    /**
     * 通过id删除
     *
     * @param id id
     * @return effect
     */
    Integer deleteAppVcs(Long id);

    /**
     * 获取列表
     *
     * @param request request
     * @return rows
     */
    DataGrid<ApplicationVcsVO> listAppVcs(ApplicationVcsRequest request);

    /**
     * 获取详情
     *
     * @param id id
     * @return row
     */
    ApplicationVcsVO getAppVcsDetail(Long id);

    /**
     * 仓库初始化
     *
     * @param id id
     */
    void initVcs(Long id);

    /**
     * 获取版本信息列表
     *
     * @param id id
     * @return 分支信息
     */
    ApplicationVcsInfoVO getVcsInfo(Long id);

    /**
     * 获取分支列表
     *
     * @param id id
     * @return 分支信息
     */
    List<ApplicationVcsBranchVO> getVcsBranchList(Long id);

    /**
     * 获取提交列表
     *
     * @param id         id
     * @param branchName 分支名称
     * @return log
     */
    List<ApplicationVcsCommitVO> getVcsCommitList(Long id, String branchName);

    /**
     * 打开git
     *
     * @param id id
     * @return gits
     */
    Gits openGit(Long id);

}