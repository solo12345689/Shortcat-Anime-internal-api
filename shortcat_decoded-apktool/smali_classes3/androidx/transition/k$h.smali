.class Landroidx/transition/k$h;
.super Landroidx/transition/s;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/transition/v;
.implements Lb2/h$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field private a:J

.field private b:Ljava/util/ArrayList;

.field private c:Ljava/util/ArrayList;

.field private d:Z

.field private e:Z

.field private f:Lb2/m;

.field private g:[LK1/a;

.field private final h:Landroidx/transition/A;

.field private i:Ljava/lang/Runnable;

.field final synthetic j:Landroidx/transition/k;


# direct methods
.method constructor <init>(Landroidx/transition/k;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/transition/s;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, Landroidx/transition/k$h;->a:J

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Landroidx/transition/k$h;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/transition/k$h;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/transition/k$h;->g:[LK1/a;

    .line 16
    .line 17
    new-instance p1, Landroidx/transition/A;

    .line 18
    .line 19
    invoke-direct {p1}, Landroidx/transition/A;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/transition/k$h;->h:Landroidx/transition/A;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic m(Landroidx/transition/k$h;Lb2/h;ZFF)V
    .locals 4

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    const/high16 p1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    cmpg-float p1, p3, p1

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    if-gez p1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/transition/k$h;->c()J

    .line 11
    .line 12
    .line 13
    move-result-wide p3

    .line 14
    iget-object p1, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 15
    .line 16
    check-cast p1, Landroidx/transition/w;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroidx/transition/w;->x0(I)Landroidx/transition/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Landroidx/transition/k;->a(Landroidx/transition/k;)Landroidx/transition/k;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-static {p1, v0}, Landroidx/transition/k;->c(Landroidx/transition/k;Landroidx/transition/k;)Landroidx/transition/k;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 31
    .line 32
    iget-wide v0, p0, Landroidx/transition/k$h;->a:J

    .line 33
    .line 34
    const-wide/16 v2, -0x1

    .line 35
    .line 36
    invoke-virtual {p1, v2, v3, v0, v1}, Landroidx/transition/k;->k0(JJ)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 40
    .line 41
    invoke-virtual {p1, p3, p4, v2, v3}, Landroidx/transition/k;->k0(JJ)V

    .line 42
    .line 43
    .line 44
    iput-wide p3, p0, Landroidx/transition/k$h;->a:J

    .line 45
    .line 46
    iget-object p1, p0, Landroidx/transition/k$h;->i:Ljava/lang/Runnable;

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object p0, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 54
    .line 55
    iget-object p0, p0, Landroidx/transition/k;->E:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 58
    .line 59
    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    sget-object p0, Landroidx/transition/k$j;->b:Landroidx/transition/k$j;

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    invoke-virtual {p2, p0, p1}, Landroidx/transition/k;->b0(Landroidx/transition/k$j;Z)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void

    .line 69
    :cond_2
    iget-object p0, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 70
    .line 71
    sget-object p1, Landroidx/transition/k$j;->b:Landroidx/transition/k$j;

    .line 72
    .line 73
    invoke-virtual {p0, p1, p2}, Landroidx/transition/k;->b0(Landroidx/transition/k$j;Z)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private n()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/transition/k$h;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/transition/k$h;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, Landroidx/transition/k$h;->g:[LK1/a;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    new-array v1, v0, [LK1/a;

    .line 23
    .line 24
    iput-object v1, p0, Landroidx/transition/k$h;->g:[LK1/a;

    .line 25
    .line 26
    :cond_1
    iget-object v1, p0, Landroidx/transition/k$h;->c:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/transition/k$h;->g:[LK1/a;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, [LK1/a;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iput-object v2, p0, Landroidx/transition/k$h;->g:[LK1/a;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    :goto_0
    if-ge v3, v0, :cond_2

    .line 41
    .line 42
    aget-object v4, v1, v3

    .line 43
    .line 44
    invoke-interface {v4, p0}, LK1/a;->accept(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    aput-object v2, v1, v3

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iput-object v1, p0, Landroidx/transition/k$h;->g:[LK1/a;

    .line 53
    .line 54
    :cond_3
    :goto_1
    return-void
.end method

.method private o()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/transition/k$h;->h:Landroidx/transition/A;

    .line 7
    .line 8
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-wide v3, p0, Landroidx/transition/k$h;->a:J

    .line 13
    .line 14
    long-to-float v3, v3

    .line 15
    invoke-virtual {v0, v1, v2, v3}, Landroidx/transition/A;->a(JF)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lb2/m;

    .line 19
    .line 20
    new-instance v1, Lb2/k;

    .line 21
    .line 22
    invoke-direct {v1}, Lb2/k;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Lb2/m;-><init>(Lb2/k;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 29
    .line 30
    new-instance v0, Lb2/n;

    .line 31
    .line 32
    invoke-direct {v0}, Lb2/n;-><init>()V

    .line 33
    .line 34
    .line 35
    const/high16 v1, 0x3f800000    # 1.0f

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lb2/n;->f(F)Lb2/n;

    .line 38
    .line 39
    .line 40
    const/high16 v1, 0x43480000    # 200.0f

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lb2/n;->h(F)Lb2/n;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lb2/m;->z(Lb2/n;)Lb2/m;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 51
    .line 52
    iget-wide v1, p0, Landroidx/transition/k$h;->a:J

    .line 53
    .line 54
    long-to-float v1, v1

    .line 55
    invoke-virtual {v0, v1}, Lb2/h;->o(F)Lb2/h;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Lb2/h;->c(Lb2/h$r;)Lb2/h;

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 64
    .line 65
    iget-object v1, p0, Landroidx/transition/k$h;->h:Landroidx/transition/A;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroidx/transition/A;->b()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v0, v1}, Lb2/h;->p(F)Lb2/h;

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/transition/k$h;->c()J

    .line 77
    .line 78
    .line 79
    move-result-wide v1

    .line 80
    const-wide/16 v3, 0x1

    .line 81
    .line 82
    add-long/2addr v1, v3

    .line 83
    long-to-float v1, v1

    .line 84
    invoke-virtual {v0, v1}, Lb2/h;->k(F)Lb2/h;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 88
    .line 89
    const/high16 v1, -0x40800000    # -1.0f

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lb2/h;->l(F)Lb2/h;

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 95
    .line 96
    const/high16 v1, 0x40800000    # 4.0f

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lb2/h;->m(F)Lb2/h;

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 102
    .line 103
    new-instance v1, Landroidx/transition/m;

    .line 104
    .line 105
    invoke-direct {v1, p0}, Landroidx/transition/m;-><init>(Landroidx/transition/k$h;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Lb2/h;->b(Lb2/h$q;)Lb2/h;

    .line 109
    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public a(Lb2/h;FF)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/transition/k$h;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    float-to-double p1, p2

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    const-wide/16 v0, -0x1

    .line 18
    .line 19
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    iget-object p3, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 24
    .line 25
    iget-wide v0, p0, Landroidx/transition/k$h;->a:J

    .line 26
    .line 27
    invoke-virtual {p3, p1, p2, v0, v1}, Landroidx/transition/k;->k0(JJ)V

    .line 28
    .line 29
    .line 30
    iput-wide p1, p0, Landroidx/transition/k$h;->a:J

    .line 31
    .line 32
    invoke-direct {p0}, Landroidx/transition/k$h;->n()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/transition/k;->N()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public d()V
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/transition/k$h;->o()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/transition/k$h;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide/16 v3, 0x1

    .line 11
    .line 12
    add-long/2addr v1, v3

    .line 13
    long-to-float v1, v1

    .line 14
    invoke-virtual {v0, v1}, Lb2/m;->u(F)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public g(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    iget-wide v0, p0, Landroidx/transition/k$h;->a:J

    .line 6
    .line 7
    cmp-long v0, p1, v0

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/transition/k$h;->isReady()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-boolean v0, p0, Landroidx/transition/k$h;->e:Z

    .line 19
    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    cmp-long v2, p1, v0

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    iget-wide v2, p0, Landroidx/transition/k$h;->a:J

    .line 29
    .line 30
    cmp-long v0, v2, v0

    .line 31
    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    const-wide/16 p1, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p0}, Landroidx/transition/k$h;->c()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    cmp-long v2, p1, v0

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    iget-wide v2, p0, Landroidx/transition/k$h;->a:J

    .line 46
    .line 47
    cmp-long v2, v2, v0

    .line 48
    .line 49
    if-gez v2, :cond_2

    .line 50
    .line 51
    const-wide/16 p1, 0x1

    .line 52
    .line 53
    add-long/2addr p1, v0

    .line 54
    :cond_2
    :goto_0
    iget-wide v0, p0, Landroidx/transition/k$h;->a:J

    .line 55
    .line 56
    cmp-long v2, p1, v0

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    iget-object v2, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 61
    .line 62
    invoke-virtual {v2, p1, p2, v0, v1}, Landroidx/transition/k;->k0(JJ)V

    .line 63
    .line 64
    .line 65
    iput-wide p1, p0, Landroidx/transition/k$h;->a:J

    .line 66
    .line 67
    :cond_3
    invoke-direct {p0}, Landroidx/transition/k$h;->n()V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Landroidx/transition/k$h;->h:Landroidx/transition/A;

    .line 71
    .line 72
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    long-to-float p1, p1

    .line 77
    invoke-virtual {v0, v1, v2, p1}, Landroidx/transition/A;->a(JF)V

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_1
    return-void

    .line 81
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string p2, "setCurrentPlayTimeMillis() called after animation has been started"

    .line 84
    .line 85
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1
.end method

.method public isReady()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/transition/k$h;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public j(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/transition/k$h;->i:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/transition/k$h;->o()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/transition/k$h;->f:Lb2/m;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Lb2/m;->u(F)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public k(Landroidx/transition/k;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroidx/transition/k$h;->e:Z

    .line 3
    .line 4
    return-void
.end method

.method p()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/transition/k$h;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-wide/16 v2, 0x1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/transition/k$h;->j:Landroidx/transition/k;

    .line 14
    .line 15
    iget-wide v4, p0, Landroidx/transition/k$h;->a:J

    .line 16
    .line 17
    invoke-virtual {v0, v2, v3, v4, v5}, Landroidx/transition/k;->k0(JJ)V

    .line 18
    .line 19
    .line 20
    iput-wide v2, p0, Landroidx/transition/k$h;->a:J

    .line 21
    .line 22
    return-void
.end method

.method public q()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/transition/k$h;->d:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/transition/k$h;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Landroidx/transition/k$h;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, LK1/a;

    .line 23
    .line 24
    invoke-interface {v2, p0}, LK1/a;->accept(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-direct {p0}, Landroidx/transition/k$h;->n()V

    .line 31
    .line 32
    .line 33
    return-void
.end method
