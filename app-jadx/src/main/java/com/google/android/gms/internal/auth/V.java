package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class V implements Serializable, U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final U f39130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile transient boolean f39131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object f39132c;

    V(U u10) {
        this.f39130a = u10;
    }

    public final String toString() {
        Object obj;
        if (this.f39131b) {
            obj = "<supplier that returned " + String.valueOf(this.f39132c) + ">";
        } else {
            obj = this.f39130a;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        if (!this.f39131b) {
            synchronized (this) {
                try {
                    if (!this.f39131b) {
                        Object objZza = this.f39130a.zza();
                        this.f39132c = objZza;
                        this.f39131b = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f39132c;
    }
}
