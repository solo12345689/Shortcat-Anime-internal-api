package com.facebook.react.devsupport;

import com.facebook.react.devsupport.n0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import dg.C;
import dg.C4618A;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import tg.AbstractC6678c;
import tg.C6683h;
import tg.InterfaceC6685j;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.devsupport.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3212b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0614b f36708c = new C0614b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4618A f36709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4624e f36710b;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0613a f36711c = new C0613a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36713b;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0613a {
            public /* synthetic */ C0613a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0613a() {
            }
        }

        public final void a(int i10) {
            this.f36713b = i10;
        }

        public final void b(String str) {
            this.f36712a = str;
        }

        public final String c() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", this.f36712a);
                jSONObject.put("filesChangedCount", this.f36713b);
                return jSONObject.toString();
            } catch (JSONException e10) {
                AbstractC7283a.n("BundleDownloader", "Can't serialize bundle info: ", e10);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0614b {
        public /* synthetic */ C0614b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(String str, dg.t tVar, a aVar) {
            aVar.b(str);
            String strD = tVar.d("X-Metro-Files-Changed-Count");
            if (strD != null) {
                try {
                    aVar.a(Integer.parseInt(strD));
                } catch (NumberFormatException e10) {
                    aVar.a(-2);
                    AbstractC7283a.n("BundleDownloader", "Can't populate bundle info: ", e10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(InterfaceC6685j interfaceC6685j, File file) throws IOException {
            tg.X xC = AbstractC6678c.a().c(file);
            try {
                interfaceC6685j.U(xC);
                fe.c.a(xC, null);
                return true;
            } finally {
            }
        }

        private C0614b() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC4625f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c7.c f36715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f36716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f36717d;

        c(c7.c cVar, File file, a aVar) {
            this.f36715b = cVar;
            this.f36716c = file;
            this.f36717d = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            if (r11.u1() == true) goto L10;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v15, types: [dg.E] */
        /* JADX WARN: Type inference failed for: r11v16, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v19 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v20 */
        /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5, types: [dg.e] */
        /* JADX WARN: Type inference failed for: r11v6 */
        @Override // dg.InterfaceC4625f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(dg.InterfaceC4624e r11, dg.E r12) throws java.io.IOException {
            /*
                r10 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.AbstractC5504s.h(r11, r0)
                java.lang.String r11 = "response"
                kotlin.jvm.internal.AbstractC5504s.h(r12, r11)
                com.facebook.react.devsupport.b r0 = com.facebook.react.devsupport.C3212b.this
                java.io.File r4 = r10.f36716c
                com.facebook.react.devsupport.b$a r5 = r10.f36717d
                c7.c r6 = r10.f36715b
                dg.e r11 = com.facebook.react.devsupport.C3212b.a(r0)     // Catch: java.lang.Throwable -> L79
                r8 = 0
                if (r11 == 0) goto L26
                dg.e r11 = com.facebook.react.devsupport.C3212b.a(r0)     // Catch: java.lang.Throwable -> L79
                r1 = 1
                if (r11 == 0) goto L30
                boolean r11 = r11.u1()     // Catch: java.lang.Throwable -> L29
                if (r11 != r1) goto L30
            L26:
                r11 = r12
                goto Lad
            L29:
                r0 = move-exception
                r11 = r0
                r9 = r12
                r12 = r11
                r11 = r9
                goto Lb4
            L30:
                com.facebook.react.devsupport.C3212b.d(r0, r8)     // Catch: java.lang.Throwable -> L79
                dg.C r11 = r12.h()     // Catch: java.lang.Throwable -> L79
                dg.u r11 = r11.d()     // Catch: java.lang.Throwable -> L79
                java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L79
                java.lang.String r2 = "content-type"
                r3 = 2
                java.lang.String r2 = dg.E.D(r12, r2, r8, r3, r8)     // Catch: java.lang.Throwable -> L79
                if (r2 != 0) goto L4a
                java.lang.String r2 = ""
            L4a:
                java.lang.String r3 = "multipart/mixed;.*boundary=\"([^\"]+)\""
                java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Throwable -> L79
                java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch: java.lang.Throwable -> L79
                int r2 = r2.length()     // Catch: java.lang.Throwable -> L79
                if (r2 <= 0) goto L7c
                boolean r2 = r3.find()     // Catch: java.lang.Throwable -> L79
                if (r2 == 0) goto L7c
                java.lang.String r1 = r3.group(r1)     // Catch: java.lang.Throwable -> L79
                java.lang.Object r1 = Q6.a.c(r1)     // Catch: java.lang.Throwable -> L79
                r3 = r1
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L79
                kotlin.jvm.internal.AbstractC5504s.e(r3)     // Catch: java.lang.Throwable -> L79
                r1 = r11
                r2 = r12
                com.facebook.react.devsupport.C3212b.c(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L75
                r11 = r2
                goto L9f
            L75:
                r0 = move-exception
                r11 = r2
            L77:
                r12 = r0
                goto Lb4
            L79:
                r0 = move-exception
                r11 = r12
                goto L77
            L7c:
                r1 = r11
                r11 = r12
                dg.F r12 = r11.a()     // Catch: java.lang.Throwable -> La5
                if (r12 == 0) goto L9a
                int r2 = r11.b()     // Catch: java.lang.Throwable -> L97
                dg.t r3 = r11.g()     // Catch: java.lang.Throwable -> L97
                r7 = r6
                r6 = r5
                r5 = r4
                tg.j r4 = r12.k()     // Catch: java.lang.Throwable -> L97
                com.facebook.react.devsupport.C3212b.b(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L97
                goto L9a
            L97:
                r0 = move-exception
                r1 = r0
                goto La7
            L9a:
                Td.L r0 = Td.L.f17438a     // Catch: java.lang.Throwable -> L97
                fe.c.a(r12, r8)     // Catch: java.lang.Throwable -> La5
            L9f:
                Td.L r12 = Td.L.f17438a     // Catch: java.lang.Throwable -> La5
                fe.c.a(r11, r8)
                return
            La5:
                r0 = move-exception
                goto L77
            La7:
                throw r1     // Catch: java.lang.Throwable -> La8
            La8:
                r0 = move-exception
                fe.c.a(r12, r1)     // Catch: java.lang.Throwable -> La5
                throw r0     // Catch: java.lang.Throwable -> La5
            Lad:
                com.facebook.react.devsupport.C3212b.d(r0, r8)     // Catch: java.lang.Throwable -> La5
                fe.c.a(r11, r8)
                return
            Lb4:
                throw r12     // Catch: java.lang.Throwable -> Lb5
            Lb5:
                r0 = move-exception
                fe.c.a(r11, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.C3212b.c.h(dg.e, dg.E):void");
        }

        @Override // dg.InterfaceC4625f
        public void j(InterfaceC4624e call, IOException e10) {
            InterfaceC4624e interfaceC4624e;
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(e10, "e");
            if (C3212b.this.f36710b == null || ((interfaceC4624e = C3212b.this.f36710b) != null && interfaceC4624e.u1())) {
                C3212b.this.f36710b = null;
                return;
            }
            C3212b.this.f36710b = null;
            String string = call.z().d().toString();
            this.f36715b.onFailure(U6.b.f19359b.a(string, "Could not connect to development server.", "URL: " + string, e10));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements n0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ dg.E f36718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3212b f36719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ File f36721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f36722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c7.c f36723f;

        d(dg.E e10, C3212b c3212b, String str, File file, a aVar, c7.c cVar) {
            this.f36718a = e10;
            this.f36719b = c3212b;
            this.f36720c = str;
            this.f36721d = file;
            this.f36722e = aVar;
            this.f36723f = cVar;
        }

        @Override // com.facebook.react.devsupport.n0.a
        public void a(Map headers, long j10, long j11) {
            AbstractC5504s.h(headers, "headers");
            if (AbstractC5504s.c("application/javascript", headers.get("Content-Type"))) {
                c7.c cVar = this.f36723f;
                long j12 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                cVar.b("Downloading", Integer.valueOf((int) (j10 / j12)), Integer.valueOf((int) (j11 / j12)));
            }
        }

        @Override // com.facebook.react.devsupport.n0.a
        public void b(Map headers, C6683h body, boolean z10) throws IOException {
            AbstractC5504s.h(headers, "headers");
            AbstractC5504s.h(body, "body");
            if (z10) {
                int iB = this.f36718a.b();
                if (headers.containsKey("X-Http-Status")) {
                    iB = Integer.parseInt((String) headers.getOrDefault("X-Http-Status", "0"));
                }
                this.f36719b.f(this.f36720c, iB, dg.t.f45580b.a(headers), body, this.f36721d, this.f36722e, this.f36723f);
                return;
            }
            if (headers.containsKey("Content-Type") && AbstractC5504s.c(headers.get("Content-Type"), "application/json")) {
                try {
                    JSONObject jSONObject = new JSONObject(body.M1());
                    this.f36723f.b(jSONObject.has("status") ? jSONObject.getString("status") : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                } catch (JSONException e10) {
                    AbstractC7283a.m("ReactNative", "Error parsing progress JSON. " + e10);
                }
            }
        }
    }

    public C3212b(C4618A client) {
        AbstractC5504s.h(client, "client");
        this.f36709a = client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(String str, int i10, dg.t tVar, InterfaceC6685j interfaceC6685j, File file, a aVar, c7.c cVar) throws IOException {
        if (i10 == 200) {
            if (aVar != null) {
                f36708c.c(str, tVar, aVar);
            }
            File file2 = new File(file.getPath() + ".tmp");
            if (!f36708c.d(interfaceC6685j, file2) || file2.renameTo(file)) {
                cVar.a();
                return;
            }
            throw new IOException("Couldn't rename " + file2 + " to " + file);
        }
        String strM1 = interfaceC6685j.M1();
        U6.b bVarC = U6.b.f19359b.c(str, strM1);
        if (bVarC != null) {
            cVar.onFailure(bVarC);
            return;
        }
        String str2 = "The development server returned response error code: " + i10 + "\n\nURL: " + str + "\n\nBody:\n" + strM1;
        AbstractC5504s.g(str2, "toString(...)");
        cVar.onFailure(new U6.b(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str, dg.E e10, String str2, File file, a aVar, c7.c cVar) {
        if (e10.a() == null) {
            cVar.onFailure(new U6.b(Df.r.j("\n                    Error while reading multipart response.\n                    \n                    Response body was empty: " + e10.b() + "\n                    \n                    URL: " + str + "\n                    \n                    \n                    ")));
            return;
        }
        dg.F fA = e10.a();
        InterfaceC6685j interfaceC6685jK = fA != null ? fA.k() : null;
        if (interfaceC6685jK == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (new n0(interfaceC6685jK, str2).d(new d(e10, this, str, file, aVar, cVar))) {
            return;
        }
        cVar.onFailure(new U6.b(Df.r.j("\n                    Error while reading multipart response.\n                    \n                    Response code: " + e10.b() + "\n                    \n                    URL: " + str + "\n                    \n                    \n                    ")));
    }

    public final void e(c7.c callback, File outputFile, String str, a aVar, C.a requestBuilder) {
        AbstractC5504s.h(callback, "callback");
        AbstractC5504s.h(outputFile, "outputFile");
        AbstractC5504s.h(requestBuilder, "requestBuilder");
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        InterfaceC4624e interfaceC4624eA = this.f36709a.a(requestBuilder.m(str).a("Accept", "multipart/mixed").b());
        this.f36710b = interfaceC4624eA;
        if (interfaceC4624eA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        interfaceC4624eA.O1(new c(callback, outputFile, aVar));
    }
}
