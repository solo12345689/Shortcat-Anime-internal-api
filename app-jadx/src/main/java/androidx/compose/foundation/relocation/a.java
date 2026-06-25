package androidx.compose.foundation.relocation;

import a0.C2507c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class a implements H.b {

    /* JADX INFO: renamed from: a */
    private final C2507c f26364a = new C2507c(new e[16], 0);

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0455a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f26365a;

        /* JADX INFO: renamed from: b */
        Object f26366b;

        /* JADX INFO: renamed from: c */
        int f26367c;

        /* JADX INFO: renamed from: d */
        int f26368d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f26369e;

        /* JADX INFO: renamed from: g */
        int f26371g;

        C0455a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26369e = obj;
            this.f26371g |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0068, code lost:
    
        if (r8 < r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0064 -> B:44:0x0067). Please report as a decompilation issue!!! */
    @Override // H.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(r0.C6226h r8, Zd.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.a.C0455a
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.relocation.a$a r0 = (androidx.compose.foundation.relocation.a.C0455a) r0
            int r1 = r0.f26371g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26371g = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.a$a r0 = new androidx.compose.foundation.relocation.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26369e
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f26371g
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f26368d
            int r2 = r0.f26367c
            java.lang.Object r4 = r0.f26366b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f26365a
            r0.h r5 = (r0.C6226h) r5
            Td.v.b(r9)
            r9 = r5
            goto L67
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            Td.v.b(r9)
            a0.c r9 = r7.f26364a
            int r2 = r9.p()
            if (r2 <= 0) goto L6a
            java.lang.Object[] r9 = r9.o()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L52:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.e r5 = (androidx.compose.foundation.relocation.e) r5
            r0.f26365a = r9
            r0.f26366b = r4
            r0.f26367c = r2
            r0.f26368d = r8
            r0.f26371g = r3
            java.lang.Object r5 = H.e.a(r5, r9, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            int r8 = r8 + r3
            if (r8 < r2) goto L52
        L6a:
            Td.L r8 = Td.L.f17438a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.a.a(r0.h, Zd.e):java.lang.Object");
    }

    public final C2507c b() {
        return this.f26364a;
    }
}
