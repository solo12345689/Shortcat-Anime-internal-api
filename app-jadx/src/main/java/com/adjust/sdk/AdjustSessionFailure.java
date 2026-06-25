package com.adjust.sdk;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustSessionFailure {
    public String adid;
    public JSONObject jsonResponse;
    public String message;
    public String timestamp;
    public boolean willRetry;

    public String toString() {
        return Util.formatString("Session Failure msg:%s time:%s adid:%s retry:%b json:%s", this.message, this.timestamp, this.adid, Boolean.valueOf(this.willRetry), this.jsonResponse);
    }
}
