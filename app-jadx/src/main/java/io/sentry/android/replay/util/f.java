package io.sentry.android.replay.util;

import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5187d0;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final Future b(InterfaceC5187d0 interfaceC5187d0, final C5322z3 options, final String taskName, final Runnable task) {
        AbstractC5504s.h(interfaceC5187d0, "<this>");
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(taskName, "taskName");
        AbstractC5504s.h(task, "task");
        try {
            return interfaceC5187d0.submit(new Runnable() { // from class: io.sentry.android.replay.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.c(task, options, taskName);
                }
            });
        } catch (Throwable th2) {
            options.getLogger().b(EnumC5215i3.ERROR, "Failed to submit task " + taskName + " to executor", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Runnable runnable, C5322z3 c5322z3, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.ERROR, "Failed to execute task " + str, th2);
        }
    }
}
