package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class NativeLibHelper implements a {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e10) {
            Log.e("NativeLibHelper", "Signer Library could not be loaded: " + e10.getMessage());
        }
    }

    private native void nOnResume();

    private native byte[] nSign(Context context, Object obj, byte[] bArr, int i10);

    public final void a() {
        nOnResume();
    }

    public final byte[] b(Context context, Object obj, byte[] bArr, int i10) {
        return nSign(context, obj, bArr, i10);
    }
}
