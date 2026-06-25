package Eb;

import Cf.l;
import Td.L;
import Ud.AbstractC2279u;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a */
    private final Context f5882a;

    /* JADX INFO: renamed from: b */
    private final Uri f5883b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f5884a;

        /* JADX INFO: renamed from: b */
        Object f5885b;

        /* JADX INFO: renamed from: c */
        int f5886c;

        /* JADX INFO: renamed from: d */
        int f5887d;

        /* JADX INFO: renamed from: e */
        int f5888e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f5889f;

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(Cf.k kVar, Zd.e eVar) {
            return ((a) create(kVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = i.this.new a(eVar);
            aVar.f5889f = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0045, code lost:
        
            if (r1.d(r12, r11) == r0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
        
            if (r7.e(r12, r11) == r0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0091 -> B:51:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r11.f5888e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L33
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L23
                int r1 = r11.f5887d
                int r4 = r11.f5886c
                java.lang.Object r5 = r11.f5885b
                Eb.i r5 = (Eb.i) r5
                java.lang.Object r6 = r11.f5884a
                Y1.a[] r6 = (Y1.a[]) r6
                java.lang.Object r7 = r11.f5889f
                Cf.k r7 = (Cf.k) r7
                Td.v.b(r12)
                goto L94
            L23:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2b:
                java.lang.Object r1 = r11.f5889f
                Cf.k r1 = (Cf.k) r1
                Td.v.b(r12)
                goto L48
            L33:
                Td.v.b(r12)
                java.lang.Object r12 = r11.f5889f
                r1 = r12
                Cf.k r1 = (Cf.k) r1
                Eb.i r12 = Eb.i.this
                r11.f5889f = r1
                r11.f5888e = r3
                java.lang.Object r12 = r1.d(r12, r11)
                if (r12 != r0) goto L48
                goto L93
            L48:
                Eb.i r12 = Eb.i.this
                boolean r12 = r12.isDirectory()
                if (r12 == 0) goto L96
                Eb.i r12 = Eb.i.this
                Y1.a r12 = Eb.i.b(r12)
                if (r12 == 0) goto L96
                Y1.a[] r12 = r12.p()
                if (r12 == 0) goto L96
                Eb.i r4 = Eb.i.this
                int r5 = r12.length
                r6 = 0
                r7 = r1
                r1 = r5
                r5 = r4
                r4 = r6
                r6 = r12
            L67:
                if (r4 >= r1) goto L96
                r12 = r6[r4]
                Eb.i r8 = new Eb.i
                android.content.Context r9 = Eb.i.a(r5)
                android.net.Uri r12 = r12.k()
                java.lang.String r10 = "getUri(...)"
                kotlin.jvm.internal.AbstractC5504s.g(r12, r10)
                r8.<init>(r9, r12)
                Cf.i r12 = r8.N()
                r11.f5889f = r7
                r11.f5884a = r6
                r11.f5885b = r5
                r11.f5886c = r4
                r11.f5887d = r1
                r11.f5888e = r2
                java.lang.Object r12 = r7.e(r12, r11)
                if (r12 != r0) goto L94
            L93:
                return r0
            L94:
                int r4 = r4 + r3
                goto L67
            L96:
                Td.L r12 = Td.L.f17438a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: Eb.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i(Context context, Uri uri) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(uri, "uri");
        this.f5882a = context;
        this.f5883b = uri;
    }

    public final Y1.a d() {
        List<String> pathSegments = c().getPathSegments();
        AbstractC5504s.g(pathSegments, "getPathSegments(...)");
        String str = (String) AbstractC2279u.p0(pathSegments, 0);
        if (str == null) {
            str = "tree";
        }
        return AbstractC5504s.c(str, "document") ? Y1.a.g(this.f5882a, c()) : Y1.a.h(this.f5882a, c());
    }

    @Override // Eb.k
    public InputStream L() throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = this.f5882a.getContentResolver().openInputStream(c());
        if (inputStreamOpenInputStream != null) {
            return inputStreamOpenInputStream;
        }
        throw new IllegalStateException("Unable to open input stream for URI: " + c());
    }

    @Override // Eb.k
    public k M(String mimeType, String displayName) {
        Uri uriK;
        AbstractC5504s.h(mimeType, "mimeType");
        AbstractC5504s.h(displayName, "displayName");
        Y1.a aVarD = d();
        Y1.a aVarD2 = aVarD != null ? aVarD.d(mimeType, displayName) : null;
        if (aVarD2 == null || (uriK = aVarD2.k()) == null) {
            return null;
        }
        return new i(this.f5882a, uriK);
    }

    @Override // Eb.k
    public Cf.i N() {
        return l.b(new a(null));
    }

    @Override // Eb.k
    public k O(String displayName) {
        Uri uriK;
        AbstractC5504s.h(displayName, "displayName");
        Y1.a aVarD = d();
        Y1.a aVarC = aVarD != null ? aVarD.c(displayName) : null;
        if (aVarC == null || (uriK = aVarC.k()) == null) {
            return null;
        }
        return new i(this.f5882a, uriK);
    }

    @Override // Eb.k
    public OutputStream P(boolean z10) throws FileNotFoundException {
        OutputStream outputStreamOpenOutputStream = this.f5882a.getContentResolver().openOutputStream(c(), z10 ? "wa" : "w");
        if (outputStreamOpenOutputStream != null) {
            return outputStreamOpenOutputStream;
        }
        throw new IllegalStateException("Unable to open output stream for URI: " + c());
    }

    @Override // Eb.k
    public List Q() {
        Y1.a[] aVarArrP;
        Y1.a aVarD = d();
        if (aVarD == null || (aVarArrP = aVarD.p()) == null) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(aVarArrP.length);
        for (Y1.a aVar : aVarArrP) {
            Context context = this.f5882a;
            Uri uriK = aVar.k();
            AbstractC5504s.g(uriK, "getUri(...)");
            arrayList.add(new i(context, uriK));
        }
        return arrayList;
    }

    @Override // Eb.k
    public boolean R() {
        Y1.a aVarD = d();
        return aVarD != null && j.a(aVarD);
    }

    @Override // Eb.k
    public Long S() {
        Y1.a aVarD = d();
        if (aVarD != null) {
            return Long.valueOf(aVarD.n());
        }
        return null;
    }

    @Override // Eb.k
    public Uri T(Ub.d appContext) {
        AbstractC5504s.h(appContext, "appContext");
        return c();
    }

    @Override // Eb.k
    public Uri c() {
        return this.f5883b;
    }

    @Override // Eb.k
    public boolean delete() {
        Y1.a aVarD = d();
        return aVarD != null && aVarD.e();
    }

    @Override // Eb.k
    public boolean exists() {
        Y1.a aVarD = d();
        return aVarD != null && aVarD.f();
    }

    @Override // Eb.k
    public Long getCreationTime() {
        return null;
    }

    @Override // Eb.k
    public String getFileName() {
        Y1.a aVarD = d();
        if (aVarD != null) {
            return aVarD.i();
        }
        return null;
    }

    @Override // Eb.k
    public String getType() {
        Y1.a aVarD = d();
        if (aVarD != null) {
            return aVarD.j();
        }
        return null;
    }

    @Override // Eb.k
    public boolean isDirectory() {
        Y1.a aVarD = d();
        return aVarD != null && aVarD.l();
    }

    @Override // Eb.k
    public boolean isFile() {
        Y1.a aVarD = d();
        return aVarD != null && aVarD.m();
    }

    @Override // Eb.k
    public long length() {
        Y1.a aVarD = d();
        if (aVarD != null) {
            return aVarD.o();
        }
        return 0L;
    }
}
