package gc;

import expo.modules.kotlin.views.r;
import hc.AbstractC4934f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pc.X;

/* JADX INFO: renamed from: gc.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4874a extends AbstractC4934f {

    /* JADX INFO: renamed from: k */
    private final c f47408k;

    /* JADX INFO: renamed from: l */
    private String f47409l;

    /* JADX INFO: renamed from: m */
    private Map f47410m;

    /* JADX INFO: renamed from: n */
    private final Map f47411n;

    /* JADX INFO: renamed from: o */
    private Function2 f47412o;

    /* JADX INFO: renamed from: p */
    private List f47413p;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC4874a(c cVar, X x10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        X xM;
        cVar = (i10 & 1) != 0 ? null : cVar;
        this(cVar, (i10 & 2) != 0 ? (cVar == null || (xM = cVar.m()) == null) ? null : expo.modules.kotlin.types.c.b(xM) : x10);
    }

    public final void s(String name) {
        AbstractC5504s.h(name, "name");
        this.f47409l = name;
    }

    public final void t(Function2 body) {
        AbstractC5504s.h(body, "body");
        this.f47412o = body;
    }

    public final e u() {
        String simpleName = this.f47409l;
        if (simpleName == null) {
            c cVar = this.f47408k;
            simpleName = cVar != null ? cVar.getClass().getSimpleName() : null;
        }
        String str = simpleName;
        if (str != null) {
            return new e(str, j(), this.f47410m, this.f47411n, this.f47412o, this.f47413p);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List v() {
        return this.f47413p;
    }

    public final Map w() {
        return this.f47411n;
    }

    public final c x() {
        return this.f47408k;
    }

    public final void y(r definition) {
        AbstractC5504s.h(definition, "definition");
        if (!this.f47410m.containsKey(definition.d())) {
            this.f47410m.put(definition.d(), definition);
            if (this.f47410m.containsKey("DEFAULT_MODULE_VIEW")) {
                return;
            }
            this.f47410m.put("DEFAULT_MODULE_VIEW", definition);
            return;
        }
        throw new IllegalArgumentException(("The module definition defines more than one view with name " + definition.d() + ".").toString());
    }

    public AbstractC4874a(c cVar, X x10) {
        super(x10);
        this.f47408k = cVar;
        this.f47410m = new LinkedHashMap();
        this.f47411n = new LinkedHashMap();
        this.f47413p = new ArrayList();
    }
}
