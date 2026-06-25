.class public final LCa/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Landroidx/core/view/K0;

.field private b:Landroid/os/CancellationSignal;

.field private c:Lkotlin/jvm/functions/Function1;

.field private final d:Lkotlin/Lazy;

.field private e:Z

.field private f:Lb2/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LCa/e;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LCa/e;-><init>(LCa/f;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LCa/f;->d:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(LCa/f;F)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LCa/f;->i(LCa/f;F)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LCa/f;Lb2/h;ZFF)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LCa/f;->k(LCa/f;Lb2/h;ZFF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroidx/core/view/K0;)F
    .locals 0

    .line 1
    invoke-static {p0}, LCa/f;->j(Landroidx/core/view/K0;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic d(LCa/f;)LCa/f$a;
    .locals 0

    .line 1
    invoke-static {p0}, LCa/f;->m(LCa/f;)LCa/f$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(LCa/f;Landroidx/core/view/K0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LCa/f;->v(Landroidx/core/view/K0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic f(LCa/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LCa/f;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final g(ZLjava/lang/Float;)V
    .locals 3

    .line 1
    iget-object v0, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    new-instance v1, LCa/b;

    .line 6
    .line 7
    invoke-direct {v1, p0}, LCa/b;-><init>(LCa/f;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, LCa/c;

    .line 11
    .line 12
    invoke-direct {v2, v0}, LCa/c;-><init>(Landroidx/core/view/K0;)V

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/core/view/K0;->e()LA1/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget p1, p1, LA1/b;->d:I

    .line 22
    .line 23
    :goto_0
    int-to-float p1, p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroidx/core/view/K0;->d()LA1/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget p1, p1, LA1/b;->d:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    invoke-static {v1, v2, p1}, Lb2/i;->b(Lkotlin/jvm/functions/Function1;Lie/a;F)Lb2/m;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lb2/m;->w()Lb2/n;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    new-instance v0, Lb2/n;

    .line 43
    .line 44
    invoke-direct {v0}, Lb2/n;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lb2/m;->z(Lb2/n;)Lb2/m;

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1}, Lb2/m;->w()Lb2/n;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "spring"

    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/high16 v1, 0x3f800000    # 1.0f

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lb2/n;->f(F)Lb2/n;

    .line 62
    .line 63
    .line 64
    const v1, 0x44bb8000    # 1500.0f

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lb2/n;->h(F)Lb2/n;

    .line 68
    .line 69
    .line 70
    if-eqz p2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-virtual {p1, p2}, Lb2/h;->p(F)Lb2/h;

    .line 77
    .line 78
    .line 79
    :cond_2
    new-instance p2, LCa/d;

    .line 80
    .line 81
    invoke-direct {p2, p0}, LCa/d;-><init>(LCa/f;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lb2/h;->b(Lb2/h$q;)Lb2/h;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lb2/m;->r()V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, LCa/f;->f:Lb2/m;

    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string p2, "Controller should not be null"

    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1
.end method

.method static synthetic h(LCa/f;ZLjava/lang/Float;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, LCa/f;->g(ZLjava/lang/Float;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final i(LCa/f;F)LTd/L;
    .locals 0

    .line 1
    invoke-static {p1}, Lke/a;->d(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, LCa/f;->s(I)I

    .line 6
    .line 7
    .line 8
    sget-object p0, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final j(Landroidx/core/view/K0;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/core/view/K0;->c()LA1/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, LA1/b;->d:I

    .line 6
    .line 7
    int-to-float p0, p0

    .line 8
    return p0
.end method

.method private static final k(LCa/f;Lb2/h;ZFF)V
    .locals 0

    .line 1
    iget-object p2, p0, LCa/f;->f:Lb2/m;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, LCa/f;->f:Lb2/m;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, LCa/f;->o()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final m(LCa/f;)LCa/f$a;
    .locals 1

    .line 1
    new-instance v0, LCa/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LCa/f$a;-><init>(LCa/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final p()LCa/f$a;
    .locals 1

    .line 1
    iget-object v0, p0, LCa/f;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LCa/f$a;

    .line 8
    .line 9
    return-object v0
.end method

.method private final v(Landroidx/core/view/K0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LCa/f;->b:Landroid/os/CancellationSignal;

    .line 3
    .line 4
    iput-object p1, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 5
    .line 6
    iget-object v1, p0, LCa/f;->c:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, LCa/f;->c:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    return-void
.end method

.method private final w()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 3
    .line 4
    iput-object v0, p0, LCa/f;->b:Landroid/os/CancellationSignal;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, p0, LCa/f;->e:Z

    .line 8
    .line 9
    iget-object v1, p0, LCa/f;->f:Lb2/m;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lb2/m;->d()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object v0, p0, LCa/f;->f:Lb2/m;

    .line 17
    .line 18
    iput-object v0, p0, LCa/f;->c:Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic y(LCa/f;Landroid/view/View;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, LCa/f;->x(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Float;)V
    .locals 6

    .line 1
    iget-object v0, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, LCa/f;->b:Landroid/os/CancellationSignal;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/os/CancellationSignal;->cancel()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    sget-object v1, LCa/a;->a:LCa/a;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2}, LCa/a;->b(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()LA1/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v1, v1, LA1/b;->d:I

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/core/view/K0;->e()LA1/b;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget v3, v3, LA1/b;->d:I

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/core/view/K0;->d()LA1/b;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v4, v4, LA1/b;->d:I

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x0

    .line 45
    cmpg-float v0, v0, v1

    .line 46
    .line 47
    if-gez v0, :cond_2

    .line 48
    .line 49
    move v2, v5

    .line 50
    :cond_2
    invoke-direct {p0, v2, p1}, LCa/f;->g(ZLjava/lang/Float;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    if-ne v1, v3, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Landroidx/core/view/K0;->a(Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_4
    if-ne v1, v4, :cond_5

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroidx/core/view/K0;->a(Z)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_5
    invoke-virtual {v0}, Landroidx/core/view/K0;->b()F

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const v0, 0x3e19999a    # 0.15f

    .line 71
    .line 72
    .line 73
    cmpl-float p1, p1, v0

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    const/4 v1, 0x0

    .line 77
    if-ltz p1, :cond_6

    .line 78
    .line 79
    iget-boolean p1, p0, LCa/f;->e:Z

    .line 80
    .line 81
    xor-int/2addr p1, v5

    .line 82
    invoke-static {p0, p1, v1, v0, v1}, LCa/f;->h(LCa/f;ZLjava/lang/Float;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_6
    iget-boolean p1, p0, LCa/f;->e:Z

    .line 87
    .line 88
    invoke-static {p0, p1, v1, v0, v1}, LCa/f;->h(LCa/f;ZLjava/lang/Float;ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget-object v0, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, LCa/f;->e:Z

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/core/view/K0;->a(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LCa/f;->b:Landroid/os/CancellationSignal;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, LCa/f;->f:Lb2/m;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Lb2/m;->d()V

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-direct {p0}, LCa/f;->w()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final o()V
    .locals 5

    .line 1
    iget-object v0, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LCa/f;->b:Landroid/os/CancellationSignal;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()LA1/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v1, v1, LA1/b;->d:I

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/core/view/K0;->e()LA1/b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v2, v2, LA1/b;->d:I

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/core/view/K0;->d()LA1/b;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget v3, v3, LA1/b;->d:I

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-ne v1, v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, v4}, Landroidx/core/view/K0;->a(Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    if-ne v1, v3, :cond_3

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, v1}, Landroidx/core/view/K0;->a(Z)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    invoke-virtual {v0}, Landroidx/core/view/K0;->b()F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const v2, 0x3e19999a    # 0.15f

    .line 50
    .line 51
    .line 52
    cmpl-float v1, v1, v2

    .line 53
    .line 54
    if-ltz v1, :cond_4

    .line 55
    .line 56
    iget-boolean v1, p0, LCa/f;->e:Z

    .line 57
    .line 58
    xor-int/2addr v1, v4

    .line 59
    invoke-virtual {v0, v1}, Landroidx/core/view/K0;->a(Z)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    iget-boolean v1, p0, LCa/f;->e:Z

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroidx/core/view/K0;->a(Z)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final q()I
    .locals 2

    .line 1
    iget-object v0, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()LA1/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, LA1/b;->d:I

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public final r(I)I
    .locals 3

    .line 1
    iget-object v0, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, LCa/a;->a:LCa/a;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v1, v2}, LCa/a;->b(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()LA1/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v0, v0, LA1/b;->d:I

    .line 16
    .line 17
    sub-int/2addr v0, p1

    .line 18
    invoke-virtual {p0, v0}, LCa/f;->s(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method public final s(I)I
    .locals 5

    .line 1
    iget-object v0, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/core/view/K0;->d()LA1/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, LA1/b;->d:I

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/core/view/K0;->e()LA1/b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget v2, v2, LA1/b;->d:I

    .line 16
    .line 17
    iget-boolean v3, p0, LCa/f;->e:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    move v4, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v4, v1

    .line 24
    :goto_0
    if-eqz v3, :cond_1

    .line 25
    .line 26
    move v3, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v3, v2

    .line 29
    :goto_1
    invoke-static {p1, v1, v2}, Loe/j;->m(III)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()LA1/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget v1, v1, LA1/b;->d:I

    .line 38
    .line 39
    sub-int/2addr v1, p1

    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v2, v2, v2, p1}, LA1/b;->c(IIII)LA1/b;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sub-int/2addr p1, v4

    .line 46
    int-to-float p1, p1

    .line 47
    sub-int/2addr v3, v4

    .line 48
    int-to-float v3, v3

    .line 49
    div-float/2addr p1, v3

    .line 50
    const/high16 v3, 0x3f800000    # 1.0f

    .line 51
    .line 52
    invoke-virtual {v0, v2, v3, p1}, Landroidx/core/view/K0;->f(LA1/b;FF)V

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, LCa/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

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

.method public final u()Z
    .locals 1

    .line 1
    iget-object v0, p0, LCa/f;->b:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    if-eqz v0, :cond_0

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

.method public final x(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LCa/f;->t()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Landroidx/core/view/a0;->F(Landroid/view/View;)Landroidx/core/view/L0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Landroidx/core/view/L0$p;->d()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v0, v3}, Landroidx/core/view/L0;->r(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ne v0, v2, :cond_0

    .line 29
    .line 30
    move v1, v2

    .line 31
    :cond_0
    iput-boolean v1, p0, LCa/f;->e:Z

    .line 32
    .line 33
    new-instance v0, Landroid/os/CancellationSignal;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/os/CancellationSignal;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, LCa/f;->b:Landroid/os/CancellationSignal;

    .line 39
    .line 40
    iput-object p2, p0, LCa/f;->c:Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    sget-object p2, LCa/a;->a:LCa/a;

    .line 43
    .line 44
    invoke-virtual {p2, v2}, LCa/a;->b(Z)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Landroidx/core/view/a0;->J(Landroid/view/View;)Landroidx/core/view/l1;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-static {}, Landroidx/core/view/L0$p;->d()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-static {}, LCa/g;->a()Landroid/view/animation/LinearInterpolator;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    iget-object v8, p0, LCa/f;->b:Landroid/os/CancellationSignal;

    .line 62
    .line 63
    invoke-direct {p0}, LCa/f;->p()LCa/f$a;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    const-wide/16 v5, -0x1

    .line 68
    .line 69
    invoke-virtual/range {v3 .. v9}, Landroidx/core/view/l1;->a(IJLandroid/view/animation/Interpolator;Landroid/os/CancellationSignal;Landroidx/core/view/D0;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void

    .line 73
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string p2, "Animation in progress. Can not start a new request to controlWindowInsetsAnimation()"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
.end method
