package Tf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f17496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f17497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f17498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f17499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f17500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f17501g;

    public a(String serialName) {
        AbstractC5504s.h(serialName, "serialName");
        this.f17495a = serialName;
        this.f17496b = AbstractC2279u.m();
        this.f17497c = new ArrayList();
        this.f17498d = new HashSet();
        this.f17499e = new ArrayList();
        this.f17500f = new ArrayList();
        this.f17501g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, e eVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC2279u.m();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, eVar, list, z10);
    }

    public final void a(String elementName, e descriptor, List annotations, boolean z10) {
        AbstractC5504s.h(elementName, "elementName");
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(annotations, "annotations");
        if (this.f17498d.add(elementName)) {
            this.f17497c.add(elementName);
            this.f17499e.add(descriptor);
            this.f17500f.add(annotations);
            this.f17501g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f17495a).toString());
    }

    public final List c() {
        return this.f17496b;
    }

    public final List d() {
        return this.f17500f;
    }

    public final List e() {
        return this.f17499e;
    }

    public final List f() {
        return this.f17497c;
    }

    public final List g() {
        return this.f17501g;
    }

    public final void h(List list) {
        AbstractC5504s.h(list, "<set-?>");
        this.f17496b = list;
    }
}
