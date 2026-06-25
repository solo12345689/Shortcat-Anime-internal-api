package O8;

import R8.C2122x;
import R8.V;
import Y8.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f13059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View.OnClickListener f13060d;

    public l(Context context) {
        this(context, null);
    }

    private final void b(Context context) {
        View view = this.f13059c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f13059c = V.c(context, this.f13057a, this.f13058b);
        } catch (c.a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i10 = this.f13057a;
            int i11 = this.f13058b;
            C2122x c2122x = new C2122x(context, null);
            c2122x.a(context.getResources(), i10, i11);
            this.f13059c = c2122x;
        }
        addView(this.f13059c);
        this.f13059c.setEnabled(isEnabled());
        this.f13059c.setOnClickListener(this);
    }

    public void a(int i10, int i11) {
        this.f13057a = i10;
        this.f13058b = i11;
        b(getContext());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f13060d;
        if (onClickListener == null || view != this.f13059c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i10) {
        a(this.f13057a, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f13059c.setEnabled(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13060d = onClickListener;
        View view = this.f13059c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f13057a, this.f13058b);
    }

    public void setSize(int i10) {
        a(i10, this.f13058b);
    }

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13060d = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, M8.d.f12278b, 0, 0);
        try {
            this.f13057a = typedArrayObtainStyledAttributes.getInt(M8.d.f12279c, 0);
            this.f13058b = typedArrayObtainStyledAttributes.getInt(M8.d.f12280d, 2);
            typedArrayObtainStyledAttributes.recycle();
            a(this.f13057a, this.f13058b);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
