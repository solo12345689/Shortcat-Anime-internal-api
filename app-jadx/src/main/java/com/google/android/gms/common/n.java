package com.google.android.gms.common;

import R8.AbstractC2115p;
import R8.x0;
import R8.y0;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class n extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38959a;

    protected n(byte[] bArr) {
        AbstractC2115p.a(bArr.length == 25);
        this.f38959a = Arrays.hashCode(bArr);
    }

    protected static byte[] H3(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract byte[] G3();

    public final boolean equals(Object obj) {
        Y8.a aVarL;
        if (!(obj instanceof y0)) {
            return false;
        }
        try {
            y0 y0Var = (y0) obj;
            if (y0Var.m() == this.f38959a && (aVarL = y0Var.l()) != null) {
                return Arrays.equals(G3(), (byte[]) Y8.b.h(aVarL));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public final int hashCode() {
        return this.f38959a;
    }

    @Override // R8.y0
    public final Y8.a l() {
        return Y8.b.G3(G3());
    }

    @Override // R8.y0
    public final int m() {
        return this.f38959a;
    }
}
