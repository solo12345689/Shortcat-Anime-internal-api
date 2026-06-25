package com.bumptech.glide;

import m5.C5641a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m5.c f35671a = C5641a.a();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            return (l) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    final m5.c c() {
        return this.f35671a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return o5.l.e(this.f35671a, ((l) obj).f35671a);
        }
        return false;
    }

    public int hashCode() {
        m5.c cVar = this.f35671a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
