package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends S8.a implements Iterable {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f40711a;

    E(Bundle bundle) {
        this.f40711a = bundle;
    }

    final Object c(String str) {
        return this.f40711a.get(str);
    }

    final Long d(String str) {
        return Long.valueOf(this.f40711a.getLong(str));
    }

    final Double e(String str) {
        return Double.valueOf(this.f40711a.getDouble("value"));
    }

    final String f(String str) {
        return this.f40711a.getString(str);
    }

    public final int i() {
        return this.f40711a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new D(this);
    }

    public final Bundle l() {
        return new Bundle(this.f40711a);
    }

    final /* synthetic */ Bundle r() {
        return this.f40711a;
    }

    public final String toString() {
        return this.f40711a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.e(parcel, 2, l(), false);
        S8.c.b(parcel, iA);
    }
}
