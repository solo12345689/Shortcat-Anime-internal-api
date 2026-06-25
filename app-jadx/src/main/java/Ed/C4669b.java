package ed;

import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.app.Activity;
import android.content.Context;
import javax.crypto.Cipher;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pb.C5957b;
import r.f;
import sb.InterfaceC6446a;

/* JADX INFO: renamed from: ed.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4669b {

    /* JADX INFO: renamed from: d */
    public static final a f45902d = new a(null);

    /* JADX INFO: renamed from: a */
    private final Context f45903a;

    /* JADX INFO: renamed from: b */
    private final C5957b f45904b;

    /* JADX INFO: renamed from: c */
    private boolean f45905c;

    /* JADX INFO: renamed from: ed.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ed.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0726b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f45906a;

        /* JADX INFO: renamed from: c */
        int f45908c;

        C0726b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f45906a = obj;
            this.f45908c |= Integer.MIN_VALUE;
            return C4669b.this.c(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: ed.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f45909a;

        /* JADX INFO: renamed from: c */
        int f45911c;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f45909a = obj;
            this.f45911c |= Integer.MIN_VALUE;
            return C4669b.this.e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ed.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f45912a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ed.c f45913b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cipher f45914c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ed.c cVar, Cipher cipher, Zd.e eVar) {
            super(2, eVar);
            this.f45913b = cVar;
            this.f45914c = cipher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new d(this.f45913b, this.f45914c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws C4668a {
            Object objF = AbstractC2605b.f();
            int i10 = this.f45912a;
            if (i10 == 0) {
                v.b(obj);
                ed.c cVar = this.f45913b;
                Cipher cipher = this.f45914c;
                this.f45912a = 1;
                obj = cVar.b(cipher, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            f.b bVar = (f.b) obj;
            if (bVar != null) {
                return bVar;
            }
            throw new C4668a("Couldn't get the authentication result", null, 2, null);
        }
    }

    public C4669b(Context context, C5957b moduleRegistry) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(moduleRegistry, "moduleRegistry");
        this.f45903a = context;
        this.f45904b = moduleRegistry;
    }

    private final Activity d() {
        Object objB = this.f45904b.b(InterfaceC6446a.class);
        AbstractC5504s.g(objB, "getModule(...)");
        return ((InterfaceC6446a) objB).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(javax.crypto.Cipher r8, java.lang.String r9, Zd.e r10) throws ed.C4668a {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ed.C4669b.c
            if (r0 == 0) goto L13
            r0 = r10
            ed.b$c r0 = (ed.C4669b.c) r0
            int r1 = r0.f45911c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45911c = r1
            goto L18
        L13:
            ed.b$c r0 = new ed.b$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f45909a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f45911c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            Td.v.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L6d
        L2a:
            r8 = move-exception
            goto L78
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            Td.v.b(r10)
            boolean r10 = r7.f45905c
            r2 = 2
            r5 = 0
            if (r10 != 0) goto L7b
            r7.f45905c = r4
            r7.b()     // Catch: java.lang.Throwable -> L2a
            android.app.Activity r10 = r7.d()     // Catch: java.lang.Throwable -> L2a
            boolean r6 = r10 instanceof androidx.fragment.app.AbstractActivityC2842v     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L4d
            androidx.fragment.app.v r10 = (androidx.fragment.app.AbstractActivityC2842v) r10     // Catch: java.lang.Throwable -> L2a
            goto L4e
        L4d:
            r10 = r5
        L4e:
            if (r10 == 0) goto L70
            ed.c r2 = new ed.c     // Catch: java.lang.Throwable -> L2a
            android.content.Context r6 = r7.f45903a     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r10, r6, r9)     // Catch: java.lang.Throwable -> L2a
            Gf.M0 r9 = Gf.C1608f0.c()     // Catch: java.lang.Throwable -> L2a
            Gf.M0 r9 = r9.d2()     // Catch: java.lang.Throwable -> L2a
            ed.b$d r10 = new ed.b$d     // Catch: java.lang.Throwable -> L2a
            r10.<init>(r2, r8, r5)     // Catch: java.lang.Throwable -> L2a
            r0.f45911c = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r10 = Gf.AbstractC1613i.g(r9, r10, r0)     // Catch: java.lang.Throwable -> L2a
            if (r10 != r1) goto L6d
            return r1
        L6d:
            r7.f45905c = r3
            return r10
        L70:
            ed.a r8 = new ed.a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r9 = "Cannot display biometric prompt when the app is not in the foreground"
            r8.<init>(r9, r5, r2, r5)     // Catch: java.lang.Throwable -> L2a
            throw r8     // Catch: java.lang.Throwable -> L2a
        L78:
            r7.f45905c = r3
            throw r8
        L7b:
            ed.a r8 = new ed.a
            java.lang.String r9 = "Authentication is already in progress"
            r8.<init>(r9, r5, r2, r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.C4669b.e(javax.crypto.Cipher, java.lang.String, Zd.e):java.lang.Object");
    }

    public final void b() throws C4668a {
        r.e eVarG = r.e.g(this.f45903a);
        AbstractC5504s.g(eVarG, "from(...)");
        int iA = eVarG.a(15);
        if (iA == -2) {
            throw new C4668a("Biometric authentication is unsupported", null, 2, null);
        }
        if (iA == -1) {
            throw new C4668a("Biometric authentication status is unknown", null, 2, null);
        }
        if (iA != 1) {
            if (iA == 15) {
                throw new C4668a("An update is required before the biometrics can be used", null, 2, null);
            }
            if (iA == 11) {
                throw new C4668a("No biometrics are currently enrolled", null, 2, null);
            }
            if (iA != 12) {
                return;
            }
        }
        throw new C4668a("No hardware available for biometric authentication. Use expo-local-authentication to check if the device supports it", null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(javax.crypto.Cipher r5, boolean r6, java.lang.String r7, Zd.e r8) throws ed.C4668a {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ed.C4669b.C0726b
            if (r0 == 0) goto L13
            r0 = r8
            ed.b$b r0 = (ed.C4669b.C0726b) r0
            int r1 = r0.f45908c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45908c = r1
            goto L18
        L13:
            ed.b$b r0 = new ed.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f45906a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f45908c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Td.v.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Td.v.b(r8)
            if (r6 == 0) goto L58
            r0.f45908c = r3
            java.lang.Object r8 = r4.e(r5, r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            r.f$b r8 = (r.f.b) r8
            r.f$c r5 = r8.b()
            if (r5 == 0) goto L4e
            javax.crypto.Cipher r5 = r5.a()
            if (r5 == 0) goto L4e
            return r5
        L4e:
            ed.a r5 = new ed.a
            java.lang.String r6 = "Couldn't get cipher from authentication result"
            r7 = 2
            r8 = 0
            r5.<init>(r6, r8, r7, r8)
            throw r5
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.C4669b.c(javax.crypto.Cipher, boolean, java.lang.String, Zd.e):java.lang.Object");
    }
}
