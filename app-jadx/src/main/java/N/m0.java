package N;

import Td.AbstractC2163n;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f12498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f12499b = AbstractC2163n.a(Td.q.f17463c, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.view.O f12500c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = m0.this.f12498a.getContext().getSystemService("input_method");
            AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public m0(View view) {
        this.f12498a = view;
        this.f12500c = new androidx.core.view.O(view);
    }

    private final InputMethodManager f() {
        return (InputMethodManager) this.f12499b.getValue();
    }

    @Override // N.l0
    public void a(int i10, int i11, int i12, int i13) {
        f().updateSelection(this.f12498a, i10, i11, i12, i13);
    }

    @Override // N.l0
    public boolean b() {
        return f().isActive(this.f12498a);
    }

    @Override // N.l0
    public void c() {
        f().restartInput(this.f12498a);
    }

    @Override // N.l0
    public void d() {
        if (Build.VERSION.SDK_INT >= 34) {
            C1940e.f12491a.a(f(), this.f12498a);
        }
    }

    @Override // N.l0
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        f().updateCursorAnchorInfo(this.f12498a, cursorAnchorInfo);
    }

    @Override // N.l0
    public void updateExtractedText(int i10, ExtractedText extractedText) {
        f().updateExtractedText(this.f12498a, i10, extractedText);
    }
}
