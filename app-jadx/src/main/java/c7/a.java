package C7;

import android.view.View;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2893a = new a();

    private a() {
    }

    public static final int a(int i10) {
        return i10 % 2 == 0 ? 2 : 1;
    }

    public static final int b(int i10, int i11) {
        int i12 = i11 == -1 ? 1 : 2;
        if (i12 == 1 && !d(i10) && i10 % 2 == 0) {
            return 2;
        }
        return i12;
    }

    public static final int c(View view) {
        AbstractC5504s.h(view, "view");
        return a(view.getId());
    }

    public static final boolean d(int i10) {
        return i10 % 10 == 1;
    }
}
