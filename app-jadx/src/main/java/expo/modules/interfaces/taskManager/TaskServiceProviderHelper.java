package expo.modules.interfaces.taskManager;

import Sb.b;
import Ud.AbstractC2279u;
import android.content.Context;
import ib.C5055d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pb.C5956a;
import sb.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/interfaces/taskManager/TaskServiceProviderHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LSb/b;", "getTaskServiceImpl", "(Landroid/content/Context;)LSb/b;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TaskServiceProviderHelper {

    /* JADX INFO: renamed from: a */
    public static final TaskServiceProviderHelper f46117a = new TaskServiceProviderHelper();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C5956a c5956a = C5956a.f55872a;
            return Xd.a.d(Integer.valueOf(c5956a.a(O.b(((g) obj2).getClass()).u())), Integer.valueOf(c5956a.a(O.b(((g) obj).getClass()).u())));
        }
    }

    private TaskServiceProviderHelper() {
    }

    public final b getTaskServiceImpl(Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method method;
        AbstractC5504s.h(context, "context");
        try {
            C5055d.a aVar = C5055d.Companion;
            method = C5055d.class.getMethod("getPackageList", null);
        } catch (ClassNotFoundException unused) {
        }
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(null, null);
        List list = objInvoke instanceof List ? (List) objInvoke : null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof g) {
                arrayList.add(obj);
            }
        }
        List listR0 = AbstractC2279u.R0(arrayList, new a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            it.next();
        }
        android.support.v4.media.session.b.a(AbstractC2279u.o0(arrayList2));
        return null;
    }
}
