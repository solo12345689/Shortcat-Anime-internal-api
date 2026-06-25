package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import j9.C5344a;
import j9.InterfaceC5347d;
import j9.InterfaceC5350g;
import j9.InterfaceC5353j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3797e2 extends com.google.android.gms.internal.measurement.O implements InterfaceC5347d {
    C3797e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // j9.InterfaceC5347d
    public final void A0(B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(26, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void C1(B6 b62, j9.J j10, InterfaceC5353j interfaceC5353j) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        com.google.android.gms.internal.measurement.Q.c(parcelG3, j10);
        com.google.android.gms.internal.measurement.Q.d(parcelG3, interfaceC5353j);
        H3(29, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void C3(B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(20, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void E2(B6 b62, C3810g c3810g) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        com.google.android.gms.internal.measurement.Q.c(parcelG3, c3810g);
        H3(30, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final byte[] G0(G g10, String str) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, g10);
        parcelG3.writeString(str);
        Parcel parcelC = c(9, parcelG3);
        byte[] bArrCreateByteArray = parcelC.createByteArray();
        parcelC.recycle();
        return bArrCreateByteArray;
    }

    @Override // j9.InterfaceC5347d
    public final List K(String str, String str2, String str3, boolean z10) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(null);
        parcelG3.writeString(str2);
        parcelG3.writeString(str3);
        int i10 = com.google.android.gms.internal.measurement.Q.f39546b;
        parcelG3.writeInt(z10 ? 1 : 0);
        Parcel parcelC = c(15, parcelG3);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(v6.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // j9.InterfaceC5347d
    public final void M(C3826i c3826i, B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, c3826i);
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(12, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final C5344a O2(B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        Parcel parcelC = c(21, parcelG3);
        C5344a c5344a = (C5344a) com.google.android.gms.internal.measurement.Q.b(parcelC, C5344a.CREATOR);
        parcelC.recycle();
        return c5344a;
    }

    @Override // j9.InterfaceC5347d
    public final void P0(v6 v6Var, B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, v6Var);
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(2, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void P2(Bundle bundle, B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, bundle);
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(19, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void W2(B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(4, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void a2(long j10, String str, String str2, String str3) {
        Parcel parcelG3 = G3();
        parcelG3.writeLong(j10);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        parcelG3.writeString(str3);
        H3(10, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void b2(B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(18, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void e3(B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(27, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final List j3(String str, String str2, boolean z10, B6 b62) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        int i10 = com.google.android.gms.internal.measurement.Q.f39546b;
        parcelG3.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        Parcel parcelC = c(14, parcelG3);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(v6.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // j9.InterfaceC5347d
    public final List l0(String str, String str2, String str3) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(null);
        parcelG3.writeString(str2);
        parcelG3.writeString(str3);
        Parcel parcelC = c(17, parcelG3);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(C3826i.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // j9.InterfaceC5347d
    public final List p3(String str, String str2, B6 b62) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        Parcel parcelC = c(16, parcelG3);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(C3826i.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // j9.InterfaceC5347d
    public final void t2(B6 b62, Bundle bundle, InterfaceC5350g interfaceC5350g) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        com.google.android.gms.internal.measurement.Q.c(parcelG3, bundle);
        com.google.android.gms.internal.measurement.Q.d(parcelG3, interfaceC5350g);
        H3(31, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void u0(B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(25, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final String w1(B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        Parcel parcelC = c(11, parcelG3);
        String string = parcelC.readString();
        parcelC.recycle();
        return string;
    }

    @Override // j9.InterfaceC5347d
    public final void x0(G g10, B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, g10);
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(1, parcelG3);
    }

    @Override // j9.InterfaceC5347d
    public final void y0(B6 b62) {
        Parcel parcelG3 = G3();
        com.google.android.gms.internal.measurement.Q.c(parcelG3, b62);
        H3(6, parcelG3);
    }
}
