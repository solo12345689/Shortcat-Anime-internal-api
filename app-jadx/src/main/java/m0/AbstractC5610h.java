package m0;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: m0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5610h {
    public static final void a(C5606d c5606d, SparseArray sparseArray) {
        if (c5606d.b().a().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValueA = AbstractC5607e.a(sparseArray.get(iKeyAt));
            x xVar = x.f52948a;
            if (xVar.e(autofillValueA)) {
                c5606d.b().b(iKeyAt, xVar.B(autofillValueA).toString());
            } else {
                if (xVar.c(autofillValueA)) {
                    throw new Td.s("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (xVar.d(autofillValueA)) {
                    throw new Td.s("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (xVar.f(autofillValueA)) {
                    throw new Td.s("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(C5606d c5606d, ViewStructure viewStructure) {
        if (c5606d.b().a().isEmpty()) {
            return;
        }
        x xVar = x.f52948a;
        int iA = xVar.a(viewStructure, c5606d.b().a().size());
        Iterator it = c5606d.b().a().entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            android.support.v4.media.session.b.a(entry.getValue());
            ViewStructure viewStructureG = xVar.g(viewStructure, iA);
            xVar.i(viewStructureG, c5606d.c(), iIntValue);
            xVar.v(viewStructureG, iIntValue, c5606d.d().getContext().getPackageName(), null, null);
            xVar.j(viewStructureG, J.b(I.f52883a.a()));
            throw null;
        }
    }
}
