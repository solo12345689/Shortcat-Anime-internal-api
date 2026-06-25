.class public final LH2/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LH2/m;
.implements LQ2/m$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH2/c$c;,
        LH2/c$b;
    }
.end annotation


# static fields
.field public static final p:LH2/m$a;


# instance fields
.field private final a:LG2/d;

.field private final b:LH2/l;

.field private final c:LQ2/k;

.field private final d:Ljava/util/HashMap;

.field private final e:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final f:D

.field private g:LM2/L$a;

.field private h:LQ2/m;

.field private i:Landroid/os/Handler;

.field private j:LH2/m$e;

.field private k:LH2/i;

.field private l:Landroid/net/Uri;

.field private m:LH2/f;

.field private n:Z

.field private o:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LH2/b;

    .line 2
    .line 3
    invoke-direct {v0}, LH2/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH2/c;->p:LH2/m$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LG2/d;LQ2/k;LH2/l;LQ2/e;)V
    .locals 7

    const-wide/high16 v5, 0x400c000000000000L    # 3.5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v6}, LH2/c;-><init>(LG2/d;LQ2/k;LH2/l;LQ2/e;D)V

    return-void
.end method

.method public constructor <init>(LG2/d;LQ2/k;LH2/l;LQ2/e;D)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LH2/c;->a:LG2/d;

    .line 4
    iput-object p3, p0, LH2/c;->b:LH2/l;

    .line 5
    iput-object p2, p0, LH2/c;->c:LQ2/k;

    .line 6
    iput-wide p5, p0, LH2/c;->f:D

    .line 7
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, LH2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LH2/c;->d:Ljava/util/HashMap;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, LH2/c;->o:J

    return-void
.end method

