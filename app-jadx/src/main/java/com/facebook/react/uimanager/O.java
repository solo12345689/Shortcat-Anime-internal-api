package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface O {
    void addChildAt(O o10, int i10);

    void addNativeChildAt(O o10, int i10);

    void calculateLayout();

    void calculateLayout(float f10, float f11);

    Iterable calculateLayoutOnChildren();

    void dirty();

    void dispatchUpdates(float f10, float f11, j0 j0Var, C3309z c3309z);

    boolean dispatchUpdatesWillChangeLayout(float f10, float f11);

    void dispose();

    O getChildAt(int i10);

    int getChildCount();

    Integer getHeightMeasureSpec();

    com.facebook.yoga.h getLayoutDirection();

    float getLayoutHeight();

    O getLayoutParent();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    EnumC3307x getNativeKind();

    int getNativeOffsetForChild(O o10);

    O getNativeParent();

    O getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    YogaValue getStyleHeight();

    YogaValue getStyleWidth();

    C3284b0 getThemedContext();

    String getViewClass();

    Integer getWidthMeasureSpec();

    boolean hasUpdates();

    int indexOf(O o10);

    int indexOfNativeChild(O o10);

    boolean isDescendantOf(O o10);

    boolean isLayoutOnly();

    boolean isVirtual();

    void markUpdateSeen();

    void onBeforeLayout(C3309z c3309z);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    O removeChildAt(int i10);

    O removeNativeChildAt(int i10);

    void setIsLayoutOnly(boolean z10);

    void setLayoutDirection(com.facebook.yoga.h hVar);

    void setLayoutParent(O o10);

    void setLocalData(Object obj);

    void setMeasureSpecs(int i10, int i11);

    void setPadding(int i10, float f10);

    void setReactTag(int i10);

    void setRootTag(int i10);

    void setStyleHeight(float f10);

    void setStyleWidth(float f10);

    void setThemedContext(C3284b0 c3284b0);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(Q q10);
}
