package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC2702h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27459a = a.f27460a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.h0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27460a = new a();

        private a() {
        }

        public final InterfaceC2702h0 a() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? C2714l0.f27481b : i10 >= 29 ? C2711k0.f27473b : i10 >= 28 ? C2708j0.f27471b : C2705i0.f27461b;
        }
    }

    Rect a(Activity activity);
}
