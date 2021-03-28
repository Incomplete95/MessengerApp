package com.incomplete.messenger.app.service.def;

import com.incomplete.messenger.app.model.Message;

import java.util.List;

/**
 * Created by Incomplete on 3/26/21.
 */
public interface ISyncService {
    List<Message> pullMessage(String userId, String threadId);
}
