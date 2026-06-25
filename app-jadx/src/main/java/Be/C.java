package Be;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f1662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f1663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f1664d;

    public C(List allDependencies, Set modulesWhoseInternalsAreVisible, List directExpectedByDependencies, Set allExpectedByDependencies) {
        AbstractC5504s.h(allDependencies, "allDependencies");
        AbstractC5504s.h(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        AbstractC5504s.h(directExpectedByDependencies, "directExpectedByDependencies");
        AbstractC5504s.h(allExpectedByDependencies, "allExpectedByDependencies");
        this.f1661a = allDependencies;
        this.f1662b = modulesWhoseInternalsAreVisible;
        this.f1663c = directExpectedByDependencies;
        this.f1664d = allExpectedByDependencies;
    }

    @Override // Be.B
    public List a() {
        return this.f1661a;
    }

    @Override // Be.B
    public List b() {
        return this.f1663c;
    }

    @Override // Be.B
    public Set c() {
        return this.f1662b;
    }
}
