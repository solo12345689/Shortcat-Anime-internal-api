.class final LE3/B2$c;
.super LF3/j$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/B2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final d:Landroid/os/Handler;

.field final synthetic e:LE3/B2;


# direct methods
.method public constructor <init>(LE3/B2;Landroid/os/Looper;)V
    .locals 1

    .line 1
    iput-object p1, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-direct {p0}, LF3/j$a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v0, LE3/D2;

    .line 9
    .line 10
    invoke-direct {v0, p0}, LE3/D2;-><init>(LE3/B2$c;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LE3/B2$c;->d:Landroid/os/Handler;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic o(LE3/B2$c;Landroid/os/Message;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p1, Landroid/os/Message;->what:I

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, LE3/B2$c;->e:LE3/B2;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-static {p0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p0, p1, v1}, LE3/B2;->w1(LE3/B2;ZLE3/B2$e;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return v0
.end method

.method public static synthetic p(LE3/B2$c;Ljava/lang/String;Landroid/os/Bundle;LE3/A$c;)V
    .locals 2

    .line 1
    iget-object p0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, LE3/T6;

    .line 8
    .line 9
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    move-object p2, v1

    .line 17
    :cond_0
    invoke-interface {p3, p0, v0, p2}, LE3/A$c;->q0(LE3/A;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, LE3/B2;->A1(Ljava/util/concurrent/Future;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static synthetic q(LE3/B2$c;ZLE3/A$c;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Bundle;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED"

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, LE3/B2$c;->e:LE3/B2;

    .line 15
    .line 16
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, LE3/T6;

    .line 21
    .line 22
    const-string v1, "androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED"

    .line 23
    .line 24
    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-direct {p1, v1, v2}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p2, p0, p1, v0}, LE3/A$c;->q0(LE3/A;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, LE3/B2;->A1(Ljava/util/concurrent/Future;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private s()V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/B2$c;->d:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, LE3/B2$c;->d:Landroid/os/Handler;

    .line 12
    .line 13
    iget-object v2, p0, LE3/B2$c;->e:LE3/B2;

    .line 14
    .line 15
    invoke-static {v2}, LE3/B2;->z1(LE3/B2;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a(LF3/j$e;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, LE3/B2$e;->c(LF3/j$e;)LE3/B2$e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, LE3/B2;->t1(LE3/B2;LE3/B2$e;)LE3/B2$e;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, LE3/B2$c;->s()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/B2;->Q1()LE3/A;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LE3/C2;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, LE3/C2;-><init>(LE3/B2$c;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LE3/A;->i1(Lt2/n;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 9
    .line 10
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, p1}, LE3/B2$e;->h(Landroid/os/Bundle;)LE3/B2$e;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, LE3/B2;->t1(LE3/B2;LE3/B2$e;)LE3/B2$e;

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, LE3/B2$c;->e:LE3/B2;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-static {p1, v0}, LE3/B2;->y1(LE3/B2;Z)Z

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, LE3/B2$c;->s()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public d(LF3/m;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, LE3/B2$e;->b(LF3/m;)LE3/B2$e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, LE3/B2;->t1(LE3/B2;LE3/B2$e;)LE3/B2$e;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, LE3/B2$c;->s()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public e(LF3/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p1}, LE3/B2;->v1(LF3/v;)LF3/v;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v1, p1}, LE3/B2$e;->d(LF3/v;)LE3/B2$e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v0, p1}, LE3/B2;->t1(LE3/B2;LE3/B2$e;)LE3/B2$e;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, LE3/B2$c;->s()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public f(Ljava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p1}, LE3/B2;->x1(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v1, p1}, LE3/B2$e;->e(Ljava/util/List;)LE3/B2$e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v0, p1}, LE3/B2;->t1(LE3/B2;LE3/B2$e;)LE3/B2$e;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, LE3/B2$c;->s()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public g(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, LE3/B2$e;->f(Ljava/lang/CharSequence;)LE3/B2$e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, LE3/B2;->t1(LE3/B2;LE3/B2$e;)LE3/B2$e;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, LE3/B2$c;->s()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public h(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, LE3/B2$e;->g(I)LE3/B2$e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, LE3/B2;->t1(LE3/B2;LE3/B2$e;)LE3/B2$e;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, LE3/B2$c;->s()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/B2;->Q1()LE3/A;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LE3/A;->a()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public j(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 5
    .line 6
    invoke-virtual {v0}, LE3/B2;->Q1()LE3/A;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, LE3/E2;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1, p2}, LE3/E2;-><init>(LE3/B2$c;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, LE3/A;->i1(Lt2/n;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public k()V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-static {v0}, LE3/B2;->r1(LE3/B2;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 10
    .line 11
    invoke-virtual {v0}, LE3/B2;->Z1()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 16
    .line 17
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, LE3/B2$c;->e:LE3/B2;

    .line 22
    .line 23
    invoke-static {v2}, LE3/B2;->u1(LE3/B2;)LF3/j;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, LF3/j;->j()LF3/v;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2}, LE3/B2;->v1(LF3/v;)LF3/v;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, p0, LE3/B2$c;->e:LE3/B2;

    .line 36
    .line 37
    invoke-static {v3}, LE3/B2;->u1(LE3/B2;)LF3/j;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, LF3/j;->n()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    iget-object v4, p0, LE3/B2$c;->e:LE3/B2;

    .line 46
    .line 47
    invoke-static {v4}, LE3/B2;->u1(LE3/B2;)LF3/j;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4}, LF3/j;->o()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {v1, v2, v3, v4}, LE3/B2$e;->a(LF3/v;II)LE3/B2$e;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v0, v1}, LE3/B2;->t1(LE3/B2;LE3/B2$e;)LE3/B2$e;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 63
    .line 64
    invoke-static {v0}, LE3/B2;->u1(LE3/B2;)LF3/j;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, LF3/j;->q()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p0, v0}, LE3/B2$c;->b(Z)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, LE3/B2$c;->d:Landroid/os/Handler;

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v0, v1, v2}, LE3/B2;->w1(LE3/B2;ZLE3/B2$e;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public l(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$c;->e:LE3/B2;

    .line 2
    .line 3
    invoke-static {v0}, LE3/B2;->s1(LE3/B2;)LE3/B2$e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, LE3/B2$e;->i(I)LE3/B2$e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, LE3/B2;->t1(LE3/B2;LE3/B2$e;)LE3/B2$e;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, LE3/B2$c;->s()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$c;->d:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
