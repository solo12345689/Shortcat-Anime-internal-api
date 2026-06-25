package o6;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements InterfaceC5833b {

    /* JADX INFO: renamed from: a */
    private ULocale f54561a;

    /* JADX INFO: renamed from: b */
    private ULocale.Builder f54562b;

    /* JADX INFO: renamed from: c */
    private boolean f54563c;

    private h(ULocale uLocale) {
        this.f54562b = null;
        this.f54563c = false;
        this.f54561a = uLocale;
    }

    public static InterfaceC5833b h() {
        return new h(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static InterfaceC5833b i(String str) {
        return new h(str);
    }

    public static InterfaceC5833b j(ULocale uLocale) {
        return new h(uLocale);
    }

    private void k() throws f {
        if (this.f54563c) {
            try {
                this.f54561a = this.f54562b.build();
                this.f54563c = false;
            } catch (RuntimeException e10) {
                throw new f(e10.getMessage());
            }
        }
    }

    @Override // o6.InterfaceC5833b
    public HashMap a() throws f {
        k();
        HashMap map = new HashMap();
        Iterator<String> keywords = this.f54561a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                map.put(j.b(next), this.f54561a.getKeywordValue(next));
            }
        }
        return map;
    }

    @Override // o6.InterfaceC5833b
    public ArrayList b(String str) throws f {
        k();
        String strA = j.a(str);
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.f54561a.getKeywordValue(strA);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // o6.InterfaceC5833b
    public InterfaceC5833b d() throws f {
        k();
        return new h(this.f54561a);
    }

    @Override // o6.InterfaceC5833b
    public String e() {
        return c().toLanguageTag();
    }

    @Override // o6.InterfaceC5833b
    public void f(String str, ArrayList arrayList) throws f {
        k();
        if (this.f54562b == null) {
            this.f54562b = new ULocale.Builder().setLocale(this.f54561a);
        }
        try {
            this.f54562b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f54563c = true;
        } catch (RuntimeException e10) {
            throw new f(e10.getMessage());
        }
    }

    @Override // o6.InterfaceC5833b
    public String g() {
        return getLocale().toLanguageTag();
    }

    @Override // o6.InterfaceC5833b
    /* JADX INFO: renamed from: l */
    public ULocale getLocale() throws f {
        k();
        return this.f54561a;
    }

    @Override // o6.InterfaceC5833b
    /* JADX INFO: renamed from: m */
    public ULocale c() throws f {
        k();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f54561a);
        builder.clearExtensions();
        return builder.build();
    }

    private h(String str) throws f {
        this.f54561a = null;
        this.f54562b = null;
        this.f54563c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f54562b = builder;
        try {
            builder.setLanguageTag(str);
            this.f54563c = true;
        } catch (RuntimeException e10) {
            throw new f(e10.getMessage());
        }
    }
}
