package com.google.android.gms.internal.auth;

import android.os.Binder;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3387s {
    public static Object a(InterfaceC3390t interfaceC3390t) {
        try {
            return interfaceC3390t.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC3390t.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
