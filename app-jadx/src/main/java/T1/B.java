package T1;

import Gf.AbstractC1617k;
import Gf.C0;
import Gf.O;
import If.k;
import Td.L;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a */
    private final O f16760a;

    /* JADX INFO: renamed from: b */
    private final Function2 f16761b;

    /* JADX INFO: renamed from: c */
    private final If.g f16762c;

    /* JADX INFO: renamed from: d */
    private final C2138b f16763d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f16764a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ B f16765b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f16766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, B b10, Function2 function2) {
            super(1);
            this.f16764a = function1;
            this.f16765b = b10;
            this.f16766c = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return L.f17438a;
        }

        public final void invoke(Throwable th2) {
            L l10;
            this.f16764a.invoke(th2);
            this.f16765b.f16762c.i(th2);
            do {
                Object objF = If.k.f(this.f16765b.f16762c.f());
                if (objF != null) {
                    this.f16766c.invoke(objF, th2);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
            } while (l10 != null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f16767a;

        /* JADX INFO: renamed from: b */
        int f16768b;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return B.this.new b(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
        
            if (r1.invoke(r6, r5) != r0) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0051 A[PHI: r1 r6
  0x0051: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:37:0x004e, B:33:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:37:0x004e, B:33:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x005a -> B:42:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r5.f16768b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Td.v.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f16767a
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                Td.v.b(r6)
                goto L51
            L22:
                Td.v.b(r6)
                T1.B r6 = T1.B.this
                T1.b r6 = T1.B.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                T1.B r6 = T1.B.this
                Gf.O r6 = T1.B.d(r6)
                Gf.P.f(r6)
                T1.B r6 = T1.B.this
                kotlin.jvm.functions.Function2 r1 = T1.B.a(r6)
                T1.B r6 = T1.B.this
                If.g r6 = T1.B.b(r6)
                r5.f16767a = r1
                r5.f16768b = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f16767a = r4
                r5.f16768b = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                T1.B r6 = T1.B.this
                T1.b r6 = T1.B.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                Td.L r6 = Td.L.f17438a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: T1.B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public B(O scope, Function1 onComplete, Function2 onUndeliveredElement, Function2 consumeMessage) {
        AbstractC5504s.h(scope, "scope");
        AbstractC5504s.h(onComplete, "onComplete");
        AbstractC5504s.h(onUndeliveredElement, "onUndeliveredElement");
        AbstractC5504s.h(consumeMessage, "consumeMessage");
        this.f16760a = scope;
        this.f16761b = consumeMessage;
        this.f16762c = If.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f16763d = new C2138b(0);
        C0 c02 = (C0) scope.getCoroutineContext().l(C0.f7490K);
        if (c02 != null) {
            c02.H(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(Object obj) throws Throwable {
        Object objD = this.f16762c.d(obj);
        if (objD instanceof k.a) {
            Throwable thE = If.k.e(objD);
            if (thE != null) {
                throw thE;
            }
            throw new If.q("Channel was closed normally");
        }
        if (!If.k.i(objD)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f16763d.c() == 0) {
            AbstractC1617k.d(this.f16760a, null, null, new b(null), 3, null);
        }
    }
}
