package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SearchView f44676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f44677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f44678c;

    public o0(SearchView searchView) {
        AbstractC5504s.h(searchView, "searchView");
        this.f44676a = searchView;
    }

    private final ImageView a() {
        return (ImageView) this.f44676a.findViewById(i.f.f48089z);
    }

    private final EditText b() {
        View viewFindViewById = this.f44676a.findViewById(i.f.f48051E);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    private final ImageView c() {
        return (ImageView) this.f44676a.findViewById(i.f.f48088y);
    }

    private final View d() {
        return this.f44676a.findViewById(i.f.f48050D);
    }

    public final void e(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            c().setColorFilter(iIntValue);
            a().setColorFilter(iIntValue);
        }
    }

    public final void f(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            EditText editTextB = b();
            if (editTextB != null) {
                editTextB.setHintTextColor(iIntValue);
            }
        }
    }

    public final void g(String placeholder, boolean z10) {
        AbstractC5504s.h(placeholder, "placeholder");
        if (z10) {
            this.f44676a.setQueryHint(placeholder);
            return;
        }
        EditText editTextB = b();
        if (editTextB != null) {
            editTextB.setHint(placeholder);
        }
    }

    public final void h(Integer num) {
        EditText editTextB;
        ColorStateList textColors;
        Integer num2 = this.f44677b;
        if (num == null) {
            if (num2 == null || (editTextB = b()) == null) {
                return;
            }
            editTextB.setTextColor(num2.intValue());
            return;
        }
        if (num2 == null) {
            EditText editTextB2 = b();
            this.f44677b = (editTextB2 == null || (textColors = editTextB2.getTextColors()) == null) ? null : Integer.valueOf(textColors.getDefaultColor());
        }
        EditText editTextB3 = b();
        if (editTextB3 != null) {
            editTextB3.setTextColor(num.intValue());
        }
    }

    public final void i(Integer num) {
        Drawable drawable = this.f44678c;
        if (num != null) {
            if (drawable == null) {
                this.f44678c = d().getBackground();
            }
            d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            d().setBackground(drawable);
        }
    }
}
