package d2;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: renamed from: d2.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C4559c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    private final TextView f44990a;

    /* JADX INFO: renamed from: b */
    private final a f44991b;

    /* JADX INFO: renamed from: d2.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
            return androidx.emoji2.text.e.h(inputConnection, editable, i10, i11, z10);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.e.k()) {
                androidx.emoji2.text.e.c().x(editorInfo);
            }
        }
    }

    C4559c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable b() {
        return this.f44990a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f44991b.a(this, b(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f44991b.a(this, b(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    C4559c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f44990a = textView;
        this.f44991b = aVar;
        aVar.b(editorInfo);
    }
}
