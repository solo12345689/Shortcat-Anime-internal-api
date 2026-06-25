package com.google.android.gms.internal.auth;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class G0 {

    /* JADX INFO: renamed from: a */
    static final Charset f39063a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    static final Charset f39064b = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: c */
    static final Charset f39065c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d */
    public static final byte[] f39066d;

    /* JADX INFO: renamed from: e */
    public static final ByteBuffer f39067e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC3394u0 f39068f;

    static {
        byte[] bArr = new byte[0];
        f39066d = bArr;
        f39067e = ByteBuffer.wrap(bArr);
        int i10 = AbstractC3394u0.f39307a;
        C3388s0 c3388s0 = new C3388s0(bArr, 0, 0, false, null);
        try {
            c3388s0.c(0);
            f39068f = c3388s0;
        } catch (H0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f39064b);
    }
}
