package Gc;

import Pc.b;
import Pc.c;
import Pc.j;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    private Bundle b(b bVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("opensAppToForeground", bVar.b());
        Bundle bundle2 = new Bundle();
        bundle2.putString("identifier", bVar.a());
        bundle2.putString("buttonTitle", bVar.getTitle());
        bundle2.putBundle("options", bundle);
        if (!(bVar instanceof j)) {
            bundle2.putBundle("textInput", null);
            return bundle2;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("placeholder", ((j) bVar).c());
        bundle2.putBundle("textInput", bundle3);
        return bundle2;
    }

    private ArrayList d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((b) it.next()));
        }
        return arrayList;
    }

    protected String a(c cVar) {
        return cVar.b();
    }

    public Bundle c(c cVar) {
        Bundle bundle = new Bundle();
        bundle.putString("identifier", a(cVar));
        bundle.putParcelableArrayList("actions", d(cVar.a()));
        bundle.putBundle("options", new Bundle());
        return bundle;
    }
}
