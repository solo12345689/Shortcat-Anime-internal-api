package androidx.compose.ui.layout;

import I0.M;
import I0.T;
import K0.I0;
import Td.L;
import Y.A0;
import Y.C0;
import android.graphics.Rect;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import t.C6546L;
import t.c0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class A extends e.c implements K0.E, I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26854a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RunnableC2677f f26855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f26856c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f26857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar) {
            super(1);
            this.f26857a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.N(aVar, this.f26857a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RunnableC2677f f26859b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(RunnableC2677f runnableC2677f) {
            super(1);
            this.f26859b = runnableC2677f;
        }

        public final void a(M m10) {
            A a10 = A.this;
            a10.J1(a10.G1().b());
            if (A.this.H1() > 0) {
                long jA = m10.x().a();
                c0 c0VarF = this.f26859b.f();
                int i10 = (int) (jA >> 32);
                int i11 = (int) (jA & 4294967295L);
                F[] fArr = H.f26903b;
                int length = fArr.length;
                int i12 = 0;
                while (i12 < length) {
                    F f10 = fArr[i12];
                    Object objE = c0VarF.e(f10);
                    AbstractC5504s.e(objE);
                    T t10 = (T) objE;
                    M m11 = m10;
                    H.f(m11, f10.a(), t10.a(), i10, i11);
                    if (t10.g()) {
                        H.f(m11, t10.c(), t10.d(), i10, i11);
                        H.f(m11, t10.e(), t10.f(), i10, i11);
                    }
                    H.f(m11, f10.b(), t10.b(), i10, i11);
                    i12++;
                    m10 = m11;
                }
                M m12 = m10;
                if (A.this.E1().g()) {
                    C6546L c6546lE1 = A.this.E1();
                    A a11 = A.this;
                    Object[] objArr = c6546lE1.f60006a;
                    int i13 = c6546lE1.f60007b;
                    for (int i14 = 0; i14 < i13; i14++) {
                        C0 c02 = (C0) objArr[i14];
                        u uVar = (u) a11.F1().get(i14);
                        Rect rect = (Rect) c02.getValue();
                        m12.A0(uVar.a(), rect.left);
                        m12.A0(uVar.b(), rect.top);
                        m12.A0(uVar.c(), rect.right);
                        m12.A0(uVar.d(), rect.bottom);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((M) obj);
            return L.f17438a;
        }
    }

    public A(RunnableC2677f runnableC2677f) {
        this.f26855b = runnableC2677f;
        this.f26856c = new b(runnableC2677f);
    }

    @Override // K0.I0
    public Object B() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    public final C6546L E1() {
        return this.f26855b.c();
    }

    public final List F1() {
        return this.f26855b.b();
    }

    public final A0 G1() {
        return this.f26855b.e();
    }

    public final int H1() {
        return this.f26854a;
    }

    public final void I1(RunnableC2677f runnableC2677f) {
        if (this.f26855b != runnableC2677f) {
            this.f26855b = runnableC2677f;
            K0.H.c(this);
        }
    }

    public final void J1(int i10) {
        this.f26854a = i10;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo5measure3p2s80s(l lVar, I0.A a10, long j10) {
        s sVarV0 = a10.v0(j10);
        return l.J(lVar, sVarV0.W0(), sVarV0.P0(), null, this.f26856c, new a(sVarV0), 4, null);
    }
}
