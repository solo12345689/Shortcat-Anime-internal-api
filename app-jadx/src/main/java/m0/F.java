package m0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class F extends AutofillManager$AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f52880a = new F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52881b = 8;

    private F() {
    }

    public final void a(C5606d c5606d) {
        c5606d.a().registerCallback(AbstractC5602C.a(this));
    }

    public final void b(C5606d c5606d) {
        c5606d.a().unregisterCallback(AbstractC5602C.a(this));
    }

    public void onAutofillEvent(View view, int i10, int i11) {
        super.onAutofillEvent(view, i10, i11);
        Log.d("Autofill Status", i11 != 1 ? i11 != 2 ? i11 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
