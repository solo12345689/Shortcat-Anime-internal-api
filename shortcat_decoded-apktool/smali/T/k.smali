.class public final LT/k;
.super Landroid/view/View;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/k$a;
    }
.end annotation


# static fields
.field public static final f:LT/k$a;

.field public static final g:I

.field private static final h:[I

.field private static final i:[I


# instance fields
.field private a:LT/p;

.field private b:Ljava/lang/Boolean;

.field private c:Ljava/lang/Long;

.field private d:Ljava/lang/Runnable;

.field private e:Lie/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LT/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LT/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LT/k;->f:LT/k$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, LT/k;->g:I

    .line 12
    .line 13
    const v0, 0x10100a7

    .line 14
    .line 15
    .line 16
    const v1, 0x101009e

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v1}, [I

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LT/k;->h:[I

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    sput-object v0, LT/k;->i:[I

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(LT/k;)V
    .locals 0

    .line 1
    invoke-static {p0}, LT/k;->setRippleState$lambda$2(LT/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(Z)V
    .locals 1

    .line 1
    new-instance v0, LT/p;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LT/p;-><init>(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LT/k;->a:LT/p;

    .line 10
    .line 11
    return-void
.end method

.method private final setRippleState(Z)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, LT/k;->d:Ljava/lang/Runnable;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, LT/k;->c:Ljava/lang/Long;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    :goto_0
    sub-long v2, v0, v2

    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    const-wide/16 v4, 0x5

    .line 31
    .line 32
    cmp-long v2, v2, v4

    .line 33
    .line 34
    if-gez v2, :cond_2

    .line 35
    .line 36
    new-instance p1, LT/j;

    .line 37
    .line 38
    invoke-direct {p1, p0}, LT/j;-><init>(LT/k;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, LT/k;->d:Ljava/lang/Runnable;

    .line 42
    .line 43
    const-wide/16 v2, 0x32

    .line 44
    .line 45
    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    if-eqz p1, :cond_3

    .line 50
    .line 51
    sget-object p1, LT/k;->h:[I

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    sget-object p1, LT/k;->i:[I

    .line 55
    .line 56
    :goto_1
    iget-object v2, p0, LT/k;->a:LT/p;

    .line 57
    .line 58
    if-nez v2, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 62
    .line 63
    .line 64
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, LT/k;->c:Ljava/lang/Long;

    .line 69
    .line 70
    return-void
.end method

.method private static final setRippleState$lambda$2(LT/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, LT/k;->a:LT/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v1, LT/k;->i:[I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 9
    .line 10
    .line 11
    :goto_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, LT/k;->d:Ljava/lang/Runnable;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(LB/o$b;ZJIJFLie/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, LT/k;->a:LT/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LT/k;->b:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-direct {p0, p2}, LT/k;->c(Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, LT/k;->b:Ljava/lang/Boolean;

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, LT/k;->a:LT/p;

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object p9, p0, LT/k;->e:Lie/a;

    .line 32
    .line 33
    invoke-virtual {v0, p5}, LT/p;->c(I)V

    .line 34
    .line 35
    .line 36
    move-wide p4, p3

    .line 37
    move-object p3, p0

    .line 38
    invoke-virtual/range {p3 .. p8}, LT/k;->f(JJF)V

    .line 39
    .line 40
    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, LB/o$b;->a()J

    .line 44
    .line 45
    .line 46
    move-result-wide p4

    .line 47
    invoke-static {p4, p5}, Lr0/f;->m(J)F

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-virtual {p1}, LB/o$b;->a()J

    .line 52
    .line 53
    .line 54
    move-result-wide p4

    .line 55
    invoke-static {p4, p5}, Lr0/f;->n(J)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-virtual {v0, p2, p1}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    int-to-float p1, p1

    .line 72
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    int-to-float p2, p2

    .line 81
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    .line 82
    .line 83
    .line 84
    :goto_0
    const/4 p1, 0x1

    .line 85
    invoke-direct {p0, p1}, LT/k;->setRippleState(Z)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LT/k;->e:Lie/a;

    .line 3
    .line 4
    iget-object v0, p0, LT/k;->d:Ljava/lang/Runnable;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LT/k;->d:Ljava/lang/Runnable;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, LT/k;->a:LT/p;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v1, LT/k;->i:[I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, LT/k;->a:LT/p;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    const/4 v1, 0x0

    .line 36
    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LT/k;->setRippleState(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final f(JJF)V
    .locals 1

    .line 1
    iget-object v0, p0, LT/k;->a:LT/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p3, p4, p5}, LT/p;->b(JF)V

    .line 7
    .line 8
    .line 9
    new-instance p3, Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-static {p1, p2}, Lr0/l;->i(J)F

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    invoke-static {p4}, Lke/a;->d(F)I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    invoke-static {p1, p2}, Lr0/l;->g(J)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Lke/a;->d(F)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-direct {p3, p2, p2, p4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 29
    .line 30
    .line 31
    iget p1, p3, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/view/View;->setLeft(I)V

    .line 34
    .line 35
    .line 36
    iget p1, p3, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/view/View;->setTop(I)V

    .line 39
    .line 40
    .line 41
    iget p1, p3, Landroid/graphics/Rect;->right:I

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroid/view/View;->setRight(I)V

    .line 44
    .line 45
    .line 46
    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Landroid/view/View;->setBottom(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p1, p0, LT/k;->e:Lie/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public refreshDrawableState()V
    .locals 0

    .line 1
    return-void
.end method
