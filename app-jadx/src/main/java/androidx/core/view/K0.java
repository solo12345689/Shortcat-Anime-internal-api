package androidx.core.view;

import android.view.WindowInsetsAnimationController;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f28948a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f28949a;

        a(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f28949a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.K0.b
        void a(boolean z10) {
            this.f28949a.finish(z10);
        }

        @Override // androidx.core.view.K0.b
        public float b() {
            return this.f28949a.getCurrentFraction();
        }

        @Override // androidx.core.view.K0.b
        public A1.b c() {
            return A1.b.f(this.f28949a.getCurrentInsets());
        }

        @Override // androidx.core.view.K0.b
        public A1.b d() {
            return A1.b.f(this.f28949a.getHiddenStateInsets());
        }

        @Override // androidx.core.view.K0.b
        public A1.b e() {
            return A1.b.f(this.f28949a.getShownStateInsets());
        }

        @Override // androidx.core.view.K0.b
        public void f(A1.b bVar, float f10, float f11) {
            this.f28949a.setInsetsAndAlpha(bVar == null ? null : bVar.g(), f10, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        b() {
        }

        abstract void a(boolean z10);

        public abstract float b();

        public abstract A1.b c();

        public abstract A1.b d();

        public abstract A1.b e();

        public abstract void f(A1.b bVar, float f10, float f11);
    }

    K0(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f28948a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z10) {
        this.f28948a.a(z10);
    }

    public float b() {
        return this.f28948a.b();
    }

    public A1.b c() {
        return this.f28948a.c();
    }

    public A1.b d() {
        return this.f28948a.d();
    }

    public A1.b e() {
        return this.f28948a.e();
    }

    public void f(A1.b bVar, float f10, float f11) {
        this.f28948a.f(bVar, f10, f11);
    }
}
