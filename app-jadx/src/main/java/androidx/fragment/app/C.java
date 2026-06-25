package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e2.AbstractC4642c;
import f2.C4755c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final K f29726a;

    C(K k10) {
        this.f29726a = k10;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        S sC;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f29726a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4642c.f45788a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(AbstractC4642c.f45789b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC4642c.f45790c, -1);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC4642c.f45791d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC2846z.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qP0 = resourceId != -1 ? this.f29726a.p0(resourceId) : null;
        if (abstractComponentCallbacksC2838qP0 == null && string != null) {
            abstractComponentCallbacksC2838qP0 = this.f29726a.q0(string);
        }
        if (abstractComponentCallbacksC2838qP0 == null && id2 != -1) {
            abstractComponentCallbacksC2838qP0 = this.f29726a.p0(id2);
        }
        if (abstractComponentCallbacksC2838qP0 == null) {
            abstractComponentCallbacksC2838qP0 = this.f29726a.B0().a(context.getClassLoader(), attributeValue);
            abstractComponentCallbacksC2838qP0.mFromLayout = true;
            abstractComponentCallbacksC2838qP0.mFragmentId = resourceId != 0 ? resourceId : id2;
            abstractComponentCallbacksC2838qP0.mContainerId = id2;
            abstractComponentCallbacksC2838qP0.mTag = string;
            abstractComponentCallbacksC2838qP0.mInLayout = true;
            K k10 = this.f29726a;
            abstractComponentCallbacksC2838qP0.mFragmentManager = k10;
            abstractComponentCallbacksC2838qP0.mHost = k10.D0();
            abstractComponentCallbacksC2838qP0.onInflate(this.f29726a.D0().f(), attributeSet, abstractComponentCallbacksC2838qP0.mSavedFragmentState);
            sC = this.f29726a.l(abstractComponentCallbacksC2838qP0);
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC2838qP0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (abstractComponentCallbacksC2838qP0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            abstractComponentCallbacksC2838qP0.mInLayout = true;
            K k11 = this.f29726a;
            abstractComponentCallbacksC2838qP0.mFragmentManager = k11;
            abstractComponentCallbacksC2838qP0.mHost = k11.D0();
            abstractComponentCallbacksC2838qP0.onInflate(this.f29726a.D0().f(), attributeSet, abstractComponentCallbacksC2838qP0.mSavedFragmentState);
            sC = this.f29726a.C(abstractComponentCallbacksC2838qP0);
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC2838qP0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C4755c.g(abstractComponentCallbacksC2838qP0, viewGroup);
        abstractComponentCallbacksC2838qP0.mContainer = viewGroup;
        sC.m();
        sC.j();
        View view2 = abstractComponentCallbacksC2838qP0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (abstractComponentCallbacksC2838qP0.mView.getTag() == null) {
            abstractComponentCallbacksC2838qP0.mView.setTag(string);
        }
        abstractComponentCallbacksC2838qP0.mView.addOnAttachStateChangeListener(new a(sC));
        return abstractComponentCallbacksC2838qP0.mView;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f29727a;

        a(S s10) {
            this.f29727a = s10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = this.f29727a.k();
            this.f29727a.m();
            c0.u((ViewGroup) abstractComponentCallbacksC2838qK.mView.getParent(), C.this.f29726a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
