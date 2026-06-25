.class public final Lq2/C$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/net/Uri;

.field private c:Ljava/lang/String;

.field private d:Lq2/C$d$a;

.field private e:Lq2/C$f$a;

.field private f:Ljava/util/List;

.field private g:Ljava/lang/String;

.field private h:LP9/u;

.field private i:Lq2/C$b;

.field private j:Ljava/lang/Object;

.field private k:J

.field private l:Lq2/I;

.field private m:Lq2/C$g$a;

.field private n:Lq2/C$i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lq2/C$d$a;

    invoke-direct {v0}, Lq2/C$d$a;-><init>()V

    iput-object v0, p0, Lq2/C$c;->d:Lq2/C$d$a;

    .line 4
    new-instance v0, Lq2/C$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq2/C$f$a;-><init>(Lq2/C$a;)V

    iput-object v0, p0, Lq2/C$c;->e:Lq2/C$f$a;

    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lq2/C$c;->f:Ljava/util/List;

    .line 6
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/C$c;->h:LP9/u;

    .line 7
    new-instance v0, Lq2/C$g$a;

    invoke-direct {v0}, Lq2/C$g$a;-><init>()V

    iput-object v0, p0, Lq2/C$c;->m:Lq2/C$g$a;

    .line 8
    sget-object v0, Lq2/C$i;->d:Lq2/C$i;

    iput-object v0, p0, Lq2/C$c;->n:Lq2/C$i;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide v0, p0, Lq2/C$c;->k:J

    return-void
.end method

