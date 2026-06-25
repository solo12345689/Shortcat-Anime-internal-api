package a1;

import Td.AbstractC2163n;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: a1.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2555w implements InterfaceC2554v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f23647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f23648b = AbstractC2163n.a(Td.q.f17463c, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.view.O f23649c;

    /* JADX INFO: renamed from: a1.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = C2555w.this.f23647a.getContext().getSystemService("input_method");
            AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public C2555w(View view) {
        this.f23647a = view;
        this.f23649c = new androidx.core.view.O(view);
    }

    private final InputMethodManager g() {
        return (InputMethodManager) this.f23648b.getValue();
    }

    @Override // a1.InterfaceC2554v
    public void a(int i10, int i11, int i12, int i13) {
        g().updateSelection(this.f23647a, i10, i11, i12, i13);
    }

    @Override // a1.InterfaceC2554v
    public boolean b() {
        return g().isActive(this.f23647a);
    }

    @Override // a1.InterfaceC2554v
    public void c() {
        g().restartInput(this.f23647a);
    }

    @Override // a1.InterfaceC2554v
    public void d() {
        this.f23649c.b();
    }

    @Override // a1.InterfaceC2554v
    public void e() {
        this.f23649c.a();
    }

    @Override // a1.InterfaceC2554v
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        g().updateCursorAnchorInfo(this.f23647a, cursorAnchorInfo);
    }

    @Override // a1.InterfaceC2554v
    public void updateExtractedText(int i10, ExtractedText extractedText) {
        g().updateExtractedText(this.f23647a, i10, extractedText);
    }
}
