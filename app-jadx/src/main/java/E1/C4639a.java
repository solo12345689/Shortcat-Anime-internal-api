package e1;

import Ud.AbstractC2279u;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import d1.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: e1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4639a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4639a f45776a = new C4639a();

    private C4639a() {
    }

    public final Object a(c1.e eVar) {
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(eVar, 10));
        Iterator<E> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1.d) it.next()).b());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(i iVar, c1.e eVar) {
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(eVar, 10));
        Iterator<E> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1.d) it.next()).b());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        iVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
