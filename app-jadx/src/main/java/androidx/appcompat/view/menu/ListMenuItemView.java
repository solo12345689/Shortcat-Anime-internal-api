package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.h0;
import i.AbstractC4956a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f24648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f24649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f24650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f24651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f24652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f24653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f24654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f24655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f24656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f24657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f24658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f24659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f24660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f24661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f24662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LayoutInflater f24663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f24664q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47941C);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f24656i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(i.g.f48097h, (ViewGroup) this, false);
        this.f24652e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(i.g.f48098i, (ViewGroup) this, false);
        this.f24649b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(i.g.f48100k, (ViewGroup) this, false);
        this.f24650c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f24663p == null) {
            this.f24663p = LayoutInflater.from(getContext());
        }
        return this.f24663p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f24654g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f24655h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24655h.getLayoutParams();
        rect.top += this.f24655h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f24648a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f24648a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f24648a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f24653f.setText(this.f24648a.h());
        }
        if (this.f24653f.getVisibility() != i10) {
            this.f24653f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f24657j);
        TextView textView = (TextView) findViewById(i.f.f48060N);
        this.f24651d = textView;
        int i10 = this.f24658k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f24659l, i10);
        }
        this.f24653f = (TextView) findViewById(i.f.f48053G);
        ImageView imageView = (ImageView) findViewById(i.f.f48056J);
        this.f24654g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f24661n);
        }
        this.f24655h = (ImageView) findViewById(i.f.f48082s);
        this.f24656i = (LinearLayout) findViewById(i.f.f48076m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f24649b != null && this.f24660m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f24649b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f24650c == null && this.f24652e == null) {
            return;
        }
        if (this.f24648a.m()) {
            if (this.f24650c == null) {
                g();
            }
            compoundButton = this.f24650c;
            view = this.f24652e;
        } else {
            if (this.f24652e == null) {
                e();
            }
            compoundButton = this.f24652e;
            view = this.f24650c;
        }
        if (z10) {
            compoundButton.setChecked(this.f24648a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f24652e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f24650c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f24648a.m()) {
            if (this.f24650c == null) {
                g();
            }
            compoundButton = this.f24650c;
        } else {
            if (this.f24652e == null) {
                e();
            }
            compoundButton = this.f24652e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f24664q = z10;
        this.f24660m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f24655h;
        if (imageView != null) {
            imageView.setVisibility((this.f24662o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f24648a.z() || this.f24664q;
        if (z10 || this.f24660m) {
            ImageView imageView = this.f24649b;
            if (imageView == null && drawable == null && !this.f24660m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f24660m) {
                this.f24649b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f24649b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f24649b.getVisibility() != 0) {
                this.f24649b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f24651d.getVisibility() != 8) {
                this.f24651d.setVisibility(8);
            }
        } else {
            this.f24651d.setText(charSequence);
            if (this.f24651d.getVisibility() != 0) {
                this.f24651d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        h0 h0VarV = h0.v(getContext(), attributeSet, i.j.f48227T1, i10, 0);
        this.f24657j = h0VarV.g(i.j.f48237V1);
        this.f24658k = h0VarV.n(i.j.f48232U1, -1);
        this.f24660m = h0VarV.a(i.j.f48242W1, false);
        this.f24659l = context;
        this.f24661n = h0VarV.g(i.j.f48247X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC4956a.f47979z, 0);
        this.f24662o = typedArrayObtainStyledAttributes.hasValue(0);
        h0VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
