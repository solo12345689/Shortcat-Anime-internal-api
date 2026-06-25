package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3505k5 {

    /* JADX INFO: renamed from: a */
    static final Charset f39812a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f39813b;

    static {
        Charset.forName("US-ASCII");
        f39812a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f39813b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = K4.f39402a;
        try {
            new J4(bArr, 0, 0, false, null).c(0);
        } catch (C3523m5 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int b(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static boolean d(E5 e52) {
        return false;
    }
}
