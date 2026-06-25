package androidx.compose.ui.platform;

import android.view.View;
import z0.AbstractC7270b;
import z0.InterfaceC7269a;

/* JADX INFO: renamed from: androidx.compose.ui.platform.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2743y0 implements InterfaceC7269a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f27630a;

    public C2743y0(View view) {
        this.f27630a = view;
    }

    @Override // z0.InterfaceC7269a
    public void a(int i10) {
        AbstractC7270b.a aVar = AbstractC7270b.f65468a;
        if (AbstractC7270b.b(i10, aVar.a())) {
            this.f27630a.performHapticFeedback(16);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.b())) {
            this.f27630a.performHapticFeedback(6);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.c())) {
            this.f27630a.performHapticFeedback(13);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.d())) {
            this.f27630a.performHapticFeedback(23);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.e())) {
            this.f27630a.performHapticFeedback(3);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.f())) {
            this.f27630a.performHapticFeedback(0);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.g())) {
            this.f27630a.performHapticFeedback(17);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.h())) {
            this.f27630a.performHapticFeedback(27);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.i())) {
            this.f27630a.performHapticFeedback(26);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.j())) {
            this.f27630a.performHapticFeedback(9);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.k())) {
            this.f27630a.performHapticFeedback(22);
        } else if (AbstractC7270b.b(i10, aVar.l())) {
            this.f27630a.performHapticFeedback(21);
        } else if (AbstractC7270b.b(i10, aVar.m())) {
            this.f27630a.performHapticFeedback(1);
        }
    }
}
