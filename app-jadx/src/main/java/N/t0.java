package N;

import Ud.AbstractC2279u;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f12555a = new t0();

    private t0() {
    }

    public final void a(EditorInfo editorInfo, c1.e eVar) {
        if (AbstractC5504s.c(eVar, c1.e.f33423c.b())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(eVar, 10));
        Iterator<E> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1.d) it.next()).b());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
