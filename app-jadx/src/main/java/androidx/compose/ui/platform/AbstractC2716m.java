package androidx.compose.ui.platform;

import U0.C2197e;
import Ud.AbstractC2273n;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.compose.ui.platform.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2716m {
    public static final C2197e a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C2197e(charSequence.toString(), null, 2, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iF0 = AbstractC2273n.f0(annotationArr);
        if (iF0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (AbstractC5504s.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new C2197e.d(new C2741x0(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i10 == iF0) {
                    break;
                }
                i10++;
            }
        }
        return new C2197e(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(C2197e c2197e) {
        if (c2197e.g().isEmpty()) {
            return c2197e.j();
        }
        SpannableString spannableString = new SpannableString(c2197e.j());
        E0 e02 = new E0();
        List listG = c2197e.g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2197e.d dVar = (C2197e.d) listG.get(i10);
            U0.I0 i02 = (U0.I0) dVar.a();
            int iB = dVar.b();
            int iC = dVar.c();
            e02.q();
            e02.d(i02);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", e02.p()), iB, iC, 33);
        }
        return spannableString;
    }
}
