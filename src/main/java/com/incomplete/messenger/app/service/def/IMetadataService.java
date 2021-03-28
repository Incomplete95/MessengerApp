package com.incomplete.messenger.app.service.def;

import com.incomplete.messenger.app.model.ChatThread;
import com.incomplete.messenger.app.model.DM;
import com.incomplete.messenger.app.model.Group;

import java.util.List;

/**
 * Created by Incomplete on 3/26/21.
 */
public interface IMetadataService {
    List<ChatThread> listAllThread(String userId);
    List<DM> listAllDm(String userId);
    List<Group> listAllGroup(String userId);
}
