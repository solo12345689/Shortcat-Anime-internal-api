package mb;

import Df.C1271d;
import Df.r;
import Td.L;
import Td.v;
import Ud.AbstractC2273n;
import ae.AbstractC2605b;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.revenuecat.purchases.common.Constants;
import dc.C4581b;
import dc.p;
import dg.C;
import dg.E;
import dg.F;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lmb/b;", "Lgc/c;", "<init>", "()V", "Ljava/net/URI;", "uri", "", "D", "(Ljava/net/URI;)Ljava/lang/String;", "LUb/d;", "appContext", "Ljava/io/File;", "localUrl", "Landroid/net/Uri;", "B", "(LUb/d;Ljava/net/URI;Ljava/io/File;LZd/e;)Ljava/lang/Object;", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "C", "()Landroid/content/Context;", "context", "expo-asset_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f53239a = new a();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(URI.class);
        }
    }

    /* JADX INFO: renamed from: mb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0829b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0829b f53240a = new C0829b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f53241a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f53242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f53243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f53244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Zd.e eVar, b bVar) {
            super(3, eVar);
            this.f53244c = bVar;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, Zd.e eVar) {
            d dVar = new d(eVar, this.f53244c);
            dVar.f53243b = objArr;
            return dVar.invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws cc.e, mb.f {
            Object objF = AbstractC2605b.f();
            int i10 = this.f53242a;
            if (i10 != 0) {
                if (i10 == 1) {
                    v.b(obj);
                    return obj;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            Object[] objArr = (Object[]) this.f53243b;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            String str = (String) objArr[2];
            String str2 = (String) obj3;
            URI uri = (URI) obj2;
            if (AbstractC5504s.c(uri.getScheme(), "file")) {
                String string = uri.toString();
                AbstractC5504s.g(string, "toString(...)");
                if (!r.Q(string, "file:///android_res/", false, 2, null)) {
                    return uri;
                }
            }
            String strD = str2 == null ? this.f53244c.D(uri) : str2;
            File file = new File(this.f53244c.i().p() + "/ExponentAsset-" + strD + "." + str);
            if (!file.exists()) {
                b bVar = this.f53244c;
                Ub.d dVarI = bVar.i();
                this.f53242a = 1;
                Object objB = bVar.B(dVarI, uri, file, this);
                if (objB != objF) {
                    return objB;
                }
            } else {
                if (str2 == null || AbstractC5504s.c(str2, mb.d.b(file))) {
                    return Uri.fromFile(file);
                }
                b bVar2 = this.f53244c;
                Ub.d dVarI2 = bVar2.i();
                this.f53242a = 2;
                Object objB2 = bVar2.B(dVarI2, uri, file, this);
                if (objB2 != objF) {
                    return objB2;
                }
            }
            return objF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f53245a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f53247c;

        e(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f53245a = obj;
            this.f53247c |= Integer.MIN_VALUE;
            return b.this.B(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f53248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ URI f53249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f53250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ File f53251d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(URI uri, b bVar, File file, Zd.e eVar) {
            super(2, eVar);
            this.f53249b = uri;
            this.f53250c = bVar;
            this.f53251d = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new f(this.f53249b, this.f53250c, this.f53251d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws mb.f {
            InputStream inputStreamA;
            AbstractC2605b.f();
            if (this.f53248a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                String string = this.f53249b.toString();
                AbstractC5504s.g(string, "toString(...)");
                if (r.W(string, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
                    String string2 = this.f53249b.toString();
                    AbstractC5504s.g(string2, "toString(...)");
                    if (r.Q(string2, "file:///android_res/", false, 2, null)) {
                        Context contextC = this.f53250c.C();
                        String string3 = this.f53249b.toString();
                        AbstractC5504s.g(string3, "toString(...)");
                        inputStreamA = mb.e.c(contextC, string3);
                    } else {
                        C.a aVar = new C.a();
                        URL url = this.f53249b.toURL();
                        AbstractC5504s.g(url, "toURL(...)");
                        E eB = v7.f.f().a(aVar.n(url).b()).b();
                        F fJ = eB.j();
                        if (!eB.J() || fJ == null) {
                            eB.close();
                            throw new Exception("HTTP " + eB.o() + " for " + this.f53249b);
                        }
                        inputStreamA = fJ.a();
                    }
                } else {
                    Context contextC2 = this.f53250c.C();
                    String string4 = this.f53249b.toString();
                    AbstractC5504s.g(string4, "toString(...)");
                    inputStreamA = mb.e.d(contextC2, string4);
                }
                File file = this.f53251d;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        if (fe.b.b(inputStreamA, fileOutputStream, 0, 2, null) == 0) {
                            Log.w("ExpoAsset", "Asset downloaded to " + file + " is empty. It might be conflicting with another asset, or corrupted.");
                        }
                        L l10 = L.f17438a;
                        fe.c.a(fileOutputStream, null);
                        fe.c.a(inputStreamA, null);
                        return Uri.fromFile(this.f53251d);
                    } finally {
                    }
                } finally {
                }
            } catch (Exception unused) {
                String string5 = this.f53249b.toString();
                AbstractC5504s.g(string5, "toString(...)");
                throw new mb.f(string5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(Ub.d r6, java.net.URI r7, java.io.File r8, Zd.e r9) throws cc.e, mb.f {
        /*
            r5 = this;
            boolean r0 = r9 instanceof mb.b.e
            if (r0 == 0) goto L13
            r0 = r9
            mb.b$e r0 = (mb.b.e) r0
            int r1 = r0.f53247c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53247c = r1
            goto L18
        L13:
            mb.b$e r0 = new mb.b$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53245a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f53247c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Td.v.b(r9)
            goto L75
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Td.v.b(r9)
            java.io.File r9 = r8.getParentFile()
            if (r9 == 0) goto L41
            boolean r9 = r9.exists()
            if (r9 != r3) goto L41
            goto L44
        L41:
            r8.mkdirs()
        L44:
            expo.modules.kotlin.services.FilePermissionService r9 = r6.s()
            android.content.Context r2 = r5.C()
            java.lang.String r4 = r8.getParent()
            if (r4 == 0) goto L8a
            java.util.EnumSet r9 = r9.d(r2, r4)
            expo.modules.kotlin.services.FilePermissionService$a r2 = expo.modules.kotlin.services.FilePermissionService.a.f46180b
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L7b
            Gf.O r6 = r6.o()
            Zd.i r6 = r6.getCoroutineContext()
            mb.b$f r9 = new mb.b$f
            r2 = 0
            r9.<init>(r7, r5, r8, r2)
            r0.f53247c = r3
            java.lang.Object r9 = Gf.AbstractC1613i.g(r6, r9, r0)
            if (r9 != r1) goto L75
            return r1
        L75:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r9, r6)
            return r9
        L7b:
            mb.f r6 = new mb.f
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r7, r8)
            r6.<init>(r7)
            throw r6
        L8a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.b.B(Ub.d, java.net.URI, java.io.File, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context C() throws cc.e {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D(URI uri) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        String string = uri.toString();
        AbstractC5504s.g(string, "toString(...)");
        byte[] bytes = string.getBytes(C1271d.f3718b);
        AbstractC5504s.g(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC5504s.g(bArrDigest, "digest(...)");
        return AbstractC2273n.w0(bArrDigest, "", null, null, 0, null, new Function1() { // from class: mb.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.E(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence E(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    @Override // gc.c
    public gc.e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoAsset");
            C4581b c4581bB = dVar.b("downloadAsync");
            String strC = c4581bB.c();
            X xB = c4581bB.b();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(URI.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(URI.class), false, a.f53239a), xB);
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), Boolean.TRUE));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(String.class), true, C0829b.f53240a), xB);
            }
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b3 == null) {
                c5972b3 = new C5972b(new M(O.b(String.class), false, c.f53241a), xB);
            }
            c4581bB.d(new p(strC, new C5972b[]{c5972b, c5972b2, c5972b3}, new d(null, this)));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
