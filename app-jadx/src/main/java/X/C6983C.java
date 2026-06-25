package x;

import I0.InterfaceC1690p;
import K0.I0;
import K0.InterfaceC1808v;
import K0.J0;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: x.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6983C extends e.c implements I0, InterfaceC1808v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f63220d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f63221e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f63223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1690p f63224c;

    /* JADX INFO: renamed from: x.C$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final C6984D E1() {
        if (isAttached()) {
            I0 i0A = J0.a(this, C6984D.f63225c);
            if (i0A instanceof C6984D) {
                return (C6984D) i0A;
            }
        }
        return null;
    }

    private final void F1() {
        C6984D c6984dE1;
        InterfaceC1690p interfaceC1690p = this.f63224c;
        if (interfaceC1690p != null) {
            AbstractC5504s.e(interfaceC1690p);
            if (!interfaceC1690p.b() || (c6984dE1 = E1()) == null) {
                return;
            }
            c6984dE1.E1(this.f63224c);
        }
    }

    @Override // K0.I0
    public Object B() {
        return f63220d;
    }

    public final void G1(boolean z10) {
        if (z10 == this.f63222a) {
            return;
        }
        if (z10) {
            F1();
        } else {
            C6984D c6984dE1 = E1();
            if (c6984dE1 != null) {
                c6984dE1.E1(null);
            }
        }
        this.f63222a = z10;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f63223b;
    }

    @Override // K0.InterfaceC1808v
    public void p(InterfaceC1690p interfaceC1690p) {
        this.f63224c = interfaceC1690p;
        if (this.f63222a) {
            if (interfaceC1690p.b()) {
                F1();
                return;
            }
            C6984D c6984dE1 = E1();
            if (c6984dE1 != null) {
                c6984dE1.E1(null);
            }
        }
    }
}
