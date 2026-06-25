package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class b {

    /* JADX INFO: renamed from: a */
    final int f42183a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CarouselLayoutManager f42184b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f42184b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.b
        int d() {
            return this.f42184b.b0();
        }

        @Override // com.google.android.material.carousel.b
        int e() {
            return this.f42184b.i0();
        }

        @Override // com.google.android.material.carousel.b
        int f() {
            return this.f42184b.s0() - this.f42184b.j0();
        }

        @Override // com.google.android.material.carousel.b
        int g() {
            return h();
        }

        @Override // com.google.android.material.carousel.b
        int h() {
            return 0;
        }

        @Override // com.google.android.material.carousel.b
        public void i(View view, int i10, int i11) {
            int iE = e();
            this.f42184b.D0(view, iE, i10, iE + k(view), i11);
        }

        @Override // com.google.android.material.carousel.b
        public void j(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        int k(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f42184b.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0639b extends b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CarouselLayoutManager f42185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0639b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f42185b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.b
        int d() {
            return this.f42185b.b0() - this.f42185b.h0();
        }

        @Override // com.google.android.material.carousel.b
        int e() {
            return 0;
        }

        @Override // com.google.android.material.carousel.b
        int f() {
            return this.f42185b.s0();
        }

        @Override // com.google.android.material.carousel.b
        int g() {
            return this.f42185b.F2() ? f() : e();
        }

        @Override // com.google.android.material.carousel.b
        int h() {
            return this.f42185b.k0();
        }

        @Override // com.google.android.material.carousel.b
        public void i(View view, int i10, int i11) {
            int iH = h();
            this.f42185b.D0(view, i10, iH, i11, iH + k(view));
        }

        @Override // com.google.android.material.carousel.b
        public void j(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        int k(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f42185b.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
    }

    /* synthetic */ b(int i10, a aVar) {
        this(i10);
    }

    private static b a(CarouselLayoutManager carouselLayoutManager) {
        return new C0639b(0, carouselLayoutManager);
    }

    static b b(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return a(carouselLayoutManager);
        }
        if (i10 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static b c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract int d();

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int h();

    abstract void i(View view, int i10, int i11);

    abstract void j(View view, Rect rect, float f10, float f11);

    private b(int i10) {
        this.f42183a = i10;
    }
}
