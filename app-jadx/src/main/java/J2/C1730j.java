package J2;

import J2.C1723c;
import J2.InterfaceC1737q;
import J2.P;
import android.content.Context;
import android.os.Build;
import q2.AbstractC6079K;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: renamed from: J2.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1730j implements InterfaceC1737q.b {

    /* JADX INFO: renamed from: b */
    private final Context f9389b;

    /* JADX INFO: renamed from: c */
    private final O9.t f9390c;

    /* JADX INFO: renamed from: d */
    private final O9.t f9391d;

    /* JADX INFO: renamed from: e */
    private int f9392e;

    /* JADX INFO: renamed from: f */
    private boolean f9393f;

    public C1730j() {
        this.f9392e = 0;
        this.f9393f = false;
        this.f9389b = null;
        this.f9390c = null;
        this.f9391d = null;
    }

    private boolean d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f9389b;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // J2.InterfaceC1737q.b
    public InterfaceC1737q b(InterfaceC1737q.a aVar) {
        O9.t tVar;
        int i10 = this.f9392e;
        if (i10 != 1 && (i10 != 0 || !d())) {
            return new P.b().b(aVar);
        }
        int iK = AbstractC6079K.k(aVar.f9401c.f57022o);
        AbstractC6635w.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + a0.x0(iK));
        O9.t tVar2 = this.f9390c;
        C1723c.b bVar = (tVar2 == null || (tVar = this.f9391d) == null) ? new C1723c.b(iK) : new C1723c.b(tVar2, tVar);
        bVar.f(this.f9393f);
        return bVar.b(aVar);
    }

    public C1730j c() {
        this.f9392e = 1;
        return this;
    }

    public C1730j(Context context) {
        this(context, null, null);
    }

    public C1730j(Context context, O9.t tVar, O9.t tVar2) {
        this.f9389b = context;
        this.f9392e = 0;
        this.f9393f = false;
        this.f9390c = tVar;
        this.f9391d = tVar2;
    }
}
