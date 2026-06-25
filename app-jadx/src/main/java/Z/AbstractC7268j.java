package z;

import E0.C1307q;
import E0.InterfaceC1292b;
import E0.Q;
import Td.L;
import ae.AbstractC2605b;
import androidx.compose.ui.platform.A1;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.N;
import r0.C6224f;

/* JADX INFO: renamed from: z.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7268j {

    /* JADX INFO: renamed from: a */
    private static final float f65360a;

    /* JADX INFO: renamed from: b */
    private static final float f65361b;

    /* JADX INFO: renamed from: c */
    private static final float f65362c;

    /* JADX INFO: renamed from: z.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f65363a;

        /* JADX INFO: renamed from: b */
        Object f65364b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f65365c;

        /* JADX INFO: renamed from: d */
        int f65366d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65365c = obj;
            this.f65366d |= Integer.MIN_VALUE;
            return AbstractC7268j.b(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: z.j$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f65367a;

        /* JADX INFO: renamed from: b */
        Object f65368b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f65369c;

        /* JADX INFO: renamed from: d */
        int f65370d;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65369c = obj;
            this.f65370d |= Integer.MIN_VALUE;
            return AbstractC7268j.c(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: z.j$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f65371a;

        /* JADX INFO: renamed from: b */
        int f65372b;

        /* JADX INFO: renamed from: c */
        int f65373c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Object f65374d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ N f65375e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ N f65376f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N n10, N n11, Zd.e eVar) {
            super(2, eVar);
            this.f65375e = n10;
            this.f65376f = n11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = new c(this.f65375e, this.f65376f, eVar);
            cVar.f65374d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1292b interfaceC1292b, Zd.e eVar) {
            return ((c) create(interfaceC1292b, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:106:0x009a, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x00cd A[EDGE_INSN: B:141:0x00cd->B:117:0x00cd BREAK  A[LOOP:0: B:112:0x00ba->B:116:0x00ca], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x006f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x005f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x00ac -> B:111:0x00af). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z.AbstractC7268j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: z.j$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f65377a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function1 function1) {
            super(3);
            this.f65377a = function1;
        }

        public final void a(E0.C c10, E0.C c11, long j10) {
            this.f65377a.invoke(C6224f.d(c11.h()));
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((E0.C) obj, (E0.C) obj2, ((C6224f) obj3).u());
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: z.j$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5082a f65378a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC5082a interfaceC5082a) {
            super(1);
            this.f65378a = interfaceC5082a;
        }

        public final void a(E0.C c10) {
            this.f65378a.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E0.C) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: z.j$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final f f65379a = new f();

        f() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: z.j$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f65380a;

        /* JADX INFO: renamed from: b */
        Object f65381b;

        /* JADX INFO: renamed from: c */
        Object f65382c;

        /* JADX INFO: renamed from: d */
        Object f65383d;

        /* JADX INFO: renamed from: e */
        Object f65384e;

        /* JADX INFO: renamed from: f */
        Object f65385f;

        /* JADX INFO: renamed from: g */
        boolean f65386g;

        /* JADX INFO: renamed from: h */
        float f65387h;

        /* JADX INFO: renamed from: i */
        int f65388i;

        /* JADX INFO: renamed from: j */
        private /* synthetic */ Object f65389j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5082a f65390k;

        /* JADX INFO: renamed from: l */
        final /* synthetic */ M f65391l;

        /* JADX INFO: renamed from: m */
        final /* synthetic */ q f65392m;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC5096o f65393n;

        /* JADX INFO: renamed from: o */
        final /* synthetic */ Function2 f65394o;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ InterfaceC5082a f65395p;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Function1 f65396q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC5082a interfaceC5082a, M m10, q qVar, InterfaceC5096o interfaceC5096o, Function2 function2, InterfaceC5082a interfaceC5082a2, Function1 function1, Zd.e eVar) {
            super(2, eVar);
            this.f65390k = interfaceC5082a;
            this.f65391l = m10;
            this.f65392m = qVar;
            this.f65393n = interfaceC5096o;
            this.f65394o = function2;
            this.f65395p = interfaceC5082a2;
            this.f65396q = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            g gVar = new g(this.f65390k, this.f65391l, this.f65392m, this.f65393n, this.f65394o, this.f65395p, this.f65396q, eVar);
            gVar.f65389j = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1292b interfaceC1292b, Zd.e eVar) {
            return ((g) create(interfaceC1292b, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:175:0x00f9, code lost:
        
            if (r0 == false) goto L230;
         */
        /* JADX WARN: Code restructure failed: missing block: B:232:0x024e, code lost:
        
            if (z.AbstractC7268j.g(r2.F0(), r0) != false) goto L233;
         */
        /* JADX WARN: Code restructure failed: missing block: B:236:0x0275, code lost:
        
            if (r10 != r6) goto L238;
         */
        /* JADX WARN: Code restructure failed: missing block: B:272:0x02fb, code lost:
        
            if (((r2 != null ? r2 == z.q.Vertical ? r0.C6224f.n(r7) : r0.C6224f.m(r7) : r0.C6224f.k(r7)) == 0.0f) == false) goto L273;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:250:0x02b2, B:261:0x02db], limit reached: 134 */
        /* JADX WARN: Removed duplicated region for block: B:178:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0145 A[PHI: r0 r1 r2 r4 r5 r13 r14 r15
  0x0145: PHI (r0v9 float) = (r0v10 float), (r0v30 float) binds: [B:181:0x0141, B:161:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r1v8 E0.C) = (r1v10 E0.C), (r1v26 E0.C) binds: [B:181:0x0141, B:161:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r2v10 E0.b) = (r2v13 E0.b), (r2v29 E0.b) binds: [B:181:0x0141, B:161:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r4v7 E0.b) = (r4v8 E0.b), (r4v18 E0.b) binds: [B:181:0x0141, B:161:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r5v3 z.D) = (r5v4 z.D), (r5v14 z.D) binds: [B:181:0x0141, B:161:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r13v4 java.lang.Object) = (r13v9 java.lang.Object), (r13v20 java.lang.Object) binds: [B:181:0x0141, B:161:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r14v2 kotlin.jvm.internal.M) = (r14v4 kotlin.jvm.internal.M), (r14v16 kotlin.jvm.internal.M) binds: [B:181:0x0141, B:161:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r15v0 kotlin.jvm.internal.M) = (r15v1 kotlin.jvm.internal.M), (r15v10 kotlin.jvm.internal.M) binds: [B:181:0x0141, B:161:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:292:0x0171 A[SYNTHETIC] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0111 -> B:224:0x0207). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x017b -> B:193:0x017d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x01cb -> B:224:0x0207). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x01f7 -> B:221:0x01fd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:236:0x0275 -> B:238:0x0278). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 826
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z.AbstractC7268j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: z.j$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f65397a;

        /* JADX INFO: renamed from: b */
        Object f65398b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f65399c;

        /* JADX INFO: renamed from: d */
        int f65400d;

        h(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65399c = obj;
            this.f65400d |= Integer.MIN_VALUE;
            return AbstractC7268j.f(null, 0L, null, this);
        }
    }

    static {
        float fN = C5015h.n((float) 0.125d);
        f65360a = fN;
        float fN2 = C5015h.n(18);
        f65361b = fN2;
        f65362c = fN / fN2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ca, code lost:
    
        if (E0.r.j(r11) != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0067 -> B:79:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(E0.InterfaceC1292b r17, long r18, Zd.e r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.AbstractC7268j.b(E0.b, long, Zd.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(E0.InterfaceC1292b r9, long r10, Zd.e r12) {
        /*
            boolean r0 = r12 instanceof z.AbstractC7268j.b
            if (r0 == 0) goto L13
            r0 = r12
            z.j$b r0 = (z.AbstractC7268j.b) r0
            int r1 = r0.f65370d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65370d = r1
            goto L18
        L13:
            z.j$b r0 = new z.j$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f65369c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f65370d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r9 = r0.f65368b
            kotlin.jvm.internal.N r9 = (kotlin.jvm.internal.N) r9
            java.lang.Object r10 = r0.f65367a
            E0.C r10 = (E0.C) r10
            Td.v.b(r12)     // Catch: E0.C1309t -> L9b
            goto L99
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            Td.v.b(r12)
            E0.q r12 = r9.F0()
            boolean r12 = g(r12, r10)
            if (r12 == 0) goto L48
            return r4
        L48:
            E0.q r12 = r9.F0()
            java.util.List r12 = r12.c()
            int r2 = r12.size()
            r5 = 0
        L55:
            if (r5 >= r2) goto L6c
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            E0.C r7 = (E0.C) r7
            long r7 = r7.f()
            boolean r7 = E0.B.d(r7, r10)
            if (r7 == 0) goto L69
            goto L6d
        L69:
            int r5 = r5 + 1
            goto L55
        L6c:
            r6 = r4
        L6d:
            r10 = r6
            E0.C r10 = (E0.C) r10
            if (r10 != 0) goto L73
            return r4
        L73:
            kotlin.jvm.internal.N r11 = new kotlin.jvm.internal.N
            r11.<init>()
            kotlin.jvm.internal.N r12 = new kotlin.jvm.internal.N
            r12.<init>()
            r12.f52259a = r10
            androidx.compose.ui.platform.A1 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            z.j$c r2 = new z.j$c     // Catch: E0.C1309t -> L9a
            r2.<init>(r12, r11, r4)     // Catch: E0.C1309t -> L9a
            r0.f65367a = r10     // Catch: E0.C1309t -> L9a
            r0.f65368b = r11     // Catch: E0.C1309t -> L9a
            r0.f65370d = r3     // Catch: E0.C1309t -> L9a
            java.lang.Object r9 = r9.K(r5, r2, r0)     // Catch: E0.C1309t -> L9a
            if (r9 != r1) goto L99
            return r1
        L99:
            return r4
        L9a:
            r9 = r11
        L9b:
            java.lang.Object r9 = r9.f52259a
            E0.C r9 = (E0.C) r9
            if (r9 != 0) goto La2
            goto La3
        La2:
            r10 = r9
        La3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z.AbstractC7268j.c(E0.b, long, Zd.e):java.lang.Object");
    }

    public static final Object d(E0.L l10, InterfaceC5096o interfaceC5096o, Function1 function1, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, q qVar, Function2 function2, Zd.e eVar) {
        Object objC = o.c(l10, new g(interfaceC5082a2, new M(), qVar, interfaceC5096o, function2, interfaceC5082a, function1, null), eVar);
        return objC == AbstractC2605b.f() ? objC : L.f17438a;
    }

    public static final Object e(E0.L l10, Function1 function1, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, Function2 function2, Zd.e eVar) {
        Object objD = d(l10, new d(function1), new e(interfaceC5082a), interfaceC5082a2, f.f65379a, null, function2, eVar);
        return objD == AbstractC2605b.f() ? objD : L.f17438a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0048 -> B:45:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(E0.InterfaceC1292b r4, long r5, kotlin.jvm.functions.Function1 r7, Zd.e r8) {
        /*
            boolean r0 = r8 instanceof z.AbstractC7268j.h
            if (r0 == 0) goto L13
            r0 = r8
            z.j$h r0 = (z.AbstractC7268j.h) r0
            int r1 = r0.f65400d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65400d = r1
            goto L18
        L13:
            z.j$h r0 = new z.j$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f65399c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f65400d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f65398b
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r0.f65397a
            E0.b r5 = (E0.InterfaceC1292b) r5
            Td.v.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Td.v.b(r8)
        L3e:
            r0.f65397a = r4
            r0.f65398b = r7
            r0.f65400d = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            E0.C r8 = (E0.C) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L55:
            boolean r5 = E0.r.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.f()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: z.AbstractC7268j.f(E0.b, long, kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    public static final boolean g(C1307q c1307q, long j10) {
        Object obj;
        List listC = c1307q.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i10);
            if (E0.B.d(((E0.C) obj).f(), j10)) {
                break;
            }
            i10++;
        }
        E0.C c10 = (E0.C) obj;
        if (c10 != null && c10.i()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float h(A1 a12, int i10) {
        return Q.g(i10, Q.f4086a.b()) ? a12.g() * f65362c : a12.g();
    }
}
