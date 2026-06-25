.class public interface abstract LK0/p0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE0/S;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/p0$a;,
        LK0/p0$b;
    }
.end annotation


# static fields
.field public static final N:LK0/p0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LK0/p0$a;->a:LK0/p0$a;

    .line 2
    .line 3
    sput-object v0, LK0/p0;->N:LK0/p0$a;

    .line 4
    .line 5
    return-void
.end method

.method public static synthetic I(LK0/p0;LK0/J;ZZZILjava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p6, :cond_3

    .line 2
    .line 3
    and-int/lit8 p6, p5, 0x2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p6, :cond_0

    .line 7
    .line 8
    move p2, v0

    .line 9
    :cond_0
    and-int/lit8 p6, p5, 0x4

    .line 10
    .line 11
    if-eqz p6, :cond_1

    .line 12
    .line 13
    move p3, v0

    .line 14
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 15
    .line 16
    if-eqz p5, :cond_2

    .line 17
    .line 18
    const/4 p4, 0x1

    .line 19
    :cond_2
    invoke-interface {p0, p1, p2, p3, p4}, LK0/p0;->A(LK0/J;ZZZ)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 24
    .line 25
    const-string p1, "Super calls with default arguments not supported in this target, function: onRequestMeasure"

    .line 26
    .line 27
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0
.end method

.method public static synthetic h(LK0/p0;Lkotlin/jvm/functions/Function2;Lie/a;Lv0/c;ILjava/lang/Object;)LK0/o0;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x4

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2, p3}, LK0/p0;->p(Lkotlin/jvm/functions/Function2;Lie/a;Lv0/c;)LK0/o0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: createLayer"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static synthetic j(LK0/p0;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    and-int/2addr p2, p3

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    move p1, p3

    .line 8
    :cond_0
    invoke-interface {p0, p1}, LK0/p0;->c(Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: measureAndLayout"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static synthetic n(LK0/p0;LK0/J;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2}, LK0/p0;->J(LK0/J;Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static synthetic v(LK0/p0;LK0/J;ZZILjava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    move p2, v0

    .line 9
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    move p3, v0

    .line 14
    :cond_1
    invoke-interface {p0, p1, p2, p3}, LK0/p0;->y(LK0/J;ZZ)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: onRequestRelayout"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method


# virtual methods
.method public abstract A(LK0/J;ZZZ)V
.end method

.method public abstract C(F)V
.end method

.method public abstract D(LK0/J;)V
.end method

.method public abstract F(Lie/a;)V
.end method

.method public abstract G()V
.end method

.method public abstract H()V
.end method

.method public abstract J(LK0/J;Z)V
.end method

.method public abstract K(LK0/J;)V
.end method

.method public abstract c(Z)V
.end method

.method public abstract e(LK0/J;)V
.end method

.method public abstract f(J)J
.end method

.method public abstract getAccessibilityManager()Landroidx/compose/ui/platform/i;
.end method

.method public abstract getAutofill()Lm0/k;
.end method

.method public abstract getAutofillManager()Lm0/G;
.end method

.method public abstract getAutofillTree()Lm0/H;
.end method

.method public abstract getClipboard()Landroidx/compose/ui/platform/s0;
.end method

.method public abstract getClipboardManager()Landroidx/compose/ui/platform/t0;
.end method

.method public abstract getCoroutineContext()LZd/i;
.end method

.method public abstract getDensity()Li1/d;
.end method

.method public abstract getDragAndDropManager()Lo0/c;
.end method

.method public abstract getFocusOwner()Lq0/j;
.end method

.method public abstract getFontFamilyResolver()LY0/u$b;
.end method

.method public abstract getFontLoader()LY0/t$a;
.end method

.method public abstract getGraphicsContext()Ls0/Z0;
.end method

.method public abstract getHapticFeedBack()Lz0/a;
.end method

.method public abstract getInputModeManager()LA0/b;
.end method

.method public abstract getLayoutDirection()Li1/t;
.end method

.method public abstract getModifierLocalManager()LJ0/f;
.end method

.method public abstract getOutOfFrameExecutor()LK0/n0;
.end method

.method public abstract getPlacementScope()Landroidx/compose/ui/layout/s$a;
.end method

.method public abstract getPointerIconService()LE0/z;
.end method

.method public abstract getRectManager()LS0/b;
.end method

.method public abstract getRoot()LK0/J;
.end method

.method public abstract getSemanticsOwner()LR0/v;
.end method

.method public abstract getSharedDrawScope()LK0/L;
.end method

.method public abstract getShowLayoutBounds()Z
.end method

.method public abstract getSnapshotObserver()LK0/r0;
.end method

.method public abstract getSoftwareKeyboardController()Landroidx/compose/ui/platform/o1;
.end method

.method public abstract getTextInputService()La1/W;
.end method

.method public abstract getTextToolbar()Landroidx/compose/ui/platform/s1;
.end method

.method public abstract getViewConfiguration()Landroidx/compose/ui/platform/A1;
.end method

.method public abstract getWindowInfo()Landroidx/compose/ui/platform/F1;
.end method

.method public abstract i(Landroid/view/View;)V
.end method

.method public abstract k(LK0/J;I)V
.end method

.method public abstract l(LK0/J;I)V
.end method

.method public abstract p(Lkotlin/jvm/functions/Function2;Lie/a;Lv0/c;)LK0/o0;
.end method

.method public abstract r(LK0/J;)V
.end method

.method public abstract s(LK0/J;J)V
.end method

.method public abstract setShowLayoutBounds(Z)V
.end method

.method public abstract t(LK0/J;)V
.end method

.method public abstract u(J)J
.end method

.method public abstract x(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
.end method

.method public abstract y(LK0/J;ZZ)V
.end method

.method public abstract z(LK0/J;)V
.end method
