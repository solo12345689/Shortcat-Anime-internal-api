package R8;

import Y8.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends Y8.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final V f15228c = new V();

    private V() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) throws c.a {
        V v10 = f15228c;
        try {
            return (View) Y8.b.h(((I) v10.b(context)).K3(Y8.b.G3(context), new T(1, i10, i11, null)));
        } catch (Exception e10) {
            throw new c.a("Could not get button with size " + i10 + " and color " + i11, e10);
        }
    }

    @Override // Y8.c
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new I(iBinder);
    }
}
