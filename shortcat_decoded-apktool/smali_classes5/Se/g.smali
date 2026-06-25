.class public final LSe/g;
.super LZe/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe/g$b;,
        LSe/g$d;,
        LSe/g$c;
    }
.end annotation


# static fields
.field private static final j:LSe/g;

.field public static k:LZe/r;


# instance fields
.field private final b:LZe/d;

.field private c:I

.field private d:LSe/g$c;

.field private e:Ljava/util/List;

.field private f:LSe/i;

.field private g:LSe/g$d;

.field private h:B

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSe/g$a;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/g$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/g;->k:LZe/r;

    .line 7
    .line 8
    new-instance v0, LSe/g;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LSe/g;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LSe/g;->j:LSe/g;

    .line 15
    .line 16
    invoke-direct {v0}, LSe/g;->I()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(LZe/e;LZe/g;)V
    .locals 9

    .line 11
    invoke-direct {p0}, LZe/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LSe/g;->h:B

    .line 13
    iput v0, p0, LSe/g;->i:I

    .line 14
    invoke-direct {p0}, LSe/g;->I()V

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

    if-nez v3, :cond_c

    .line 17
    :try_start_0
    invoke-virtual {p1}, LZe/e;->J()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0x8

    if-eq v6, v7, :cond_9

    const/16 v7, 0x12

    if-eq v6, v7, :cond_7

    const/16 v7, 0x1a

    if-eq v6, v7, :cond_4

    const/16 v7, 0x20

    if-eq v6, v7, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v6}, LZe/i;->p(LZe/e;LZe/f;LZe/g;I)Z

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

    .line 19
    :cond_2
    invoke-virtual {p1}, LZe/e;->m()I

    move-result v7

    .line 20
    invoke-static {v7}, LSe/g$d;->a(I)LSe/g$d;

    move-result-object v8

    if-nez v8, :cond_3

    .line 21
    invoke-virtual {v2, v6}, LZe/f;->n0(I)V

    .line 22
    invoke-virtual {v2, v7}, LZe/f;->n0(I)V

    goto :goto_0

    .line 23
    :cond_3
    iget v6, p0, LSe/g;->c:I

    or-int/lit8 v6, v6, 0x4

    iput v6, p0, LSe/g;->c:I

    .line 24
    iput-object v8, p0, LSe/g;->g:LSe/g$d;

    goto :goto_0

    .line 25
    :cond_4
    iget v6, p0, LSe/g;->c:I

    and-int/2addr v6, v5

    if-ne v6, v5, :cond_5

    .line 26
    iget-object v6, p0, LSe/g;->f:LSe/i;

    invoke-virtual {v6}, LSe/i;->W()LSe/i$b;

    move-result-object v6

    goto :goto_1

    :cond_5
    const/4 v6, 0x0

    .line 27
    :goto_1
    sget-object v7, LSe/i;->n:LZe/r;

    invoke-virtual {p1, v7, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v7

    check-cast v7, LSe/i;

    iput-object v7, p0, LSe/g;->f:LSe/i;

    if-eqz v6, :cond_6

    .line 28
    invoke-virtual {v6, v7}, LSe/i$b;->v(LSe/i;)LSe/i$b;

    .line 29
    invoke-virtual {v6}, LSe/i$b;->p()LSe/i;

    move-result-object v6

    iput-object v6, p0, LSe/g;->f:LSe/i;

    .line 30
    :cond_6
    iget v6, p0, LSe/g;->c:I

    or-int/2addr v6, v5

    iput v6, p0, LSe/g;->c:I

    goto :goto_0

    :cond_7
    and-int/lit8 v6, v4, 0x2

    if-eq v6, v5, :cond_8

    .line 31
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, LSe/g;->e:Ljava/util/List;

    move v4, v5

    .line 32
    :cond_8
    iget-object v6, p0, LSe/g;->e:Ljava/util/List;

    sget-object v7, LSe/i;->n:LZe/r;

    invoke-virtual {p1, v7, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 33
    :cond_9
    invoke-virtual {p1}, LZe/e;->m()I

    move-result v7

    .line 34
    invoke-static {v7}, LSe/g$c;->a(I)LSe/g$c;

    move-result-object v8

    if-nez v8, :cond_a

    .line 35
    invoke-virtual {v2, v6}, LZe/f;->n0(I)V

    .line 36
    invoke-virtual {v2, v7}, LZe/f;->n0(I)V

    goto/16 :goto_0

    .line 37
    :cond_a
    iget v6, p0, LSe/g;->c:I

    or-int/2addr v6, v1

    iput v6, p0, LSe/g;->c:I

    .line 38
    iput-object v8, p0, LSe/g;->d:LSe/g$c;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 39
    :goto_2
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
    :goto_3
    invoke-virtual {p1, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_b

    .line 42
    iget-object p2, p0, LSe/g;->e:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LSe/g;->e:Ljava/util/List;

    .line 43
    :cond_b
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/g;->b:LZe/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/g;->b:LZe/d;

    .line 45
    throw p1

    .line 46
    :goto_5
    invoke-virtual {p0}, LZe/i;->l()V

    .line 47
    throw p1

    :cond_c
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_d

    .line 48
    iget-object p1, p0, LSe/g;->e:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LSe/g;->e:Ljava/util/List;

    .line 49
    :cond_d
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 50
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/g;->b:LZe/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/g;->b:LZe/d;

    .line 51
    throw p1

    .line 52
    :goto_6
    invoke-virtual {p0}, LZe/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LSe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LSe/g;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i;-><init>(LZe/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LSe/g;->h:B

    .line 5
    iput v0, p0, LSe/g;->i:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/g;->b:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$b;LSe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LSe/g;-><init>(LZe/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LSe/g;->h:B

    .line 9
    iput p1, p0, LSe/g;->i:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LSe/g;->b:LZe/d;

    return-void
.end method

.method public static A()LSe/g;
    .locals 1

    .line 1
    sget-object v0, LSe/g;->j:LSe/g;

    .line 2
    .line 3
    return-object v0
.end method

.method private I()V
    .locals 1

    .line 1
    sget-object v0, LSe/g$c;->b:LSe/g$c;

    .line 2
    .line 3
    iput-object v0, p0, LSe/g;->d:LSe/g$c;

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, LSe/g;->e:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {}, LSe/i;->G()LSe/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LSe/g;->f:LSe/i;

    .line 14
    .line 15
    sget-object v0, LSe/g$d;->b:LSe/g$d;

    .line 16
    .line 17
    iput-object v0, p0, LSe/g;->g:LSe/g$d;

    .line 18
    .line 19
    return-void
.end method

.method public static J()LSe/g$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/g$b;->m()LSe/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static K(LSe/g;)LSe/g$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/g;->J()LSe/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LSe/g$b;->v(LSe/g;)LSe/g$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic s(LSe/g;LSe/g$c;)LSe/g$c;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/g;->d:LSe/g$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic t(LSe/g;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/g;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic u(LSe/g;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/g;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic v(LSe/g;LSe/i;)LSe/i;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/g;->f:LSe/i;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic w(LSe/g;LSe/g$d;)LSe/g$d;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/g;->g:LSe/g$d;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic x(LSe/g;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/g;->c:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic y(LSe/g;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/g;->b:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public B(I)LSe/i;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/g;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LSe/i;

    .line 8
    .line 9
    return-object p1
.end method

.method public C()I
    .locals 1

    .line 1
    iget-object v0, p0, LSe/g;->e:Ljava/util/List;

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

.method public D()LSe/g$c;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/g;->d:LSe/g$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public E()LSe/g$d;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/g;->g:LSe/g$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public F()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/g;->c:I

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

.method public G()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/g;->c:I

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

.method public H()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/g;->c:I

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

.method public L()LSe/g$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/g;->J()LSe/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public M()LSe/g$b;
    .locals 1

    .line 1
    invoke-static {p0}, LSe/g;->K(LSe/g;)LSe/g$b;

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
    invoke-virtual {p0}, LSe/g;->L()LSe/g$b;

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
    iget v0, p0, LSe/g;->i:I

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
    iget v0, p0, LSe/g;->c:I

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
    iget-object v0, p0, LSe/g;->d:LSe/g$c;

    .line 15
    .line 16
    invoke-virtual {v0}, LSe/g$c;->d()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v1, v0}, LZe/f;->h(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v0, v2

    .line 26
    :goto_0
    iget-object v1, p0, LSe/g;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v3, 0x2

    .line 33
    if-ge v2, v1, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, LSe/g;->e:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, LZe/p;

    .line 42
    .line 43
    invoke-static {v3, v1}, LZe/f;->r(ILZe/p;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget v1, p0, LSe/g;->c:I

    .line 52
    .line 53
    and-int/2addr v1, v3

    .line 54
    if-ne v1, v3, :cond_3

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    iget-object v2, p0, LSe/g;->f:LSe/i;

    .line 58
    .line 59
    invoke-static {v1, v2}, LZe/f;->r(ILZe/p;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    add-int/2addr v0, v1

    .line 64
    :cond_3
    iget v1, p0, LSe/g;->c:I

    .line 65
    .line 66
    const/4 v2, 0x4

    .line 67
    and-int/2addr v1, v2

    .line 68
    if-ne v1, v2, :cond_4

    .line 69
    .line 70
    iget-object v1, p0, LSe/g;->g:LSe/g$d;

    .line 71
    .line 72
    invoke-virtual {v1}, LSe/g$d;->d()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {v2, v1}, LZe/f;->h(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    add-int/2addr v0, v1

    .line 81
    :cond_4
    iget-object v1, p0, LSe/g;->b:LZe/d;

    .line 82
    .line 83
    invoke-virtual {v1}, LZe/d;->size()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v0, v1

    .line 88
    iput v0, p0, LSe/g;->i:I

    .line 89
    .line 90
    return v0
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-byte v0, p0, LSe/g;->h:B

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
    invoke-virtual {p0}, LSe/g;->C()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, LSe/g;->B(I)LSe/i;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, LSe/i;->e()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    iput-byte v2, p0, LSe/g;->h:B

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
    invoke-virtual {p0}, LSe/g;->F()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0}, LSe/g;->z()LSe/i;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, LSe/i;->e()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    iput-byte v2, p0, LSe/g;->h:B

    .line 51
    .line 52
    return v2

    .line 53
    :cond_4
    iput-byte v1, p0, LSe/g;->h:B

    .line 54
    .line 55
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/g;->M()LSe/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(LZe/f;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LSe/g;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, LSe/g;->c:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LSe/g;->d:LSe/g$c;

    .line 11
    .line 12
    invoke-virtual {v0}, LSe/g$c;->d()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1, v1, v0}, LZe/f;->R(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-object v1, p0, LSe/g;->e:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x2

    .line 27
    if-ge v0, v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, LSe/g;->e:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, LZe/p;

    .line 36
    .line 37
    invoke-virtual {p1, v2, v1}, LZe/f;->c0(ILZe/p;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget v0, p0, LSe/g;->c:I

    .line 44
    .line 45
    and-int/2addr v0, v2

    .line 46
    if-ne v0, v2, :cond_2

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    iget-object v1, p0, LSe/g;->f:LSe/i;

    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, LZe/f;->c0(ILZe/p;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    iget v0, p0, LSe/g;->c:I

    .line 55
    .line 56
    const/4 v1, 0x4

    .line 57
    and-int/2addr v0, v1

    .line 58
    if-ne v0, v1, :cond_3

    .line 59
    .line 60
    iget-object v0, p0, LSe/g;->g:LSe/g$d;

    .line 61
    .line 62
    invoke-virtual {v0}, LSe/g$d;->d()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p1, v1, v0}, LZe/f;->R(II)V

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v0, p0, LSe/g;->b:LZe/d;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public z()LSe/i;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/g;->f:LSe/i;

    .line 2
    .line 3
    return-object v0
.end method
