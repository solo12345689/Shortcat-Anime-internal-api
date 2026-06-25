package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3760z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile C3760z1 f40592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C3760z1 f40593c = new C3760z1(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f40594a = Collections.EMPTY_MAP;

    C3760z1(boolean z10) {
    }

    public static C3760z1 a() {
        C3760z1 c3760z1 = f40592b;
        if (c3760z1 != null) {
            return c3760z1;
        }
        synchronized (C3760z1.class) {
            try {
                C3760z1 c3760z12 = f40592b;
                if (c3760z12 != null) {
                    return c3760z12;
                }
                int i10 = C3701m2.f40505d;
                C3760z1 c3760z1A = F1.a(C3760z1.class);
                f40592b = c3760z1A;
                return c3760z1A;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final I1 b(InterfaceC3666f2 interfaceC3666f2, int i10) {
        android.support.v4.media.session.b.a(this.f40594a.get(new C3756y1(interfaceC3666f2, i10)));
        return null;
    }
}
