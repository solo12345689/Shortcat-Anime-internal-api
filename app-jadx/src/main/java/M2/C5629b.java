package m2;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.AbstractC5628a;

/* JADX INFO: renamed from: m2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5629b extends AbstractC5628a {
    public C5629b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // m2.AbstractC5628a
    public Object a(AbstractC5628a.c key) {
        AbstractC5504s.h(key, "key");
        return b().get(key);
    }

    public final void c(AbstractC5628a.c key, Object obj) {
        AbstractC5504s.h(key, "key");
        b().put(key, obj);
    }

    public C5629b(Map initialExtras) {
        AbstractC5504s.h(initialExtras, "initialExtras");
        b().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5629b(AbstractC5628a initialExtras) {
        this(initialExtras.b());
        AbstractC5504s.h(initialExtras, "initialExtras");
    }

    public /* synthetic */ C5629b(AbstractC5628a abstractC5628a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC5628a.b.f53049c : abstractC5628a);
    }
}
