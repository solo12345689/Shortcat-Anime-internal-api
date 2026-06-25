package s2;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: s2.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6408f {

    /* JADX INFO: renamed from: a */
    private static final String f59088a = a0.H0(0);

    /* JADX INFO: renamed from: b */
    private static final String f59089b = a0.H0(1);

    /* JADX INFO: renamed from: c */
    private static final String f59090c = a0.H0(2);

    /* JADX INFO: renamed from: d */
    private static final String f59091d = a0.H0(3);

    /* JADX INFO: renamed from: e */
    private static final String f59092e = a0.H0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C6411i c6411i : (C6411i[]) spanned.getSpans(0, spanned.length(), C6411i.class)) {
            arrayList.add(b(spanned, c6411i, 1, c6411i.b()));
        }
        for (C6413k c6413k : (C6413k[]) spanned.getSpans(0, spanned.length(), C6413k.class)) {
            arrayList.add(b(spanned, c6413k, 2, c6413k.b()));
        }
        for (C6409g c6409g : (C6409g[]) spanned.getSpans(0, spanned.length(), C6409g.class)) {
            arrayList.add(b(spanned, c6409g, 3, null));
        }
        for (C6414l c6414l : (C6414l[]) spanned.getSpans(0, spanned.length(), C6414l.class)) {
            arrayList.add(b(spanned, c6414l, 4, c6414l.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f59088a, spanned.getSpanStart(obj));
        bundle2.putInt(f59089b, spanned.getSpanEnd(obj));
        bundle2.putInt(f59090c, spanned.getSpanFlags(obj));
        bundle2.putInt(f59091d, i10);
        if (bundle != null) {
            bundle2.putBundle(f59092e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f59088a);
        int i11 = bundle.getInt(f59089b);
        int i12 = bundle.getInt(f59090c);
        int i13 = bundle.getInt(f59091d, -1);
        Bundle bundle2 = bundle.getBundle(f59092e);
        if (i13 == 1) {
            spannable.setSpan(C6411i.a((Bundle) AbstractC6614a.e(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(C6413k.a((Bundle) AbstractC6614a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new C6409g(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(C6414l.a((Bundle) AbstractC6614a.e(bundle2)), i10, i11, i12);
        }
    }
}
