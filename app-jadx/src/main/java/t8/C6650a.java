package t8;

import javax.inject.Provider;

/* JADX INFO: renamed from: t8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6650a implements Provider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f60859c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Provider f60860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f60861b = f60859c;

    private C6650a(Provider provider) {
        this.f60860a = provider;
    }

    public static Provider a(Provider provider) {
        AbstractC6653d.b(provider);
        return provider instanceof C6650a ? provider : new C6650a(provider);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f60859c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj;
        Object obj2 = this.f60861b;
        Object obj3 = f60859c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f60861b;
                if (obj == obj3) {
                    obj = this.f60860a.get();
                    this.f60861b = b(this.f60861b, obj);
                    this.f60860a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
