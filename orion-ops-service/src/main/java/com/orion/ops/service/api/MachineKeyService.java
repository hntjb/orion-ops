package com.orion.ops.service.api;

import com.orion.lang.wrapper.DataGrid;
import com.orion.ops.entity.domain.MachineSecretKeyDO;
import com.orion.ops.entity.request.MachineKeyRequest;
import com.orion.ops.entity.vo.MachineSecretKeyVO;

/**
 * 机器秘钥service
 *
 * @author Jiahang Li
 * @version 1.0.0
 * @since 2021/4/5 11:03
 */
public interface MachineKeyService {

    /**
     * 添加key
     *
     * @param key key
     * @return id
     */
    Long addSecretKey(MachineSecretKeyDO key);

    /**
     * 修改key
     *
     * @param key key
     * @return effect
     */
    Integer updateSecretKey(MachineSecretKeyDO key);

    /**
     * 删除key
     *
     * @param id id
     * @return effect
     */
    Integer removeSecretKey(Long id);

    /**
     * 查询keys
     *
     * @param request request
     * @return dataGrid
     */
    DataGrid<MachineSecretKeyVO> listKeys(MachineKeyRequest request);

}
