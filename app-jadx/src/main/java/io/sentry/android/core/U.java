package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC5247p0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class U {
    public static InterfaceC5247p0 a(Context context, C5131g0 c5131g0) {
        return c5131g0.d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
