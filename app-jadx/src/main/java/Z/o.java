package z;

import E0.InterfaceC1292b;
import Td.L;
import ae.AbstractC2605b;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f65406a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f65407b;

        /* JADX INFO: renamed from: c */
        int f65408c;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65407b = obj;
            this.f65408c |= Integer.MIN_VALUE;
            return o.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a */
        int f65409a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f65410b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Zd.i f65411c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function2 f65412d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Zd.i iVar, Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f65411c = iVar;
            this.f65412d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f65411c, this.f65412d, eVar);
            bVar.f65410b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1292b interfaceC1292b, Zd.e eVar) {
            return ((b) create(interfaceC1292b, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0059, code lost:
        
            if (r8 != r0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0070, code lost:
        
            if (r8 == r0) goto L76;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [E0.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [E0.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.functions.Function2] */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v8 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0059 -> B:54:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0070 -> B:54:0x0028). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r7.f65409a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r7.f65410b
                E0.b r1 = (E0.InterfaceC1292b) r1
                Td.v.b(r8)
                goto L28
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f65410b
                E0.b r1 = (E0.InterfaceC1292b) r1
                Td.v.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r8 = r1
                goto L3b
            L2a:
                r8 = move-exception
                goto L60
            L2c:
                java.lang.Object r1 = r7.f65410b
                E0.b r1 = (E0.InterfaceC1292b) r1
                Td.v.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
                goto L51
            L34:
                Td.v.b(r8)
                java.lang.Object r8 = r7.f65410b
                E0.b r8 = (E0.InterfaceC1292b) r8
            L3b:
                Zd.i r1 = r7.f65411c
                boolean r1 = Gf.F0.n(r1)
                if (r1 == 0) goto L74
                kotlin.jvm.functions.Function2 r1 = r7.f65412d     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f65410b = r8     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f65409a = r4     // Catch: java.util.concurrent.CancellationException -> L5c
                java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5c
                if (r1 != r0) goto L50
                goto L72
            L50:
                r1 = r8
            L51:
                r7.f65410b = r1     // Catch: java.util.concurrent.CancellationException -> L2a
                r7.f65409a = r3     // Catch: java.util.concurrent.CancellationException -> L2a
                java.lang.Object r8 = z.o.b(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L2a
                if (r8 != r0) goto L28
                goto L72
            L5c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L60:
                Zd.i r5 = r7.f65411c
                boolean r5 = Gf.F0.n(r5)
                if (r5 == 0) goto L73
                r7.f65410b = r1
                r7.f65409a = r2
                java.lang.Object r8 = z.o.b(r1, r7)
                if (r8 != r0) goto L28
            L72:
                return r0
            L73:
                throw r8
            L74:
                Td.L r8 = Td.L.f17438a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: z.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean a(InterfaceC1292b interfaceC1292b) {
        List listC = interfaceC1292b.F0().c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((E0.C) listC.get(i10)).i()) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003c, code lost:
    
        if (a(r6) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0048 -> B:48:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(E0.InterfaceC1292b r6, Zd.e r7) {
        /*
            boolean r0 = r7 instanceof z.o.a
            if (r0 == 0) goto L13
            r0 = r7
            z.o$a r0 = (z.o.a) r0
            int r1 = r0.f65408c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65408c = r1
            goto L18
        L13:
            z.o$a r0 = new z.o$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f65407b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f65408c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f65406a
            E0.b r6 = (E0.InterfaceC1292b) r6
            Td.v.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            Td.v.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L68
        L3e:
            E0.s r7 = E0.EnumC1308s.f4180c
            r0.f65406a = r6
            r0.f65408c = r3
            java.lang.Object r7 = r6.p0(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            E0.q r7 = (E0.C1307q) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            E0.C r5 = (E0.C) r5
            boolean r5 = r5.i()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            Td.L r6 = Td.L.f17438a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.o.b(E0.b, Zd.e):java.lang.Object");
    }

    public static final Object c(E0.L l10, Function2 function2, Zd.e eVar) {
        Object objK1 = l10.k1(new b(eVar.getContext(), function2, null), eVar);
        return objK1 == AbstractC2605b.f() ? objK1 : L.f17438a;
    }
}
