package Vf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2324e extends AbstractC2348q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tf.e f20187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2324e(Rf.b element) {
        super(element);
        AbstractC5504s.h(element, "element");
        this.f20187b = new C2322d(element.getDescriptor());
    }

    @Override // Vf.AbstractC2346p, Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return this.f20187b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        AbstractC5504s.h(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i10) {
        AbstractC5504s.h(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2346p
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i10, Object obj) {
        AbstractC5504s.h(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(List list) {
        AbstractC5504s.h(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public List l(ArrayList arrayList) {
        AbstractC5504s.h(arrayList, "<this>");
        return arrayList;
    }
}
