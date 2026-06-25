package androidx.compose.ui.platform;

import Y.C2433o1;
import android.view.View;
import androidx.compose.ui.platform.I1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27235a = a.f27236a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27236a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final I1 f27237b = new I1() { // from class: androidx.compose.ui.platform.H1
            @Override // androidx.compose.ui.platform.I1
            public final C2433o1 a(View view) {
                return I1.a.b(view);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2433o1 b(View view) {
            return K1.c(view, null, null, 3, null);
        }

        public final I1 c() {
            return f27237b;
        }
    }

    C2433o1 a(View view);
}
