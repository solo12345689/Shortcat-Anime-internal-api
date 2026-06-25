.class public Lcom/facebook/react/views/scroll/j;
.super Landroid/widget/HorizontalScrollView;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/F;
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;
.implements Landroid/view/View$OnLayoutChangeListener;
.implements Lcom/facebook/react/views/scroll/h;
.implements Lcom/facebook/react/uimanager/K;
.implements Lcom/facebook/react/views/scroll/n$c;
.implements Lcom/facebook/react/views/scroll/n$e;
.implements Lcom/facebook/react/views/scroll/n$a;
.implements Lcom/facebook/react/views/scroll/n$b;
.implements Lcom/facebook/react/views/scroll/n$d;
.implements Lcom/facebook/react/views/scroll/s;


# static fields
.field private static final o0:Z = false

.field private static final p0:Ljava/lang/String; = "j"

.field private static q0:Ljava/lang/reflect/Field; = null

.field private static r0:Z = false


# instance fields
.field private A:Z

.field private B:I

.field private C:I

.field private D:Lcom/facebook/react/uimanager/a0;

.field private E:Lcom/facebook/react/views/scroll/n$h;

.field private F:Lcom/facebook/react/uimanager/C;

.field private G:J

.field private H:I

.field private I:Landroid/view/View;

.field private a:I

.field private final b:Lcom/facebook/react/views/scroll/g;

.field private final c:Landroid/widget/OverScroller;

.field private final d:Lcom/facebook/react/views/scroll/q;

.field private final e:Landroid/graphics/Rect;

.field private final f:Landroid/animation/ValueAnimator;

.field private g:Landroid/graphics/Rect;

.field private h:Lcom/facebook/react/views/scroll/v;

.field private i:Z

.field private j:Landroid/graphics/Rect;

.field private k:LH7/v;

.field private l:Z

.field private l0:Lcom/facebook/react/views/scroll/f;

.field private m:Z

.field private m0:I

.field private n:Ljava/lang/Runnable;

.field private n0:I

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Ljava/lang/String;

.field private s:Landroid/graphics/drawable/Drawable;

.field private t:I

.field private u:Z

.field private v:I

.field private w:Ljava/util/List;

