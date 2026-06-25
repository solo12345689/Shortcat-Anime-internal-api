package io.sentry;

import app.notifee.core.event.LogEvent;

/* JADX INFO: renamed from: io.sentry.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC5221k {
    All("__all__"),
    Default("default"),
    Error(LogEvent.LEVEL_ERROR),
    Feedback("feedback"),
    Session("session"),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC5221k(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
