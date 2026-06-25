package Hf;

import Gf.C1608f0;
import Gf.F0;
import Gf.InterfaceC1612h0;
import Gf.InterfaceC1623n;
import Gf.P0;
import Gf.Y;
import Td.L;
import Zd.i;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends g implements Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f8598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f8601f;

    private f(Handler handler, String str, boolean z10) {
        super(null);
        this.f8598c = handler;
        this.f8599d = str;
        this.f8600e = z10;
        this.f8601f = z10 ? this : new f(handler, str, true);
    }

    private final void h2(i iVar, Runnable runnable) {
        F0.d(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C1608f0.b().D1(iVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(f fVar, Runnable runnable) {
        fVar.f8598c.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(InterfaceC1623n interfaceC1623n, f fVar) {
        interfaceC1623n.N(fVar, L.f17438a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L l2(f fVar, Runnable runnable, Throwable th2) {
        fVar.f8598c.removeCallbacks(runnable);
        return L.f17438a;
    }

    @Override // Gf.Y
    public InterfaceC1612h0 B0(long j10, final Runnable runnable, i iVar) {
        if (this.f8598c.postDelayed(runnable, AbstractC5874j.j(j10, 4611686018427387903L))) {
            return new InterfaceC1612h0() { // from class: Hf.e
                @Override // Gf.InterfaceC1612h0
                public final void dispose() {
                    f.j2(this.f8596a, runnable);
                }
            };
        }
        h2(iVar, runnable);
        return P0.f7528a;
    }

    @Override // Gf.K
    public void D1(i iVar, Runnable runnable) {
        if (this.f8598c.post(runnable)) {
            return;
        }
        h2(iVar, runnable);
    }

    @Override // Gf.Y
    public void G0(long j10, final InterfaceC1623n interfaceC1623n) {
        final Runnable runnable = new Runnable() { // from class: Hf.c
            @Override // java.lang.Runnable
            public final void run() {
                f.k2(interfaceC1623n, this);
            }
        };
        if (this.f8598c.postDelayed(runnable, AbstractC5874j.j(j10, 4611686018427387903L))) {
            interfaceC1623n.p(new Function1() { // from class: Hf.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.l2(this.f8594a, runnable, (Throwable) obj);
                }
            });
        } else {
            h2(interfaceC1623n.getContext(), runnable);
        }
    }

    @Override // Gf.K
    public boolean S1(i iVar) {
        return (this.f8600e && AbstractC5504s.c(Looper.myLooper(), this.f8598c.getLooper())) ? false : true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f8598c == this.f8598c && fVar.f8600e == this.f8600e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f8598c) ^ (this.f8600e ? 1231 : 1237);
    }

    @Override // Hf.g
    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f d2() {
        return this.f8601f;
    }

    @Override // Gf.K
    public String toString() {
        String strC2 = c2();
        if (strC2 != null) {
            return strC2;
        }
        String string = this.f8599d;
        if (string == null) {
            string = this.f8598c.toString();
        }
        if (!this.f8600e) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ f(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(Handler handler, String str) {
        this(handler, str, false);
    }
}
