package x;

import android.view.View;
import android.widget.Magnifier;
import i1.InterfaceC5011d;
import ke.AbstractC5466a;
import r0.AbstractC6225g;
import r0.C6224f;
import r0.C6230l;
import x.X;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Y implements InterfaceC7002W {

    /* JADX INFO: renamed from: b */
    public static final Y f63297b = new Y();

    /* JADX INFO: renamed from: c */
    private static final boolean f63298c = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends X.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // x.X.a, x.InterfaceC7001V
        public void b(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                d().setZoom(f10);
            }
            if (AbstractC6225g.b(j11)) {
                d().show(C6224f.m(j10), C6224f.n(j10), C6224f.m(j11), C6224f.n(j11));
            } else {
                d().show(C6224f.m(j10), C6224f.n(j10));
            }
        }
    }

    private Y() {
    }

    @Override // x.InterfaceC7002W
    public boolean b() {
        return f63298c;
    }

    @Override // x.InterfaceC7002W
    /* JADX INFO: renamed from: c */
    public a a(View view, boolean z10, long j10, float f10, float f11, boolean z11, InterfaceC5011d interfaceC5011d, float f12) {
        if (z10) {
            return new a(new Magnifier(view));
        }
        long jW1 = interfaceC5011d.w1(j10);
        float fL1 = interfaceC5011d.l1(f10);
        float fL12 = interfaceC5011d.l1(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jW1 != 9205357640488583168L) {
            builder.setSize(AbstractC5466a.d(C6230l.i(jW1)), AbstractC5466a.d(C6230l.g(jW1)));
        }
        if (!Float.isNaN(fL1)) {
            builder.setCornerRadius(fL1);
        }
        if (!Float.isNaN(fL12)) {
            builder.setElevation(fL12);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new a(builder.build());
    }
}