.method private constructor <init>(Lq2/C;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Lq2/C$c;-><init>()V

    .line 11
    iget-object v0, p1, Lq2/C;->f:Lq2/C$d;

    invoke-virtual {v0}, Lq2/C$d;->a()Lq2/C$d$a;

    move-result-object v0

    iput-object v0, p0, Lq2/C$c;->d:Lq2/C$d$a;

    .line 12
    iget-object v0, p1, Lq2/C;->a:Ljava/lang/String;

    iput-object v0, p0, Lq2/C$c;->a:Ljava/lang/String;

    .line 13
    iget-object v0, p1, Lq2/C;->e:Lq2/I;

    iput-object v0, p0, Lq2/C$c;->l:Lq2/I;

    .line 14
    iget-object v0, p1, Lq2/C;->d:Lq2/C$g;

    invoke-virtual {v0}, Lq2/C$g;->a()Lq2/C$g$a;

    move-result-object v0

    iput-object v0, p0, Lq2/C$c;->m:Lq2/C$g$a;

    .line 15
    iget-object v0, p1, Lq2/C;->h:Lq2/C$i;

    iput-object v0, p0, Lq2/C$c;->n:Lq2/C$i;

    .line 16
    iget-object p1, p1, Lq2/C;->b:Lq2/C$h;

    if-eqz p1, :cond_1

    .line 17
    iget-object v0, p1, Lq2/C$h;->f:Ljava/lang/String;

    iput-object v0, p0, Lq2/C$c;->g:Ljava/lang/String;

    .line 18
    iget-object v0, p1, Lq2/C$h;->b:Ljava/lang/String;

    iput-object v0, p0, Lq2/C$c;->c:Ljava/lang/String;

    .line 19
    iget-object v0, p1, Lq2/C$h;->a:Landroid/net/Uri;

    iput-object v0, p0, Lq2/C$c;->b:Landroid/net/Uri;

    .line 20
    iget-object v0, p1, Lq2/C$h;->e:Ljava/util/List;

    iput-object v0, p0, Lq2/C$c;->f:Ljava/util/List;

    .line 21
    iget-object v0, p1, Lq2/C$h;->g:LP9/u;

    iput-object v0, p0, Lq2/C$c;->h:LP9/u;

    .line 22
    iget-object v0, p1, Lq2/C$h;->i:Ljava/lang/Object;

    iput-object v0, p0, Lq2/C$c;->j:Ljava/lang/Object;

    .line 23
    iget-object v0, p1, Lq2/C$h;->c:Lq2/C$f;

    if-eqz v0, :cond_0

    .line 24
    invoke-virtual {v0}, Lq2/C$f;->b()Lq2/C$f$a;

    move-result-object v0

    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lq2/C$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq2/C$f$a;-><init>(Lq2/C$a;)V

    :goto_0
    iput-object v0, p0, Lq2/C$c;->e:Lq2/C$f$a;

    .line 26
    iget-object v0, p1, Lq2/C$h;->d:Lq2/C$b;

    iput-object v0, p0, Lq2/C$c;->i:Lq2/C$b;

    .line 27
    iget-wide v0, p1, Lq2/C$h;->j:J

    iput-wide v0, p0, Lq2/C$c;->k:J

    :cond_1
    return-void
.end method

.method synthetic constructor <init>(Lq2/C;Lq2/C$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq2/C$c;-><init>(Lq2/C;)V

    return-void
.end method


# virtual methods
.method public a()Lq2/C;
    .locals 13

    .line 1
    iget-object v0, p0, Lq2/C$c;->e:Lq2/C$f$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq2/C$f$a;->e(Lq2/C$f$a;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lq2/C$c;->e:Lq2/C$f$a;

    .line 10
    .line 11
    invoke-static {v0}, Lq2/C$f$a;->f(Lq2/C$f$a;)Ljava/util/UUID;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lq2/C$c;->b:Landroid/net/Uri;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    new-instance v1, Lq2/C$h;

    .line 30
    .line 31
    iget-object v3, p0, Lq2/C$c;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v4, p0, Lq2/C$c;->e:Lq2/C$f$a;

    .line 34
    .line 35
    invoke-static {v4}, Lq2/C$f$a;->f(Lq2/C$f$a;)Ljava/util/UUID;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lq2/C$c;->e:Lq2/C$f$a;

    .line 42
    .line 43
    invoke-virtual {v0}, Lq2/C$f$a;->i()Lq2/C$f;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_2
    move-object v4, v0

    .line 48
    iget-object v5, p0, Lq2/C$c;->i:Lq2/C$b;

    .line 49
    .line 50
    iget-object v6, p0, Lq2/C$c;->f:Ljava/util/List;

    .line 51
    .line 52
    iget-object v7, p0, Lq2/C$c;->g:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v8, p0, Lq2/C$c;->h:LP9/u;

    .line 55
    .line 56
    iget-object v9, p0, Lq2/C$c;->j:Ljava/lang/Object;

    .line 57
    .line 58
    iget-wide v10, p0, Lq2/C$c;->k:J

    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    invoke-direct/range {v1 .. v12}, Lq2/C$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Lq2/C$f;Lq2/C$b;Ljava/util/List;Ljava/lang/String;LP9/u;Ljava/lang/Object;JLq2/C$a;)V

    .line 62
    .line 63
    .line 64
    move-object v5, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-object v5, v0

    .line 67
    :goto_2
    new-instance v2, Lq2/C;

    .line 68
    .line 69
    iget-object v0, p0, Lq2/C$c;->a:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    :goto_3
    move-object v3, v0

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const-string v0, ""

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :goto_4
    iget-object v0, p0, Lq2/C$c;->d:Lq2/C$d$a;

    .line 79
    .line 80
    invoke-virtual {v0}, Lq2/C$d$a;->h()Lq2/C$e;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iget-object v0, p0, Lq2/C$c;->m:Lq2/C$g$a;

    .line 85
    .line 86
    invoke-virtual {v0}, Lq2/C$g$a;->f()Lq2/C$g;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    iget-object v0, p0, Lq2/C$c;->l:Lq2/I;

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    :goto_5
    move-object v7, v0

    .line 95
    goto :goto_6

    .line 96
    :cond_5
    sget-object v0, Lq2/I;->K:Lq2/I;

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :goto_6
    iget-object v8, p0, Lq2/C$c;->n:Lq2/C$i;

    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    invoke-direct/range {v2 .. v9}, Lq2/C;-><init>(Ljava/lang/String;Lq2/C$e;Lq2/C$h;Lq2/C$g;Lq2/I;Lq2/C$i;Lq2/C$a;)V

    .line 103
    .line 104
    .line 105
    return-object v2
.end method

.method public b(Lq2/C$f;)Lq2/C$c;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lq2/C$f;->b()Lq2/C$f$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lq2/C$f$a;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p1, v0}, Lq2/C$f$a;-><init>(Lq2/C$a;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iput-object p1, p0, Lq2/C$c;->e:Lq2/C$f$a;

    .line 15
    .line 16
    return-object p0
.end method

.method public c(Lq2/C$g;)Lq2/C$c;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lq2/C$g;->a()Lq2/C$g$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/C$c;->m:Lq2/C$g$a;

    .line 6
    .line 7
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lq2/C$c;
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iput-object p1, p0, Lq2/C$c;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public e(Lq2/I;)Lq2/C$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$c;->l:Lq2/I;

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Ljava/lang/String;)Lq2/C$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$c;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(Lq2/C$i;)Lq2/C$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$c;->n:Lq2/C$i;

    .line 2
    .line 3
    return-object p0
.end method

.method public h(Ljava/util/List;)Lq2/C$c;
    .locals 0

    .line 1
    invoke-static {p1}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/C$c;->h:LP9/u;

    .line 6
    .line 7
    return-object p0
.end method

.method public i(Ljava/lang/Object;)Lq2/C$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$c;->j:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Landroid/net/Uri;)Lq2/C$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$c;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public k(Ljava/lang/String;)Lq2/C$c;
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
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-virtual {p0, p1}, Lq2/C$c;->j(Landroid/net/Uri;)Lq2/C$c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
