.class public final LSe/n;
.super LZe/i$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe/n$b;
    }
.end annotation


# static fields
.field private static final k:LSe/n;

.field public static l:LZe/r;


# instance fields
.field private final c:LZe/d;

.field private d:I

.field private e:LSe/q;

.field private f:LSe/p;

.field private g:LSe/m;

.field private h:Ljava/util/List;

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSe/n$a;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/n$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/n;->l:LZe/r;

    .line 7
    .line 8
    new-instance v0, LSe/n;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LSe/n;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LSe/n;->k:LSe/n;

    .line 15
    .line 16
    invoke-direct {v0}, LSe/n;->T()V

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
    iput-byte v0, p0, LSe/n;->i:B

    .line 13
    iput v0, p0, LSe/n;->j:I

    .line 14
    invoke-direct {p0}, LSe/n;->T()V

    .line 15
    invoke-static {}, LZe/d;->t()LZe/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, LZe/f;->I(Ljava/io/OutputStream;I)LZe/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x8

    if-nez v3, :cond_e

    .line 17
    :try_start_0
    invoke-virtual {p1}, LZe/e;->J()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0xa

    const/4 v8, 0x0

    if-eq v6, v7, :cond_a

    const/16 v7, 0x12

    if-eq v6, v7, :cond_7

    const/16 v7, 0x1a

    if-eq v6, v7, :cond_4

    const/16 v7, 0x22

    if-eq v6, v7, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v6}, LZe/i$d;->p(LZe/e;LZe/f;LZe/g;I)Z

    move-result v5

    if-nez v5, :cond_0

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

    :cond_2
    and-int/lit8 v6, v4, 0x8

    if-eq v6, v5, :cond_3

    .line 19
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, LSe/n;->h:Ljava/util/List;

    move v4, v5

    .line 20
    :cond_3
    iget-object v6, p0, LSe/n;->h:Ljava/util/List;

    sget-object v7, LSe/c;->l0:LZe/r;

    invoke-virtual {p1, v7, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_4
    iget v6, p0, LSe/n;->d:I

    const/4 v7, 0x4

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_5

    .line 22
    iget-object v6, p0, LSe/n;->g:LSe/m;

    invoke-virtual {v6}, LSe/m;->f0()LSe/m$b;

    move-result-object v8

    .line 23
    :cond_5
    sget-object v6, LSe/m;->m:LZe/r;

    invoke-virtual {p1, v6, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v6

    check-cast v6, LSe/m;

    iput-object v6, p0, LSe/n;->g:LSe/m;

    if-eqz v8, :cond_6

    .line 24
    invoke-virtual {v8, v6}, LSe/m$b;->C(LSe/m;)LSe/m$b;

    .line 25
    invoke-virtual {v8}, LSe/m$b;->t()LSe/m;

    move-result-object v6

    iput-object v6, p0, LSe/n;->g:LSe/m;

    .line 26
    :cond_6
    iget v6, p0, LSe/n;->d:I

    or-int/2addr v6, v7

    iput v6, p0, LSe/n;->d:I

    goto :goto_0

    .line 27
    :cond_7
    iget v6, p0, LSe/n;->d:I

    const/4 v7, 0x2

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_8

    .line 28
    iget-object v6, p0, LSe/n;->f:LSe/p;

    invoke-virtual {v6}, LSe/p;->C()LSe/p$b;

    move-result-object v8

    .line 29
    :cond_8
    sget-object v6, LSe/p;->g:LZe/r;

    invoke-virtual {p1, v6, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v6

    check-cast v6, LSe/p;

    iput-object v6, p0, LSe/n;->f:LSe/p;

    if-eqz v8, :cond_9

    .line 30
    invoke-virtual {v8, v6}, LSe/p$b;->u(LSe/p;)LSe/p$b;

    .line 31
    invoke-virtual {v8}, LSe/p$b;->p()LSe/p;

    move-result-object v6

    iput-object v6, p0, LSe/n;->f:LSe/p;

    .line 32
    :cond_9
    iget v6, p0, LSe/n;->d:I

    or-int/2addr v6, v7

    iput v6, p0, LSe/n;->d:I

    goto/16 :goto_0

    .line 33
    :cond_a
    iget v6, p0, LSe/n;->d:I

    and-int/2addr v6, v1

    if-ne v6, v1, :cond_b

    .line 34
    iget-object v6, p0, LSe/n;->e:LSe/q;

    invoke-virtual {v6}, LSe/q;->C()LSe/q$b;

    move-result-object v8

    .line 35
    :cond_b
    sget-object v6, LSe/q;->g:LZe/r;

    invoke-virtual {p1, v6, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v6

    check-cast v6, LSe/q;

    iput-object v6, p0, LSe/n;->e:LSe/q;

    if-eqz v8, :cond_c

    .line 36
    invoke-virtual {v8, v6}, LSe/q$b;->u(LSe/q;)LSe/q$b;

    .line 37
    invoke-virtual {v8}, LSe/q$b;->p()LSe/q;

    move-result-object v6

    iput-object v6, p0, LSe/n;->e:LSe/q;

    .line 38
    :cond_c
    iget v6, p0, LSe/n;->d:I

    or-int/2addr v6, v1

    iput v6, p0, LSe/n;->d:I
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

    :goto_3
    and-int/lit8 p2, v4, 0x8

    if-ne p2, v5, :cond_d

    .line 42
    iget-object p2, p0, LSe/n;->h:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LSe/n;->h:Ljava/util/List;

    .line 43
    :cond_d
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/n;->c:LZe/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/n;->c:LZe/d;

    .line 45
    throw p1

    .line 46
    :goto_4
    invoke-virtual {p0}, LZe/i$d;->l()V

    .line 47
    throw p1

    :cond_e
    and-int/lit8 p1, v4, 0x8

    if-ne p1, v5, :cond_f

    .line 48
    iget-object p1, p0, LSe/n;->h:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LSe/n;->h:Ljava/util/List;

    .line 49
    :cond_f
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 50
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/n;->c:LZe/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/n;->c:LZe/d;

    .line 51
    throw p1

    .line 52
    :goto_5
    invoke-virtual {p0}, LZe/i$d;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LSe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LSe/n;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i$d;-><init>(LZe/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LSe/n;->i:B

    .line 5
    iput v0, p0, LSe/n;->j:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/n;->c:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$c;LSe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LSe/n;-><init>(LZe/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LSe/n;->i:B

    .line 9
    iput p1, p0, LSe/n;->j:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LSe/n;->c:LZe/d;

    return-void
.end method

.method static synthetic B(LSe/n;LSe/q;)LSe/q;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/n;->e:LSe/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic C(LSe/n;LSe/p;)LSe/p;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/n;->f:LSe/p;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic D(LSe/n;LSe/m;)LSe/m;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/n;->g:LSe/m;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic E(LSe/n;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/n;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic F(LSe/n;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/n;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic G(LSe/n;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/n;->d:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic H(LSe/n;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/n;->c:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static L()LSe/n;
    .locals 1

    .line 1
    sget-object v0, LSe/n;->k:LSe/n;

    .line 2
    .line 3
    return-object v0
.end method

.method private T()V
    .locals 1

    .line 1
    invoke-static {}, LSe/q;->v()LSe/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LSe/n;->e:LSe/q;

    .line 6
    .line 7
    invoke-static {}, LSe/p;->v()LSe/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LSe/n;->f:LSe/p;

    .line 12
    .line 13
    invoke-static {}, LSe/m;->L()LSe/m;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, LSe/n;->g:LSe/m;

    .line 18
    .line 19
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 20
    .line 21
    iput-object v0, p0, LSe/n;->h:Ljava/util/List;

    .line 22
    .line 23
    return-void
.end method

.method public static U()LSe/n$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/n$b;->r()LSe/n$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static V(LSe/n;)LSe/n$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/n;->U()LSe/n$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LSe/n$b;->A(LSe/n;)LSe/n$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static X(Ljava/io/InputStream;LZe/g;)LSe/n;
    .locals 1

    .line 1
    sget-object v0, LSe/n;->l:LZe/r;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, LZe/r;->c(Ljava/io/InputStream;LZe/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LSe/n;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public I(I)LSe/c;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/n;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LSe/c;

    .line 8
    .line 9
    return-object p1
.end method

.method public J()I
    .locals 1

    .line 1
    iget-object v0, p0, LSe/n;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public K()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/n;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public M()LSe/n;
    .locals 1

    .line 1
    sget-object v0, LSe/n;->k:LSe/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public N()LSe/m;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/n;->g:LSe/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public O()LSe/p;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/n;->f:LSe/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public P()LSe/q;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/n;->e:LSe/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public Q()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/n;->d:I

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

.method public R()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/n;->d:I

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

.method public S()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/n;->d:I

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

.method public W()LSe/n$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/n;->U()LSe/n$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public Y()LSe/n$b;
    .locals 1

    .line 1
    invoke-static {p0}, LSe/n;->V(LSe/n;)LSe/n$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic a()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/n;->W()LSe/n$b;

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
    invoke-virtual {p0}, LSe/n;->M()LSe/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()I
    .locals 5

    .line 1
    iget v0, p0, LSe/n;->j:I

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
    iget v0, p0, LSe/n;->d:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, LSe/n;->e:LSe/q;

    .line 15
    .line 16
    invoke-static {v1, v0}, LZe/f;->r(ILZe/p;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    iget v1, p0, LSe/n;->d:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, LSe/n;->f:LSe/p;

    .line 29
    .line 30
    invoke-static {v3, v1}, LZe/f;->r(ILZe/p;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v0, v1

    .line 35
    :cond_2
    iget v1, p0, LSe/n;->d:I

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    and-int/2addr v1, v3

    .line 39
    if-ne v1, v3, :cond_3

    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    iget-object v4, p0, LSe/n;->g:LSe/m;

    .line 43
    .line 44
    invoke-static {v1, v4}, LZe/f;->r(ILZe/p;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    :cond_3
    :goto_1
    iget-object v1, p0, LSe/n;->h:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ge v2, v1, :cond_4

    .line 56
    .line 57
    iget-object v1, p0, LSe/n;->h:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, LZe/p;

    .line 64
    .line 65
    invoke-static {v3, v1}, LZe/f;->r(ILZe/p;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v0, v1

    .line 70
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-virtual {p0}, LZe/i$d;->u()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v0, v1

    .line 78
    iget-object v1, p0, LSe/n;->c:LZe/d;

    .line 79
    .line 80
    invoke-virtual {v1}, LZe/d;->size()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    add-int/2addr v0, v1

    .line 85
    iput v0, p0, LSe/n;->j:I

    .line 86
    .line 87
    return v0
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-byte v0, p0, LSe/n;->i:B

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
    invoke-virtual {p0}, LSe/n;->R()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, LSe/n;->O()LSe/p;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, LSe/p;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iput-byte v2, p0, LSe/n;->i:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    invoke-virtual {p0}, LSe/n;->Q()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, LSe/n;->N()LSe/m;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, LSe/m;->e()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    iput-byte v2, p0, LSe/n;->i:B

    .line 47
    .line 48
    return v2

    .line 49
    :cond_3
    move v0, v2

    .line 50
    :goto_0
    invoke-virtual {p0}, LSe/n;->J()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-ge v0, v3, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0, v0}, LSe/n;->I(I)LSe/c;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, LSe/c;->e()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    iput-byte v2, p0, LSe/n;->i:B

    .line 67
    .line 68
    return v2

    .line 69
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    invoke-virtual {p0}, LZe/i$d;->t()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    iput-byte v2, p0, LSe/n;->i:B

    .line 79
    .line 80
    return v2

    .line 81
    :cond_6
    iput-byte v1, p0, LSe/n;->i:B

    .line 82
    .line 83
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/n;->Y()LSe/n$b;

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
    invoke-virtual {p0}, LSe/n;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LZe/i$d;->z()LZe/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, LSe/n;->d:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LSe/n;->e:LSe/q;

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, LZe/f;->c0(ILZe/p;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, LSe/n;->d:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, LSe/n;->f:LSe/p;

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, LZe/f;->c0(ILZe/p;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v1, p0, LSe/n;->d:I

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
    iget-object v3, p0, LSe/n;->g:LSe/m;

    .line 38
    .line 39
    invoke-virtual {p1, v1, v3}, LZe/f;->c0(ILZe/p;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    const/4 v1, 0x0

    .line 43
    :goto_0
    iget-object v3, p0, LSe/n;->h:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-ge v1, v3, :cond_3

    .line 50
    .line 51
    iget-object v3, p0, LSe/n;->h:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, LZe/p;

    .line 58
    .line 59
    invoke-virtual {p1, v2, v3}, LZe/f;->c0(ILZe/p;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/16 v1, 0xc8

    .line 66
    .line 67
    invoke-virtual {v0, v1, p1}, LZe/i$d$a;->a(ILZe/f;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, LSe/n;->c:LZe/d;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
