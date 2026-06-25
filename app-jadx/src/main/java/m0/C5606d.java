package m0;

import Td.C2160k;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: m0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5606d implements InterfaceC5613k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f52931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f52932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AutofillManager f52933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AutofillId f52934d;

    public C5606d(View view, H h10) {
        this.f52931a = view;
        this.f52932b = h10;
        AutofillManager autofillManagerA = AbstractC5604b.a(view.getContext().getSystemService(AbstractC5603a.a()));
        if (autofillManagerA == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f52933c = autofillManagerA;
        view.setImportantForAutofill(1);
        N0.b bVarA = N0.e.a(view);
        AutofillId autofillIdA = bVarA != null ? bVarA.a() : null;
        if (autofillIdA != null) {
            this.f52934d = autofillIdA;
        } else {
            H0.a.c("Required value was null.");
            throw new C2160k();
        }
    }

    public final AutofillManager a() {
        return this.f52933c;
    }

    public final H b() {
        return this.f52932b;
    }

    public final AutofillId c() {
        return this.f52934d;
    }

    public final View d() {
        return this.f52931a;
    }
}
