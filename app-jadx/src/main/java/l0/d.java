package l0;

import K0.Y;
import Ud.AbstractC2273n;
import androidx.compose.ui.platform.V0;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(((Field) obj).getName(), ((Field) obj2).getName());
        }
    }

    public static final boolean a(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final Object b(Object obj) {
        return obj.getClass();
    }

    public static final void c(V0 v02, Y y10) {
        List listK0 = AbstractC2273n.K0(y10.getClass().getDeclaredFields(), new a());
        int size = listK0.size();
        for (int i10 = 0; i10 < size; i10++) {
            Field field = (Field) listK0.get(i10);
            if (!field.getDeclaringClass().isAssignableFrom(Y.class)) {
                try {
                    field.setAccessible(true);
                    v02.b().c(field.getName(), field.get(y10));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
