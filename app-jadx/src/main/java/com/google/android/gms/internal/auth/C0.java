package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C0 extends AbstractC3338b0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C3386r1 zzc = C3386r1.a();

    static C0 b(Class cls) {
        Map map = zzb;
        C0 c02 = (C0) map.get(cls);
        if (c02 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c02 = (C0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (c02 != null) {
            return c02;
        }
        C0 c03 = (C0) ((C0) A1.e(cls)).o(6, null, null);
        if (c03 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, c03);
        return c03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
    
        if (r1 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static com.google.android.gms.internal.auth.C0 d(com.google.android.gms.internal.auth.C0 r3, byte[] r4) throws com.google.android.gms.internal.auth.H0 {
        /*
            int r0 = r4.length
            com.google.android.gms.internal.auth.v0 r1 = com.google.android.gms.internal.auth.C3397v0.f39312b
            r2 = 0
            com.google.android.gms.internal.auth.C0 r3 = p(r3, r4, r2, r0, r1)
            if (r3 == 0) goto L44
            r4 = 1
            r0 = 0
            java.lang.Object r1 = r3.o(r4, r0, r0)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r4) goto L19
            goto L44
        L19:
            if (r1 == 0) goto L37
            java.lang.Class r1 = r3.getClass()
            com.google.android.gms.internal.auth.h1 r2 = com.google.android.gms.internal.auth.C3357h1.a()
            com.google.android.gms.internal.auth.k1 r1 = r2.b(r1)
            boolean r1 = r1.f(r3)
            if (r4 == r1) goto L2f
            r4 = r0
            goto L30
        L2f:
            r4 = r3
        L30:
            r2 = 2
            r3.o(r2, r4, r0)
            if (r1 == 0) goto L37
            goto L44
        L37:
            com.google.android.gms.internal.auth.o1 r4 = new com.google.android.gms.internal.auth.o1
            r4.<init>(r3)
            com.google.android.gms.internal.auth.H0 r4 = r4.a()
            r4.e(r3)
            throw r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0.d(com.google.android.gms.internal.auth.C0, byte[]):com.google.android.gms.internal.auth.C0");
    }

    protected static E0 e() {
        return C3360i1.c();
    }

    static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object g(Z0 z02, String str, Object[] objArr) {
        return new C3363j1(z02, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void j(Class cls, C0 c02) {
        c02.i();
        zzb.put(cls, c02);
    }

    private static C0 p(C0 c02, byte[] bArr, int i10, int i11, C3397v0 c3397v0) throws H0 {
        C0 c0C = c02.c();
        try {
            InterfaceC3366k1 interfaceC3366k1B = C3357h1.a().b(c0C.getClass());
            interfaceC3366k1B.d(c0C, bArr, 0, i11, new C3347e0(c3397v0));
            interfaceC3366k1B.a(c0C);
            return c0C;
        } catch (H0 e10) {
            e10.e(c0C);
            throw e10;
        } catch (C3378o1 e11) {
            H0 h0A = e11.a();
            h0A.e(c0C);
            throw h0A;
        } catch (IOException e12) {
            if (e12.getCause() instanceof H0) {
                throw ((H0) e12.getCause());
            }
            H0 h02 = new H0(e12);
            h02.e(c0C);
            throw h02;
        } catch (IndexOutOfBoundsException unused) {
            H0 h0F = H0.f();
            h0F.e(c0C);
            throw h0F;
        }
    }

    final int a() {
        return C3357h1.a().b(getClass()).b(this);
    }

    final C0 c() {
        return (C0) o(4, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C3357h1.a().b(getClass()).c(this, (C0) obj);
    }

    protected final void h() {
        C3357h1.a().b(getClass()).a(this);
        i();
    }

    public final int hashCode() {
        if (n()) {
            return a();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iA = a();
        this.zza = iA;
        return iA;
    }

    final void i() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void k(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3336a1
    public final /* synthetic */ Z0 m() {
        return (C0) o(6, null, null);
    }

    final boolean n() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object o(int i10, Object obj, Object obj2);

    public final String toString() {
        return AbstractC3339b1.a(this, super.toString());
    }
}
