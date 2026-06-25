package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0528b f32011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f32012b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f32013c = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f32014a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f32015b;

        a() {
        }

        private void c() {
            if (this.f32015b == null) {
                this.f32015b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f32014a &= ~(1 << i10);
                return;
            }
            a aVar = this.f32015b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f32015b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f32014a) : Long.bitCount(this.f32014a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f32014a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f32014a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f32014a & (1 << i10)) != 0;
            }
            c();
            return this.f32015b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f32015b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f32014a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f32014a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f32015b != null) {
                c();
                this.f32015b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f32015b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f32014a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f32014a = j12;
            long j13 = j10 - 1;
            this.f32014a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f32015b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f32015b.f(0);
            }
            return z10;
        }

        void g() {
            this.f32014a = 0L;
            a aVar = this.f32015b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f32014a |= 1 << i10;
            } else {
                c();
                this.f32015b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f32015b == null) {
                return Long.toBinaryString(this.f32014a);
            }
            return this.f32015b.toString() + "xx" + Long.toBinaryString(this.f32014a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface InterfaceC0528b {
        void a(View view);

        RecyclerView.E b(View view);

        void c(int i10);

        void d(View view, int i10);

        void e();

        int f(View view);

        void g(View view);

        View getChildAt(int i10);

        int getChildCount();

        void h(int i10);

        void i(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC0528b interfaceC0528b) {
        this.f32011a = interfaceC0528b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f32011a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int iB = i10 - (i11 - this.f32012b.b(i11));
            if (iB == 0) {
                while (this.f32012b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f32013c.add(view);
        this.f32011a.a(view);
    }

    private boolean t(View view) {
        if (!this.f32013c.remove(view)) {
            return false;
        }
        this.f32011a.g(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int childCount = i10 < 0 ? this.f32011a.getChildCount() : h(i10);
        this.f32012b.e(childCount, z10);
        if (z10) {
            l(view);
        }
        this.f32011a.d(view, childCount);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int childCount = i10 < 0 ? this.f32011a.getChildCount() : h(i10);
        this.f32012b.e(childCount, z10);
        if (z10) {
            l(view);
        }
        this.f32011a.i(view, childCount, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f32012b.f(iH);
        this.f32011a.c(iH);
    }

    View e(int i10) {
        int size = this.f32013c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f32013c.get(i11);
            RecyclerView.E eB = this.f32011a.b(view);
            if (eB.n() == i10 && !eB.u() && !eB.w()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f32011a.getChildAt(h(i10));
    }

    int g() {
        return this.f32011a.getChildCount() - this.f32013c.size();
    }

    View i(int i10) {
        return this.f32011a.getChildAt(i10);
    }

    int j() {
        return this.f32011a.getChildCount();
    }

    void k(View view) {
        int iF = this.f32011a.f(view);
        if (iF >= 0) {
            this.f32012b.h(iF);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iF = this.f32011a.f(view);
        if (iF == -1 || this.f32012b.d(iF)) {
            return -1;
        }
        return iF - this.f32012b.b(iF);
    }

    boolean n(View view) {
        return this.f32013c.contains(view);
    }

    void o() {
        this.f32012b.g();
        for (int size = this.f32013c.size() - 1; size >= 0; size--) {
            this.f32011a.g((View) this.f32013c.get(size));
            this.f32013c.remove(size);
        }
        this.f32011a.e();
    }

    void p(View view) {
        int iF = this.f32011a.f(view);
        if (iF < 0) {
            return;
        }
        if (this.f32012b.f(iF)) {
            t(view);
        }
        this.f32011a.h(iF);
    }

    void q(int i10) {
        int iH = h(i10);
        View childAt = this.f32011a.getChildAt(iH);
        if (childAt == null) {
            return;
        }
        if (this.f32012b.f(iH)) {
            t(childAt);
        }
        this.f32011a.h(iH);
    }

    boolean r(View view) {
        int iF = this.f32011a.f(view);
        if (iF == -1) {
            t(view);
            return true;
        }
        if (!this.f32012b.d(iF)) {
            return false;
        }
        this.f32012b.f(iF);
        t(view);
        this.f32011a.h(iF);
        return true;
    }

    void s(View view) {
        int iF = this.f32011a.f(view);
        if (iF < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f32012b.d(iF)) {
            this.f32012b.a(iF);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f32012b.toString() + ", hidden list:" + this.f32013c.size();
    }
}
