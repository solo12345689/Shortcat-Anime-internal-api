package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f32152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f32153b = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32154a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f32155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f32158e;

        a() {
        }

        void a(int i10) {
            this.f32154a = i10 | this.f32154a;
        }

        boolean b() {
            int i10 = this.f32154a;
            if ((i10 & 7) != 0 && (i10 & c(this.f32157d, this.f32155b)) == 0) {
                return false;
            }
            int i11 = this.f32154a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f32157d, this.f32156c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f32154a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f32158e, this.f32155b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f32154a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f32158e, this.f32156c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f32154a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f32155b = i10;
            this.f32156c = i11;
            this.f32157d = i12;
            this.f32158e = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        int a(View view);

        int b();

        int c();

        int d(View view);

        View getChildAt(int i10);
    }

    o(b bVar) {
        this.f32152a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iB = this.f32152a.b();
        int iC = this.f32152a.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View childAt = this.f32152a.getChildAt(i10);
            this.f32153b.e(iB, iC, this.f32152a.a(childAt), this.f32152a.d(childAt));
            if (i12 != 0) {
                this.f32153b.d();
                this.f32153b.a(i12);
                if (this.f32153b.b()) {
                    return childAt;
                }
            }
            if (i13 != 0) {
                this.f32153b.d();
                this.f32153b.a(i13);
                if (this.f32153b.b()) {
                    view = childAt;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f32153b.e(this.f32152a.b(), this.f32152a.c(), this.f32152a.a(view), this.f32152a.d(view));
        if (i10 == 0) {
            return false;
        }
        this.f32153b.d();
        this.f32153b.a(i10);
        return this.f32153b.b();
    }
}
