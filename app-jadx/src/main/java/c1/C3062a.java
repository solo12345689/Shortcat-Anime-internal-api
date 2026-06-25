package c1;

import android.os.LocaleList;
import android.util.Log;
import d1.u;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: c1.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3062a implements f {

    /* JADX INFO: renamed from: a */
    private LocaleList f33417a;

    /* JADX INFO: renamed from: b */
    private e f33418b;

    /* JADX INFO: renamed from: c */
    private final u f33419c = new u();

    @Override // c1.f
    public e a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f33419c) {
            e eVar = this.f33418b;
            if (eVar != null && localeList == this.f33417a) {
                return eVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new d(localeList.get(i10)));
            }
            e eVar2 = new e(arrayList);
            this.f33417a = localeList;
            this.f33418b = eVar2;
            return eVar2;
        }
    }

    @Override // c1.f
    public Locale b(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (AbstractC5504s.c(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(b.f33420a, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
