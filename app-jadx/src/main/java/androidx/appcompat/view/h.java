package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC2771m0;
import androidx.core.view.C2767k0;
import androidx.core.view.InterfaceC2769l0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f24625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InterfaceC2769l0 f24626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24627e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f24624b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC2771m0 f24628f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f24623a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC2771m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f24629a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24630b = 0;

        a() {
        }

        @Override // androidx.core.view.InterfaceC2769l0
        public void b(View view) {
            int i10 = this.f24630b + 1;
            this.f24630b = i10;
            if (i10 == h.this.f24623a.size()) {
                InterfaceC2769l0 interfaceC2769l0 = h.this.f24626d;
                if (interfaceC2769l0 != null) {
                    interfaceC2769l0.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.AbstractC2771m0, androidx.core.view.InterfaceC2769l0
        public void c(View view) {
            if (this.f24629a) {
                return;
            }
            this.f24629a = true;
            InterfaceC2769l0 interfaceC2769l0 = h.this.f24626d;
            if (interfaceC2769l0 != null) {
                interfaceC2769l0.c(null);
            }
        }

        void d() {
            this.f24630b = 0;
            this.f24629a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f24627e) {
            Iterator it = this.f24623a.iterator();
            while (it.hasNext()) {
                ((C2767k0) it.next()).c();
            }
            this.f24627e = false;
        }
    }

    void b() {
        this.f24627e = false;
    }

    public h c(C2767k0 c2767k0) {
        if (!this.f24627e) {
            this.f24623a.add(c2767k0);
        }
        return this;
    }

    public h d(C2767k0 c2767k0, C2767k0 c2767k02) {
        this.f24623a.add(c2767k0);
        c2767k02.i(c2767k0.d());
        this.f24623a.add(c2767k02);
        return this;
    }

    public h e(long j10) {
        if (!this.f24627e) {
            this.f24624b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f24627e) {
            this.f24625c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC2769l0 interfaceC2769l0) {
        if (!this.f24627e) {
            this.f24626d = interfaceC2769l0;
        }
        return this;
    }

    public void h() {
        if (this.f24627e) {
            return;
        }
        for (C2767k0 c2767k0 : this.f24623a) {
            long j10 = this.f24624b;
            if (j10 >= 0) {
                c2767k0.e(j10);
            }
            Interpolator interpolator = this.f24625c;
            if (interpolator != null) {
                c2767k0.f(interpolator);
            }
            if (this.f24626d != null) {
                c2767k0.g(this.f24628f);
            }
            c2767k0.k();
        }
        this.f24627e = true;
    }
}
