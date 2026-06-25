package Vf;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class M extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Tf.e f20151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Rf.b kSerializer, Rf.b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC5504s.h(kSerializer, "kSerializer");
        AbstractC5504s.h(vSerializer, "vSerializer");
        this.f20151c = new L(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // Vf.T, Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return this.f20151c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap a() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashMap linkedHashMap) {
        AbstractC5504s.h(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashMap linkedHashMap, int i10) {
        AbstractC5504s.h(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator d(Map map) {
        AbstractC5504s.h(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map map) {
        AbstractC5504s.h(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap k(Map map) {
        AbstractC5504s.h(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(LinkedHashMap linkedHashMap) {
        AbstractC5504s.h(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
