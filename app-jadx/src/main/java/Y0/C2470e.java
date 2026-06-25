package Y0;

import Td.u;
import Y0.F;
import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: renamed from: Y0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2470e implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22653b;

    /* JADX INFO: renamed from: Y0.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f22654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f22655b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22657d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22655b = obj;
            this.f22657d |= Integer.MIN_VALUE;
            return C2470e.this.c(null, this);
        }
    }

    public C2470e(Context context) {
        this.f22652a = context.getApplicationContext();
    }

    @Override // Y0.U
    public Object a() {
        return this.f22653b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Y0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(Y0.InterfaceC2484t r6, Zd.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Y0.C2470e.a
            if (r0 == 0) goto L13
            r0 = r7
            Y0.e$a r0 = (Y0.C2470e.a) r0
            int r1 = r0.f22657d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22657d = r1
            goto L18
        L13:
            Y0.e$a r0 = new Y0.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f22655b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f22657d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f22654a
            Y0.t r6 = (Y0.InterfaceC2484t) r6
            Td.v.b(r7)
            goto L69
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            Td.v.b(r7)
            return r7
        L3c:
            Td.v.b(r7)
            boolean r7 = r6 instanceof Y0.AbstractC2468c
            if (r7 == 0) goto L55
            Y0.c r6 = (Y0.AbstractC2468c) r6
            Y0.c$a r7 = r6.d()
            android.content.Context r2 = r5.f22652a
            r0.f22657d = r4
            java.lang.Object r6 = r7.a(r2, r6, r0)
            if (r6 != r1) goto L54
            goto L68
        L54:
            return r6
        L55:
            boolean r7 = r6 instanceof Y0.f0
            if (r7 == 0) goto L78
            r7 = r6
            Y0.f0 r7 = (Y0.f0) r7
            android.content.Context r2 = r5.f22652a
            r0.f22654a = r6
            r0.f22657d = r3
            java.lang.Object r7 = Y0.AbstractC2471f.b(r7, r2, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            Y0.f0 r6 = (Y0.f0) r6
            Y0.K$d r6 = r6.e()
            android.content.Context r0 = r5.f22652a
            android.graphics.Typeface r6 = Y0.e0.c(r7, r6, r0)
            return r6
        L78:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.C2470e.c(Y0.t, Zd.e):java.lang.Object");
    }

    @Override // Y0.U
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface b(InterfaceC2484t interfaceC2484t) {
        Object objB;
        Typeface typefaceC;
        if (interfaceC2484t instanceof AbstractC2468c) {
            AbstractC2468c abstractC2468c = (AbstractC2468c) interfaceC2484t;
            return abstractC2468c.d().b(this.f22652a, abstractC2468c);
        }
        if (!(interfaceC2484t instanceof f0)) {
            return null;
        }
        f0 f0Var = (f0) interfaceC2484t;
        int iA = f0Var.a();
        F.a aVar = F.f22590a;
        if (F.e(iA, aVar.b())) {
            typefaceC = AbstractC2471f.c(f0Var, this.f22652a);
        } else {
            if (!F.e(iA, aVar.c())) {
                if (F.e(iA, aVar.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) F.g(f0Var.a())));
            }
            try {
                u.a aVar2 = Td.u.f17466b;
                objB = Td.u.b(AbstractC2471f.c((f0) interfaceC2484t, this.f22652a));
            } catch (Throwable th2) {
                u.a aVar3 = Td.u.f17466b;
                objB = Td.u.b(Td.v.a(th2));
            }
            typefaceC = (Typeface) (Td.u.g(objB) ? null : objB);
        }
        return e0.c(typefaceC, f0Var.e(), this.f22652a);
    }
}
