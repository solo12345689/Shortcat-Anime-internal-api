package z0;

import android.view.View;
import z0.AbstractC7270b;

/* JADX INFO: renamed from: z0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7271c implements InterfaceC7269a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f65469a;

    public C7271c(View view) {
        this.f65469a = view;
    }

    @Override // z0.InterfaceC7269a
    public void a(int i10) {
        AbstractC7270b.a aVar = AbstractC7270b.f65468a;
        if (AbstractC7270b.b(i10, aVar.a())) {
            this.f65469a.performHapticFeedback(16);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.b())) {
            this.f65469a.performHapticFeedback(6);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.c())) {
            this.f65469a.performHapticFeedback(13);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.d())) {
            this.f65469a.performHapticFeedback(23);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.e())) {
            this.f65469a.performHapticFeedback(3);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.f())) {
            this.f65469a.performHapticFeedback(0);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.g())) {
            this.f65469a.performHapticFeedback(17);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.h())) {
            this.f65469a.performHapticFeedback(27);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.i())) {
            this.f65469a.performHapticFeedback(26);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.j())) {
            this.f65469a.performHapticFeedback(9);
            return;
        }
        if (AbstractC7270b.b(i10, aVar.k())) {
            this.f65469a.performHapticFeedback(22);
        } else if (AbstractC7270b.b(i10, aVar.l())) {
            this.f65469a.performHapticFeedback(21);
        } else if (AbstractC7270b.b(i10, aVar.m())) {
            this.f65469a.performHapticFeedback(1);
        }
    }
}
