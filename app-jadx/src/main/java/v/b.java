package V;

import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Rect;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b4.C2985b;
import c4.f;
import c4.l;
import i1.AbstractC5026s;
import i1.C5018k;
import i1.InterfaceC5011d;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC1742e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1742e f19587a;

        /* JADX INFO: renamed from: V.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0338a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC1743f f19588a;

            /* JADX INFO: renamed from: V.b$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class C0339a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f19589a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f19590b;

                public C0339a(Zd.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f19589a = obj;
                    this.f19590b |= Integer.MIN_VALUE;
                    return C0338a.this.emit(null, this);
                }
            }

            public C0338a(InterfaceC1743f interfaceC1743f) {
                this.f19588a = interfaceC1743f;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Jf.InterfaceC1743f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, Zd.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof V.b.a.C0338a.C0339a
                    if (r0 == 0) goto L13
                    r0 = r8
                    V.b$a$a$a r0 = (V.b.a.C0338a.C0339a) r0
                    int r1 = r0.f19590b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19590b = r1
                    goto L18
                L13:
                    V.b$a$a$a r0 = new V.b$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f19589a
                    java.lang.Object r1 = ae.AbstractC2605b.f()
                    int r2 = r0.f19590b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Td.v.b(r8)
                    goto L60
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    Td.v.b(r8)
                    Jf.f r8 = r6.f19588a
                    c4.j r7 = (c4.j) r7
                    java.util.List r7 = r7.a()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L45:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L57
                    java.lang.Object r4 = r7.next()
                    boolean r5 = r4 instanceof c4.InterfaceC3075c
                    if (r5 == 0) goto L45
                    r2.add(r4)
                    goto L45
                L57:
                    r0.f19590b = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L60
                    return r1
                L60:
                    Td.L r7 = Td.L.f17438a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: V.b.a.C0338a.emit(java.lang.Object, Zd.e):java.lang.Object");
            }
        }

        public a(InterfaceC1742e interfaceC1742e) {
            this.f19587a = interfaceC1742e;
        }

        @Override // Jf.InterfaceC1742e
        public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            Object objCollect = this.f19587a.collect(new C0338a(interfaceC1743f), eVar);
            return objCollect == AbstractC2605b.f() ? objCollect : L.f17438a;
        }
    }

    public static final h2 a(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.C(-883534959);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-883534959, i10, -1, "androidx.compose.material3.adaptive.collectFoldingFeaturesAsState (AndroidWindowAdaptiveInfo.android.kt:68)");
        }
        Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        interfaceC2425m.C(793549594);
        boolean zU = interfaceC2425m.U(context);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new a(f.f33487a.d(context).a(context));
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.T();
        h2 h2VarA = U1.a((InterfaceC1742e) objD, AbstractC2279u.m(), null, interfaceC2425m, 48, 2);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.T();
        return h2VarA;
    }

    public static final e b(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.C(-2003129230);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-2003129230, i10, -1, "androidx.compose.material3.adaptive.currentWindowAdaptiveInfo (AndroidWindowAdaptiveInfo.android.kt:35)");
        }
        interfaceC2425m.C(-1765630114);
        long jQ = ((InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())).Q(AbstractC5026s.d(c(interfaceC2425m, 0)));
        interfaceC2425m.T();
        e eVar = new e(C2985b.f33095c.a(C5018k.h(jQ), C5018k.g(jQ)), V.a.a((List) a(interfaceC2425m, 0).getValue()));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.T();
        return eVar;
    }

    public static final long c(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.C(-1153163183);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1153163183, i10, -1, "androidx.compose.material3.adaptive.currentWindowSize (AndroidWindowAdaptiveInfo.android.kt:49)");
        }
        interfaceC2425m.n(AndroidCompositionLocals_androidKt.f());
        Rect rectA = l.f33506a.a().a((Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g())).a();
        long jA = AbstractC5026s.a(rectA.width(), rectA.height());
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.T();
        return jA;
    }
}
