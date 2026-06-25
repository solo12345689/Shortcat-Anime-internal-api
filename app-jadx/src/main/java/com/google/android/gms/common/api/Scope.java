package com.google.android.gms.common.api;

import R8.AbstractC2115p;
import S8.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Scope extends S8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f38930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38931b;

    Scope(int i10, String str) {
        AbstractC2115p.g(str, "scopeUri must not be null or empty");
        this.f38930a = i10;
        this.f38931b = str;
    }

    public String c() {
        return this.f38931b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f38931b.equals(((Scope) obj).f38931b);
        }
        return false;
    }

    public int hashCode() {
        return this.f38931b.hashCode();
    }

    public String toString() {
        return this.f38931b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f38930a;
        int iA = c.a(parcel);
        c.j(parcel, 1, i11);
        c.q(parcel, 2, c(), false);
        c.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
