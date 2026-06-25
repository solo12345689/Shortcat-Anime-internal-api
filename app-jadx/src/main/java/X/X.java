package x;

import android.view.View;
import android.widget.Magnifier;
import i1.AbstractC5026s;
import i1.InterfaceC5011d;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class X implements InterfaceC7002W {

    /* JADX INFO: renamed from: b */
    public static final X f63294b = new X();

    /* JADX INFO: renamed from: c */
    private static final boolean f63295c = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements InterfaceC7001V {

        /* JADX INFO: renamed from: a */
        private final Magnifier f63296a;

        public a(Magnifier magnifier) {
            this.f63296a = magnifier;
        }

        @Override // x.InterfaceC7001V
        public long a() {
            return AbstractC5026s.a(this.f63296a.getWidth(), this.f63296a.getHeight());
        }

        @Override // x.InterfaceC7001V
        public void b(long j10, long j11, float f10) {
            this.f63296a.show(C6224f.m(j10), C6224f.n(j10));
        }

        @Override // x.InterfaceC7001V
        public void c() {
            this.f63296a.update();
        }

        public final Magnifier d() {
            return this.f63296a;
        }

        @Override // x.InterfaceC7001V
        public void dismiss() {
            this.f63296a.dismiss();
        }
    }

    private X() {
    }

    @Override // x.InterfaceC7002W
    public boolean b() {
        return f63295c;
    }

    @Override // x.InterfaceC7002W
    /* JADX INFO: renamed from: c */
    public a a(View view, boolean z10, long j10, float f10, float f11, boolean z11, InterfaceC5011d interfaceC5011d, float f12) {
        return new a(new Magnifier(view));
    }
}
