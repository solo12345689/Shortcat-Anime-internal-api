package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class W implements A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewConfiguration f27404a;

    public W(ViewConfiguration viewConfiguration) {
        this.f27404a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.A1
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.A1
    public long b() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.A1
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.A1
    public float d() {
        return Build.VERSION.SDK_INT >= 34 ? Z.f27406a.b(this.f27404a) : super.d();
    }

    @Override // androidx.compose.ui.platform.A1
    public float f() {
        return this.f27404a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.A1
    public float g() {
        return this.f27404a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.A1
    public float h() {
        return Build.VERSION.SDK_INT >= 34 ? Z.f27406a.a(this.f27404a) : super.h();
    }
}
