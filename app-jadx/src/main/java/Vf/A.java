package Vf;

import Ud.AbstractC2273n;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class A {
    public static final Rf.b a(String serialName, Enum[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(values, "values");
        AbstractC5504s.h(names, "names");
        AbstractC5504s.h(entryAnnotations, "entryAnnotations");
        C2354x c2354x = new C2354x(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                c2354x.x(annotation);
            }
        }
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Enum r42 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) AbstractC2273n.i0(names, i11);
            if (strName == null) {
                strName = r42.name();
            }
            C2337k0.q(c2354x, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC2273n.i0(entryAnnotations, i11);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    c2354x.w(annotation2);
                }
            }
            i10++;
            i11 = i12;
        }
        return new C2356z(serialName, values, c2354x);
    }

    public static final Rf.b b(String serialName, Enum[] values) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(values, "values");
        return new C2356z(serialName, values);
    }
}