.method static synthetic A(LH2/c;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->l:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic B(LH2/c;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LH2/c;->P()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic C(LH2/c;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic D(LH2/c;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic E(LH2/c;)LG2/d;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->a:LG2/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic F(LH2/c;)LM2/L$a;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->g:LM2/L$a;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic G(LH2/c;)LQ2/k;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->c:LQ2/k;

    .line 2
    .line 3
    return-object p0
.end method

.method private H(Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Landroid/net/Uri;

    .line 13
    .line 14
    new-instance v3, LH2/c$c;

    .line 15
    .line 16
    invoke-direct {v3, p0, v2}, LH2/c$c;-><init>(LH2/c;Landroid/net/Uri;)V

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method private static I(LH2/f;LH2/f;)LH2/f$f;
    .locals 4

    .line 1
    iget-wide v0, p1, LH2/f;->k:J

    .line 2
    .line 3
    iget-wide v2, p0, LH2/f;->k:J

    .line 4
    .line 5
    sub-long/2addr v0, v2

    .line 6
    long-to-int p1, v0

    .line 7
    iget-object p0, p0, LH2/f;->r:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, LH2/f$f;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method private J(LH2/f;LH2/f;)LH2/f;
    .locals 2

    .line 1
    invoke-virtual {p2, p1}, LH2/f;->f(LH2/f;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p2, p2, LH2/f;->o:Z

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, LH2/f;->d()LH2/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    return-object p1

    .line 16
    :cond_1
    invoke-direct {p0, p1, p2}, LH2/c;->L(LH2/f;LH2/f;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-direct {p0, p1, p2}, LH2/c;->K(LH2/f;LH2/f;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p2, v0, v1, p1}, LH2/f;->c(JI)LH2/f;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method private K(LH2/f;LH2/f;)I
    .locals 3

    .line 1
    iget-boolean v0, p2, LH2/f;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p1, p2, LH2/f;->j:I

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    iget-object v0, p0, LH2/c;->m:LH2/f;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget v0, v0, LH2/f;->j:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v0, v1

    .line 17
    :goto_0
    if-nez p1, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    invoke-static {p1, p2}, LH2/c;->I(LH2/f;LH2/f;)LH2/f$f;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    iget p1, p1, LH2/f;->j:I

    .line 27
    .line 28
    iget v0, v2, LH2/f$g;->d:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iget-object p2, p2, LH2/f;->r:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, LH2/f$f;

    .line 38
    .line 39
    iget p2, p2, LH2/f$g;->d:I

    .line 40
    .line 41
    sub-int/2addr p1, p2

    .line 42
    return p1

    .line 43
    :cond_3
    :goto_1
    return v0
.end method

.method private L(LH2/f;LH2/f;)J
    .locals 8

    .line 1
    iget-boolean v0, p2, LH2/f;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide p1, p2, LH2/f;->h:J

    .line 6
    .line 7
    return-wide p1

    .line 8
    :cond_0
    iget-object v0, p0, LH2/c;->m:LH2/f;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-wide v0, v0, LH2/f;->h:J

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    :goto_0
    if-nez p1, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    iget-object v2, p1, LH2/f;->r:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {p1, p2}, LH2/c;->I(LH2/f;LH2/f;)LH2/f$f;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    iget-wide p1, p1, LH2/f;->h:J

    .line 33
    .line 34
    iget-wide v0, v3, LH2/f$g;->e:J

    .line 35
    .line 36
    add-long/2addr p1, v0

    .line 37
    return-wide p1

    .line 38
    :cond_3
    int-to-long v2, v2

    .line 39
    iget-wide v4, p2, LH2/f;->k:J

    .line 40
    .line 41
    iget-wide v6, p1, LH2/f;->k:J

    .line 42
    .line 43
    sub-long/2addr v4, v6

    .line 44
    cmp-long p2, v2, v4

    .line 45
    .line 46
    if-nez p2, :cond_4

    .line 47
    .line 48
    invoke-virtual {p1}, LH2/f;->e()J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    return-wide p1

    .line 53
    :cond_4
    :goto_1
    return-wide v0
.end method

.method private M(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    .line 1
    iget-object v0, p0, LH2/c;->m:LH2/f;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, LH2/f;->v:LH2/f$h;

    .line 6
    .line 7
    iget-boolean v1, v1, LH2/f$h;->e:Z

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, LH2/f;->t:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LH2/f$e;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-wide v1, v0, LH2/f$e;->b:J

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "_HLS_msn"

    .line 32
    .line 33
    invoke-virtual {p1, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 34
    .line 35
    .line 36
    iget v0, v0, LH2/f$e;->c:I

    .line 37
    .line 38
    const/4 v1, -0x1

    .line 39
    if-eq v0, v1, :cond_0

    .line 40
    .line 41
    const-string v1, "_HLS_part"

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :cond_1
    return-object p1
.end method

.method private N(Landroid/net/Uri;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LH2/c;->k:LH2/i;

    .line 2
    .line 3
    iget-object v0, v0, LH2/i;->e:Ljava/util/List;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-ge v2, v3, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, LH2/i$b;

    .line 18
    .line 19
    iget-object v3, v3, LH2/i$b;->a:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v1
.end method

.method private O(Landroid/net/Uri;)V
    .locals 2

    .line 1
    iget-object v0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LH2/c$c;

    .line 8
    .line 9
    invoke-virtual {p1}, LH2/c$c;->l()LH2/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, LH2/c$c;->m()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x1

    .line 21
    invoke-virtual {p1, v1}, LH2/c$c;->A(Z)V

    .line 22
    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, v0, LH2/f;->o:Z

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, v1}, LH2/c$c;->p(Z)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method private P()Z
    .locals 9

    .line 1
    iget-object v0, p0, LH2/c;->k:LH2/i;

    .line 2
    .line 3
    iget-object v0, v0, LH2/i;->e:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const/4 v4, 0x0

    .line 14
    move v5, v4

    .line 15
    :goto_0
    if-ge v5, v1, :cond_1

    .line 16
    .line 17
    iget-object v6, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    check-cast v7, LH2/i$b;

    .line 24
    .line 25
    iget-object v7, v7, LH2/i$b;->a:Landroid/net/Uri;

    .line 26
    .line 27
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    check-cast v6, LH2/c$c;

    .line 32
    .line 33
    invoke-static {v6}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, LH2/c$c;

    .line 38
    .line 39
    invoke-static {v6}, LH2/c$c;->d(LH2/c$c;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v7

    .line 43
    cmp-long v7, v2, v7

    .line 44
    .line 45
    if-lez v7, :cond_0

    .line 46
    .line 47
    invoke-static {v6}, LH2/c$c;->e(LH2/c$c;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, LH2/c;->l:Landroid/net/Uri;

    .line 52
    .line 53
    invoke-direct {p0, v0}, LH2/c;->M(Landroid/net/Uri;)Landroid/net/Uri;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v6, v0}, LH2/c$c;->f(LH2/c$c;Landroid/net/Uri;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    return v0

    .line 62
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return v4
.end method

.method private Q(Landroid/net/Uri;)V
    .locals 3

    .line 1
    iget-object v0, p0, LH2/c;->l:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    invoke-direct {p0, p1}, LH2/c;->N(Landroid/net/Uri;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, LH2/c;->m:LH2/f;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-boolean v0, v0, LH2/f;->o:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, LH2/c;->l:Landroid/net/Uri;

    .line 25
    .line 26
    iget-object v0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, LH2/c$c;

    .line 33
    .line 34
    invoke-static {v0}, LH2/c$c;->g(LH2/c$c;)LH2/f;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-boolean v2, v1, LH2/f;->o:Z

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    iput-object v1, p0, LH2/c;->m:LH2/f;

    .line 45
    .line 46
    iget-object p1, p0, LH2/c;->j:LH2/m$e;

    .line 47
    .line 48
    invoke-interface {p1, v1}, LH2/m$e;->i(LH2/f;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    invoke-direct {p0, p1}, LH2/c;->M(Landroid/net/Uri;)Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {v0, p1}, LH2/c$c;->f(LH2/c$c;Landroid/net/Uri;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_0
    return-void
.end method

.method private R(Landroid/net/Uri;LQ2/k$c;Z)Z
    .locals 3

    .line 1
    iget-object v0, p0, LH2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, LH2/m$b;

    .line 19
    .line 20
    invoke-interface {v2, p1, p2, p3}, LH2/m$b;->b(Landroid/net/Uri;LQ2/k$c;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    xor-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    or-int/2addr v1, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return v1
.end method

.method private W(Landroid/net/Uri;LH2/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, LH2/c;->l:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, LH2/c;->m:LH2/f;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-boolean p1, p2, LH2/f;->o:Z

    .line 14
    .line 15
    xor-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    iput-boolean p1, p0, LH2/c;->n:Z

    .line 18
    .line 19
    iget-wide v0, p2, LH2/f;->h:J

    .line 20
    .line 21
    iput-wide v0, p0, LH2/c;->o:J

    .line 22
    .line 23
    :cond_0
    iput-object p2, p0, LH2/c;->m:LH2/f;

    .line 24
    .line 25
    iget-object p1, p0, LH2/c;->j:LH2/m$e;

    .line 26
    .line 27
    invoke-interface {p1, p2}, LH2/m$e;->i(LH2/f;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object p1, p0, LH2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, LH2/m$b;

    .line 47
    .line 48
    invoke-interface {p2}, LH2/m$b;->e()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return-void
.end method

.method static synthetic q(LH2/c;Landroid/net/Uri;LQ2/k$c;Z)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LH2/c;->R(Landroid/net/Uri;LQ2/k$c;Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic r(LH2/c;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->i:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic s(LH2/c;)LH2/i;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->k:LH2/i;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic t(LH2/c;)LH2/l;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->b:LH2/l;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic u(LH2/c;)LQ2/e;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method static synthetic w(LH2/c;)LH2/f;
    .locals 0

    .line 1
    iget-object p0, p0, LH2/c;->m:LH2/f;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic x(LH2/c;LH2/f;LH2/f;)LH2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LH2/c;->J(LH2/f;LH2/f;)LH2/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic y(LH2/c;Landroid/net/Uri;LH2/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LH2/c;->W(Landroid/net/Uri;LH2/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic z(LH2/c;)D
    .locals 2

    .line 1
    iget-wide v0, p0, LH2/c;->f:D

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public S(LQ2/o;JJZ)V
    .locals 12

    .line 1
    new-instance v0, LM2/y;

    .line 2
    .line 3
    iget-wide v1, p1, LQ2/o;->a:J

    .line 4
    .line 5
    iget-object v3, p1, LQ2/o;->b:Lw2/o;

    .line 6
    .line 7
    invoke-virtual {p1}, LQ2/o;->f()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {p1}, LQ2/o;->d()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p1}, LQ2/o;->b()J

    .line 16
    .line 17
    .line 18
    move-result-wide v10

    .line 19
    move-wide v6, p2

    .line 20
    move-wide/from16 v8, p4

    .line 21
    .line 22
    invoke-direct/range {v0 .. v11}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LH2/c;->c:LQ2/k;

    .line 26
    .line 27
    iget-wide v2, p1, LQ2/o;->a:J

    .line 28
    .line 29
    invoke-interface {v1, v2, v3}, LQ2/k;->d(J)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, LH2/c;->g:LM2/L$a;

    .line 33
    .line 34
    const/4 v1, 0x4

    .line 35
    invoke-virtual {p1, v0, v1}, LM2/L$a;->l(LM2/y;I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public T(LQ2/o;JJ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, LQ2/o;->e()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, LH2/j;

    .line 10
    .line 11
    instance-of v3, v2, LH2/f;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v4, v2, LH2/j;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v4}, LH2/i;->e(Ljava/lang/String;)LH2/i;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v4, v2

    .line 23
    check-cast v4, LH2/i;

    .line 24
    .line 25
    :goto_0
    iput-object v4, v0, LH2/c;->k:LH2/i;

    .line 26
    .line 27
    iget-object v5, v4, LH2/i;->e:Ljava/util/List;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, LH2/i$b;

    .line 35
    .line 36
    iget-object v5, v5, LH2/i$b;->a:Landroid/net/Uri;

    .line 37
    .line 38
    iput-object v5, v0, LH2/c;->l:Landroid/net/Uri;

    .line 39
    .line 40
    iget-object v5, v0, LH2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    new-instance v7, LH2/c$b;

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    invoke-direct {v7, v0, v8}, LH2/c$b;-><init>(LH2/c;LH2/c$a;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget-object v4, v4, LH2/i;->d:Ljava/util/List;

    .line 52
    .line 53
    invoke-direct {v0, v4}, LH2/c;->H(Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    new-instance v7, LM2/y;

    .line 57
    .line 58
    iget-wide v8, v1, LQ2/o;->a:J

    .line 59
    .line 60
    iget-object v10, v1, LQ2/o;->b:Lw2/o;

    .line 61
    .line 62
    invoke-virtual {v1}, LQ2/o;->f()Landroid/net/Uri;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    invoke-virtual {v1}, LQ2/o;->d()Ljava/util/Map;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    invoke-virtual {v1}, LQ2/o;->b()J

    .line 71
    .line 72
    .line 73
    move-result-wide v17

    .line 74
    move-wide/from16 v13, p2

    .line 75
    .line 76
    move-wide/from16 v15, p4

    .line 77
    .line 78
    invoke-direct/range {v7 .. v18}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 79
    .line 80
    .line 81
    iget-object v4, v0, LH2/c;->d:Ljava/util/HashMap;

    .line 82
    .line 83
    iget-object v5, v0, LH2/c;->l:Landroid/net/Uri;

    .line 84
    .line 85
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, LH2/c$c;

    .line 90
    .line 91
    if-eqz v3, :cond_1

    .line 92
    .line 93
    check-cast v2, LH2/f;

    .line 94
    .line 95
    invoke-static {v4, v2, v7}, LH2/c$c;->c(LH2/c$c;LH2/f;LM2/y;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    invoke-virtual {v4, v6}, LH2/c$c;->p(Z)V

    .line 100
    .line 101
    .line 102
    :goto_1
    iget-object v2, v0, LH2/c;->c:LQ2/k;

    .line 103
    .line 104
    iget-wide v3, v1, LQ2/o;->a:J

    .line 105
    .line 106
    invoke-interface {v2, v3, v4}, LQ2/k;->d(J)V

    .line 107
    .line 108
    .line 109
    iget-object v1, v0, LH2/c;->g:LM2/L$a;

    .line 110
    .line 111
    const/4 v2, 0x4

    .line 112
    invoke-virtual {v1, v7, v2}, LM2/L$a;->o(LM2/y;I)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public U(LQ2/o;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 13

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    new-instance v1, LM2/y;

    .line 4
    .line 5
    iget-wide v2, p1, LQ2/o;->a:J

    .line 6
    .line 7
    iget-object v4, p1, LQ2/o;->b:Lw2/o;

    .line 8
    .line 9
    invoke-virtual {p1}, LQ2/o;->f()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-virtual {p1}, LQ2/o;->d()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-virtual {p1}, LQ2/o;->b()J

    .line 18
    .line 19
    .line 20
    move-result-wide v11

    .line 21
    move-wide v7, p2

    .line 22
    move-wide/from16 v9, p4

    .line 23
    .line 24
    invoke-direct/range {v1 .. v12}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 25
    .line 26
    .line 27
    new-instance v2, LM2/B;

    .line 28
    .line 29
    iget v3, p1, LQ2/o;->c:I

    .line 30
    .line 31
    invoke-direct {v2, v3}, LM2/B;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iget-object v3, p0, LH2/c;->c:LQ2/k;

    .line 35
    .line 36
    new-instance v4, LQ2/k$c;

    .line 37
    .line 38
    move/from16 v5, p7

    .line 39
    .line 40
    invoke-direct {v4, v1, v2, v0, v5}, LQ2/k$c;-><init>(LM2/y;LM2/B;Ljava/io/IOException;I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v3, v4}, LQ2/k;->c(LQ2/k$c;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long v4, v2, v4

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    if-nez v4, :cond_0

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v4, v5

    .line 60
    :goto_0
    iget-object v6, p0, LH2/c;->g:LM2/L$a;

    .line 61
    .line 62
    iget v7, p1, LQ2/o;->c:I

    .line 63
    .line 64
    invoke-virtual {v6, v1, v7, v0, v4}, LM2/L$a;->s(LM2/y;ILjava/io/IOException;Z)V

    .line 65
    .line 66
    .line 67
    if-eqz v4, :cond_1

    .line 68
    .line 69
    iget-object v0, p0, LH2/c;->c:LQ2/k;

    .line 70
    .line 71
    iget-wide v6, p1, LQ2/o;->a:J

    .line 72
    .line 73
    invoke-interface {v0, v6, v7}, LQ2/k;->d(J)V

    .line 74
    .line 75
    .line 76
    :cond_1
    if-eqz v4, :cond_2

    .line 77
    .line 78
    sget-object p1, LQ2/m;->g:LQ2/m$c;

    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_2
    invoke-static {v5, v2, v3}, LQ2/m;->h(ZJ)LQ2/m$c;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
.end method

.method public V(LQ2/o;JJI)V
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v2, LM2/y;

    .line 8
    .line 9
    iget-wide v3, v0, LQ2/o;->a:J

    .line 10
    .line 11
    iget-object v5, v0, LQ2/o;->b:Lw2/o;

    .line 12
    .line 13
    move-wide/from16 v6, p2

    .line 14
    .line 15
    invoke-direct/range {v2 .. v7}, LM2/y;-><init>(JLw2/o;J)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, LM2/y;

    .line 20
    .line 21
    iget-wide v4, v0, LQ2/o;->a:J

    .line 22
    .line 23
    iget-object v6, v0, LQ2/o;->b:Lw2/o;

    .line 24
    .line 25
    invoke-virtual {v0}, LQ2/o;->f()Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-virtual {v0}, LQ2/o;->d()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-virtual {v0}, LQ2/o;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v13

    .line 37
    move-wide/from16 v9, p2

    .line 38
    .line 39
    move-wide/from16 v11, p4

    .line 40
    .line 41
    invoke-direct/range {v3 .. v14}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 42
    .line 43
    .line 44
    move-object v2, v3

    .line 45
    :goto_0
    iget-object v3, p0, LH2/c;->g:LM2/L$a;

    .line 46
    .line 47
    iget v0, v0, LQ2/o;->c:I

    .line 48
    .line 49
    invoke-virtual {v3, v2, v0, v1}, LM2/L$a;->u(LM2/y;II)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public a(Landroid/net/Uri;LM2/L$a;LH2/m$e;)V
    .locals 3

    .line 1
    invoke-static {}, Lt2/a0;->C()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LH2/c;->i:Landroid/os/Handler;

    .line 6
    .line 7
    iput-object p2, p0, LH2/c;->g:LM2/L$a;

    .line 8
    .line 9
    iput-object p3, p0, LH2/c;->j:LH2/m$e;

    .line 10
    .line 11
    new-instance p2, Lw2/o$b;

    .line 12
    .line 13
    invoke-direct {p2}, Lw2/o$b;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1}, Lw2/o$b;->i(Landroid/net/Uri;)Lw2/o$b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-virtual {p1, p2}, Lw2/o$b;->b(I)Lw2/o$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lw2/o$b;->a()Lw2/o;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance p3, LQ2/o;

    .line 30
    .line 31
    iget-object v0, p0, LH2/c;->a:LG2/d;

    .line 32
    .line 33
    const/4 v1, 0x4

    .line 34
    invoke-interface {v0, v1}, LG2/d;->a(I)Lw2/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v2, p0, LH2/c;->b:LH2/l;

    .line 39
    .line 40
    invoke-interface {v2}, LH2/l;->b()LQ2/o$a;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-direct {p3, v0, p1, v1, v2}, LQ2/o;-><init>(Lw2/g;Lw2/o;ILQ2/o$a;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, LH2/c;->h:LQ2/m;

    .line 48
    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p2, 0x0

    .line 53
    :goto_0
    invoke-static {p2}, Lt2/a;->g(Z)V

    .line 54
    .line 55
    .line 56
    new-instance p1, LQ2/m;

    .line 57
    .line 58
    const-string p2, "DefaultHlsPlaylistTracker:MultivariantPlaylist"

    .line 59
    .line 60
    invoke-direct {p1, p2}, LQ2/m;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, LH2/c;->h:LQ2/m;

    .line 64
    .line 65
    iget-object p2, p0, LH2/c;->c:LQ2/k;

    .line 66
    .line 67
    iget v0, p3, LQ2/o;->c:I

    .line 68
    .line 69
    invoke-interface {p2, v0}, LQ2/k;->a(I)I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-virtual {p1, p3, p0, p2}, LQ2/m;->n(LQ2/m$e;LQ2/m$b;I)J

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public b(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LH2/c$c;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, LH2/c$c;->A(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public c(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LH2/c$c;

    .line 8
    .line 9
    invoke-virtual {p1}, LH2/c$c;->s()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public d()J
    .locals 2

    .line 1
    iget-wide v0, p0, LH2/c;->o:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public e()LH2/i;
    .locals 1

    .line 1
    iget-object v0, p0, LH2/c;->k:LH2/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LH2/c$c;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, LH2/c$c;->p(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public g(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LH2/c$c;

    .line 8
    .line 9
    invoke-virtual {p1}, LH2/c$c;->o()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public bridge synthetic h(LQ2/m$e;JJZ)V
    .locals 0

    .line 1
    check-cast p1, LQ2/o;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, LH2/c;->S(LQ2/o;JJZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LH2/c;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic j(LQ2/m$e;JJ)V
    .locals 0

    .line 1
    check-cast p1, LQ2/o;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, LH2/c;->T(LQ2/o;JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(Landroid/net/Uri;J)Z
    .locals 1

    .line 1
    iget-object v0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LH2/c$c;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {p1, p2, p3}, LH2/c$c;->b(LH2/c$c;J)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    xor-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, LH2/c;->h:LQ2/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LQ2/m;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LH2/c;->l:Landroid/net/Uri;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, v0}, LH2/c;->c(Landroid/net/Uri;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method public m(Landroid/net/Uri;Z)LH2/f;
    .locals 1

    .line 1
    iget-object v0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LH2/c$c;

    .line 8
    .line 9
    invoke-virtual {v0}, LH2/c$c;->l()LH2/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-direct {p0, p1}, LH2/c;->Q(Landroid/net/Uri;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, LH2/c;->O(Landroid/net/Uri;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object v0
.end method

.method public bridge synthetic n(LQ2/m$e;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 0

    .line 1
    check-cast p1, LQ2/o;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, LH2/c;->U(LQ2/o;JJLjava/io/IOException;I)LQ2/m$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public o(LH2/m$b;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LH2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public p(LH2/m$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public stop()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LH2/c;->l:Landroid/net/Uri;

    .line 3
    .line 4
    iput-object v0, p0, LH2/c;->m:LH2/f;

    .line 5
    .line 6
    iput-object v0, p0, LH2/c;->k:LH2/i;

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, LH2/c;->o:J

    .line 14
    .line 15
    iget-object v1, p0, LH2/c;->h:LQ2/m;

    .line 16
    .line 17
    invoke-virtual {v1}, LQ2/m;->l()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LH2/c;->h:LQ2/m;

    .line 21
    .line 22
    iget-object v1, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, LH2/c$c;

    .line 43
    .line 44
    invoke-virtual {v2}, LH2/c$c;->z()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v1, p0, LH2/c;->i:Landroid/os/Handler;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, LH2/c;->i:Landroid/os/Handler;

    .line 54
    .line 55
    iget-object v0, p0, LH2/c;->d:Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public bridge synthetic v(LQ2/m$e;JJI)V
    .locals 0

    .line 1
    check-cast p1, LQ2/o;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, LH2/c;->V(LQ2/o;JJI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
