.class public final LVe/a$d;
.super LZe/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVe/a$d$b;
    }
.end annotation


# static fields
.field private static final k:LVe/a$d;

.field public static l:LZe/r;


# instance fields
.field private final b:LZe/d;

.field private c:I

.field private d:LVe/a$b;

.field private e:LVe/a$c;

.field private f:LVe/a$c;

.field private g:LVe/a$c;

.field private h:LVe/a$c;

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LVe/a$d$a;

    .line 2
    .line 3
    invoke-direct {v0}, LVe/a$d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LVe/a$d;->l:LZe/r;

    .line 7
    .line 8
    new-instance v0, LVe/a$d;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LVe/a$d;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LVe/a$d;->k:LVe/a$d;

    .line 15
    .line 16
    invoke-direct {v0}, LVe/a$d;->K()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(LZe/e;LZe/g;)V
    .locals 7

    .line 11
    invoke-direct {p0}, LZe/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LVe/a$d;->i:B

    .line 13
    iput v0, p0, LVe/a$d;->j:I

    .line 14
    invoke-direct {p0}, LVe/a$d;->K()V

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
    if-nez v3, :cond_11

    .line 17
    :try_start_0
    invoke-virtual {p1}, LZe/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eq v4, v5, :cond_e

    const/16 v5, 0x12

    if-eq v4, v5, :cond_b

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_8

    const/16 v5, 0x22

    if-eq v4, v5, :cond_5

    const/16 v5, 0x2a

    if-eq v4, v5, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, LZe/i;->p(LZe/e;LZe/f;LZe/g;I)Z

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
    iget v4, p0, LVe/a$d;->c:I

    const/16 v5, 0x10

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    .line 20
    iget-object v4, p0, LVe/a$d;->h:LVe/a$c;

    invoke-virtual {v4}, LVe/a$c;->F()LVe/a$c$b;

    move-result-object v6

    .line 21
    :cond_3
    sget-object v4, LVe/a$c;->i:LZe/r;

    invoke-virtual {p1, v4, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v4

    check-cast v4, LVe/a$c;

    iput-object v4, p0, LVe/a$d;->h:LVe/a$c;

    if-eqz v6, :cond_4

    .line 22
    invoke-virtual {v6, v4}, LVe/a$c$b;->t(LVe/a$c;)LVe/a$c$b;

    .line 23
    invoke-virtual {v6}, LVe/a$c$b;->p()LVe/a$c;

    move-result-object v4

    iput-object v4, p0, LVe/a$d;->h:LVe/a$c;

    .line 24
    :cond_4
    iget v4, p0, LVe/a$d;->c:I

    or-int/2addr v4, v5

    iput v4, p0, LVe/a$d;->c:I

    goto :goto_0

    .line 25
    :cond_5
    iget v4, p0, LVe/a$d;->c:I

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_6

    .line 26
    iget-object v4, p0, LVe/a$d;->g:LVe/a$c;

    invoke-virtual {v4}, LVe/a$c;->F()LVe/a$c$b;

    move-result-object v6

    .line 27
    :cond_6
    sget-object v4, LVe/a$c;->i:LZe/r;

    invoke-virtual {p1, v4, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v4

    check-cast v4, LVe/a$c;

    iput-object v4, p0, LVe/a$d;->g:LVe/a$c;

    if-eqz v6, :cond_7

    .line 28
    invoke-virtual {v6, v4}, LVe/a$c$b;->t(LVe/a$c;)LVe/a$c$b;

    .line 29
    invoke-virtual {v6}, LVe/a$c$b;->p()LVe/a$c;

    move-result-object v4

    iput-object v4, p0, LVe/a$d;->g:LVe/a$c;

    .line 30
    :cond_7
    iget v4, p0, LVe/a$d;->c:I

    or-int/2addr v4, v5

    iput v4, p0, LVe/a$d;->c:I

    goto :goto_0

    .line 31
    :cond_8
    iget v4, p0, LVe/a$d;->c:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_9

    .line 32
    iget-object v4, p0, LVe/a$d;->f:LVe/a$c;

    invoke-virtual {v4}, LVe/a$c;->F()LVe/a$c$b;

    move-result-object v6

    .line 33
    :cond_9
    sget-object v4, LVe/a$c;->i:LZe/r;

    invoke-virtual {p1, v4, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v4

    check-cast v4, LVe/a$c;

    iput-object v4, p0, LVe/a$d;->f:LVe/a$c;

    if-eqz v6, :cond_a

    .line 34
    invoke-virtual {v6, v4}, LVe/a$c$b;->t(LVe/a$c;)LVe/a$c$b;

    .line 35
    invoke-virtual {v6}, LVe/a$c$b;->p()LVe/a$c;

    move-result-object v4

    iput-object v4, p0, LVe/a$d;->f:LVe/a$c;

    .line 36
    :cond_a
    iget v4, p0, LVe/a$d;->c:I

    or-int/2addr v4, v5

    iput v4, p0, LVe/a$d;->c:I

    goto/16 :goto_0

    .line 37
    :cond_b
    iget v4, p0, LVe/a$d;->c:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_c

    .line 38
    iget-object v4, p0, LVe/a$d;->e:LVe/a$c;

    invoke-virtual {v4}, LVe/a$c;->F()LVe/a$c$b;

    move-result-object v6

    .line 39
    :cond_c
    sget-object v4, LVe/a$c;->i:LZe/r;

    invoke-virtual {p1, v4, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v4

    check-cast v4, LVe/a$c;

    iput-object v4, p0, LVe/a$d;->e:LVe/a$c;

    if-eqz v6, :cond_d

    .line 40
    invoke-virtual {v6, v4}, LVe/a$c$b;->t(LVe/a$c;)LVe/a$c$b;

    .line 41
    invoke-virtual {v6}, LVe/a$c$b;->p()LVe/a$c;

    move-result-object v4

    iput-object v4, p0, LVe/a$d;->e:LVe/a$c;

    .line 42
    :cond_d
    iget v4, p0, LVe/a$d;->c:I

    or-int/2addr v4, v5

    iput v4, p0, LVe/a$d;->c:I

    goto/16 :goto_0

    .line 43
    :cond_e
    iget v4, p0, LVe/a$d;->c:I

    and-int/2addr v4, v1

    if-ne v4, v1, :cond_f

    .line 44
    iget-object v4, p0, LVe/a$d;->d:LVe/a$b;

    invoke-virtual {v4}, LVe/a$b;->F()LVe/a$b$b;

    move-result-object v6

    .line 45
    :cond_f
    sget-object v4, LVe/a$b;->i:LZe/r;

    invoke-virtual {p1, v4, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v4

    check-cast v4, LVe/a$b;

    iput-object v4, p0, LVe/a$d;->d:LVe/a$b;

    if-eqz v6, :cond_10

    .line 46
    invoke-virtual {v6, v4}, LVe/a$b$b;->t(LVe/a$b;)LVe/a$b$b;

    .line 47
    invoke-virtual {v6}, LVe/a$b$b;->p()LVe/a$b;

    move-result-object v4

    iput-object v4, p0, LVe/a$d;->d:LVe/a$b;

    .line 48
    :cond_10
    iget v4, p0, LVe/a$d;->c:I

    or-int/2addr v4, v1

    iput v4, p0, LVe/a$d;->c:I
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 49
    :goto_1
    :try_start_1
    new-instance p2, LZe/k;

    .line 50
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LZe/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1

    .line 51
    :goto_2
    invoke-virtual {p1, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    :goto_3
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LVe/a$d;->b:LZe/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LVe/a$d;->b:LZe/d;

    .line 54
    throw p1

    .line 55
    :goto_4
    invoke-virtual {p0}, LZe/i;->l()V

    .line 56
    throw p1

    .line 57
    :cond_11
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 58
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LVe/a$d;->b:LZe/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LVe/a$d;->b:LZe/d;

    .line 59
    throw p1

    .line 60
    :goto_5
    invoke-virtual {p0}, LZe/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LVe/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LVe/a$d;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i;-><init>(LZe/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LVe/a$d;->i:B

    .line 5
    iput v0, p0, LVe/a$d;->j:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LVe/a$d;->b:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$b;LVe/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LVe/a$d;-><init>(LZe/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LVe/a$d;->i:B

    .line 9
    iput p1, p0, LVe/a$d;->j:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LVe/a$d;->b:LZe/d;

    return-void
.end method

.method private K()V
    .locals 1

    .line 1
    invoke-static {}, LVe/a$b;->w()LVe/a$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LVe/a$d;->d:LVe/a$b;

    .line 6
    .line 7
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LVe/a$d;->e:LVe/a$c;

    .line 12
    .line 13
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, LVe/a$d;->f:LVe/a$c;

    .line 18
    .line 19
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, LVe/a$d;->g:LVe/a$c;

    .line 24
    .line 25
    invoke-static {}, LVe/a$c;->w()LVe/a$c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, LVe/a$d;->h:LVe/a$c;

    .line 30
    .line 31
    return-void
.end method

.method public static L()LVe/a$d$b;
    .locals 1

    .line 1
    invoke-static {}, LVe/a$d$b;->m()LVe/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static M(LVe/a$d;)LVe/a$d$b;
    .locals 1

    .line 1
    invoke-static {}, LVe/a$d;->L()LVe/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LVe/a$d$b;->v(LVe/a$d;)LVe/a$d$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic s(LVe/a$d;LVe/a$b;)LVe/a$b;
    .locals 0

    .line 1
    iput-object p1, p0, LVe/a$d;->d:LVe/a$b;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic t(LVe/a$d;LVe/a$c;)LVe/a$c;
    .locals 0

    .line 1
    iput-object p1, p0, LVe/a$d;->e:LVe/a$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic u(LVe/a$d;LVe/a$c;)LVe/a$c;
    .locals 0

    .line 1
    iput-object p1, p0, LVe/a$d;->f:LVe/a$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic v(LVe/a$d;LVe/a$c;)LVe/a$c;
    .locals 0

    .line 1
    iput-object p1, p0, LVe/a$d;->g:LVe/a$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic w(LVe/a$d;LVe/a$c;)LVe/a$c;
    .locals 0

    .line 1
    iput-object p1, p0, LVe/a$d;->h:LVe/a$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic x(LVe/a$d;I)I
    .locals 0

    .line 1
    iput p1, p0, LVe/a$d;->c:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic y(LVe/a$d;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LVe/a$d;->b:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static z()LVe/a$d;
    .locals 1

    .line 1
    sget-object v0, LVe/a$d;->k:LVe/a$d;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()LVe/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, LVe/a$d;->h:LVe/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public B()LVe/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, LVe/a$d;->d:LVe/a$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public C()LVe/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, LVe/a$d;->f:LVe/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public D()LVe/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, LVe/a$d;->g:LVe/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public E()LVe/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, LVe/a$d;->e:LVe/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public F()Z
    .locals 2

    .line 1
    iget v0, p0, LVe/a$d;->c:I

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

.method public G()Z
    .locals 2

    .line 1
    iget v0, p0, LVe/a$d;->c:I

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
    iget v0, p0, LVe/a$d;->c:I

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

.method public I()Z
    .locals 2

    .line 1
    iget v0, p0, LVe/a$d;->c:I

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

.method public J()Z
    .locals 2

    .line 1
    iget v0, p0, LVe/a$d;->c:I

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

.method public N()LVe/a$d$b;
    .locals 1

    .line 1
    invoke-static {}, LVe/a$d;->L()LVe/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public O()LVe/a$d$b;
    .locals 1

    .line 1
    invoke-static {p0}, LVe/a$d;->M(LVe/a$d;)LVe/a$d$b;

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
    invoke-virtual {p0}, LVe/a$d;->N()LVe/a$d$b;

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
    iget v0, p0, LVe/a$d;->j:I

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
    iget v0, p0, LVe/a$d;->c:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LVe/a$d;->d:LVe/a$b;

    .line 14
    .line 15
    invoke-static {v1, v0}, LZe/f;->r(ILZe/p;)I

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
    iget v1, p0, LVe/a$d;->c:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, LVe/a$d;->e:LVe/a$c;

    .line 28
    .line 29
    invoke-static {v2, v1}, LZe/f;->r(ILZe/p;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, LVe/a$d;->c:I

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
    iget-object v3, p0, LVe/a$d;->f:LVe/a$c;

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
    iget v1, p0, LVe/a$d;->c:I

    .line 49
    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    and-int/2addr v1, v3

    .line 53
    if-ne v1, v3, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, LVe/a$d;->g:LVe/a$c;

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
    iget v1, p0, LVe/a$d;->c:I

    .line 63
    .line 64
    const/16 v2, 0x10

    .line 65
    .line 66
    and-int/2addr v1, v2

    .line 67
    if-ne v1, v2, :cond_5

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    iget-object v2, p0, LVe/a$d;->h:LVe/a$c;

    .line 71
    .line 72
    invoke-static {v1, v2}, LZe/f;->r(ILZe/p;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v0, v1

    .line 77
    :cond_5
    iget-object v1, p0, LVe/a$d;->b:LZe/d;

    .line 78
    .line 79
    invoke-virtual {v1}, LZe/d;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    add-int/2addr v0, v1

    .line 84
    iput v0, p0, LVe/a$d;->j:I

    .line 85
    .line 86
    return v0
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-byte v0, p0, LVe/a$d;->i:B

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
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    iput-byte v1, p0, LVe/a$d;->i:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LVe/a$d;->O()LVe/a$d$b;

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
    invoke-virtual {p0}, LVe/a$d;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, LVe/a$d;->c:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LVe/a$d;->d:LVe/a$b;

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, LZe/f;->c0(ILZe/p;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, LVe/a$d;->c:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, LVe/a$d;->e:LVe/a$c;

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, LZe/f;->c0(ILZe/p;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, LVe/a$d;->c:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    iget-object v2, p0, LVe/a$d;->f:LVe/a$c;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v2}, LZe/f;->c0(ILZe/p;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget v0, p0, LVe/a$d;->c:I

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    and-int/2addr v0, v2

    .line 43
    if-ne v0, v2, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, LVe/a$d;->g:LVe/a$c;

    .line 46
    .line 47
    invoke-virtual {p1, v1, v0}, LZe/f;->c0(ILZe/p;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    iget v0, p0, LVe/a$d;->c:I

    .line 51
    .line 52
    const/16 v1, 0x10

    .line 53
    .line 54
    and-int/2addr v0, v1

    .line 55
    if-ne v0, v1, :cond_4

    .line 56
    .line 57
    const/4 v0, 0x5

    .line 58
    iget-object v1, p0, LVe/a$d;->h:LVe/a$c;

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, LZe/f;->c0(ILZe/p;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget-object v0, p0, LVe/a$d;->b:LZe/d;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
