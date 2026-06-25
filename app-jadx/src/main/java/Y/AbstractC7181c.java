package y;

import E0.InterfaceC1292b;
import E0.V;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import y.C7187i;
import z.o;

/* JADX INFO: renamed from: y.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7181c {

    /* JADX INFO: renamed from: y.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f64611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f64612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f64613c;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f64612b = obj;
            this.f64613c |= Integer.MIN_VALUE;
            return AbstractC7181c.b(null, this);
        }
    }

    /* JADX INFO: renamed from: y.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f64614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f64615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7187i f64616c;

        /* JADX INFO: renamed from: y.c$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7187i f64617a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7187i c7187i) {
                super(1);
                this.f64617a = c7187i;
            }

            public final void a(long j10) {
                this.f64617a.b(new C7187i.a.b(j10, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C6224f) obj).u());
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7187i c7187i, Zd.e eVar) {
            super(2, eVar);
            this.f64616c = c7187i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f64616c, eVar);
            bVar.f64615b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E0.L l10, Zd.e eVar) {
            return ((b) create(l10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f64614a;
            if (i10 == 0) {
                v.b(obj);
                E0.L l10 = (E0.L) this.f64615b;
                a aVar = new a(this.f64616c);
                this.f64614a = 1;
                if (AbstractC7181c.d(l10, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: y.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0973c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f64618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f64619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f64620c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0973c(Function1 function1, Zd.e eVar) {
            super(2, eVar);
            this.f64620c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            C0973c c0973c = new C0973c(this.f64620c, eVar);
            c0973c.f64619b = obj;
            return c0973c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1292b interfaceC1292b, Zd.e eVar) {
            return ((C0973c) create(interfaceC1292b, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r7.f64618a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Td.v.b(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f64619b
                E0.b r1 = (E0.InterfaceC1292b) r1
                Td.v.b(r8)
                goto L35
            L22:
                Td.v.b(r8)
                java.lang.Object r8 = r7.f64619b
                r1 = r8
                E0.b r1 = (E0.InterfaceC1292b) r1
                r7.f64619b = r1
                r7.f64618a = r3
                java.lang.Object r8 = y.AbstractC7181c.a(r1, r7)
                if (r8 != r0) goto L35
                goto L52
            L35:
                E0.C r8 = (E0.C) r8
                r8.a()
                kotlin.jvm.functions.Function1 r4 = r7.f64620c
                long r5 = r8.h()
                r0.f r8 = r0.C6224f.d(r5)
                r4.invoke(r8)
                r8 = 0
                r7.f64619b = r8
                r7.f64618a = r2
                java.lang.Object r8 = z.AbstractC7254A.l(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                E0.C r8 = (E0.C) r8
                if (r8 == 0) goto L5a
                r8.a()
            L5a:
                Td.L r8 = Td.L.f17438a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: y.AbstractC7181c.C0973c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(E0.InterfaceC1292b r8, Zd.e r9) {
        /*
            boolean r0 = r9 instanceof y.AbstractC7181c.a
            if (r0 == 0) goto L13
            r0 = r9
            y.c$a r0 = (y.AbstractC7181c.a) r0
            int r1 = r0.f64613c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64613c = r1
            goto L18
        L13:
            y.c$a r0 = new y.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f64612b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f64613c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f64611a
            E0.b r8 = (E0.InterfaceC1292b) r8
            Td.v.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            Td.v.b(r9)
        L38:
            r0.f64611a = r8
            r0.f64613c = r3
            r9 = 0
            java.lang.Object r9 = E0.InterfaceC1292b.D1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            E0.q r9 = (E0.C1307q) r9
            int r2 = r9.b()
            boolean r2 = E0.AbstractC1311v.c(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5a:
            if (r6 >= r4) goto L6c
            java.lang.Object r7 = r2.get(r6)
            E0.C r7 = (E0.C) r7
            boolean r7 = E0.r.a(r7)
            if (r7 != 0) goto L69
            goto L38
        L69:
            int r6 = r6 + 1
            goto L5a
        L6c:
            java.util.List r8 = r9.c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y.AbstractC7181c.b(E0.b, Zd.e):java.lang.Object");
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, C7187i c7187i) {
        return eVar.then(new SuspendPointerInputElement(C7182d.f64621a, null, null, new V.a(new b(c7187i, null)), 6, null));
    }

    public static final Object d(E0.L l10, Function1 function1, Zd.e eVar) {
        Object objC = o.c(l10, new C0973c(function1, null), eVar);
        return objC == AbstractC2605b.f() ? objC : L.f17438a;
    }
}
