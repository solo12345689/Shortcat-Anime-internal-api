package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2845y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f30126a;

    private C2845y(A a10) {
        this.f30126a = a10;
    }

    public static C2845y b(A a10) {
        return new C2845y((A) K1.f.h(a10, "callbacks == null"));
    }

    public void a(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        K kG = this.f30126a.g();
        A a10 = this.f30126a;
        kG.q(a10, a10, abstractComponentCallbacksC2838q);
    }

    public void c() {
        this.f30126a.g().E();
    }

    public boolean d(MenuItem menuItem) {
        return this.f30126a.g().H(menuItem);
    }

    public void e() {
        this.f30126a.g().I();
    }

    public void f() {
        this.f30126a.g().K();
    }

    public void g() {
        this.f30126a.g().T();
    }

    public void h() {
        this.f30126a.g().X();
    }

    public void i() {
        this.f30126a.g().Y();
    }

    public void j() {
        this.f30126a.g().a0();
    }

    public boolean k() {
        return this.f30126a.g().h0(true);
    }

    public K l() {
        return this.f30126a.g();
    }

    public void m() {
        this.f30126a.g().c1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f30126a.g().E0().onCreateView(view, str, context, attributeSet);
    }
}
