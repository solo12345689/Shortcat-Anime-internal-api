package l6;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f52661a = new l();

    private l() {
    }

    public static final Uri a(Object obj, Object obj2, Object[] objArr, y5.e requestToUri) {
        AbstractC5504s.h(requestToUri, "requestToUri");
        Uri uri = obj != null ? (Uri) requestToUri.apply(obj) : null;
        if (uri != null) {
            return uri;
        }
        if (objArr != null && objArr.length != 0) {
            Object obj3 = objArr[0];
            Uri uri2 = obj3 != null ? (Uri) requestToUri.apply(obj3) : null;
            if (uri2 != null) {
                return uri2;
            }
        }
        if (obj2 != null) {
            return (Uri) requestToUri.apply(obj2);
        }
        return null;
    }
}
