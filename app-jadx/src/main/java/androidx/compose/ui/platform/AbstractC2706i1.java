package androidx.compose.ui.platform;

import Y.AbstractC2394b1;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2706i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2394b1 f27462a = Y.H.j(a.f27463a);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.i1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27463a = new a();

        a() {
            super(0);
        }

        public final AbstractC2729r0 a() {
            return null;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.i1$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f27465b;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27464a = obj;
            this.f27465b |= Integer.MIN_VALUE;
            return AbstractC2706i1.b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.i1$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f27467b;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27466a = obj;
            this.f27467b |= Integer.MIN_VALUE;
            return AbstractC2706i1.c(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.platform.InterfaceC2703h1 r4, kotlin.jvm.functions.Function2 r5, Zd.e r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AbstractC2706i1.b
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.i1$b r0 = (androidx.compose.ui.platform.AbstractC2706i1.b) r0
            int r1 = r0.f27465b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27465b = r1
            goto L18
        L13:
            androidx.compose.ui.platform.i1$b r0 = new androidx.compose.ui.platform.i1$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27464a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f27465b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            Td.v.b(r6)
            goto L5d
        L31:
            Td.v.b(r6)
            androidx.compose.ui.e$c r6 = r4.getNode()
            boolean r6 = r6.isAttached()
            if (r6 == 0) goto L63
            K0.p0 r6 = K0.AbstractC1796k.o(r4)
            K0.J r4 = K0.AbstractC1796k.n(r4)
            Y.I r4 = r4.Q()
            Y.b1 r2 = androidx.compose.ui.platform.AbstractC2706i1.f27462a
            java.lang.Object r4 = r4.a(r2)
            android.support.v4.media.session.b.a(r4)
            r0.f27465b = r3
            r4 = 0
            java.lang.Object r4 = c(r6, r4, r5, r0)
            if (r4 != r1) goto L5d
            return r1
        L5d:
            Td.k r4 = new Td.k
            r4.<init>()
            throw r4
        L63:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractC2706i1.b(androidx.compose.ui.platform.h1, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(K0.p0 r3, androidx.compose.ui.platform.AbstractC2729r0 r4, kotlin.jvm.functions.Function2 r5, Zd.e r6) {
        /*
            boolean r4 = r6 instanceof androidx.compose.ui.platform.AbstractC2706i1.c
            if (r4 == 0) goto L13
            r4 = r6
            androidx.compose.ui.platform.i1$c r4 = (androidx.compose.ui.platform.AbstractC2706i1.c) r4
            int r0 = r4.f27467b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f27467b = r0
            goto L18
        L13:
            androidx.compose.ui.platform.i1$c r4 = new androidx.compose.ui.platform.i1$c
            r4.<init>(r6)
        L18:
            java.lang.Object r6 = r4.f27466a
            java.lang.Object r0 = ae.AbstractC2605b.f()
            int r1 = r4.f27467b
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L39
            r3 = 2
            if (r1 == r3) goto L30
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L30:
            Td.v.b(r6)
            Td.k r3 = new Td.k
            r3.<init>()
            throw r3
        L39:
            Td.v.b(r6)
            goto L49
        L3d:
            Td.v.b(r6)
            r4.f27467b = r2
            java.lang.Object r3 = r3.x(r5, r4)
            if (r3 != r0) goto L49
            return r0
        L49:
            Td.k r3 = new Td.k
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractC2706i1.c(K0.p0, androidx.compose.ui.platform.r0, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }
}
