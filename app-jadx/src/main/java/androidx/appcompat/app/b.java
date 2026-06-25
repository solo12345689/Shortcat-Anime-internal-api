package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import i.AbstractC4956a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class b extends r implements DialogInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AlertController f24388f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f24389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24390b;

        public a(Context context) {
            this(context, b.m(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f24389a;
            bVar.f24370w = listAdapter;
            bVar.f24371x = onClickListener;
            return this;
        }

        public a b(View view) {
            this.f24389a.f24354g = view;
            return this;
        }

        public a c(Drawable drawable) {
            this.f24389a.f24351d = drawable;
            return this;
        }

        public b create() {
            b bVar = new b(this.f24389a.f24348a, this.f24390b);
            this.f24389a.a(bVar.f24388f);
            bVar.setCancelable(this.f24389a.f24365r);
            if (this.f24389a.f24365r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f24389a.f24366s);
            bVar.setOnDismissListener(this.f24389a.f24367t);
            DialogInterface.OnKeyListener onKeyListener = this.f24389a.f24368u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public a d(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f24389a;
            bVar.f24369v = charSequenceArr;
            bVar.f24371x = onClickListener;
            return this;
        }

        public a e(CharSequence charSequence) {
            this.f24389a.f24355h = charSequence;
            return this;
        }

        public a f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f24389a;
            bVar.f24359l = charSequence;
            bVar.f24361n = onClickListener;
            return this;
        }

        public a g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f24389a;
            bVar.f24362o = charSequence;
            bVar.f24364q = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f24389a.f24348a;
        }

        public a h(DialogInterface.OnKeyListener onKeyListener) {
            this.f24389a.f24368u = onKeyListener;
            return this;
        }

        public a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f24389a;
            bVar.f24356i = charSequence;
            bVar.f24358k = onClickListener;
            return this;
        }

        public a j(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f24389a;
            bVar.f24370w = listAdapter;
            bVar.f24371x = onClickListener;
            bVar.f24341I = i10;
            bVar.f24340H = true;
            return this;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f24389a;
            bVar.f24359l = bVar.f24348a.getText(i10);
            this.f24389a.f24361n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f24389a;
            bVar.f24356i = bVar.f24348a.getText(i10);
            this.f24389a.f24358k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f24389a.f24353f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f24389a;
            bVar.f24373z = view;
            bVar.f24372y = 0;
            bVar.f24337E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f24389a = new AlertController.b(new ContextThemeWrapper(context, b.m(context, i10)));
            this.f24390b = i10;
        }
    }

    protected b(Context context, int i10) {
        super(context, m(context, i10));
        this.f24388f = new AlertController(getContext(), this, getWindow());
    }

    static int m(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC4956a.f47965l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView l() {
        return this.f24388f.d();
    }

    @Override // androidx.appcompat.app.r, androidx.activity.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24388f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f24388f.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f24388f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.r, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f24388f.p(charSequence);
    }
}
