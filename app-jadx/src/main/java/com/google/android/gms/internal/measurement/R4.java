package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class R4 {

    /* JADX INFO: renamed from: b */
    private static volatile R4 f39560b;

    /* JADX INFO: renamed from: c */
    static final R4 f39561c = new R4(true);

    /* JADX INFO: renamed from: a */
    private final Map f39562a = Collections.EMPTY_MAP;

    R4(boolean z10) {
    }

    public static R4 a() {
        R4 r42 = f39560b;
        if (r42 != null) {
            return r42;
        }
        synchronized (R4.class) {
            try {
                R4 r43 = f39560b;
                if (r43 != null) {
                    return r43;
                }
                int i10 = M5.f39422d;
                R4 r4A = Y4.a(R4.class);
                f39560b = r4A;
                return r4A;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AbstractC3433c5 b(E5 e52, int i10) {
        android.support.v4.media.session.b.a(this.f39562a.get(new Q4(e52, i10)));
        return null;
    }
}
