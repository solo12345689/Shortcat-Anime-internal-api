package expo.modules.adapters.react;

import android.content.Context;
import com.facebook.react.O;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import pb.AbstractC5958c;
import pb.C5957b;
import sb.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class b extends AbstractC5958c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f46016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection f46017c;

    public b(List list, List list2) {
        super(list);
        this.f46017c = list2;
    }

    private Collection d(Context context) {
        Collection collection = this.f46017c;
        if (collection != null) {
            return collection;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((g) it.next()).c(context));
        }
        return arrayList;
    }

    public C5957b b(Context context) {
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        for (g gVar : a()) {
            arrayList.addAll(gVar.f(context));
            if (gVar instanceof O) {
                cVar.a((O) gVar);
            }
        }
        arrayList.add(cVar);
        return new C5957b(arrayList, d(context));
    }

    public Collection c(ReactApplicationContext reactApplicationContext) {
        Collection collection = this.f46016b;
        if (collection != null) {
            return collection;
        }
        this.f46016b = new HashSet();
        for (g gVar : a()) {
            if (gVar instanceof O) {
                this.f46016b.addAll(((O) gVar).createViewManagers(reactApplicationContext));
            }
        }
        return this.f46016b;
    }
}
