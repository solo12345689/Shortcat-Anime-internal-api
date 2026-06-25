package androidx.media3.ui;

import G3.C1592a;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s2.C6403a;

/* JADX INFO: renamed from: androidx.media3.ui.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2923a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a */
    private final List f31383a;

    /* JADX INFO: renamed from: b */
    private List f31384b;

    /* JADX INFO: renamed from: c */
    private int f31385c;

    /* JADX INFO: renamed from: d */
    private float f31386d;

    /* JADX INFO: renamed from: e */
    private C1592a f31387e;

    /* JADX INFO: renamed from: f */
    private float f31388f;

    public C2923a(Context context) {
        this(context, null);
    }

    private static C6403a b(C6403a c6403a) {
        C6403a.b bVarP = c6403a.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (c6403a.f59051f == 0) {
            bVarP.h(1.0f - c6403a.f59050e, 0);
        } else {
            bVarP.h((-c6403a.f59050e) - 1.0f, 1);
        }
        int i10 = c6403a.f59052g;
        if (i10 == 0) {
            bVarP.i(2);
        } else if (i10 == 2) {
            bVarP.i(0);
        }
        return bVarP.a();
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List list, C1592a c1592a, float f10, int i10, float f11) {
        this.f31384b = list;
        this.f31387e = c1592a;
        this.f31386d = f10;
        this.f31385c = i10;
        this.f31388f = f11;
        while (this.f31383a.size() < list.size()) {
            this.f31383a.add(new C(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f31384b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float f10 = F.f(this.f31385c, this.f31386d, height, i10);
        if (f10 <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C6403a c6403aB = (C6403a) list.get(i11);
            if (c6403aB.f59061p != Integer.MIN_VALUE) {
                c6403aB = b(c6403aB);
            }
            ((C) this.f31383a.get(i11)).b(c6403aB, this.f31387e, f10, F.f(c6403aB.f59059n, c6403aB.f59060o, height, i10), this.f31388f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public C2923a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31383a = new ArrayList();
        this.f31384b = Collections.EMPTY_LIST;
        this.f31385c = 0;
        this.f31386d = 0.0533f;
        this.f31387e = C1592a.f7129g;
        this.f31388f = 0.08f;
    }
}
