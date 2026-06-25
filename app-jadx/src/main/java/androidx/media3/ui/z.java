package androidx.media3.ui;

import P9.AbstractC2012v;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.media3.ui.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import s2.C6409g;
import s2.C6411i;
import s2.C6413k;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f31601a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f31603b;

        private b(String str, Map map) {
            this.f31602a = str;
            this.f31603b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator f31604e = new Comparator() { // from class: androidx.media3.ui.A
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z.c.b((z.c) obj, (z.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator f31605f = new Comparator() { // from class: androidx.media3.ui.B
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z.c.a((z.c) obj, (z.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f31608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f31609d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f31606a, cVar.f31606a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f31608c.compareTo(cVar.f31608c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f31609d.compareTo(cVar.f31609d);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f31607b, cVar.f31607b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f31608c.compareTo(cVar2.f31608c);
            return iCompareTo != 0 ? iCompareTo : cVar.f31609d.compareTo(cVar2.f31609d);
        }

        private c(int i10, int i11, String str, String str2) {
            this.f31606a = i10;
            this.f31607b = i11;
            this.f31608c = str;
            this.f31609d = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f31610a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f31611b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", AbstractC2012v.k());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), AbstractC2012v.k());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(AbstractC2925c.a("bg_" + iIntValue), a0.I("background-color:%s;", AbstractC2925c.b(iIntValue)));
        }
        SparseArray sparseArrayC = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, iKeyAt)));
            d dVar = (d) sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f31611b, c.f31605f);
            Iterator it2 = dVar.f31611b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f31609d);
            }
            Collections.sort(dVar.f31610a, c.f31604e);
            Iterator it3 = dVar.f31610a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f31608c);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f31601a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray c(Spanned spanned, float f10) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f10);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                AbstractC6614a.e(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f31610a.add(cVar);
                f(sparseArray, spanEnd).f31611b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C6409g) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof C6413k)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof C6411i) {
                return "<rt>" + b(((C6411i) obj).f59095a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return a0.I("<span style='color:%s;'>", AbstractC2925c.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return a0.I("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof C6409g) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return a0.I("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r3.getSize() : r3.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return a0.I("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return a0.I("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof C6411i)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof C6413k)) {
                return null;
            }
            C6413k c6413k = (C6413k) obj;
            return a0.I("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(c6413k.f59100a, c6413k.f59101b), g(c6413k.f59102c));
        }
        int i10 = ((C6411i) obj).f59096b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray sparseArray, int i10) {
        d dVar = (d) sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
