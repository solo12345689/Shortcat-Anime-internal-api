package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f27894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f27895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f27896f;

    public t(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f27891a = i10;
        this.f27892b = z10;
        this.f27893c = z11;
        this.f27894d = z12;
        this.f27895e = z13;
        this.f27896f = z14;
    }

    public final boolean a() {
        return this.f27893c;
    }

    public final boolean b() {
        return this.f27894d;
    }

    public final boolean c() {
        return this.f27895e;
    }

    public final int d() {
        return this.f27891a;
    }

    public final boolean e() {
        return this.f27892b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f27891a == tVar.f27891a && this.f27892b == tVar.f27892b && this.f27893c == tVar.f27893c && this.f27894d == tVar.f27894d && this.f27895e == tVar.f27895e && this.f27896f == tVar.f27896f;
    }

    public final boolean f() {
        return this.f27896f;
    }

    public int hashCode() {
        return (((((((((this.f27891a * 31) + Boolean.hashCode(this.f27892b)) * 31) + Boolean.hashCode(this.f27893c)) * 31) + Boolean.hashCode(this.f27894d)) * 31) + Boolean.hashCode(this.f27895e)) * 31) + Boolean.hashCode(this.f27896f);
    }

    public /* synthetic */ t(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }

    public t(boolean z10, boolean z11, boolean z12, boolean z13) {
        this(z10, z11, z12, u.f27897a, true, z13);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ t(boolean r2, boolean r3, boolean r4, androidx.compose.ui.window.u r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 1
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            androidx.compose.ui.window.u r5 = androidx.compose.ui.window.u.f27897a
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.t.<init>(boolean, boolean, boolean, androidx.compose.ui.window.u, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public t(boolean z10, boolean z11, boolean z12, u uVar, boolean z13, boolean z14) {
        this(z10, z11, z12, uVar, z13, z14, false);
    }

    public t(boolean z10, boolean z11, boolean z12, u uVar, boolean z13, boolean z14, boolean z15) {
        this(b.g(z10, uVar, z14), uVar == u.f27897a, z11, z12, z13, z15);
    }
}
