package t2;

import android.net.Uri;
import q2.C6077I;

/* JADX INFO: renamed from: t2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6621h {
    default com.google.common.util.concurrent.p a(C6077I c6077i) {
        byte[] bArr = c6077i.f56528k;
        if (bArr != null) {
            return c(bArr);
        }
        Uri uri = c6077i.f56530m;
        if (uri != null) {
            return b(uri);
        }
        return null;
    }

    com.google.common.util.concurrent.p b(Uri uri);

    com.google.common.util.concurrent.p c(byte[] bArr);
}
