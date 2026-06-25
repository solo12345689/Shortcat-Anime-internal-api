package G1;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6974a = new a();

    private a() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
