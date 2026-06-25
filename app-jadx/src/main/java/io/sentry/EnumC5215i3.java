package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.i3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC5215i3 implements B0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    /* JADX INFO: renamed from: io.sentry.i3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public EnumC5215i3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            return EnumC5215i3.valueOf(interfaceC5218j1.X0().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.f(name().toLowerCase(Locale.ROOT));
    }
}