.field private x:Z

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/views/scroll/a;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/high16 p1, -0x80000000

    .line 5
    .line 6
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->a:I

    .line 7
    .line 8
    new-instance p1, Lcom/facebook/react/views/scroll/g;

    .line 9
    .line 10
    invoke-direct {p1}, Lcom/facebook/react/views/scroll/g;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->b:Lcom/facebook/react/views/scroll/g;

    .line 14
    .line 15
    new-instance p1, Lcom/facebook/react/views/scroll/q;

    .line 16
    .line 17
    invoke-direct {p1}, Lcom/facebook/react/views/scroll/q;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->d:Lcom/facebook/react/views/scroll/q;

    .line 21
    .line 22
    new-instance p1, Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->e:Landroid/graphics/Rect;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    filled-new-array {p1, p1}, [I

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-string v0, "scrollX"

    .line 35
    .line 36
    invoke-static {p0, v0, p2}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iput-object p2, p0, Lcom/facebook/react/views/scroll/j;->f:Landroid/animation/ValueAnimator;

    .line 41
    .line 42
    new-instance p2, Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, Lcom/facebook/react/views/scroll/j;->g:Landroid/graphics/Rect;

    .line 48
    .line 49
    sget-object p2, LH7/v;->d:LH7/v;

    .line 50
    .line 51
    iput-object p2, p0, Lcom/facebook/react/views/scroll/j;->k:LH7/v;

    .line 52
    .line 53
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/j;->p:Z

    .line 57
    .line 58
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->t:I

    .line 59
    .line 60
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->u:Z

    .line 61
    .line 62
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->v:I

    .line 63
    .line 64
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/j;->x:Z

    .line 65
    .line 66
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/j;->y:Z

    .line 67
    .line 68
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->z:I

    .line 69
    .line 70
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->A:Z

    .line 71
    .line 72
    const/4 p2, -0x1

    .line 73
    iput p2, p0, Lcom/facebook/react/views/scroll/j;->B:I

    .line 74
    .line 75
    iput p2, p0, Lcom/facebook/react/views/scroll/j;->C:I

    .line 76
    .line 77
    const/4 p2, 0x0

    .line 78
    iput-object p2, p0, Lcom/facebook/react/views/scroll/j;->D:Lcom/facebook/react/uimanager/a0;

    .line 79
    .line 80
    sget-object p2, Lcom/facebook/react/uimanager/C;->e:Lcom/facebook/react/uimanager/C;

    .line 81
    .line 82
    iput-object p2, p0, Lcom/facebook/react/views/scroll/j;->F:Lcom/facebook/react/uimanager/C;

    .line 83
    .line 84
    const-wide/16 v0, 0x0

    .line 85
    .line 86
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/j;->G:J

    .line 87
    .line 88
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->H:I

    .line 89
    .line 90
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->m0:I

    .line 91
    .line 92
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->n0:I

    .line 93
    .line 94
    new-instance p2, Lcom/facebook/react/views/scroll/l;

    .line 95
    .line 96
    invoke-direct {p2}, Lcom/facebook/react/views/scroll/l;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, p2}, Landroidx/core/view/a0;->k0(Landroid/view/View;Landroidx/core/view/a;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->getOverScrollerFromParent()Landroid/widget/OverScroller;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    iput-object p2, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 107
    .line 108
    invoke-virtual {p0, p0}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->y()V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method private A(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/j;->v(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->e:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->e:Landroid/graphics/Rect;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    div-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    if-ge p1, v0, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method private B()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method private C(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/j;->v(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method private D(I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, Lcom/facebook/react/views/scroll/j;->f:Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    invoke-static {p0, p1, v1, v0, v1}, Lcom/facebook/react/views/scroll/n;->u(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 28
    .line 29
    return p1

    .line 30
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/facebook/react/views/scroll/n$h;->d()Landroid/graphics/Point;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget v1, v1, Landroid/graphics/Point;->x:I

    .line 43
    .line 44
    invoke-static {p0, v0, v1, p1}, Lcom/facebook/react/views/scroll/n;->p(Landroid/view/ViewGroup;III)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/j;->t(I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    add-int/2addr v0, p1

    .line 53
    return v0
.end method

.method private E(II)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v2, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-virtual {v2, v3}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 44
    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalX()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getStartX()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    sub-int/2addr v0, v1

    .line 61
    int-to-float v0, v0

    .line 62
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    mul-float/2addr v1, v0

    .line 73
    iget-object v2, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    float-to-int v5, v1

    .line 80
    const/4 v9, 0x0

    .line 81
    const/4 v10, 0x0

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    move v3, p1

    .line 85
    move v8, p2

    .line 86
    invoke-virtual/range {v2 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    move v3, p1

    .line 91
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/widget/OverScroller;->getCurrX()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    sub-int/2addr p1, v0

    .line 98
    add-int/2addr p1, v3

    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/j;->scrollTo(II)V

    .line 104
    .line 105
    .line 106
    :cond_2
    return-void
.end method

.method private I(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/j;->v(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->scrollBy(II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private K(II)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "setPendingContentOffsets[%d] x %d y %d"

    .line 24
    .line 25
    invoke-static {v0, v4, v1, v2, v3}, Lz5/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->z()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 p1, -0x1

    .line 35
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->B:I

    .line 36
    .line 37
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->C:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->B:I

    .line 41
    .line 42
    iput p2, p0, Lcom/facebook/react/views/scroll/j;->C:I

    .line 43
    .line 44
    return-void
.end method

.method private L(I)V
    .locals 11

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "smoothScrollAndSnap[%d] velocity %d"

    .line 20
    .line 21
    invoke-static {v0, v3, v1, v2}, Lz5/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->getSnapInterval()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-double v0, v0

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/n$h;->d()Landroid/graphics/Point;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget v3, v3, Landroid/graphics/Point;->x:I

    .line 42
    .line 43
    invoke-static {p0, v2, v3, p1}, Lcom/facebook/react/views/scroll/n;->p(Landroid/view/ViewGroup;III)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    int-to-double v2, v2

    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/j;->D(I)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    int-to-double v4, v4

    .line 53
    div-double v6, v2, v0

    .line 54
    .line 55
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v8

    .line 59
    double-to-int v8, v8

    .line 60
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    double-to-int v9, v9

    .line 65
    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    long-to-int v6, v6

    .line 70
    div-double/2addr v4, v0

    .line 71
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    long-to-int v4, v4

    .line 76
    if-lez p1, :cond_1

    .line 77
    .line 78
    if-ne v9, v8, :cond_1

    .line 79
    .line 80
    add-int/lit8 v9, v9, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    if-gez p1, :cond_2

    .line 84
    .line 85
    if-ne v8, v9, :cond_2

    .line 86
    .line 87
    add-int/lit8 v8, v8, -0x1

    .line 88
    .line 89
    :cond_2
    :goto_0
    if-lez p1, :cond_3

    .line 90
    .line 91
    if-ge v6, v9, :cond_3

    .line 92
    .line 93
    if-le v4, v8, :cond_3

    .line 94
    .line 95
    move v6, v9

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    if-gez p1, :cond_4

    .line 98
    .line 99
    if-le v6, v8, :cond_4

    .line 100
    .line 101
    if-ge v4, v9, :cond_4

    .line 102
    .line 103
    move v6, v8

    .line 104
    :cond_4
    :goto_1
    int-to-double v4, v6

    .line 105
    mul-double/2addr v4, v0

    .line 106
    cmpl-double p1, v4, v2

    .line 107
    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    const/4 p1, 0x1

    .line 111
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->i:Z

    .line 112
    .line 113
    double-to-int p1, v4

    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/views/scroll/j;->b(II)V

    .line 119
    .line 120
    .line 121
    :cond_5
    return-void
.end method

.method private M(I)V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "smoothScrollToNextPage[%d] direction %d"

    .line 20
    .line 21
    invoke-static {v0, v3, v1, v2}, Lz5/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    div-int v2, v1, v0

    .line 33
    .line 34
    rem-int/2addr v1, v0

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    :cond_1
    const/16 v1, 0x11

    .line 40
    .line 41
    if-ne p1, v1, :cond_2

    .line 42
    .line 43
    add-int/lit8 v2, v2, -0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    :goto_0
    const/4 p1, 0x0

    .line 49
    if-gez v2, :cond_3

    .line 50
    .line 51
    move v2, p1

    .line 52
    :cond_3
    mul-int/2addr v2, v0

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, v2, v0}, Lcom/facebook/react/views/scroll/j;->b(II)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, p1, p1}, Lcom/facebook/react/views/scroll/j;->x(II)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private O()V
    .locals 0

    .line 1
    return-void
.end method

.method static bridge synthetic e(Lcom/facebook/react/views/scroll/j;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/scroll/j;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic f(Lcom/facebook/react/views/scroll/j;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic g(Lcom/facebook/react/views/scroll/j;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/scroll/j;->q:Z

    .line 2
    .line 3
    return p0
.end method

.method private getContentView()Landroid/view/View;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method private getOverScrollerFromParent()Landroid/widget/OverScroller;
    .locals 3

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->r0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, Lcom/facebook/react/views/scroll/j;->r0:Z

    .line 7
    .line 8
    :try_start_0
    const-class v1, Landroid/widget/HorizontalScrollView;

    .line 9
    .line 10
    const-string v2, "mScroller"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lcom/facebook/react/views/scroll/j;->q0:Ljava/lang/reflect/Field;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 23
    .line 24
    const-string v1, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :("

    .line 25
    .line 26
    invoke-static {v0, v1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    sget-object v0, Lcom/facebook/react/views/scroll/j;->q0:Ljava/lang/reflect/Field;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v2, v0, Landroid/widget/OverScroller;

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    move-object v1, v0

    .line 43
    check-cast v1, Landroid/widget/OverScroller;

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catch_1
    move-exception v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 49
    .line 50
    const-string v2, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :("

    .line 51
    .line 52
    invoke-static {v0, v2}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 57
    .line 58
    const-string v2, "Failed to get mScroller from HorizontalScrollView!"

    .line 59
    .line 60
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :cond_2
    :goto_2
    return-object v1
.end method

.method private getSnapInterval()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->v:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method static bridge synthetic h(Lcom/facebook/react/views/scroll/j;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic i(Lcom/facebook/react/views/scroll/j;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->n:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic j(Lcom/facebook/react/views/scroll/j;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/j;->s(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic k(Lcom/facebook/react/views/scroll/j;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/j;->x(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private m(IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->end()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    sub-int/2addr p4, p3

    .line 23
    sub-int/2addr p2, p1

    .line 24
    sub-int p1, p2, p4

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    invoke-virtual {p0, p1, p3}, Lcom/facebook/react/views/scroll/j;->scrollTo(II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    sub-int/2addr p2, p3

    .line 38
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/j;->E(II)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->n:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->n:Ljava/lang/Runnable;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method private o()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->B()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->r:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v1}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private static p(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, v0}, Lcom/facebook/react/views/scroll/j;->q(Landroid/view/View;Landroid/view/MotionEvent;Z)Landroid/widget/HorizontalScrollView;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method private static q(Landroid/view/View;Landroid/view/MotionEvent;Z)Landroid/widget/HorizontalScrollView;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    float-to-int v2, v2

    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    float-to-int v3, v3

    .line 23
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->contains(II)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    if-nez p2, :cond_2

    .line 31
    .line 32
    instance-of p2, p0, Landroid/widget/HorizontalScrollView;

    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    invoke-static {p0}, Landroidx/core/view/a0;->R(Landroid/view/View;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    instance-of p2, p0, Lcom/facebook/react/views/scroll/j;

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    move-object p2, p0

    .line 47
    check-cast p2, Lcom/facebook/react/views/scroll/j;

    .line 48
    .line 49
    iget-boolean p2, p2, Lcom/facebook/react/views/scroll/j;->p:Z

    .line 50
    .line 51
    if-eqz p2, :cond_2

    .line 52
    .line 53
    check-cast p0, Landroid/widget/HorizontalScrollView;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_2
    instance-of p2, p0, Landroid/view/ViewGroup;

    .line 57
    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    const/4 p2, 0x0

    .line 61
    move v1, p2

    .line 62
    :goto_0
    move-object v2, p0

    .line 63
    check-cast v2, Landroid/view/ViewGroup;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ge v1, v3, :cond_4

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2, p1, p2}, Lcom/facebook/react/views/scroll/j;->q(Landroid/view/View;Landroid/view/MotionEvent;Z)Landroid/widget/HorizontalScrollView;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    return-object v0
.end method

.method private s(I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-boolean v1, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "smoothScrollAndSnap[%d] velocityX %d"

    .line 22
    .line 23
    invoke-static {v1, v4, v2, v3}, Lz5/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-gtz v1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget v1, v0, Lcom/facebook/react/views/scroll/j;->v:I

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    iget-object v1, v0, Lcom/facebook/react/views/scroll/j;->w:Ljava/util/List;

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    iget v1, v0, Lcom/facebook/react/views/scroll/j;->z:I

    .line 42
    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/views/scroll/j;->L(I)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/j;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, v0, Lcom/facebook/react/views/scroll/j;->f:Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    const/4 v4, 0x0

    .line 57
    if-eq v1, v2, :cond_3

    .line 58
    .line 59
    move v1, v3

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    move v1, v4

    .line 62
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->computeHorizontalScrollRange()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    sub-int/2addr v2, v5

    .line 71
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/views/scroll/j;->D(I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    iget-boolean v6, v0, Lcom/facebook/react/views/scroll/j;->u:Z

    .line 80
    .line 81
    if-eqz v6, :cond_4

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-static {v0}, Landroidx/core/view/a0;->D(Landroid/view/View;)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    sub-int/2addr v6, v7

    .line 96
    invoke-static {v0}, Landroidx/core/view/a0;->C(Landroid/view/View;)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    sub-int/2addr v6, v7

    .line 101
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-ne v7, v3, :cond_5

    .line 106
    .line 107
    sub-int v5, v2, v5

    .line 108
    .line 109
    move/from16 v7, p1

    .line 110
    .line 111
    neg-int v7, v7

    .line 112
    goto :goto_1

    .line 113
    :cond_5
    move/from16 v7, p1

    .line 114
    .line 115
    :goto_1
    iget-object v8, v0, Lcom/facebook/react/views/scroll/j;->w:Ljava/util/List;

    .line 116
    .line 117
    if-eqz v8, :cond_8

    .line 118
    .line 119
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-nez v8, :cond_8

    .line 124
    .line 125
    iget-object v8, v0, Lcom/facebook/react/views/scroll/j;->w:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    check-cast v8, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    iget-object v9, v0, Lcom/facebook/react/views/scroll/j;->w:Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    sub-int/2addr v10, v3

    .line 144
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    check-cast v9, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    move v12, v2

    .line 155
    move v10, v4

    .line 156
    move v11, v10

    .line 157
    :goto_2
    iget-object v13, v0, Lcom/facebook/react/views/scroll/j;->w:Ljava/util/List;

    .line 158
    .line 159
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    if-ge v10, v13, :cond_e

    .line 164
    .line 165
    iget-object v13, v0, Lcom/facebook/react/views/scroll/j;->w:Ljava/util/List;

    .line 166
    .line 167
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    check-cast v13, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    if-gt v13, v5, :cond_6

    .line 178
    .line 179
    sub-int v14, v5, v13

    .line 180
    .line 181
    sub-int v15, v5, v11

    .line 182
    .line 183
    if-ge v14, v15, :cond_6

    .line 184
    .line 185
    move v11, v13

    .line 186
    :cond_6
    if-lt v13, v5, :cond_7

    .line 187
    .line 188
    sub-int v14, v13, v5

    .line 189
    .line 190
    sub-int v15, v12, v5

    .line 191
    .line 192
    if-ge v14, v15, :cond_7

    .line 193
    .line 194
    move v12, v13

    .line 195
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_8
    iget v8, v0, Lcom/facebook/react/views/scroll/j;->z:I

    .line 199
    .line 200
    if-eqz v8, :cond_d

    .line 201
    .line 202
    iget v9, v0, Lcom/facebook/react/views/scroll/j;->v:I

    .line 203
    .line 204
    if-lez v9, :cond_9

    .line 205
    .line 206
    int-to-double v10, v5

    .line 207
    int-to-double v12, v9

    .line 208
    div-double/2addr v10, v12

    .line 209
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    .line 210
    .line 211
    .line 212
    move-result-wide v12

    .line 213
    iget v9, v0, Lcom/facebook/react/views/scroll/j;->v:I

    .line 214
    .line 215
    int-to-double v14, v9

    .line 216
    mul-double/2addr v12, v14

    .line 217
    double-to-int v12, v12

    .line 218
    invoke-direct {v0, v8, v12, v9, v6}, Lcom/facebook/react/views/scroll/j;->u(IIII)I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    iget v9, v0, Lcom/facebook/react/views/scroll/j;->z:I

    .line 227
    .line 228
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 229
    .line 230
    .line 231
    move-result-wide v10

    .line 232
    iget v12, v0, Lcom/facebook/react/views/scroll/j;->v:I

    .line 233
    .line 234
    int-to-double v13, v12

    .line 235
    mul-double/2addr v10, v13

    .line 236
    double-to-int v10, v10

    .line 237
    invoke-direct {v0, v9, v10, v12, v6}, Lcom/facebook/react/views/scroll/j;->u(IIII)I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    invoke-static {v9, v2}, Ljava/lang/Math;->min(II)I

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    move v9, v2

    .line 246
    move v11, v8

    .line 247
    move v8, v4

    .line 248
    goto/16 :goto_5

    .line 249
    .line 250
    :cond_9
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/j;->getContentView()Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    check-cast v8, Landroid/view/ViewGroup;

    .line 255
    .line 256
    move v11, v2

    .line 257
    move v12, v11

    .line 258
    move v9, v4

    .line 259
    move v10, v9

    .line 260
    move v13, v10

    .line 261
    :goto_3
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getChildCount()I

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    if-ge v9, v14, :cond_c

    .line 266
    .line 267
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v14

    .line 271
    iget v15, v0, Lcom/facebook/react/views/scroll/j;->z:I

    .line 272
    .line 273
    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 278
    .line 279
    .line 280
    move-result v14

    .line 281
    invoke-direct {v0, v15, v4, v14, v6}, Lcom/facebook/react/views/scroll/j;->u(IIII)I

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-gt v4, v5, :cond_a

    .line 286
    .line 287
    sub-int v14, v5, v4

    .line 288
    .line 289
    sub-int v15, v5, v10

    .line 290
    .line 291
    if-ge v14, v15, :cond_a

    .line 292
    .line 293
    move v10, v4

    .line 294
    :cond_a
    if-lt v4, v5, :cond_b

    .line 295
    .line 296
    sub-int v14, v4, v5

    .line 297
    .line 298
    sub-int v15, v12, v5

    .line 299
    .line 300
    if-ge v14, v15, :cond_b

    .line 301
    .line 302
    move v12, v4

    .line 303
    :cond_b
    invoke-static {v11, v4}, Ljava/lang/Math;->min(II)I

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    invoke-static {v13, v4}, Ljava/lang/Math;->max(II)I

    .line 308
    .line 309
    .line 310
    move-result v13

    .line 311
    add-int/lit8 v9, v9, 0x1

    .line 312
    .line 313
    const/4 v4, 0x0

    .line 314
    goto :goto_3

    .line 315
    :cond_c
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    move v9, v2

    .line 324
    :goto_4
    const/4 v8, 0x0

    .line 325
    goto :goto_5

    .line 326
    :cond_d
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/j;->getSnapInterval()I

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    int-to-double v8, v4

    .line 331
    int-to-double v10, v5

    .line 332
    div-double/2addr v10, v8

    .line 333
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    .line 334
    .line 335
    .line 336
    move-result-wide v12

    .line 337
    mul-double/2addr v12, v8

    .line 338
    double-to-int v4, v12

    .line 339
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 340
    .line 341
    .line 342
    move-result-wide v10

    .line 343
    mul-double/2addr v10, v8

    .line 344
    double-to-int v8, v10

    .line 345
    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    .line 346
    .line 347
    .line 348
    move-result v12

    .line 349
    move v9, v2

    .line 350
    move v11, v4

    .line 351
    goto :goto_4

    .line 352
    :cond_e
    :goto_5
    sub-int v4, v5, v11

    .line 353
    .line 354
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 355
    .line 356
    .line 357
    move-result v10

    .line 358
    sub-int v13, v12, v5

    .line 359
    .line 360
    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    .line 361
    .line 362
    .line 363
    move-result v14

    .line 364
    if-ge v10, v14, :cond_f

    .line 365
    .line 366
    move v10, v11

    .line 367
    goto :goto_6

    .line 368
    :cond_f
    move v10, v12

    .line 369
    :goto_6
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 370
    .line 371
    .line 372
    move-result v14

    .line 373
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 374
    .line 375
    .line 376
    move-result v15

    .line 377
    if-ne v15, v3, :cond_10

    .line 378
    .line 379
    sub-int v14, v2, v14

    .line 380
    .line 381
    :cond_10
    iget-boolean v15, v0, Lcom/facebook/react/views/scroll/j;->y:Z

    .line 382
    .line 383
    if-nez v15, :cond_12

    .line 384
    .line 385
    if-lt v5, v9, :cond_12

    .line 386
    .line 387
    if-lt v14, v9, :cond_11

    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_11
    move v5, v9

    .line 391
    :goto_7
    const/4 v4, 0x0

    .line 392
    goto :goto_9

    .line 393
    :cond_12
    iget-boolean v9, v0, Lcom/facebook/react/views/scroll/j;->x:Z

    .line 394
    .line 395
    if-nez v9, :cond_14

    .line 396
    .line 397
    if-gt v5, v8, :cond_14

    .line 398
    .line 399
    if-gt v14, v8, :cond_13

    .line 400
    .line 401
    :goto_8
    goto :goto_7

    .line 402
    :cond_13
    move v5, v8

    .line 403
    goto :goto_7

    .line 404
    :cond_14
    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    .line 405
    .line 406
    if-lez v7, :cond_16

    .line 407
    .line 408
    if-nez v1, :cond_15

    .line 409
    .line 410
    int-to-double v4, v13

    .line 411
    mul-double/2addr v4, v8

    .line 412
    double-to-int v4, v4

    .line 413
    add-int/2addr v7, v4

    .line 414
    :cond_15
    move v5, v12

    .line 415
    goto :goto_7

    .line 416
    :cond_16
    if-gez v7, :cond_18

    .line 417
    .line 418
    if-nez v1, :cond_17

    .line 419
    .line 420
    int-to-double v4, v4

    .line 421
    mul-double/2addr v4, v8

    .line 422
    double-to-int v4, v4

    .line 423
    sub-int/2addr v7, v4

    .line 424
    :cond_17
    move v5, v11

    .line 425
    goto :goto_7

    .line 426
    :cond_18
    move v5, v10

    .line 427
    goto :goto_7

    .line 428
    :goto_9
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    .line 433
    .line 434
    .line 435
    move-result v5

    .line 436
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    if-ne v8, v3, :cond_19

    .line 441
    .line 442
    sub-int v5, v2, v5

    .line 443
    .line 444
    neg-int v7, v7

    .line 445
    :cond_19
    move v13, v5

    .line 446
    if-nez v1, :cond_1e

    .line 447
    .line 448
    iget-object v8, v0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 449
    .line 450
    if-nez v8, :cond_1a

    .line 451
    .line 452
    goto :goto_f

    .line 453
    :cond_1a
    iput-boolean v3, v0, Lcom/facebook/react/views/scroll/j;->i:Z

    .line 454
    .line 455
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 460
    .line 461
    .line 462
    move-result v10

    .line 463
    if-eqz v7, :cond_1b

    .line 464
    .line 465
    :goto_a
    move v11, v7

    .line 466
    goto :goto_b

    .line 467
    :cond_1b
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    sub-int v7, v13, v1

    .line 472
    .line 473
    goto :goto_a

    .line 474
    :goto_b
    if-eqz v13, :cond_1d

    .line 475
    .line 476
    if-ne v13, v2, :cond_1c

    .line 477
    .line 478
    goto :goto_d

    .line 479
    :cond_1c
    :goto_c
    move/from16 v17, v4

    .line 480
    .line 481
    goto :goto_e

    .line 482
    :cond_1d
    :goto_d
    div-int/lit8 v4, v6, 0x2

    .line 483
    .line 484
    goto :goto_c

    .line 485
    :goto_e
    const/16 v18, 0x0

    .line 486
    .line 487
    const/4 v12, 0x0

    .line 488
    const/4 v15, 0x0

    .line 489
    const/16 v16, 0x0

    .line 490
    .line 491
    move v14, v13

    .line 492
    invoke-virtual/range {v8 .. v18}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 496
    .line 497
    .line 498
    return-void

    .line 499
    :cond_1e
    :goto_f
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    invoke-virtual {v0, v13, v1}, Lcom/facebook/react/views/scroll/j;->b(II)V

    .line 504
    .line 505
    .line 506
    return-void
.end method

.method private u(IIII)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    sub-int/2addr p4, p3

    .line 11
    :goto_0
    sub-int/2addr p2, p4

    .line 12
    return p2

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string p3, "Invalid SnapToAlignment value: "

    .line 21
    .line 22
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget p3, p0, Lcom/facebook/react/views/scroll/j;->z:I

    .line 26
    .line 27
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    sub-int/2addr p4, p3

    .line 39
    div-int/2addr p4, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return p2
.end method

.method private v(Landroid/view/View;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->e:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->e:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->e:Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/HorizontalScrollView;->computeScrollDeltaToGetChildRectOnScreen(Landroid/graphics/Rect;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method private x(II)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "handlePostTouchScrolling[%d] velocityX %d velocityY %d"

    .line 24
    .line 25
    invoke-static {v0, v4, v1, v2, v3}, Lz5/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->n:Ljava/lang/Runnable;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->q:Z

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/n;->k(Landroid/view/ViewGroup;II)V

    .line 38
    .line 39
    .line 40
    :cond_2
    const/4 p1, 0x0

    .line 41
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->i:Z

    .line 42
    .line 43
    new-instance p1, Lcom/facebook/react/views/scroll/j$b;

    .line 44
    .line 45
    invoke-direct {p1, p0}, Lcom/facebook/react/views/scroll/j$b;-><init>(Lcom/facebook/react/views/scroll/j;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->n:Ljava/lang/Runnable;

    .line 49
    .line 50
    const-wide/16 v0, 0x14

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private y()V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->g:Landroid/graphics/Rect;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->h:Lcom/facebook/react/views/scroll/v;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->i:Z

    .line 13
    .line 14
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->j:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-static {}, Lh7/b;->t()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    sget-object v2, LH7/v;->b:LH7/v;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object v2, LH7/v;->d:LH7/v;

    .line 26
    .line 27
    :goto_0
    iput-object v2, p0, Lcom/facebook/react/views/scroll/j;->k:LH7/v;

    .line 28
    .line 29
    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->l:Z

    .line 30
    .line 31
    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 32
    .line 33
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->n:Ljava/lang/Runnable;

    .line 34
    .line 35
    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->o:Z

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    iput-boolean v2, p0, Lcom/facebook/react/views/scroll/j;->p:Z

    .line 39
    .line 40
    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->q:Z

    .line 41
    .line 42
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->r:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->s:Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    iput v1, p0, Lcom/facebook/react/views/scroll/j;->t:I

    .line 47
    .line 48
    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->u:Z

    .line 49
    .line 50
    iput v1, p0, Lcom/facebook/react/views/scroll/j;->v:I

    .line 51
    .line 52
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->w:Ljava/util/List;

    .line 53
    .line 54
    iput-boolean v2, p0, Lcom/facebook/react/views/scroll/j;->x:Z

    .line 55
    .line 56
    iput-boolean v2, p0, Lcom/facebook/react/views/scroll/j;->y:Z

    .line 57
    .line 58
    iput v1, p0, Lcom/facebook/react/views/scroll/j;->z:I

    .line 59
    .line 60
    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->A:Z

    .line 61
    .line 62
    const/4 v2, -0x1

    .line 63
    iput v2, p0, Lcom/facebook/react/views/scroll/j;->B:I

    .line 64
    .line 65
    iput v2, p0, Lcom/facebook/react/views/scroll/j;->C:I

    .line 66
    .line 67
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->D:Lcom/facebook/react/uimanager/a0;

    .line 68
    .line 69
    new-instance v2, Lcom/facebook/react/views/scroll/n$h;

    .line 70
    .line 71
    invoke-direct {v2}, Lcom/facebook/react/views/scroll/n$h;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v2, p0, Lcom/facebook/react/views/scroll/j;->E:Lcom/facebook/react/views/scroll/n$h;

    .line 75
    .line 76
    sget-object v2, Lcom/facebook/react/uimanager/C;->e:Lcom/facebook/react/uimanager/C;

    .line 77
    .line 78
    iput-object v2, p0, Lcom/facebook/react/views/scroll/j;->F:Lcom/facebook/react/uimanager/C;

    .line 79
    .line 80
    const-wide/16 v2, 0x0

    .line 81
    .line 82
    iput-wide v2, p0, Lcom/facebook/react/views/scroll/j;->G:J

    .line 83
    .line 84
    iput v1, p0, Lcom/facebook/react/views/scroll/j;->H:I

    .line 85
    .line 86
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->I:Landroid/view/View;

    .line 87
    .line 88
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->l0:Lcom/facebook/react/views/scroll/f;

    .line 89
    .line 90
    iput v1, p0, Lcom/facebook/react/views/scroll/j;->m0:I

    .line 91
    .line 92
    iput v1, p0, Lcom/facebook/react/views/scroll/j;->n0:I

    .line 93
    .line 94
    return-void
.end method

.method private z()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->getContentView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method


# virtual methods
.method F()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->y()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->O()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method protected G(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected H(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/j;->scrollTo(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public J(FI)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/t;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    sget-object v1, Lcom/facebook/react/uimanager/u;->a:Lcom/facebook/react/uimanager/u;

    .line 16
    .line 17
    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/t;-><init>(FLcom/facebook/react/uimanager/u;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v0

    .line 21
    :goto_0
    invoke-static {}, LH7/i;->values()[LH7/i;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object p2, v0, p2

    .line 26
    .line 27
    invoke-static {p0, p2, p1}, Lcom/facebook/react/uimanager/a;->s(Landroid/view/View;LH7/i;Lcom/facebook/react/uimanager/t;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public N()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/scroll/j;->updateClippingRect(Ljava/util/Set;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public a(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/j;->scrollTo(II)V

    .line 2
    .line 3
    .line 4
    const p2, 0x7fffffff

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/j;->E(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public addFocusables(Ljava/util/ArrayList;II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->A:Z

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-super {p0, v0, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-eqz p3, :cond_2

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    check-cast p3, Landroid/view/View;

    .line 32
    .line 33
    invoke-direct {p0, p3}, Lcom/facebook/react/views/scroll/j;->C(Landroid/view/View;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, p3}, Lcom/facebook/react/views/scroll/j;->c(Landroid/view/View;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p3}, Landroid/view/View;->isFocused()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    :cond_1
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    return-void

    .line 56
    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public arrowScroll(I)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->A:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-lez v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->getContentView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-ne v4, v3, :cond_1

    .line 40
    .line 41
    invoke-direct {p0, v1}, Lcom/facebook/react/views/scroll/j;->C(Landroid/view/View;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    invoke-direct {p0, v1}, Lcom/facebook/react/views/scroll/j;->A(Landroid/view/View;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/j;->M(I)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/j;->M(I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move v0, v2

    .line 65
    :goto_0
    iput-boolean v2, p0, Lcom/facebook/react/views/scroll/j;->A:Z

    .line 66
    .line 67
    return v0

    .line 68
    :cond_3
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->arrowScroll(I)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    return p1
.end method

.method public b(II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/n;->y(Landroid/view/ViewGroup;II)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/j;->K(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public c(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/j;->v(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->e:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->e:Landroid/graphics/Rect;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ge p1, v0, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1
.end method

.method public canScrollHorizontally(I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public d(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->f:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/facebook/react/views/scroll/n;->o(Landroid/content/Context;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->f:Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    int-to-long v2, v0

    .line 17
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    filled-new-array {p1, p2}, [I

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->f:Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 31
    .line 32
    .line 33
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->q:Z

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-lez v0, :cond_0

    .line 39
    .line 40
    sub-int/2addr p2, p1

    .line 41
    div-int/2addr p2, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move p2, v1

    .line 44
    :goto_0
    invoke-static {p0, p2, v1}, Lcom/facebook/react/views/scroll/n;->k(Landroid/view/ViewGroup;II)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Lcom/facebook/react/views/scroll/n;->c(Landroid/view/ViewGroup;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->F:Lcom/facebook/react/uimanager/C;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/uimanager/C;->c(Lcom/facebook/react/uimanager/C;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    if-ne v0, v1, :cond_4

    .line 18
    .line 19
    const/16 v0, 0xa

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    cmpl-float v0, v0, v1

    .line 27
    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->v:I

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->w:Ljava/util/List;

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->z:I

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->n:Ljava/lang/Runnable;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    new-instance v0, Lcom/facebook/react/views/scroll/j$a;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Lcom/facebook/react/views/scroll/j$a;-><init>(Lcom/facebook/react/views/scroll/j;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->n:Ljava/lang/Runnable;

    .line 65
    .line 66
    const-wide/16 v1, 0x14

    .line 67
    .line 68
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return p1

    .line 72
    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    return p1
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->t:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->getContentView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->s:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v1, v2, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->s:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->s:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->draw(Landroid/graphics/Canvas;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public executeKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->p:Z

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    const/16 v1, 0x15

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x16

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->executeKeyEvent(Landroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public fling(I)V
    .locals 11

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "fling[%d] velocityX %d"

    .line 20
    .line 21
    invoke-static {v0, v3, v1, v2}, Lz5/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v1, 0x1c

    .line 27
    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    int-to-float p1, p1

    .line 35
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->b:Lcom/facebook/react/views/scroll/g;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/g;->a()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    mul-float/2addr p1, v0

    .line 46
    float-to-int p1, p1

    .line 47
    :cond_1
    move v3, p1

    .line 48
    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-direct {p0, v3}, Lcom/facebook/react/views/scroll/j;->s(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-static {p0}, Landroidx/core/view/a0;->D(Landroid/view/View;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    sub-int/2addr p1, v0

    .line 69
    invoke-static {p0}, Landroidx/core/view/a0;->C(Landroid/view/View;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    sub-int/2addr p1, v0

    .line 74
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    div-int/lit8 v9, p1, 0x2

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    const/4 v4, 0x0

    .line 88
    const/4 v5, 0x0

    .line 89
    const v6, 0x7fffffff

    .line 90
    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    invoke-virtual/range {v0 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0}, Landroidx/core/view/a0;->b0(Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    invoke-super {p0, v3}, Landroid/widget/HorizontalScrollView;->fling(I)V

    .line 102
    .line 103
    .line 104
    :goto_0
    const/4 p1, 0x0

    .line 105
    invoke-direct {p0, v3, p1}, Lcom/facebook/react/views/scroll/j;->x(II)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lh7/b;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/n;->m(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    return-object v0
.end method

.method public getChildVisibleRect(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->getChildVisibleRect(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public getClippingRect(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->j:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-static {v0}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public getFadingEdgeLengthEnd()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->n0:I

    .line 2
    .line 3
    return v0
.end method

.method public getFadingEdgeLengthStart()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->m0:I

    .line 2
    .line 3
    return v0
.end method

.method public getFlingAnimator()Landroid/animation/ValueAnimator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->f:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLastScrollDispatchTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/views/scroll/j;->G:J

    .line 2
    .line 3
    return-wide v0
.end method

.method protected getLeftFadingEdgeStrength()F
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->m0:I

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/views/scroll/j;->n0:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    iget v1, p0, Lcom/facebook/react/views/scroll/j;->n0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v1, p0, Lcom/facebook/react/views/scroll/j;->m0:I

    .line 21
    .line 22
    :goto_0
    int-to-float v1, v1

    .line 23
    div-float/2addr v1, v0

    .line 24
    return v1
.end method

.method public getOverflow()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/j$c;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->k:LH7/v;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    return-object v0

    .line 22
    :cond_0
    const-string v0, "visible"

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    const-string v0, "scroll"

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    const-string v0, "hidden"

    .line 29
    .line 30
    return-object v0
.end method

.method public getOverflowInset()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->g:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerEvents()Lcom/facebook/react/uimanager/C;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->F:Lcom/facebook/react/uimanager/C;

    .line 2
    .line 3
    return-object v0
.end method

.method public getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->E:Lcom/facebook/react/views/scroll/n$h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRemoveClippedSubviews()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method protected getRightFadingEdgeStrength()F
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->m0:I

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/views/scroll/j;->n0:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    iget v1, p0, Lcom/facebook/react/views/scroll/j;->m0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v1, p0, Lcom/facebook/react/views/scroll/j;->n0:I

    .line 21
    .line 22
    :goto_0
    int-to-float v1, v1

    .line 23
    div-float/2addr v1, v0

    .line 24
    return v1
.end method

.method public getScrollEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public getScrollEventThrottle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->H:I

    .line 2
    .line 3
    return v0
.end method

.method public getStateWrapper()Lcom/facebook/react/uimanager/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->D:Lcom/facebook/react/uimanager/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVirtualViewContainerState()Lcom/facebook/react/views/scroll/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->h:Lcom/facebook/react/views/scroll/v;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/facebook/react/views/scroll/v;->c(Landroid/view/ViewGroup;)Lcom/facebook/react/views/scroll/v;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->h:Lcom/facebook/react/views/scroll/v;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->h:Lcom/facebook/react/views/scroll/v;

    .line 12
    .line 13
    return-object v0
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->o:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->N()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->l0:Lcom/facebook/react/views/scroll/f;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/f;->f()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/facebook/react/views/scroll/j;->I:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p2, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->I:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->I:Landroid/view/View;

    .line 10
    .line 11
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->l0:Lcom/facebook/react/views/scroll/f;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/f;->g()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->h:Lcom/facebook/react/views/scroll/v;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/v;->b()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->k:LH7/v;

    .line 2
    .line 3
    sget-object v1, LH7/v;->b:LH7/v;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->a(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/facebook/react/l;->v:I

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->p:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0, p1}, Lcom/facebook/react/views/scroll/j;->p(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/widget/HorizontalScrollView;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->F:Lcom/facebook/react/uimanager/C;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/facebook/react/uimanager/C;->c(Lcom/facebook/react/uimanager/C;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v2, 0x1

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/j;->w(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return v2

    .line 40
    :catch_0
    move-exception p1

    .line 41
    const-string v0, "ReactNative"

    .line 42
    .line 43
    const-string v2, "Error intercepting touch event."

    .line 44
    .line 45
    invoke-static {v0, v2, p1}, Lz5/a;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return v1
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .line 1
    sget-boolean p1, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p5

    .line 31
    filled-new-array {v1, p2, p3, p4, p5}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const-string p3, "onLayout[%d] l %d t %d r %d b %d"

    .line 36
    .line 37
    invoke-static {v0, p3, p2}, Lz5/a;->v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget p2, p0, Lcom/facebook/react/views/scroll/j;->a:I

    .line 41
    .line 42
    const/high16 p3, -0x80000000

    .line 43
    .line 44
    if-eq p2, p3, :cond_2

    .line 45
    .line 46
    iget-object p4, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 47
    .line 48
    if-eqz p4, :cond_2

    .line 49
    .line 50
    invoke-virtual {p4}, Landroid/widget/OverScroller;->getFinalX()I

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    if-eq p2, p4, :cond_2

    .line 55
    .line 56
    iget-object p2, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/widget/OverScroller;->isFinished()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-nez p2, :cond_2

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    sget-object p1, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iget p4, p0, Lcom/facebook/react/views/scroll/j;->a:I

    .line 77
    .line 78
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    const-string p5, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d"

    .line 83
    .line 84
    invoke-static {p1, p5, p2, p4}, Lz5/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 88
    .line 89
    iget p2, p0, Lcom/facebook/react/views/scroll/j;->a:I

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/widget/OverScroller;->getFinalY()I

    .line 92
    .line 93
    .line 94
    move-result p4

    .line 95
    const/4 p5, 0x0

    .line 96
    invoke-virtual {p1, p2, p4, p5, p5}, Landroid/widget/OverScroller;->startScroll(IIII)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 100
    .line 101
    const/4 p2, 0x1

    .line 102
    invoke-virtual {p1, p2}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 103
    .line 104
    .line 105
    iput p3, p0, Lcom/facebook/react/views/scroll/j;->a:I

    .line 106
    .line 107
    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->z()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    iget p1, p0, Lcom/facebook/react/views/scroll/j;->B:I

    .line 114
    .line 115
    const/4 p2, -0x1

    .line 116
    if-eq p1, p2, :cond_3

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    :goto_0
    iget p3, p0, Lcom/facebook/react/views/scroll/j;->C:I

    .line 124
    .line 125
    if-eq p3, p2, :cond_4

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    :goto_1
    invoke-virtual {p0, p1, p3}, Lcom/facebook/react/views/scroll/j;->scrollTo(II)V

    .line 133
    .line 134
    .line 135
    :cond_5
    invoke-static {p0}, Lcom/facebook/react/views/scroll/n;->e(Landroid/view/ViewGroup;)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->h:Lcom/facebook/react/views/scroll/v;

    .line 139
    .line 140
    if-eqz p1, :cond_6

    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/v;->s()V

    .line 143
    .line 144
    .line 145
    :cond_6
    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/facebook/react/views/scroll/j;->I:Landroid/view/View;

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p3, 0x1

    .line 11
    if-ne p1, p3, :cond_1

    .line 12
    .line 13
    invoke-direct {p0, p2, p4, p6, p8}, Lcom/facebook/react/views/scroll/j;->m(IIII)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->l0:Lcom/facebook/react/views/scroll/f;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/f;->h()V

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/facebook/react/views/scroll/n;->d(Landroid/view/ViewGroup;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/w;->a(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "onMeasure[%d] measured width: %d measured height: %d"

    .line 35
    .line 36
    invoke-static {v0, v4, v1, v2, v3}, Lz5/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eq v0, p2, :cond_1

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    :goto_0
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 49
    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/widget/OverScroller;->getCurrX()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->a:I

    .line 62
    .line 63
    :cond_2
    return-void
.end method

.method protected onOverScrolled(IIZZ)V
    .locals 6

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b"

    .line 36
    .line 37
    invoke-static {v0, v2, v1}, Lz5/a;->v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalX()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eq v0, v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    sub-int/2addr v0, v1

    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-lt p1, v0, :cond_1

    .line 79
    .line 80
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 83
    .line 84
    .line 85
    move p1, v0

    .line 86
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/HorizontalScrollView;->onOverScrolled(IIZZ)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 6

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "onScrollChanged[%d] x %d y %d oldx %d oldy %d"

    .line 36
    .line 37
    invoke-static {v0, v2, v1}, Lz5/a;->v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    const-string v0, "ReactHorizontalScrollView.onScrollChanged"

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    invoke-static {v1, v2, v0}, LU7/a;->c(JLjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :try_start_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onScrollChanged(IIII)V

    .line 48
    .line 49
    .line 50
    const/4 p3, 0x1

    .line 51
    iput-boolean p3, p0, Lcom/facebook/react/views/scroll/j;->i:Z

    .line 52
    .line 53
    iget-object p3, p0, Lcom/facebook/react/views/scroll/j;->b:Lcom/facebook/react/views/scroll/g;

    .line 54
    .line 55
    invoke-virtual {p3, p1, p2}, Lcom/facebook/react/views/scroll/g;->c(II)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->o:Z

    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->N()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->b:Lcom/facebook/react/views/scroll/g;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/g;->a()F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget-object p2, p0, Lcom/facebook/react/views/scroll/j;->b:Lcom/facebook/react/views/scroll/g;

    .line 78
    .line 79
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/g;->b()F

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/n;->B(Landroid/view/ViewGroup;FF)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->h:Lcom/facebook/react/views/scroll/v;

    .line 87
    .line 88
    if-eqz p1, :cond_2

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/v;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :goto_1
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 98
    .line 99
    .line 100
    throw p1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/HorizontalScrollView;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->o:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->N()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/views/scroll/j;->h:Lcom/facebook/react/views/scroll/v;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/v;->s()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->p:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->F:Lcom/facebook/react/uimanager/C;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/uimanager/C;->b(Lcom/facebook/react/uimanager/C;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->d:Lcom/facebook/react/views/scroll/q;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/q;->a(Landroid/view/MotionEvent;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v2, 0x1

    .line 26
    if-ne v0, v2, :cond_3

    .line 27
    .line 28
    iget-boolean v2, p0, Lcom/facebook/react/views/scroll/j;->l:Z

    .line 29
    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-static {p0}, Lcom/facebook/react/views/scroll/n;->z(Landroid/view/ViewGroup;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lcom/facebook/react/views/scroll/j;->d:Lcom/facebook/react/views/scroll/q;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/facebook/react/views/scroll/q;->b()F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v3, p0, Lcom/facebook/react/views/scroll/j;->d:Lcom/facebook/react/views/scroll/q;

    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/q;->c()F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {p0, v2, v3}, Lcom/facebook/react/views/scroll/n;->g(Landroid/view/ViewGroup;FF)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lh7/b;->H()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/p;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/j;->l:Z

    .line 60
    .line 61
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-direct {p0, v1, v2}, Lcom/facebook/react/views/scroll/j;->x(II)V

    .line 70
    .line 71
    .line 72
    :cond_3
    if-nez v0, :cond_4

    .line 73
    .line 74
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->n()V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    return p1
.end method

.method public pageScroll(I)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->pageScroll(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0, v0}, Lcom/facebook/react/views/scroll/j;->x(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return p1
.end method

.method public r()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/facebook/react/views/scroll/j;->I(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/j;->G(Landroid/view/View;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public scrollTo(II)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/j;->o0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/j;->p0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "scrollTo[%d] x %d y %d"

    .line 24
    .line 25
    invoke-static {v0, v4, v1, v2, v3}, Lz5/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lcom/facebook/react/views/scroll/n;->z(Landroid/view/ViewGroup;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/j;->K(II)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->m(Landroid/view/View;Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBorderRadius(F)V
    .locals 1

    .line 1
    sget-object v0, LH7/i;->a:LH7/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/views/scroll/j;->J(FI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setBorderStyle(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1}, LH7/k;->b(Ljava/lang/String;)LH7/k;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->t(Landroid/view/View;LH7/k;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setDecelerationRate(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/n$h;->k(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->c:Landroid/widget/OverScroller;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    sub-float/2addr v1, p1

    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->setFriction(F)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setDisableIntervalMomentum(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method public setEndFillColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->t:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->t:I

    .line 6
    .line 7
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 8
    .line 9
    iget v0, p0, Lcom/facebook/react/views/scroll/j;->t:I

    .line 10
    .line 11
    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->s:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setFadingEdgeLengthEnd(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->n0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setFadingEdgeLengthStart(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->m0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLastScrollDispatchTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/facebook/react/views/scroll/j;->G:J

    .line 2
    .line 3
    return-void
.end method

.method public setMaintainVisibleContentPosition(Lcom/facebook/react/views/scroll/f$a;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->l0:Lcom/facebook/react/views/scroll/f;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/facebook/react/views/scroll/f;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/scroll/f;-><init>(Landroid/view/ViewGroup;Z)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->l0:Lcom/facebook/react/views/scroll/f;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/f;->f()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->l0:Lcom/facebook/react/views/scroll/f;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/f;->g()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->l0:Lcom/facebook/react/views/scroll/f;

    .line 30
    .line 31
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->l0:Lcom/facebook/react/views/scroll/f;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/f;->e(Lcom/facebook/react/views/scroll/f$a;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public setOverflow(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LH7/v;->d:LH7/v;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->k:LH7/v;

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p1}, LH7/v;->b(Ljava/lang/String;)LH7/v;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_2

    .line 13
    .line 14
    invoke-static {}, Lh7/b;->t()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    sget-object p1, LH7/v;->b:LH7/v;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object p1, LH7/v;->d:LH7/v;

    .line 24
    .line 25
    :cond_2
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->k:LH7/v;

    .line 26
    .line 27
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public setOverflowInset(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->g:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setPagingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public setPointerEvents(Lcom/facebook/react/uimanager/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->F:Lcom/facebook/react/uimanager/C;

    .line 2
    .line 3
    return-void
.end method

.method public setReactScrollViewScrollState(Lcom/facebook/react/views/scroll/n$h;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->E:Lcom/facebook/react/views/scroll/n$h;

    .line 2
    .line 3
    invoke-static {}, Lh7/b;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lh7/b;->P()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/n$h;->e()Landroid/graphics/Point;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 22
    .line 23
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 24
    .line 25
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/scroll/j;->H(II)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setRemoveClippedSubviews(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->j:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/facebook/react/views/scroll/j;->j:Landroid/graphics/Rect;

    .line 13
    .line 14
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->o:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->N()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setScrollEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->p:Z

    .line 2
    .line 3
    return-void
.end method

.method public setScrollEventThrottle(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->H:I

    .line 2
    .line 3
    return-void
.end method

.method public setScrollPerfTag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSendMomentumEvents(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->q:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSnapInterval(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->v:I

    .line 2
    .line 3
    return-void
.end method

.method public setSnapOffsets(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->w:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public setSnapToAlignment(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/j;->z:I

    .line 2
    .line 3
    return-void
.end method

.method public setSnapToEnd(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSnapToStart(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->x:Z

    .line 2
    .line 3
    return-void
.end method

.method public setStateWrapper(Lcom/facebook/react/uimanager/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/j;->D:Lcom/facebook/react/uimanager/a0;

    .line 2
    .line 3
    return-void
.end method

.method public t(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p0, p1, v1, v0, v1}, Lcom/facebook/react/views/scroll/n;->u(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 20
    .line 21
    return p1
.end method

.method public updateClippingRect(Ljava/util/Set;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/j;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "ReactHorizontalScrollView.updateClippingRect"

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    invoke-static {v1, v2, v0}, LU7/a;->c(JLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->j:Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-static {v0}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/react/views/scroll/j;->j:Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-static {p0, v0}, Lcom/facebook/react/uimanager/G;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->getContentView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v3, v0, Lcom/facebook/react/uimanager/F;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    check-cast v0, Lcom/facebook/react/uimanager/F;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/F;->updateClippingRect(Ljava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :goto_1
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method

.method protected w(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    invoke-static {}, Lh7/b;->H()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/p;->b(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p0}, Lcom/facebook/react/views/scroll/n;->f(Landroid/view/ViewGroup;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/j;->l:Z

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/j;->o()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/j;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
