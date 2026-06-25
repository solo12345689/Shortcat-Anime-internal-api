package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f28984a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScrollFeedbackProvider f28985a;

        b(View view) {
            this.f28985a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.M.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f28985a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // androidx.core.view.M.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f28985a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    private M(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f28984a = new b(view);
        } else {
            this.f28984a = new c();
        }
    }

    public static M a(View view) {
        return new M(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f28984a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f28984a.onScrollProgress(i10, i11, i12, i13);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements d {
        private c() {
        }

        @Override // androidx.core.view.M.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // androidx.core.view.M.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }
}
