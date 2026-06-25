package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3709o0 extends AbstractC3694l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Unsafe f40517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f40518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f40519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f40520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f40521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f40522f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.u0
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException {
                        Unsafe unsafe2 = C3709o0.f40517a;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                f40519c = unsafe.objectFieldOffset(AbstractC3719q0.class.getDeclaredField("c"));
                f40518b = unsafe.objectFieldOffset(AbstractC3719q0.class.getDeclaredField("b"));
                f40520d = unsafe.objectFieldOffset(AbstractC3719q0.class.getDeclaredField("a"));
                f40521e = unsafe.objectFieldOffset(C3714p0.class.getDeclaredField("a"));
                f40522f = unsafe.objectFieldOffset(C3714p0.class.getDeclaredField("b"));
                f40517a = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    /* synthetic */ C3709o0(AbstractC3743v0 abstractC3743v0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final C3679i0 a(AbstractC3719q0 abstractC3719q0, C3679i0 c3679i0) {
        C3679i0 c3679i02;
        do {
            c3679i02 = abstractC3719q0.f40540b;
            if (c3679i0 == c3679i02) {
                break;
            }
        } while (!e(abstractC3719q0, c3679i02, c3679i0));
        return c3679i02;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final C3714p0 b(AbstractC3719q0 abstractC3719q0, C3714p0 c3714p0) {
        C3714p0 c3714p02;
        do {
            c3714p02 = abstractC3719q0.f40541c;
            if (c3714p0 == c3714p02) {
                break;
            }
        } while (!g(abstractC3719q0, c3714p02, c3714p0));
        return c3714p02;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final void c(C3714p0 c3714p0, C3714p0 c3714p02) {
        f40517a.putObject(c3714p0, f40522f, c3714p02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    public final void d(C3714p0 c3714p0, Thread thread) {
        f40517a.putObject(c3714p0, f40521e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final boolean e(AbstractC3719q0 abstractC3719q0, C3679i0 c3679i0, C3679i0 c3679i02) {
        return AbstractC3733t0.a(f40517a, abstractC3719q0, f40518b, c3679i0, c3679i02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final boolean f(AbstractC3719q0 abstractC3719q0, Object obj, Object obj2) {
        return AbstractC3733t0.a(f40517a, abstractC3719q0, f40520d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final boolean g(AbstractC3719q0 abstractC3719q0, C3714p0 c3714p0, C3714p0 c3714p02) {
        return AbstractC3733t0.a(f40517a, abstractC3719q0, f40519c, c3714p0, c3714p02);
    }
}
