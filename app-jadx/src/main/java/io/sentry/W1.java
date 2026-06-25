package io.sentry;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface W1 {
    static /* synthetic */ void b(ILogger iLogger, String str, AbstractC5276t abstractC5276t, File file) {
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        iLogger.c(enumC5215i3, "Started processing cached files from %s", str);
        abstractC5276t.d(file);
        iLogger.c(enumC5215i3, "Finished processing cached files from %s", str);
    }

    default T1 a(final AbstractC5276t abstractC5276t, final String str, final ILogger iLogger) {
        final File file = new File(str);
        return new T1() { // from class: io.sentry.V1
            @Override // io.sentry.T1
            public final void a() {
                W1.b(iLogger, str, abstractC5276t, file);
            }
        };
    }

    T1 c(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3);

    default boolean d(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.c(EnumC5215i3.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }
}
