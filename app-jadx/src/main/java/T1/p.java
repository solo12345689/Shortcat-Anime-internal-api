package T1;

import ie.InterfaceC5082a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f16985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f16986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f16987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5082a f16988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f16989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pf.a f16990f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f16993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f16994d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16996f;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16994d = obj;
            this.f16996f |= Integer.MIN_VALUE;
            return p.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f16999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f17001e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17003g;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17001e = obj;
            this.f17003g |= Integer.MIN_VALUE;
            return p.this.b(null, this);
        }
    }

    public p(File file, A serializer, t coordinator, InterfaceC5082a onClose) {
        AbstractC5504s.h(file, "file");
        AbstractC5504s.h(serializer, "serializer");
        AbstractC5504s.h(coordinator, "coordinator");
        AbstractC5504s.h(onClose, "onClose");
        this.f16985a = file;
        this.f16986b = serializer;
        this.f16987c = coordinator;
        this.f16988d = onClose;
        this.f16989e = new AtomicBoolean(false);
        this.f16990f = Pf.g.b(false, 1, null);
    }

    private final void f() {
        if (this.f16989e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [T1.p] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T1.p] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T1.p$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T1.p] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ie.o] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // T1.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(ie.InterfaceC5096o r8, Zd.e r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof T1.p.a
            if (r0 == 0) goto L13
            r0 = r9
            T1.p$a r0 = (T1.p.a) r0
            int r1 = r0.f16996f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16996f = r1
            goto L18
        L13:
            T1.p$a r0 = new T1.p$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f16994d
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f16996f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f16993c
            java.lang.Object r1 = r0.f16992b
            T1.c r1 = (T1.InterfaceC2139c) r1
            java.lang.Object r0 = r0.f16991a
            T1.p r0 = (T1.p) r0
            Td.v.b(r9)     // Catch: java.lang.Throwable -> L34
            goto L6b
        L34:
            r9 = move-exception
            goto L84
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            Td.v.b(r9)
            r7.f()
            Pf.a r9 = r7.f16990f
            boolean r9 = Pf.a.C0227a.b(r9, r4, r3, r4)
            T1.n r2 = new T1.n     // Catch: java.lang.Throwable -> L8d
            java.io.File r5 = r7.f16985a     // Catch: java.lang.Throwable -> L8d
            T1.A r6 = r7.f16986b     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r9)     // Catch: java.lang.Throwable -> L7e
            r0.f16991a = r7     // Catch: java.lang.Throwable -> L7e
            r0.f16992b = r2     // Catch: java.lang.Throwable -> L7e
            r0.f16993c = r9     // Catch: java.lang.Throwable -> L7e
            r0.f16996f = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r8 != r1) goto L66
            return r1
        L66:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L70
            r1 = r4
            goto L71
        L70:
            r1 = move-exception
        L71:
            if (r1 != 0) goto L7b
            if (r8 == 0) goto L7a
            Pf.a r8 = r0.f16990f
            Pf.a.C0227a.c(r8, r4, r3, r4)
        L7a:
            return r9
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            goto L92
        L7e:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            Td.AbstractC2156g.a(r9, r1)     // Catch: java.lang.Throwable -> L7c
        L8c:
            throw r9     // Catch: java.lang.Throwable -> L7c
        L8d:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L92:
            if (r8 == 0) goto L99
            Pf.a r8 = r0.f16990f
            Pf.a.C0227a.c(r8, r4, r3, r4)
        L99:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.p.a(ie.o, Zd.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [Pf.a, int] */
    @Override // T1.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(kotlin.jvm.functions.Function2 r10, Zd.e r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.p.b(kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }

    @Override // T1.F
    public t c() {
        return this.f16987c;
    }

    @Override // T1.InterfaceC2139c
    public void close() {
        this.f16989e.set(true);
        this.f16988d.invoke();
    }
}
