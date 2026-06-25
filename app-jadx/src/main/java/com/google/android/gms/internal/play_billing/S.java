package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S extends K implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient N f40396b;

    S() {
    }

    @Override // com.google.android.gms.internal.play_billing.K
    public N e() {
        N n10 = this.f40396b;
        if (n10 != null) {
            return n10;
        }
        N nL = l();
        this.f40396b = nL;
        return nL;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC3649c0.a(this);
    }

    N l() {
        Object[] array = toArray();
        int i10 = N.f40231c;
        return N.p(array, array.length);
    }
}
