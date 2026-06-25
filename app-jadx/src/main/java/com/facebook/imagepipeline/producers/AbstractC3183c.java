package com.facebook.imagepipeline.producers;

import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3183c implements InterfaceC3194n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36169a = false;

    public static boolean e(int i10) {
        return (i10 & 1) == 1;
    }

    public static boolean f(int i10) {
        return !e(i10);
    }

    public static boolean m(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static boolean n(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static int o(int i10, int i11) {
        return i10 & (~i11);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3194n
    public synchronized void a(Throwable th2) {
        if (this.f36169a) {
            return;
        }
        this.f36169a = true;
        try {
            h(th2);
        } catch (Exception e10) {
            k(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3194n
    public synchronized void b() {
        if (this.f36169a) {
            return;
        }
        this.f36169a = true;
        try {
            g();
        } catch (Exception e10) {
            k(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3194n
    public synchronized void c(Object obj, int i10) {
        if (this.f36169a) {
            return;
        }
        this.f36169a = e(i10);
        try {
            i(obj, i10);
        } catch (Exception e10) {
            k(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3194n
    public synchronized void d(float f10) {
        if (this.f36169a) {
            return;
        }
        try {
            j(f10);
        } catch (Exception e10) {
            k(e10);
        }
    }

    protected abstract void g();

    protected abstract void h(Throwable th2);

    protected abstract void i(Object obj, int i10);

    protected abstract void j(float f10);

    protected void k(Exception exc) {
        AbstractC7283a.M(getClass(), "unhandled exception", exc);
    }

    public static int l(boolean z10) {
        return z10 ? 1 : 0;
    }
}
