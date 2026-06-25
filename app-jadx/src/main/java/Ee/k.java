package Ee;

import he.AbstractC4945a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k {
    public static final C1528g a(Annotation[] annotationArr, Xe.c fqName) {
        Annotation annotation;
        AbstractC5504s.h(annotationArr, "<this>");
        AbstractC5504s.h(fqName, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (AbstractC5504s.c(AbstractC1527f.e(AbstractC4945a.b(AbstractC4945a.a(annotation))).a(), fqName)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new C1528g(annotation);
        }
        return null;
    }

    public static final List b(Annotation[] annotationArr) {
        AbstractC5504s.h(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C1528g(annotation));
        }
        return arrayList;
    }
}
