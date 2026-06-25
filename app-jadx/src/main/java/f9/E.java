package f9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f46960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f46961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f46962c;

    private E(C c10, boolean z10, x xVar, int i10) {
        this.f46962c = c10;
        this.f46961b = z10;
        this.f46960a = xVar;
    }

    public static E a(x xVar) {
        return new E(new C(xVar), false, w.f46987b, Integer.MAX_VALUE);
    }

    public final E b() {
        return new E(this.f46962c, true, this.f46960a, Integer.MAX_VALUE);
    }

    public final Iterable c(CharSequence charSequence) {
        return new B(this, charSequence);
    }

    public final List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itA = this.f46962c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add((String) itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    final /* synthetic */ Iterator e(CharSequence charSequence) {
        return this.f46962c.a(this, charSequence);
    }

    final /* synthetic */ x f() {
        return this.f46960a;
    }

    final /* synthetic */ boolean g() {
        return this.f46961b;
    }
}
