package Jb;

import Ud.AbstractC2279u;
import Y4.n;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String it) {
        AbstractC5504s.h(it, "it");
        return it;
    }

    private final Object f(Uri uri, int i10, Object obj, Function1 function1) {
        List<String> pathSegments = uri.getPathSegments();
        AbstractC5504s.g(pathSegments, "getPathSegments(...)");
        String str = (String) AbstractC2279u.p0(pathSegments, i10);
        return str == null ? obj : function1.invoke(str);
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a b(f model, int i10, int i11, S4.h options) {
        AbstractC5504s.h(model, "model");
        AbstractC5504s.h(options, "options");
        return new n.a(new n5.c(model), new a((String) f(model.b(), 0, null, new Function1() { // from class: Jb.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.e((String) obj);
            }
        }), model.c(), model.a(), 1.0f));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean a(f model) {
        AbstractC5504s.h(model, "model");
        return true;
    }
}
