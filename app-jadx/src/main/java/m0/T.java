package m0;

import android.view.ViewStructure;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements ie.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f52929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewStructure f52930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x xVar, ViewStructure viewStructure) {
            super(4);
            this.f52929a = xVar;
            this.f52930b = viewStructure;
        }

        public final void a(int i10, int i11, int i12, int i13) {
            this.f52929a.r(this.f52930b, i10, i11, 0, 0, i12 - i10, i13 - i11);
        }

        @Override // ie.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return Td.L.f17438a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0187 A[PHI: r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x0187: PHI (r21v6 m0.I) = (r21v5 m0.I), (r21v7 m0.I) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r22v6 boolean) = (r22v5 boolean), (r22v7 boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r23v10 T0.a) = (r23v9 T0.a), (r23v11 T0.a) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r24v6 m0.K) = (r24v5 m0.K), (r24v7 m0.K) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r26v6 R0.h) = (r26v5 R0.h), (r26v7 R0.h) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r28v6 java.lang.Integer) = (r28v5 java.lang.Integer), (r28v7 java.lang.Integer) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0187: PHI (r29v6 U0.e) = (r29v5 U0.e), (r29v7 U0.e) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(android.view.ViewStructure r38, R0.n r39, android.view.autofill.AutofillId r40, java.lang.String r41, S0.b r42) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.T.a(android.view.ViewStructure, R0.n, android.view.autofill.AutofillId, java.lang.String, S0.b):void");
    }
}
