package io.sentry.android.core.internal.util;

import io.sentry.protocol.C5255e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {
    public static C5255e.b a(int i10) {
        if (i10 == 1) {
            return C5255e.b.PORTRAIT;
        }
        if (i10 != 2) {
            return null;
        }
        return C5255e.b.LANDSCAPE;
    }
}
