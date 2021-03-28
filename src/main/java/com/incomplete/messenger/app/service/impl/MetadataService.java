package com.incomplete.messenger.app.service.impl;

import com.incomplete.messenger.app.model.ChatThread;
import com.incomplete.messenger.app.model.DM;
import com.incomplete.messenger.app.model.Group;
import com.incomplete.messenger.app.service.interfaces.IMetadataService;

import java.util.List;

/**
 * Created by Incomplete on 3/27/21.
 */
public class MetadataService implements IMetadataService {
    public List<ChatThread> listAllThread(String userId) {
        return null;
    }

    public List<DM> listAllDm(String userId) {
        return null;
    }

    public List<Group> listAllGroup(String userId) {
        return null;
    }
}
