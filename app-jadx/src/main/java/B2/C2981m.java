package b2;

import android.util.AndroidRuntimeException;
import b2.AbstractC2976h;

/* JADX INFO: renamed from: b2.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2981m extends AbstractC2976h {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private C2982n f33075B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private float f33076C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f33077D;

    public C2981m(C2979k c2979k) {
        super(c2979k);
        this.f33075B = null;
        this.f33076C = Float.MAX_VALUE;
        this.f33077D = false;
    }

    private void y() {
        C2982n c2982n = this.f33075B;
        if (c2982n == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dB = c2982n.b();
        if (dB > this.f33060g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dB < this.f33061h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public void A() {
        if (!v()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!f().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f33059f) {
            this.f33077D = true;
        }
    }

    @Override // b2.AbstractC2976h
    public void d() {
        super.d();
        float f10 = this.f33076C;
        if (f10 != Float.MAX_VALUE) {
            C2982n c2982n = this.f33075B;
            if (c2982n == null) {
                this.f33075B = new C2982n(f10);
            } else {
                c2982n.g(f10);
            }
            this.f33076C = Float.MAX_VALUE;
        }
    }

    @Override // b2.AbstractC2976h
    public void r() {
        y();
        this.f33075B.i(h());
        super.r();
    }

    @Override // b2.AbstractC2976h
    boolean t(long j10) {
        if (this.f33077D) {
            float f10 = this.f33076C;
            if (f10 != Float.MAX_VALUE) {
                this.f33075B.g(f10);
                this.f33076C = Float.MAX_VALUE;
            }
            this.f33055b = this.f33075B.b();
            this.f33054a = 0.0f;
            this.f33077D = false;
            return true;
        }
        if (this.f33076C != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            AbstractC2976h.p pVarJ = this.f33075B.j(this.f33055b, this.f33054a, j11);
            this.f33075B.g(this.f33076C);
            this.f33076C = Float.MAX_VALUE;
            AbstractC2976h.p pVarJ2 = this.f33075B.j(pVarJ.f33069a, pVarJ.f33070b, j11);
            this.f33055b = pVarJ2.f33069a;
            this.f33054a = pVarJ2.f33070b;
        } else {
            AbstractC2976h.p pVarJ3 = this.f33075B.j(this.f33055b, this.f33054a, j10);
            this.f33055b = pVarJ3.f33069a;
            this.f33054a = pVarJ3.f33070b;
        }
        float fMax = Math.max(this.f33055b, this.f33061h);
        this.f33055b = fMax;
        float fMin = Math.min(fMax, this.f33060g);
        this.f33055b = fMin;
        if (!x(fMin, this.f33054a)) {
            return false;
        }
        this.f33055b = this.f33075B.b();
        this.f33054a = 0.0f;
        return true;
    }

    public void u(float f10) {
        if (i()) {
            this.f33076C = f10;
            return;
        }
        if (this.f33075B == null) {
            this.f33075B = new C2982n(f10);
        }
        this.f33075B.g(f10);
        r();
    }

    public boolean v() {
        return this.f33075B.f33079b > 0.0d;
    }

    public C2982n w() {
        return this.f33075B;
    }

    boolean x(float f10, float f11) {
        return this.f33075B.e(f10, f11);
    }

    public C2981m z(C2982n c2982n) {
        this.f33075B = c2982n;
        return this;
    }

    public C2981m(C2979k c2979k, float f10) {
        super(c2979k);
        this.f33075B = null;
        this.f33076C = Float.MAX_VALUE;
        this.f33077D = false;
        this.f33075B = new C2982n(f10);
    }

    public C2981m(Object obj, AbstractC2978j abstractC2978j) {
        super(obj, abstractC2978j);
        this.f33075B = null;
        this.f33076C = Float.MAX_VALUE;
        this.f33077D = false;
    }

    @Override // b2.AbstractC2976h
    void q(float f10) {
    }
}
