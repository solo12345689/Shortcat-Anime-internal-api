.class public final Lcom/swmansion/rnscreens/D;
.super Lcom/facebook/react/views/view/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/D$a;
    }
.end annotation


# static fields
.field public static final j:Lcom/swmansion/rnscreens/D$a;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactContext;

.field private b:I

.field private c:I

.field private d:Z

.field private e:F

.field private f:I

.field private g:Z

.field private final h:Lcom/swmansion/rnscreens/D$c;

.field private i:Lcom/swmansion/rnscreens/D$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/D$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/D$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/D;->j:Lcom/swmansion/rnscreens/D$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/swmansion/rnscreens/D;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    iput v0, p0, Lcom/swmansion/rnscreens/D;->c:I

    .line 13
    .line 14
    new-instance v0, Lcom/swmansion/rnscreens/D$c;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/D$c;-><init>(Lcom/swmansion/rnscreens/D;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/swmansion/rnscreens/D;->h:Lcom/swmansion/rnscreens/D$c;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v1, "getDecorView(...)"

    .line 36
    .line 37
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, Landroidx/core/view/a0;->C0(Landroid/view/View;Landroidx/core/view/p0$b;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lcom/swmansion/rnscreens/D$b;

    .line 44
    .line 45
    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/D$b;-><init>(Lcom/swmansion/rnscreens/D;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/swmansion/rnscreens/D;->i:Lcom/swmansion/rnscreens/D$b;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "[RNScreens] Context detached from activity while creating ScreenFooter"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
.end method

.method public static final synthetic B(Lcom/swmansion/rnscreens/D;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/swmansion/rnscreens/D;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic C(Lcom/swmansion/rnscreens/D;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/swmansion/rnscreens/D;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic D(Lcom/swmansion/rnscreens/D;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/swmansion/rnscreens/D;->e:F

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic E(Lcom/swmansion/rnscreens/D;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->getReactHeight()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic F(Lcom/swmansion/rnscreens/D;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/swmansion/rnscreens/D;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic G(Lcom/swmansion/rnscreens/D;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/D;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic H(Lcom/swmansion/rnscreens/D;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/swmansion/rnscreens/D;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic I(Lcom/swmansion/rnscreens/D;F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/swmansion/rnscreens/D;->e:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic J(Lcom/swmansion/rnscreens/D;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/swmansion/rnscreens/D;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic K(Lcom/swmansion/rnscreens/D;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/D;->S(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic L(Lcom/swmansion/rnscreens/D;F)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/D;->T(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic N(Lcom/swmansion/rnscreens/D;IIIIILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/swmansion/rnscreens/D;->M(IIII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final Q()Lcom/swmansion/rnscreens/y;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->getScreenParent()Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v1, "Required value was null."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method private final R()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v1, "Required value was null."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method private final S(I)I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->R()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-eq p1, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    if-eq p1, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x5

    .line 12
    if-eq p1, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x6

    .line 15
    if-ne p1, v1, :cond_0

    .line 16
    .line 17
    iget p1, p0, Lcom/swmansion/rnscreens/D;->b:I

    .line 18
    .line 19
    int-to-float p1, p1

    .line 20
    const/4 v1, 0x1

    .line 21
    int-to-float v1, v1

    .line 22
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o0()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sub-float/2addr v1, v0

    .line 27
    mul-float/2addr p1, v1

    .line 28
    float-to-int p1, p1

    .line 29
    return p1

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string v0, "[RNScreens] use of stable-state method for unstable state"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    iget p1, p0, Lcom/swmansion/rnscreens/D;->b:I

    .line 39
    .line 40
    return p1

    .line 41
    :cond_2
    iget p1, p0, Lcom/swmansion/rnscreens/D;->b:I

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q0()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    sub-int/2addr p1, v0

    .line 48
    return p1

    .line 49
    :cond_3
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n0()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1
.end method

.method private final T(F)I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->getScreenParent()Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 v0, 0x4

    .line 13
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/D;->S(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-direct {p0, v1}, Lcom/swmansion/rnscreens/D;->S(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    invoke-static {v0, v1, p1}, LB9/a;->c(FFF)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    float-to-int p1, p1

    .line 29
    return p1
.end method

.method private final getHasReceivedInitialLayoutFromParent()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/D;->b:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method private final getReactHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private final getReactWidth()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private final getScreenParent()Lcom/swmansion/rnscreens/y;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/swmansion/rnscreens/y;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/swmansion/rnscreens/y;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method private final getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Lcom/swmansion/rnscreens/y;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->Q()Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method


# virtual methods
.method public final M(IIII)V
    .locals 0

    .line 1
    sub-int/2addr p1, p2

    .line 2
    sub-int/2addr p1, p3

    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-static {p4, p2}, Ljava/lang/Math;->max(II)I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    sub-int/2addr p1, p3

    .line 9
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->getReactHeight()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0, p1}, Landroid/view/View;->setTop(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    add-int/2addr p1, p3

    .line 25
    invoke-virtual {p0, p1}, Landroid/view/View;->setBottom(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final O(ZIIIII)V
    .locals 7

    .line 1
    iput p6, p0, Lcom/swmansion/rnscreens/D;->b:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->getReactHeight()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->R()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->r0()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/D;->S(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v5, 0x8

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    move-object v0, p0

    .line 24
    move v1, p6

    .line 25
    invoke-static/range {v0 .. v6}, Lcom/swmansion/rnscreens/D;->N(Lcom/swmansion/rnscreens/D;IIIIILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final P(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    .line 1
    const-string v0, "behavior"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/D;->g:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/rnscreens/D;->i:Lcom/swmansion/rnscreens/D$b;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/D;->g:Z

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final U(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    .line 1
    const-string v0, "behavior"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/D;->g:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/rnscreens/D;->i:Lcom/swmansion/rnscreens/D$b;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D0(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/D;->g:Z

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final getReactContext()Lcom/facebook/react/bridge/ReactContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/D;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/g;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/swmansion/rnscreens/D;->P(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/swmansion/rnscreens/D;->U(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/facebook/react/views/view/g;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->getHasReceivedInitialLayoutFromParent()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget p2, p1, Lcom/swmansion/rnscreens/D;->b:I

    .line 13
    .line 14
    sub-int/2addr p5, p3

    .line 15
    invoke-direct {p0}, Lcom/swmansion/rnscreens/D;->R()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-virtual {p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->r0()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    invoke-direct {p0, p3}, Lcom/swmansion/rnscreens/D;->S(I)I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    iget p4, p1, Lcom/swmansion/rnscreens/D;->f:I

    .line 28
    .line 29
    invoke-virtual {p0, p2, p5, p3, p4}, Lcom/swmansion/rnscreens/D;->M(IIII)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
