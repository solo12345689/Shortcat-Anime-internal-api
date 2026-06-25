package gc;

import bc.f;
import hc.C4936h;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4936h f47419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f47420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f47421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f47422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f47423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC5082a f47424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f47425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f47426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f47427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f47428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f47429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Ub.e f47430m;

    public e(String name, C4936h objectDefinition, Map viewManagerDefinitions, Map eventListeners, Function2 function2, List classData) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(objectDefinition, "objectDefinition");
        AbstractC5504s.h(viewManagerDefinitions, "viewManagerDefinitions");
        AbstractC5504s.h(eventListeners, "eventListeners");
        AbstractC5504s.h(classData, "classData");
        this.f47418a = name;
        this.f47419b = objectDefinition;
        this.f47420c = viewManagerDefinitions;
        this.f47421d = eventListeners;
        this.f47422e = function2;
        this.f47423f = classData;
        this.f47424g = objectDefinition.f();
        this.f47425h = objectDefinition.h();
        this.f47426i = objectDefinition.b();
        this.f47427j = objectDefinition.d();
        this.f47428k = objectDefinition.g();
        this.f47429l = objectDefinition.c();
        this.f47430m = objectDefinition.e();
    }

    public final Map a() {
        return this.f47426i;
    }

    public final List b() {
        return this.f47423f;
    }

    public final Map c() {
        return this.f47421d;
    }

    public final f d() {
        return this.f47427j;
    }

    public final String e() {
        return this.f47418a;
    }

    public final C4936h f() {
        return this.f47419b;
    }

    public final Function2 g() {
        return this.f47422e;
    }

    public final Map h() {
        return this.f47420c;
    }
}
