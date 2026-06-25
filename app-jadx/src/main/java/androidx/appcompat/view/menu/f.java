package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f24757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.b f24758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f24759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.a f24760d;

    public f(e eVar) {
        this.f24757a = eVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void a(e eVar, boolean z10) {
        if (z10 || eVar == this.f24757a) {
            c();
        }
        j.a aVar = this.f24760d;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean b(e eVar) {
        j.a aVar = this.f24760d;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.b bVar = this.f24758b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        e eVar = this.f24757a;
        b.a aVar = new b.a(eVar.w());
        c cVar = new c(aVar.getContext(), i.g.f48099j);
        this.f24759c = cVar;
        cVar.e(this);
        this.f24757a.b(this.f24759c);
        aVar.a(this.f24759c.b(), this);
        View viewA = eVar.A();
        if (viewA != null) {
            aVar.b(viewA);
        } else {
            aVar.c(eVar.y()).setTitle(eVar.z());
        }
        aVar.h(this);
        androidx.appcompat.app.b bVarCreate = aVar.create();
        this.f24758b = bVarCreate;
        bVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f24758b.getWindow().getAttributes();
        attributes.type = ErrorCodes.MALFORMED_URL_EXCEPTION;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f24758b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f24757a.O((g) this.f24759c.b().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f24759c.a(this.f24757a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f24758b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f24758b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f24757a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f24757a.performShortcut(i10, keyEvent, 0);
    }
}
