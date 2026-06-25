package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class B implements InterfaceC5494h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f52252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52253b;

    public B(Class jClass, String moduleName) {
        AbstractC5504s.h(jClass, "jClass");
        AbstractC5504s.h(moduleName, "moduleName");
        this.f52252a = jClass;
        this.f52253b = moduleName;
    }

    public boolean equals(Object obj) {
        return (obj instanceof B) && AbstractC5504s.c(j(), ((B) obj).j());
    }

    public int hashCode() {
        return j().hashCode();
    }

    @Override // kotlin.jvm.internal.InterfaceC5494h
    public Class j() {
        return this.f52252a;
    }

    public String toString() {
        return j() + " (Kotlin reflection is not available)";
    }
}
