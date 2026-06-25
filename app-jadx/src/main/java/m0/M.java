package m0;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface M {
    void a(View view, int i10, AutofillValue autofillValue);

    void b(View view, int i10);

    void c(View view, int i10, boolean z10);

    void commit();

    void d(View view, int i10, Rect rect);
}
