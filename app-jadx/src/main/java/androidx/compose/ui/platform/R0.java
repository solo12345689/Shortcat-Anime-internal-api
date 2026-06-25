package androidx.compose.ui.platform;

import a0.C2507c;
import a1.AbstractC2516I;
import a1.InterfaceInputConnectionC2508A;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2700g1 f27360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f27361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f27362c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2507c f27363d = new C2507c(new K0.L0[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27364e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        public final void a(InterfaceInputConnectionC2508A interfaceInputConnectionC2508A) {
            interfaceInputConnectionC2508A.a();
            C2507c c2507c = R0.this.f27363d;
            Object[] objArr = c2507c.f23496a;
            int iP = c2507c.p();
            int i10 = 0;
            while (true) {
                if (i10 >= iP) {
                    i10 = -1;
                    break;
                } else if (AbstractC5504s.c((K0.L0) objArr[i10], interfaceInputConnectionC2508A)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                R0.this.f27363d.y(i10);
            }
            if (R0.this.f27363d.p() == 0) {
                R0.this.f27361b.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceInputConnectionC2508A) obj);
            return Td.L.f17438a;
        }
    }

    public R0(InterfaceC2700g1 interfaceC2700g1, InterfaceC5082a interfaceC5082a) {
        this.f27360a = interfaceC2700g1;
        this.f27361b = interfaceC5082a;
    }

    public final InputConnection c(EditorInfo editorInfo) {
        synchronized (this.f27362c) {
            if (this.f27364e) {
                return null;
            }
            InterfaceInputConnectionC2508A interfaceInputConnectionC2508AA = AbstractC2516I.a(this.f27360a.a(editorInfo), new a());
            this.f27363d.c(new K0.L0(interfaceInputConnectionC2508AA));
            return interfaceInputConnectionC2508AA;
        }
    }

    public final void d() {
        synchronized (this.f27362c) {
            try {
                this.f27364e = true;
                C2507c c2507c = this.f27363d;
                Object[] objArr = c2507c.f23496a;
                int iP = c2507c.p();
                for (int i10 = 0; i10 < iP; i10++) {
                    InterfaceInputConnectionC2508A interfaceInputConnectionC2508A = (InterfaceInputConnectionC2508A) ((K0.L0) objArr[i10]).get();
                    if (interfaceInputConnectionC2508A != null) {
                        interfaceInputConnectionC2508A.a();
                    }
                }
                this.f27363d.i();
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return !this.f27364e;
    }
}
