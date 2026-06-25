package mf;

import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import ye.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class M implements InterfaceC5679j {

    /* JADX INFO: renamed from: a */
    private final Ue.d f53362a;

    /* JADX INFO: renamed from: b */
    private final Ue.a f53363b;

    /* JADX INFO: renamed from: c */
    private final Function1 f53364c;

    /* JADX INFO: renamed from: d */
    private final Map f53365d;

    public M(Se.n proto, Ue.d nameResolver, Ue.a metadataVersion, Function1 classSource) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        AbstractC5504s.h(classSource, "classSource");
        this.f53362a = nameResolver;
        this.f53363b = metadataVersion;
        this.f53364c = classSource;
        List listK = proto.K();
        AbstractC5504s.g(listK, "getClass_List(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(listK, 10)), 16));
        for (Object obj : listK) {
            linkedHashMap.put(L.a(this.f53362a, ((Se.c) obj).J0()), obj);
        }
        this.f53365d = linkedHashMap;
    }

    @Override // mf.InterfaceC5679j
    public C5678i a(Xe.b classId) {
        AbstractC5504s.h(classId, "classId");
        Se.c cVar = (Se.c) this.f53365d.get(classId);
        if (cVar == null) {
            return null;
        }
        return new C5678i(this.f53362a, cVar, this.f53363b, (h0) this.f53364c.invoke(classId));
    }

    public final Collection b() {
        return this.f53365d.keySet();
    }
}
