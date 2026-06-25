.class public final LSe/e;
.super LZe/i$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe/e$b;
    }
.end annotation


# static fields
.field private static final k:LSe/e;

.field public static l:LZe/r;


# instance fields
.field private final c:LZe/d;

.field private d:I

.field private e:I

.field private f:Ljava/util/List;

.field private g:Ljava/util/List;

.field private h:Ljava/util/List;

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSe/e$a;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/e;->l:LZe/r;

    .line 7
    .line 8
    new-instance v0, LSe/e;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LSe/e;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LSe/e;->k:LSe/e;

    .line 15
    .line 16
    invoke-direct {v0}, LSe/e;->U()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(LZe/e;LZe/g;)V
    .locals 11

    .line 11
    invoke-direct {p0}, LZe/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LSe/e;->i:B

    .line 13
    iput v0, p0, LSe/e;->j:I

    .line 14
    invoke-direct {p0}, LSe/e;->U()V

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
    const/4 v5, 0x2

    const/16 v6, 0x8

    const/4 v7, 0x4

    if-nez v3, :cond_f

    .line 17
    :try_start_0
    invoke-virtual {p1}, LZe/e;->J()I

    move-result v8

    if-eqz v8, :cond_1

    if-eq v8, v6, :cond_b

    const/16 v9, 0x12

    if-eq v8, v9, :cond_9

    const/16 v9, 0xf8

    if-eq v8, v9, :cond_7

    const/16 v9, 0xfa

    if-eq v8, v9, :cond_4

    const/16 v9, 0x102

    if-eq v8, v9, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v8}, LZe/i$d;->p(LZe/e;LZe/f;LZe/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :cond_2
    and-int/lit8 v8, v4, 0x8

    if-eq v8, v6, :cond_3

    .line 19
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, LSe/e;->h:Ljava/util/List;

    or-int/lit8 v4, v4, 0x8

    .line 20
    :cond_3
    iget-object v8, p0, LSe/e;->h:Ljava/util/List;

    sget-object v9, LSe/d;->i:LZe/r;

    invoke-virtual {p1, v9, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_4
    invoke-virtual {p1}, LZe/e;->z()I

    move-result v8

    .line 22
    invoke-virtual {p1, v8}, LZe/e;->i(I)I

    move-result v8

    and-int/lit8 v9, v4, 0x4

    if-eq v9, v7, :cond_5

    .line 23
    invoke-virtual {p1}, LZe/e;->e()I

    move-result v9

    if-lez v9, :cond_5

    .line 24
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, LSe/e;->g:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    .line 25
    :cond_5
    :goto_1
    invoke-virtual {p1}, LZe/e;->e()I

    move-result v9

    if-lez v9, :cond_6

    .line 26
    iget-object v9, p0, LSe/e;->g:Ljava/util/List;

    invoke-virtual {p1}, LZe/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 27
    :cond_6
    invoke-virtual {p1, v8}, LZe/e;->h(I)V

    goto :goto_0

    :cond_7
    and-int/lit8 v8, v4, 0x4

    if-eq v8, v7, :cond_8

    .line 28
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, LSe/e;->g:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    .line 29
    :cond_8
    iget-object v8, p0, LSe/e;->g:Ljava/util/List;

    invoke-virtual {p1}, LZe/e;->r()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_9
    and-int/lit8 v8, v4, 0x2

    if-eq v8, v5, :cond_a

    .line 30
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, LSe/e;->f:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    .line 31
    :cond_a
    iget-object v8, p0, LSe/e;->f:Ljava/util/List;

    sget-object v9, LSe/v;->n:LZe/r;

    invoke-virtual {p1, v9, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 32
    :cond_b
    iget v8, p0, LSe/e;->d:I

    or-int/2addr v8, v1

    iput v8, p0, LSe/e;->d:I

    .line 33
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v8

    iput v8, p0, LSe/e;->e:I
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 34
    :goto_2
    :try_start_1
    new-instance p2, LZe/k;

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LZe/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1

    .line 36
    :goto_3
    invoke-virtual {p1, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_c

    .line 37
    iget-object p2, p0, LSe/e;->f:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LSe/e;->f:Ljava/util/List;

    :cond_c
    and-int/lit8 p2, v4, 0x4

    if-ne p2, v7, :cond_d

    .line 38
    iget-object p2, p0, LSe/e;->g:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LSe/e;->g:Ljava/util/List;

    :cond_d
    and-int/lit8 p2, v4, 0x8

    if-ne p2, v6, :cond_e

    .line 39
    iget-object p2, p0, LSe/e;->h:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LSe/e;->h:Ljava/util/List;

    .line 40
    :cond_e
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 41
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/e;->c:LZe/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/e;->c:LZe/d;

    .line 42
    throw p1

    .line 43
    :goto_5
    invoke-virtual {p0}, LZe/i$d;->l()V

    .line 44
    throw p1

    :cond_f
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_10

    .line 45
    iget-object p1, p0, LSe/e;->f:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LSe/e;->f:Ljava/util/List;

    :cond_10
    and-int/lit8 p1, v4, 0x4

    if-ne p1, v7, :cond_11

    .line 46
    iget-object p1, p0, LSe/e;->g:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LSe/e;->g:Ljava/util/List;

    :cond_11
    and-int/lit8 p1, v4, 0x8

    if-ne p1, v6, :cond_12

    .line 47
    iget-object p1, p0, LSe/e;->h:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LSe/e;->h:Ljava/util/List;

    .line 48
    :cond_12
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 49
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/e;->c:LZe/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/e;->c:LZe/d;

    .line 50
    throw p1

    .line 51
    :goto_6
    invoke-virtual {p0}, LZe/i$d;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LSe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LSe/e;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i$d;-><init>(LZe/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LSe/e;->i:B

    .line 5
    iput v0, p0, LSe/e;->j:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/e;->c:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$c;LSe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LSe/e;-><init>(LZe/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LSe/e;->i:B

    .line 9
    iput p1, p0, LSe/e;->j:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LSe/e;->c:LZe/d;

    return-void
.end method

.method static synthetic B(LSe/e;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/e;->e:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic C(LSe/e;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/e;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic D(LSe/e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/e;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic E(LSe/e;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/e;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic F(LSe/e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/e;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic G(LSe/e;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/e;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic H(LSe/e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/e;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic I(LSe/e;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/e;->d:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic J(LSe/e;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/e;->c:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static M()LSe/e;
    .locals 1

    .line 1
    sget-object v0, LSe/e;->k:LSe/e;

    .line 2
    .line 3
    return-object v0
.end method

.method private U()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, LSe/e;->e:I

    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, LSe/e;->f:Ljava/util/List;

    .line 7
    .line 8
    iput-object v0, p0, LSe/e;->g:Ljava/util/List;

    .line 9
    .line 10
    iput-object v0, p0, LSe/e;->h:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method public static V()LSe/e$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/e$b;->r()LSe/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static W(LSe/e;)LSe/e$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/e;->V()LSe/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LSe/e$b;->C(LSe/e;)LSe/e$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public K(I)LSe/d;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/e;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LSe/d;

    .line 8
    .line 9
    return-object p1
.end method

.method public L()I
    .locals 1

    .line 1
    iget-object v0, p0, LSe/e;->h:Ljava/util/List;

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

.method public N()LSe/e;
    .locals 1

    .line 1
    sget-object v0, LSe/e;->k:LSe/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public O()I
    .locals 1

    .line 1
    iget v0, p0, LSe/e;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public P(I)LSe/v;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/e;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LSe/v;

    .line 8
    .line 9
    return-object p1
.end method

.method public Q()I
    .locals 1

    .line 1
    iget-object v0, p0, LSe/e;->f:Ljava/util/List;

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

.method public R()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/e;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public S()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/e;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public T()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/e;->d:I

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

.method public X()LSe/e$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/e;->V()LSe/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public Y()LSe/e$b;
    .locals 1

    .line 1
    invoke-static {p0}, LSe/e;->W(LSe/e;)LSe/e$b;

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
    invoke-virtual {p0}, LSe/e;->X()LSe/e$b;

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
    invoke-virtual {p0}, LSe/e;->N()LSe/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()I
    .locals 6

    .line 1
    iget v0, p0, LSe/e;->j:I

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
    iget v0, p0, LSe/e;->d:I

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
    iget v0, p0, LSe/e;->e:I

    .line 15
    .line 16
    invoke-static {v1, v0}, LZe/f;->o(II)I

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
    move v1, v2

    .line 23
    :goto_1
    iget-object v3, p0, LSe/e;->f:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x2

    .line 30
    if-ge v1, v3, :cond_2

    .line 31
    .line 32
    iget-object v3, p0, LSe/e;->f:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, LZe/p;

    .line 39
    .line 40
    invoke-static {v4, v3}, LZe/f;->r(ILZe/p;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    add-int/2addr v0, v3

    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v1, v2

    .line 49
    move v3, v1

    .line 50
    :goto_2
    iget-object v5, p0, LSe/e;->g:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-ge v1, v5, :cond_3

    .line 57
    .line 58
    iget-object v5, p0, LSe/e;->g:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-static {v5}, LZe/f;->p(I)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    add-int/2addr v3, v5

    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    add-int/2addr v0, v3

    .line 79
    invoke-virtual {p0}, LSe/e;->S()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    mul-int/2addr v1, v4

    .line 88
    add-int/2addr v0, v1

    .line 89
    :goto_3
    iget-object v1, p0, LSe/e;->h:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-ge v2, v1, :cond_4

    .line 96
    .line 97
    iget-object v1, p0, LSe/e;->h:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, LZe/p;

    .line 104
    .line 105
    const/16 v3, 0x20

    .line 106
    .line 107
    invoke-static {v3, v1}, LZe/f;->r(ILZe/p;)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v0, v1

    .line 112
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-virtual {p0}, LZe/i$d;->u()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    add-int/2addr v0, v1

    .line 120
    iget-object v1, p0, LSe/e;->c:LZe/d;

    .line 121
    .line 122
    invoke-virtual {v1}, LZe/d;->size()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    add-int/2addr v0, v1

    .line 127
    iput v0, p0, LSe/e;->j:I

    .line 128
    .line 129
    return v0
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-byte v0, p0, LSe/e;->i:B

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
    move v0, v2

    .line 12
    :goto_0
    invoke-virtual {p0}, LSe/e;->Q()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, LSe/e;->P(I)LSe/v;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, LSe/v;->e()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    iput-byte v2, p0, LSe/e;->i:B

    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    move v0, v2

    .line 35
    :goto_1
    invoke-virtual {p0}, LSe/e;->L()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ge v0, v3, :cond_5

    .line 40
    .line 41
    invoke-virtual {p0, v0}, LSe/e;->K(I)LSe/d;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, LSe/d;->e()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_4

    .line 50
    .line 51
    iput-byte v2, p0, LSe/e;->i:B

    .line 52
    .line 53
    return v2

    .line 54
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    invoke-virtual {p0}, LZe/i$d;->t()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    iput-byte v2, p0, LSe/e;->i:B

    .line 64
    .line 65
    return v2

    .line 66
    :cond_6
    iput-byte v1, p0, LSe/e;->i:B

    .line 67
    .line 68
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/e;->Y()LSe/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(LZe/f;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LSe/e;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LZe/i$d;->z()LZe/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, LSe/e;->d:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, LSe/e;->e:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, LZe/f;->Z(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    :goto_0
    iget-object v3, p0, LSe/e;->f:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-ge v2, v3, :cond_1

    .line 28
    .line 29
    iget-object v3, p0, LSe/e;->f:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, LZe/p;

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    invoke-virtual {p1, v4, v3}, LZe/f;->c0(ILZe/p;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v2, v1

    .line 45
    :goto_1
    iget-object v3, p0, LSe/e;->g:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-ge v2, v3, :cond_2

    .line 52
    .line 53
    iget-object v3, p0, LSe/e;->g:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const/16 v4, 0x1f

    .line 66
    .line 67
    invoke-virtual {p1, v4, v3}, LZe/f;->Z(II)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    :goto_2
    iget-object v2, p0, LSe/e;->h:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-ge v1, v2, :cond_3

    .line 80
    .line 81
    iget-object v2, p0, LSe/e;->h:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, LZe/p;

    .line 88
    .line 89
    const/16 v3, 0x20

    .line 90
    .line 91
    invoke-virtual {p1, v3, v2}, LZe/f;->c0(ILZe/p;)V

    .line 92
    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    const/16 v1, 0x4a38

    .line 98
    .line 99
    invoke-virtual {v0, v1, p1}, LZe/i$d$a;->a(ILZe/f;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, LSe/e;->c:LZe/d;

    .line 103
    .line 104
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method
