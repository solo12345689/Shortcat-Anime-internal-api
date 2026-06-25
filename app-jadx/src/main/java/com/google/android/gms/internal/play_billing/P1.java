package com.google.android.gms.internal.play_billing;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P1 {

    /* JADX INFO: renamed from: a */
    static final Charset f40249a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f40250b;

    static {
        Charset.forName("US-ASCII");
        f40249a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f40250b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = AbstractC3724r1.f40543a;
        try {
            new C3715p1(bArr, 0, 0, false, null).c(0);
        } catch (R1 e10) {
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
}
