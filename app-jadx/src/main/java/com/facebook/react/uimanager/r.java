package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class r extends P {
    boolean mCollapsable;
    private final b mTempYogaValue = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f37816a;

        static {
            int[] iArr = new int[com.facebook.yoga.w.values().length];
            f37816a = iArr;
            try {
                iArr[com.facebook.yoga.w.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37816a[com.facebook.yoga.w.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37816a[com.facebook.yoga.w.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37816a[com.facebook.yoga.w.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a */
        float f37817a;

        /* JADX INFO: renamed from: b */
        com.facebook.yoga.w f37818b;

        /* synthetic */ b(AbstractC3302s abstractC3302s) {
            this();
        }

        void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.f37818b = com.facebook.yoga.w.UNDEFINED;
                this.f37817a = com.facebook.yoga.g.f38662b;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                if (dynamic.getType() == ReadableType.Number) {
                    this.f37818b = com.facebook.yoga.w.POINT;
                    this.f37817a = B.h(dynamic.asDouble());
                    return;
                } else {
                    this.f37818b = com.facebook.yoga.w.UNDEFINED;
                    this.f37817a = com.facebook.yoga.g.f38662b;
                    return;
                }
            }
            String strAsString = dynamic.asString();
            if (strAsString.equals("auto")) {
                this.f37818b = com.facebook.yoga.w.AUTO;
                this.f37817a = com.facebook.yoga.g.f38662b;
            } else {
                if (strAsString.endsWith("%")) {
                    this.f37818b = com.facebook.yoga.w.PERCENT;
                    this.f37817a = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
                    return;
                }
                AbstractC7283a.I("ReactNative", "Unknown value: " + strAsString);
                this.f37818b = com.facebook.yoga.w.UNDEFINED;
                this.f37817a = com.facebook.yoga.g.f38662b;
            }
        }

        private b() {
        }
    }

    static {
        W6.b.a("LayoutShadowNode", W6.a.f20778b);
    }

    private int e(int i10) {
        if (com.facebook.react.modules.i18nmanager.a.f().d(getThemedContext())) {
            if (i10 == 0) {
                return 4;
            }
            if (i10 == 2) {
                return 5;
            }
        }
        return i10;
    }

    @B7.a(name = "alignContent")
    public void setAlignContent(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignContent(com.facebook.yoga.a.FLEX_START);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignContent(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                setAlignContent(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                setAlignContent(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                setAlignContent(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                setAlignContent(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                setAlignContent(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignContent(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                setAlignContent(com.facebook.yoga.a.SPACE_AROUND);
                break;
            case "space-evenly":
                setAlignContent(com.facebook.yoga.a.SPACE_EVENLY);
                break;
            default:
                AbstractC7283a.I("ReactNative", "invalid value for alignContent: " + str);
                setAlignContent(com.facebook.yoga.a.FLEX_START);
                break;
        }
    }

    @B7.a(name = "alignItems")
    public void setAlignItems(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignItems(com.facebook.yoga.a.STRETCH);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignItems(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                setAlignItems(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                setAlignItems(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                setAlignItems(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                setAlignItems(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                setAlignItems(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignItems(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                setAlignItems(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                AbstractC7283a.I("ReactNative", "invalid value for alignItems: " + str);
                setAlignItems(com.facebook.yoga.a.STRETCH);
                break;
        }
    }

    @B7.a(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignSelf(com.facebook.yoga.a.AUTO);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignSelf(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                setAlignSelf(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                setAlignSelf(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                setAlignSelf(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                setAlignSelf(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                setAlignSelf(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignSelf(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                setAlignSelf(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                AbstractC7283a.I("ReactNative", "invalid value for alignSelf: " + str);
                setAlignSelf(com.facebook.yoga.a.AUTO);
                break;
        }
    }

    @B7.a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f10) {
        setStyleAspectRatio(f10);
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i10, float f10) {
        if (isVirtual()) {
            return;
        }
        setBorder(e(D0.f37517b[i10]), B.i(f10));
    }

    @B7.a(name = "collapsable")
    public void setCollapsable(boolean z10) {
        this.mCollapsable = z10;
    }

    @B7.a(name = "columnGap")
    public void setColumnGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            setColumnGap(this.mTempYogaValue.f37817a);
        } else if (i10 == 4) {
            setColumnGapPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "display")
    public void setDisplay(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setDisplay(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals("flex")) {
            setDisplay(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals("none")) {
            setDisplay(com.facebook.yoga.i.NONE);
            return;
        }
        AbstractC7283a.I("ReactNative", "invalid value for display: " + str);
        setDisplay(com.facebook.yoga.i.FLEX);
    }

    @Override // com.facebook.react.uimanager.P
    @B7.a(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f10) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(f10);
    }

    @B7.a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setFlexBasis(this.mTempYogaValue.f37817a);
        } else if (i10 == 3) {
            setFlexBasisAuto();
        } else if (i10 == 4) {
            setFlexBasisPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexDirection(com.facebook.yoga.l.COLUMN);
            return;
        }
        switch (str) {
            case "row-reverse":
                setFlexDirection(com.facebook.yoga.l.ROW_REVERSE);
                break;
            case "column":
                setFlexDirection(com.facebook.yoga.l.COLUMN);
                break;
            case "row":
                setFlexDirection(com.facebook.yoga.l.ROW);
                break;
            case "column-reverse":
                setFlexDirection(com.facebook.yoga.l.COLUMN_REVERSE);
                break;
            default:
                AbstractC7283a.I("ReactNative", "invalid value for flexDirection: " + str);
                setFlexDirection(com.facebook.yoga.l.COLUMN);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.P
    @B7.a(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f10) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(f10);
    }

    @Override // com.facebook.react.uimanager.P
    @B7.a(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f10) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(f10);
    }

    @B7.a(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexWrap(com.facebook.yoga.x.NO_WRAP);
            return;
        }
        switch (str) {
            case "nowrap":
                setFlexWrap(com.facebook.yoga.x.NO_WRAP);
                break;
            case "wrap-reverse":
                setFlexWrap(com.facebook.yoga.x.WRAP_REVERSE);
                break;
            case "wrap":
                setFlexWrap(com.facebook.yoga.x.WRAP);
                break;
            default:
                AbstractC7283a.I("ReactNative", "invalid value for flexWrap: " + str);
                setFlexWrap(com.facebook.yoga.x.NO_WRAP);
                break;
        }
    }

    @B7.a(name = "gap")
    public void setGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            setGap(this.mTempYogaValue.f37817a);
        } else if (i10 == 4) {
            setGapPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleHeight(this.mTempYogaValue.f37817a);
        } else if (i10 == 3) {
            setStyleHeightAuto();
        } else if (i10 == 4) {
            setStyleHeightPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setJustifyContent(com.facebook.yoga.n.FLEX_START);
            return;
        }
        switch (str) {
            case "center":
                setJustifyContent(com.facebook.yoga.n.CENTER);
                break;
            case "flex-start":
                setJustifyContent(com.facebook.yoga.n.FLEX_START);
                break;
            case "space-between":
                setJustifyContent(com.facebook.yoga.n.SPACE_BETWEEN);
                break;
            case "flex-end":
                setJustifyContent(com.facebook.yoga.n.FLEX_END);
                break;
            case "space-around":
                setJustifyContent(com.facebook.yoga.n.SPACE_AROUND);
                break;
            case "space-evenly":
                setJustifyContent(com.facebook.yoga.n.SPACE_EVENLY);
                break;
            default:
                AbstractC7283a.I("ReactNative", "invalid value for justifyContent: " + str);
                setJustifyContent(com.facebook.yoga.n.FLEX_START);
                break;
        }
    }

    @B7.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iE = e(D0.f37518c[i10]);
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setMargin(iE, this.mTempYogaValue.f37817a);
        } else if (i11 == 3) {
            setMarginAuto(iE);
        } else if (i11 == 4) {
            setMarginPercent(iE, this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleMaxHeight(this.mTempYogaValue.f37817a);
        } else if (i10 == 4) {
            setStyleMaxHeightPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleMaxWidth(this.mTempYogaValue.f37817a);
        } else if (i10 == 4) {
            setStyleMaxWidthPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleMinHeight(this.mTempYogaValue.f37817a);
        } else if (i10 == 4) {
            setStyleMinHeightPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleMinWidth(this.mTempYogaValue.f37817a);
        } else if (i10 == 4) {
            setStyleMinWidthPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "overflow")
    public void setOverflow(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setOverflow(com.facebook.yoga.u.VISIBLE);
            return;
        }
        switch (str) {
            case "hidden":
                setOverflow(com.facebook.yoga.u.HIDDEN);
                break;
            case "scroll":
                setOverflow(com.facebook.yoga.u.SCROLL);
                break;
            case "visible":
                setOverflow(com.facebook.yoga.u.VISIBLE);
                break;
            default:
                AbstractC7283a.I("ReactNative", "invalid value for overflow: " + str);
                setOverflow(com.facebook.yoga.u.VISIBLE);
                break;
        }
    }

    @B7.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i10, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iE = e(D0.f37518c[i10]);
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setPadding(iE, this.mTempYogaValue.f37817a);
        } else if (i11 == 4) {
            setPaddingPercent(iE, this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "position")
    public void setPosition(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setPositionType(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("relative")) {
            setPositionType(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("absolute")) {
            setPositionType(com.facebook.yoga.v.ABSOLUTE);
            return;
        }
        AbstractC7283a.I("ReactNative", "invalid value for position: " + str);
        setPositionType(com.facebook.yoga.v.RELATIVE);
    }

    @B7.b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i10, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iE = e(new int[]{4, 5, 0, 2, 1, 3}[i10]);
        this.mTempYogaValue.a(dynamic);
        int i11 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setPosition(iE, this.mTempYogaValue.f37817a);
        } else if (i11 == 4) {
            setPositionPercent(iE, this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "rowGap")
    public void setRowGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            setRowGap(this.mTempYogaValue.f37817a);
        } else if (i10 == 4) {
            setRowGapPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.P
    @B7.a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z10) {
        super.setShouldNotifyOnLayout(z10);
    }

    @B7.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.a(dynamic);
        int i10 = a.f37816a[this.mTempYogaValue.f37818b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleWidth(this.mTempYogaValue.f37817a);
        } else if (i10 == 3) {
            setStyleWidthAuto();
        } else if (i10 == 4) {
            setStyleWidthPercent(this.mTempYogaValue.f37817a);
        }
        dynamic.recycle();
    }

    @B7.a(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z10) {
    }

    @B7.a(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @B7.a(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z10) {
    }

    @B7.a(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z10) {
    }

    @B7.a(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z10) {
    }

    @B7.b(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i10, Dynamic dynamic) {
    }

    @B7.b(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i10, Dynamic dynamic) {
    }

    @B7.b(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i10, Dynamic dynamic) {
    }

    @B7.b(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i10, Dynamic dynamic) {
    }

    @B7.b(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i10, Dynamic dynamic) {
    }

    @B7.b(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i10, Dynamic dynamic) {
    }
}
