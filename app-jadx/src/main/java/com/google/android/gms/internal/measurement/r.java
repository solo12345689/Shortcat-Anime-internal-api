package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements InterfaceC3553q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f39951b;

    public r(String str, List list) {
        this.f39950a = str;
        ArrayList arrayList = new ArrayList();
        this.f39951b = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f39950a;
    }

    public final ArrayList b() {
        return this.f39951b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String str = this.f39950a;
        if (str == null ? rVar.f39950a == null : str.equals(rVar.f39950a)) {
            return this.f39951b.equals(rVar.f39951b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39950a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f39951b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final String k() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Double l() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Boolean m() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Iterator n() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q r(String str, Y1 y12, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q p() {
        return this;
    }
}
