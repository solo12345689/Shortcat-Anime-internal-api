package N;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a */
    private static Function1 f12536a = a.f12537a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f12537a = new a();

        a() {
            super(1, m0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final m0 invoke(View view) {
            return new m0(view);
        }
    }

    public static final q0 b() {
        return new C1936a();
    }

    public static final Function1 c() {
        return f12536a;
    }

    public static final void d(EditorInfo editorInfo) {
        if (androidx.emoji2.text.e.k()) {
            androidx.emoji2.text.e.c().x(editorInfo);
        }
    }
}
