package e1;

import U0.C2197e;
import U0.D;
import android.text.Spannable;
import androidx.emoji2.text.i;
import i1.InterfaceC5011d;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private static final void a(Spannable spannable, D d10, int i10, int i11, InterfaceC5011d interfaceC5011d) {
        Object[] spans = spannable.getSpans(i10, i11, i.class);
        for (Object obj : spans) {
            spannable.removeSpan((i) obj);
        }
        throw null;
    }

    public static final void b(Spannable spannable, List list, InterfaceC5011d interfaceC5011d) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2197e.d dVar = (C2197e.d) list.get(i10);
            android.support.v4.media.session.b.a(dVar.a());
            a(spannable, null, dVar.b(), dVar.c(), interfaceC5011d);
        }
    }
}
