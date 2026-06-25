package Yb;

import Ub.e;
import dc.r;
import hc.C4936h;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f22896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f22897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f22898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4936h f22899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f22900f;

    public d(String name, r constructor, Map staticSyncFunctions, Map staticAsyncFunctions, C4936h objectDefinition, boolean z10) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(staticSyncFunctions, "staticSyncFunctions");
        AbstractC5504s.h(staticAsyncFunctions, "staticAsyncFunctions");
        AbstractC5504s.h(objectDefinition, "objectDefinition");
        this.f22895a = name;
        this.f22896b = constructor;
        this.f22897c = staticSyncFunctions;
        this.f22898d = staticAsyncFunctions;
        this.f22899e = objectDefinition;
        this.f22900f = z10;
    }

    public final r a() {
        return this.f22896b;
    }

    public final String b() {
        return this.f22895a;
    }

    public final C4936h c() {
        return this.f22899e;
    }

    public final e d() {
        return new e(this.f22897c.values().iterator(), this.f22898d.values().iterator());
    }

    public final boolean e() {
        return this.f22900f;
    }
}
