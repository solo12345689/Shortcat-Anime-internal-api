package se;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f59523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClassLoader f59525c;

    public k1(ClassLoader classLoader) {
        AbstractC5504s.h(classLoader, "classLoader");
        this.f59523a = new WeakReference(classLoader);
        this.f59524b = System.identityHashCode(classLoader);
        this.f59525c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f59525c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k1) && this.f59523a.get() == ((k1) obj).f59523a.get();
    }

    public int hashCode() {
        return this.f59524b;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f59523a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
