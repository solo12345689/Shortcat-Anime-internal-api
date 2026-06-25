package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.S;
import androidx.appcompat.widget.m0;
import n.InterfaceC5708e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends D implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g f24633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f24634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f24635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    e.b f24636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private S f24637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b f24638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f24639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f24640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f24641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f24642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f24643r;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends S {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.S
        public InterfaceC5708e b() {
            b bVar = ActionMenuItemView.this.f24638m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.S
        protected boolean c() {
            InterfaceC5708e interfaceC5708eB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f24636k;
            return bVar != null && bVar.b(actionMenuItemView.f24633h) && (interfaceC5708eB = b()) != null && interfaceC5708eB.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {
        public abstract InterfaceC5708e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f24634i);
        if (this.f24635j != null && (!this.f24633h.B() || (!this.f24639n && !this.f24640o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f24634i : null);
        CharSequence contentDescription = this.f24633h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f24633h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f24633h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            m0.a(this, z12 ? null : this.f24633h.getTitle());
        } else {
            m0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f24633h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f24633h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f24637l == null) {
            this.f24637l = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f24633h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f24636k;
        if (bVar != null) {
            bVar.b(this.f24633h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f24639n = t();
        u();
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zS = s();
        if (zS && (i12 = this.f24642q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f24641p) : this.f24641p;
        if (mode != 1073741824 && this.f24641p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zS || this.f24635j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f24635j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s10;
        if (this.f24633h.hasSubMenu() && (s10 = this.f24637l) != null && s10.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f24640o != z10) {
            this.f24640o = z10;
            g gVar = this.f24633h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f24635j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f24643r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(e.b bVar) {
        this.f24636k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f24642q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f24638m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f24634i = charSequence;
        u();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f24639n = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f48363v, i10, 0);
        this.f24641p = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f48368w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f24643r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f24642q = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
