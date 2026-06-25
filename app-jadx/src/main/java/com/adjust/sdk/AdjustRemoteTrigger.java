package com.adjust.sdk;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustRemoteTrigger {
    private final String label;
    private final JSONObject payload;

    public AdjustRemoteTrigger(String str, JSONObject jSONObject) {
        this.label = str;
        this.payload = jSONObject;
    }

    public String getLabel() {
        return this.label;
    }

    public JSONObject getPayload() {
        return this.payload;
    }

    public String toString() {
        return "AdjustRemoteTrigger{label='" + this.label + "', payload=" + this.payload + '}';
    }
}
