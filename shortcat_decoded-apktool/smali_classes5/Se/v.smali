.class public final LSe/v;
.super LZe/i$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe/v$b;
    }
.end annotation


# static fields
.field private static final m:LSe/v;

.field public static n:LZe/r;


# instance fields
.field private final c:LZe/d;

.field private d:I

.field private e:I

.field private f:I

.field private g:LSe/r;

.field private h:I

.field private i:LSe/r;

.field private j:I

.field private k:B

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSe/v$a;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/v$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/v;->n:LZe/r;

    .line 7
    .line 8
    new-instance v0, LSe/v;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LSe/v;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LSe/v;->m:LSe/v;

    .line 15
    .line 16
    invoke-direct {v0}, LSe/v;->X()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(LZe/e;LZe/g;)V
    .locals 9

    .line 11
    invoke-direct {p0}, LZe/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LSe/v;->k:B

    .line 13
    iput v0, p0, LSe/v;->l:I

    .line 14
    invoke-direct {p0}, LSe/v;->X()V

    .line 15
    invoke-static {}, LZe/d;->t()LZe/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, LZe/f;->I(Ljava/io/OutputStream;I)LZe/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_c

    .line 17
    :try_start_0
    invoke-virtual {p1}, LZe/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_b

    const/16 v6, 0x10

    if-eq v4, v6, :cond_a

    const/16 v7, 0x1a

    const/4 v8, 0x0

    if-eq v4, v7, :cond_7

    const/16 v7, 0x22

    if-eq v4, v7, :cond_4

    const/16 v6, 0x28

    if-eq v4, v6, :cond_3

    const/16 v5, 0x30

    if-eq v4, v5, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, LZe/i$d;->p(LZe/e;LZe/f;LZe/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    .line 19
    :cond_2
    iget v4, p0, LSe/v;->d:I

    or-int/lit8 v4, v4, 0x20

    iput v4, p0, LSe/v;->d:I

    .line 20
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v4

    iput v4, p0, LSe/v;->j:I

    goto :goto_0

    .line 21
    :cond_3
    iget v4, p0, LSe/v;->d:I

    or-int/2addr v4, v5

    iput v4, p0, LSe/v;->d:I

    .line 22
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v4

    iput v4, p0, LSe/v;->h:I

    goto :goto_0

    .line 23
    :cond_4
    iget v4, p0, LSe/v;->d:I

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_5

    .line 24
    iget-object v4, p0, LSe/v;->i:LSe/r;

    invoke-virtual {v4}, LSe/r;->B0()LSe/r$c;

    move-result-object v8

    .line 25
    :cond_5
    sget-object v4, LSe/r;->v:LZe/r;

    invoke-virtual {p1, v4, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v4

    check-cast v4, LSe/r;

    iput-object v4, p0, LSe/v;->i:LSe/r;

    if-eqz v8, :cond_6

    .line 26
    invoke-virtual {v8, v4}, LSe/r$c;->C(LSe/r;)LSe/r$c;

    .line 27
    invoke-virtual {v8}, LSe/r$c;->t()LSe/r;

    move-result-object v4

    iput-object v4, p0, LSe/v;->i:LSe/r;

    .line 28
    :cond_6
    iget v4, p0, LSe/v;->d:I

    or-int/2addr v4, v6

    iput v4, p0, LSe/v;->d:I

    goto :goto_0

    .line 29
    :cond_7
    iget v4, p0, LSe/v;->d:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_8

    .line 30
    iget-object v4, p0, LSe/v;->g:LSe/r;

    invoke-virtual {v4}, LSe/r;->B0()LSe/r$c;

    move-result-object v8

    .line 31
    :cond_8
    sget-object v4, LSe/r;->v:LZe/r;

    invoke-virtual {p1, v4, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v4

    check-cast v4, LSe/r;

    iput-object v4, p0, LSe/v;->g:LSe/r;

    if-eqz v8, :cond_9

    .line 32
    invoke-virtual {v8, v4}, LSe/r$c;->C(LSe/r;)LSe/r$c;

    .line 33
    invoke-virtual {v8}, LSe/r$c;->t()LSe/r;

    move-result-object v4

    iput-object v4, p0, LSe/v;->g:LSe/r;

    .line 34
    :cond_9
    iget v4, p0, LSe/v;->d:I

    or-int/2addr v4, v5

    iput v4, p0, LSe/v;->d:I

    goto/16 :goto_0

    .line 35
    :cond_a
    iget v4, p0, LSe/v;->d:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, LSe/v;->d:I

    .line 36
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v4

    iput v4, p0, LSe/v;->f:I

    goto/16 :goto_0

    .line 37
    :cond_b
    iget v4, p0, LSe/v;->d:I

    or-int/2addr v4, v1

    iput v4, p0, LSe/v;->d:I

    .line 38
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v4

    iput v4, p0, LSe/v;->e:I
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 39
    :goto_1
    :try_start_1
    new-instance p2, LZe/k;

    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LZe/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1

    .line 41
    :goto_2
    invoke-virtual {p1, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    :goto_3
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/v;->c:LZe/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/v;->c:LZe/d;

    .line 44
    throw p1

    .line 45
    :goto_4
    invoke-virtual {p0}, LZe/i$d;->l()V

    .line 46
    throw p1

    .line 47
    :cond_c
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 48
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/v;->c:LZe/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/v;->c:LZe/d;

    .line 49
    throw p1

    .line 50
    :goto_5
    invoke-virtual {p0}, LZe/i$d;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LSe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LSe/v;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i$d;-><init>(LZe/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LSe/v;->k:B

    .line 5
    iput v0, p0, LSe/v;->l:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/v;->c:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$c;LSe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LSe/v;-><init>(LZe/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LSe/v;->k:B

    .line 9
    iput p1, p0, LSe/v;->l:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LSe/v;->c:LZe/d;

    return-void
.end method

.method static synthetic B(LSe/v;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/v;->e:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic C(LSe/v;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/v;->f:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic D(LSe/v;LSe/r;)LSe/r;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/v;->g:LSe/r;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic E(LSe/v;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/v;->h:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic F(LSe/v;LSe/r;)LSe/r;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/v;->i:LSe/r;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic G(LSe/v;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/v;->j:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic H(LSe/v;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/v;->d:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic I(LSe/v;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/v;->c:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static J()LSe/v;
    .locals 1

    .line 1
    sget-object v0, LSe/v;->m:LSe/v;

    .line 2
    .line 3
    return-object v0
.end method

.method private X()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LSe/v;->e:I

    .line 3
    .line 4
    iput v0, p0, LSe/v;->f:I

    .line 5
    .line 6
    invoke-static {}, LSe/r;->Y()LSe/r;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, LSe/v;->g:LSe/r;

    .line 11
    .line 12
    iput v0, p0, LSe/v;->h:I

    .line 13
    .line 14
    invoke-static {}, LSe/r;->Y()LSe/r;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, LSe/v;->i:LSe/r;

    .line 19
    .line 20
    iput v0, p0, LSe/v;->j:I

    .line 21
    .line 22
    return-void
.end method

.method public static Y()LSe/v$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/v$b;->r()LSe/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static Z(LSe/v;)LSe/v$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/v;->Y()LSe/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LSe/v$b;->y(LSe/v;)LSe/v$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public K()LSe/v;
    .locals 1

    .line 1
    sget-object v0, LSe/v;->m:LSe/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public L()I
    .locals 1

    .line 1
    iget v0, p0, LSe/v;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public M()I
    .locals 1

    .line 1
    iget v0, p0, LSe/v;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public N()LSe/r;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/v;->g:LSe/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public O()I
    .locals 1

    .line 1
    iget v0, p0, LSe/v;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public P()LSe/r;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/v;->i:LSe/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public Q()I
    .locals 1

    .line 1
    iget v0, p0, LSe/v;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public R()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/v;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public S()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/v;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public T()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/v;->d:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public U()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/v;->d:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public V()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/v;->d:I

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public W()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/v;->d:I

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public bridge synthetic a()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/v;->a0()LSe/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public a0()LSe/v$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/v;->Y()LSe/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b0()LSe/v$b;
    .locals 1

    .line 1
    invoke-static {p0}, LSe/v;->Z(LSe/v;)LSe/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic c()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/v;->K()LSe/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()I
    .locals 4

    .line 1
    iget v0, p0, LSe/v;->l:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, LSe/v;->d:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, LSe/v;->e:I

    .line 14
    .line 15
    invoke-static {v1, v0}, LZe/f;->o(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget v1, p0, LSe/v;->d:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, LSe/v;->f:I

    .line 28
    .line 29
    invoke-static {v2, v1}, LZe/f;->o(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, LSe/v;->d:I

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    and-int/2addr v1, v2

    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iget-object v3, p0, LSe/v;->g:LSe/r;

    .line 42
    .line 43
    invoke-static {v1, v3}, LZe/f;->r(ILZe/p;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_3
    iget v1, p0, LSe/v;->d:I

    .line 49
    .line 50
    const/16 v3, 0x10

    .line 51
    .line 52
    and-int/2addr v1, v3

    .line 53
    if-ne v1, v3, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, LSe/v;->i:LSe/r;

    .line 56
    .line 57
    invoke-static {v2, v1}, LZe/f;->r(ILZe/p;)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v0, v1

    .line 62
    :cond_4
    iget v1, p0, LSe/v;->d:I

    .line 63
    .line 64
    const/16 v2, 0x8

    .line 65
    .line 66
    and-int/2addr v1, v2

    .line 67
    if-ne v1, v2, :cond_5

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    iget v2, p0, LSe/v;->h:I

    .line 71
    .line 72
    invoke-static {v1, v2}, LZe/f;->o(II)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v0, v1

    .line 77
    :cond_5
    iget v1, p0, LSe/v;->d:I

    .line 78
    .line 79
    const/16 v2, 0x20

    .line 80
    .line 81
    and-int/2addr v1, v2

    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    const/4 v1, 0x6

    .line 85
    iget v2, p0, LSe/v;->j:I

    .line 86
    .line 87
    invoke-static {v1, v2}, LZe/f;->o(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    add-int/2addr v0, v1

    .line 92
    :cond_6
    invoke-virtual {p0}, LZe/i$d;->u()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v0, v1

    .line 97
    iget-object v1, p0, LSe/v;->c:LZe/d;

    .line 98
    .line 99
    invoke-virtual {v1}, LZe/d;->size()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 104
    iput v0, p0, LSe/v;->l:I

    .line 105
    .line 106
    return v0
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget-byte v0, p0, LSe/v;->k:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0}, LSe/v;->S()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, LSe/v;->k:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    invoke-virtual {p0}, LSe/v;->T()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, LSe/v;->N()LSe/r;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, LSe/r;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    iput-byte v2, p0, LSe/v;->k:B

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    invoke-virtual {p0}, LSe/v;->V()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, LSe/v;->P()LSe/r;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, LSe/r;->e()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    iput-byte v2, p0, LSe/v;->k:B

    .line 56
    .line 57
    return v2

    .line 58
    :cond_4
    invoke-virtual {p0}, LZe/i$d;->t()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_5

    .line 63
    .line 64
    iput-byte v2, p0, LSe/v;->k:B

    .line 65
    .line 66
    return v2

    .line 67
    :cond_5
    iput-byte v1, p0, LSe/v;->k:B

    .line 68
    .line 69
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/v;->b0()LSe/v$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(LZe/f;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LSe/v;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LZe/i$d;->z()LZe/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, LSe/v;->d:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, LSe/v;->e:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, LZe/f;->Z(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, LSe/v;->d:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    iget v1, p0, LSe/v;->f:I

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, LZe/f;->Z(II)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v1, p0, LSe/v;->d:I

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    and-int/2addr v1, v2

    .line 34
    if-ne v1, v2, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    iget-object v3, p0, LSe/v;->g:LSe/r;

    .line 38
    .line 39
    invoke-virtual {p1, v1, v3}, LZe/f;->c0(ILZe/p;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget v1, p0, LSe/v;->d:I

    .line 43
    .line 44
    const/16 v3, 0x10

    .line 45
    .line 46
    and-int/2addr v1, v3

    .line 47
    if-ne v1, v3, :cond_3

    .line 48
    .line 49
    iget-object v1, p0, LSe/v;->i:LSe/r;

    .line 50
    .line 51
    invoke-virtual {p1, v2, v1}, LZe/f;->c0(ILZe/p;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iget v1, p0, LSe/v;->d:I

    .line 55
    .line 56
    const/16 v2, 0x8

    .line 57
    .line 58
    and-int/2addr v1, v2

    .line 59
    if-ne v1, v2, :cond_4

    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    iget v2, p0, LSe/v;->h:I

    .line 63
    .line 64
    invoke-virtual {p1, v1, v2}, LZe/f;->Z(II)V

    .line 65
    .line 66
    .line 67
    :cond_4
    iget v1, p0, LSe/v;->d:I

    .line 68
    .line 69
    const/16 v2, 0x20

    .line 70
    .line 71
    and-int/2addr v1, v2

    .line 72
    if-ne v1, v2, :cond_5

    .line 73
    .line 74
    const/4 v1, 0x6

    .line 75
    iget v2, p0, LSe/v;->j:I

    .line 76
    .line 77
    invoke-virtual {p1, v1, v2}, LZe/f;->Z(II)V

    .line 78
    .line 79
    .line 80
    :cond_5
    const/16 v1, 0xc8

    .line 81
    .line 82
    invoke-virtual {v0, v1, p1}, LZe/i$d$a;->a(ILZe/f;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, LSe/v;->c:LZe/d;

    .line 86
    .line 87
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method
