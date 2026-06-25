package com.google.android.material.internal;

import L1.B;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C2662p;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import i.AbstractC4956a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends C2662p implements Checkable {

    /* JADX INFO: renamed from: g */
    private static final int[] f42476g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    private boolean f42477d;

    /* JADX INFO: renamed from: e */
    private boolean f42478e;

    /* JADX INFO: renamed from: f */
    private boolean f42479f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends C2746a {
        a() {
        }

        @Override // androidx.core.view.C2746a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            super.g(view, b10);
            b10.x0(CheckableImageButton.this.a());
            b10.y0(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends Q1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        boolean f42481c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f42481c = parcel.readInt() == 1;
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f42481c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47940B);
    }

    public boolean a() {
        return this.f42478e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f42477d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f42477d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f42476g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f42481c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f42481c = this.f42477d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f42478e != z10) {
            this.f42478e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f42478e || this.f42477d == z10) {
            return;
        }
        this.f42477d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f42479f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f42479f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f42477d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42478e = true;
        this.f42479f = true;
        AbstractC2747a0.k0(this, new a());
    }
}
