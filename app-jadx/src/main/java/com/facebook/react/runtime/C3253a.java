package com.facebook.react.runtime;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.runtime.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3253a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f37256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f37257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f37258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f37259d;

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0622a {
        Object get();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.facebook.react.runtime.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f37260a = new b("Init", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f37261b = new b("Creating", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f37262c = new b("Success", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f37263d = new b("Failure", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f37264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f37265f;

        static {
            b[] bVarArrA = a();
            f37264e = bVarArrA;
            f37265f = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f37260a, f37261b, f37262c, f37263d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f37264e.clone();
        }
    }

    public C3253a(Object obj) {
        this.f37256a = obj;
        this.f37257b = this.f37256a;
        this.f37258c = b.f37260a;
        this.f37259d = "";
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.f37256a;
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return obj;
    }

    public final synchronized Object b() {
        Object objA;
        objA = a();
        e();
        return objA;
    }

    public final synchronized Object c() {
        return this.f37256a;
    }

    public final Object d(InterfaceC0622a provider) {
        boolean z10;
        Object objA;
        Object objA2;
        AbstractC5504s.h(provider, "provider");
        synchronized (this) {
            b bVar = this.f37258c;
            b bVar2 = b.f37262c;
            if (bVar == bVar2) {
                return a();
            }
            if (this.f37258c == b.f37263d) {
                throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f37259d);
            }
            b bVar3 = this.f37258c;
            b bVar4 = b.f37261b;
            boolean z11 = false;
            if (bVar3 != bVar4) {
                this.f37258c = bVar4;
                z10 = true;
            } else {
                z10 = false;
            }
            Td.L l10 = Td.L.f17438a;
            if (z10) {
                try {
                    this.f37256a = provider.get();
                    synchronized (this) {
                        this.f37258c = bVar2;
                        AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        objA = a();
                    }
                    return objA;
                } catch (RuntimeException e10) {
                    synchronized (this) {
                        this.f37258c = b.f37263d;
                        this.f37259d = String.valueOf(e10.getMessage());
                        AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        Td.L l11 = Td.L.f17438a;
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e10);
                    }
                }
            }
            synchronized (this) {
                while (this.f37258c == b.f37261b) {
                    try {
                        AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                if (this.f37258c == b.f37263d) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f37259d);
                }
                objA2 = a();
            }
            return objA2;
        }
    }

    public final synchronized void e() {
        this.f37256a = this.f37257b;
        this.f37258c = b.f37260a;
        this.f37259d = "";
    }

    public /* synthetic */ C3253a(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
