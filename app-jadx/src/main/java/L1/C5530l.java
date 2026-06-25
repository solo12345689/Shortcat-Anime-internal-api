package l1;

import I0.H;
import Td.L;
import Ud.AbstractC2279u;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import androidx.compose.ui.platform.W0;
import i1.InterfaceC5011d;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: l1.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5530l extends AbstractC5527i {

    /* JADX INFO: renamed from: f */
    private boolean f52488f;

    /* JADX INFO: renamed from: g */
    private b f52489g;

    /* JADX INFO: renamed from: h */
    private final int f52490h;

    /* JADX INFO: renamed from: i */
    private int f52491i;

    /* JADX INFO: renamed from: j */
    private final ArrayList f52492j;

    /* JADX INFO: renamed from: l1.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends W0 implements H {

        /* JADX INFO: renamed from: c */
        private final C5524f f52493c;

        /* JADX INFO: renamed from: d */
        private final Function1 f52494d;

        /* JADX INFO: renamed from: l1.l$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0818a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C5524f f52495a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Function1 f52496b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0818a(C5524f c5524f, Function1 function1) {
                super(1);
                this.f52495a = c5524f;
                this.f52496b = function1;
            }

            public final void a(V0 v02) {
                v02.d("constrainAs");
                v02.b().c("ref", this.f52495a);
                v02.b().c("constrainBlock", this.f52496b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((V0) obj);
                return L.f17438a;
            }
        }

        public a(C5524f c5524f, Function1 function1) {
            super(T0.b() ? new C0818a(c5524f, function1) : T0.a());
            this.f52493c = c5524f;
            this.f52494d = function1;
        }

        @Override // I0.H
        /* JADX INFO: renamed from: a */
        public C5529k b(InterfaceC5011d interfaceC5011d, Object obj) {
            return new C5529k(this.f52493c, this.f52494d);
        }

        public boolean equals(Object obj) {
            Function1 function1 = this.f52494d;
            a aVar = obj instanceof a ? (a) obj : null;
            return function1 == (aVar != null ? aVar.f52494d : null);
        }

        public int hashCode() {
            return this.f52494d.hashCode();
        }
    }

    /* JADX INFO: renamed from: l1.l$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class b {
        public b() {
        }

        public final C5524f a() {
            return C5530l.this.l();
        }

        public final C5524f b() {
            return C5530l.this.l();
        }

        public final C5524f c() {
            return C5530l.this.l();
        }

        public final C5524f d() {
            return C5530l.this.l();
        }
    }

    public C5530l() {
        super(null);
        this.f52491i = this.f52490h;
        this.f52492j = new ArrayList();
    }

    @Override // l1.AbstractC5527i
    public void i() {
        super.i();
        this.f52491i = this.f52490h;
    }

    public final androidx.compose.ui.e k(androidx.compose.ui.e eVar, C5524f c5524f, Function1 function1) {
        if (this.f52488f) {
            function1.invoke(new C5523e(c5524f.a(), b(c5524f)));
        }
        return eVar.then(new a(c5524f, function1));
    }

    public final C5524f l() {
        ArrayList arrayList = this.f52492j;
        int i10 = this.f52491i;
        this.f52491i = i10 + 1;
        C5524f c5524f = (C5524f) AbstractC2279u.p0(arrayList, i10);
        if (c5524f != null) {
            return c5524f;
        }
        C5524f c5524f2 = new C5524f(Integer.valueOf(this.f52491i));
        this.f52492j.add(c5524f2);
        return c5524f2;
    }

    public final b m() {
        b bVar = this.f52489g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f52489g = bVar2;
        return bVar2;
    }
}
