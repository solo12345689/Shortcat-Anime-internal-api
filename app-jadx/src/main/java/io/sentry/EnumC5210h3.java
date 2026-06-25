package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.h3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC5210h3 implements B0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    /* JADX INFO: renamed from: io.sentry.h3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC5210h3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            return EnumC5210h3.valueOfLabel(interfaceC5218j1.X0().toLowerCase(Locale.ROOT));
        }
    }

    EnumC5210h3(String str) {
        this.itemType = str;
    }

    public static EnumC5210h3 resolve(Object obj) {
        return obj instanceof V2 ? ((V2) obj).C().g() == null ? Event : Feedback : obj instanceof io.sentry.protocol.E ? Transaction : obj instanceof O3 ? Session : obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    public static EnumC5210h3 valueOfLabel(String str) {
        for (EnumC5210h3 enumC5210h3 : values()) {
            if (enumC5210h3.itemType.equals(str)) {
                return enumC5210h3;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.f(this.itemType);
    }
}
