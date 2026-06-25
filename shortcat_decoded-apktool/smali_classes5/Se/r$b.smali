.class public final LSe/r$b;
.super LZe/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe/r$b$b;,
        LSe/r$b$c;
    }
.end annotation


# static fields
.field private static final i:LSe/r$b;

.field public static j:LZe/r;


# instance fields
.field private final b:LZe/d;

.field private c:I

.field private d:LSe/r$b$c;

.field private e:LSe/r;

.field private f:I

.field private g:B

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSe/r$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/r$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/r$b;->j:LZe/r;

    .line 7
    .line 8
    new-instance v0, LSe/r$b;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LSe/r$b;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LSe/r$b;->i:LSe/r$b;

    .line 15
    .line 16
    invoke-direct {v0}, LSe/r$b;->E()V

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
    iput-byte v0, p0, LSe/r$b;->g:B

    .line 13
    iput v0, p0, LSe/r$b;->h:I

    .line 14
    invoke-direct {p0}, LSe/r$b;->E()V

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
    if-nez v3, :cond_8

    .line 17
    :try_start_0
    invoke-virtual {p1}, LZe/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_6

    const/16 v5, 0x12

    if-eq v4, v5, :cond_3

    const/16 v5, 0x18

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

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    .line 19
    :cond_2
    iget v4, p0, LSe/r$b;->c:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, LSe/r$b;->c:I

    .line 20
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v4

    iput v4, p0, LSe/r$b;->f:I

    goto :goto_0

    .line 21
    :cond_3
    iget v4, p0, LSe/r$b;->c:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    .line 22
    iget-object v4, p0, LSe/r$b;->e:LSe/r;

    invoke-virtual {v4}, LSe/r;->B0()LSe/r$c;

    move-result-object v4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    .line 23
    :goto_1
    sget-object v6, LSe/r;->v:LZe/r;

    invoke-virtual {p1, v6, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v6

    check-cast v6, LSe/r;

    iput-object v6, p0, LSe/r$b;->e:LSe/r;

    if-eqz v4, :cond_5

    .line 24
    invoke-virtual {v4, v6}, LSe/r$c;->C(LSe/r;)LSe/r$c;

    .line 25
    invoke-virtual {v4}, LSe/r$c;->t()LSe/r;

    move-result-object v4

    iput-object v4, p0, LSe/r$b;->e:LSe/r;

    .line 26
    :cond_5
    iget v4, p0, LSe/r$b;->c:I

    or-int/2addr v4, v5

    iput v4, p0, LSe/r$b;->c:I

    goto :goto_0

    .line 27
    :cond_6
    invoke-virtual {p1}, LZe/e;->m()I

    move-result v5

    .line 28
    invoke-static {v5}, LSe/r$b$c;->a(I)LSe/r$b$c;

    move-result-object v6

    if-nez v6, :cond_7

    .line 29
    invoke-virtual {v2, v4}, LZe/f;->n0(I)V

    .line 30
    invoke-virtual {v2, v5}, LZe/f;->n0(I)V

    goto :goto_0

    .line 31
    :cond_7
    iget v4, p0, LSe/r$b;->c:I

    or-int/2addr v4, v1

    iput v4, p0, LSe/r$b;->c:I

    .line 32
    iput-object v6, p0, LSe/r$b;->d:LSe/r$b$c;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 33
    :goto_2
    :try_start_1
    new-instance p2, LZe/k;

    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LZe/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1

    .line 35
    :goto_3
    invoke-virtual {p1, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_4
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/r$b;->b:LZe/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/r$b;->b:LZe/d;

    .line 38
    throw p1

    .line 39
    :goto_5
    invoke-virtual {p0}, LZe/i;->l()V

    .line 40
    throw p1

    .line 41
    :cond_8
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 42
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/r$b;->b:LZe/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/r$b;->b:LZe/d;

    .line 43
    throw p1

    .line 44
    :goto_6
    invoke-virtual {p0}, LZe/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LSe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LSe/r$b;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i;-><init>(LZe/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LSe/r$b;->g:B

    .line 5
    iput v0, p0, LSe/r$b;->h:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/r$b;->b:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$b;LSe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LSe/r$b;-><init>(LZe/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LSe/r$b;->g:B

    .line 9
    iput p1, p0, LSe/r$b;->h:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LSe/r$b;->b:LZe/d;

    return-void
.end method

.method private E()V
    .locals 1

    .line 1
    sget-object v0, LSe/r$b$c;->d:LSe/r$b$c;

    .line 2
    .line 3
    iput-object v0, p0, LSe/r$b;->d:LSe/r$b$c;

    .line 4
    .line 5
    invoke-static {}, LSe/r;->Y()LSe/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LSe/r$b;->e:LSe/r;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, LSe/r$b;->f:I

    .line 13
    .line 14
    return-void
.end method

.method public static F()LSe/r$b$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/r$b$b;->m()LSe/r$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static G(LSe/r$b;)LSe/r$b$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/r$b;->F()LSe/r$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LSe/r$b$b;->t(LSe/r$b;)LSe/r$b$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic s(LSe/r$b;LSe/r$b$c;)LSe/r$b$c;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/r$b;->d:LSe/r$b$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic t(LSe/r$b;LSe/r;)LSe/r;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/r$b;->e:LSe/r;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic u(LSe/r$b;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/r$b;->f:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic v(LSe/r$b;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/r$b;->c:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic w(LSe/r$b;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/r$b;->b:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static x()LSe/r$b;
    .locals 1

    .line 1
    sget-object v0, LSe/r$b;->i:LSe/r$b;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()I
    .locals 1

    .line 1
    iget v0, p0, LSe/r$b;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public B()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/r$b;->c:I

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

.method public C()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/r$b;->c:I

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

.method public D()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/r$b;->c:I

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

.method public H()LSe/r$b$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/r$b;->F()LSe/r$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public I()LSe/r$b$b;
    .locals 1

    .line 1
    invoke-static {p0}, LSe/r$b;->G(LSe/r$b;)LSe/r$b$b;

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
    invoke-virtual {p0}, LSe/r$b;->H()LSe/r$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()I
    .locals 3

    .line 1
    iget v0, p0, LSe/r$b;->h:I

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
    iget v0, p0, LSe/r$b;->c:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LSe/r$b;->d:LSe/r$b$c;

    .line 14
    .line 15
    invoke-virtual {v0}, LSe/r$b$c;->d()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v1, v0}, LZe/f;->h(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    iget v1, p0, LSe/r$b;->c:I

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    and-int/2addr v1, v2

    .line 29
    if-ne v1, v2, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, LSe/r$b;->e:LSe/r;

    .line 32
    .line 33
    invoke-static {v2, v1}, LZe/f;->r(ILZe/p;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    :cond_2
    iget v1, p0, LSe/r$b;->c:I

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    and-int/2addr v1, v2

    .line 42
    if-ne v1, v2, :cond_3

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    iget v2, p0, LSe/r$b;->f:I

    .line 46
    .line 47
    invoke-static {v1, v2}, LZe/f;->o(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    :cond_3
    iget-object v1, p0, LSe/r$b;->b:LZe/d;

    .line 53
    .line 54
    invoke-virtual {v1}, LZe/d;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/2addr v0, v1

    .line 59
    iput v0, p0, LSe/r$b;->h:I

    .line 60
    .line 61
    return v0
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget-byte v0, p0, LSe/r$b;->g:B

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
    invoke-virtual {p0}, LSe/r$b;->C()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, LSe/r$b;->z()LSe/r;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, LSe/r;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iput-byte v2, p0, LSe/r$b;->g:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    iput-byte v1, p0, LSe/r$b;->g:B

    .line 31
    .line 32
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/r$b;->I()LSe/r$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(LZe/f;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LSe/r$b;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, LSe/r$b;->c:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LSe/r$b;->d:LSe/r$b$c;

    .line 11
    .line 12
    invoke-virtual {v0}, LSe/r$b$c;->d()I

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
    iget v0, p0, LSe/r$b;->c:I

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    and-int/2addr v0, v1

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, LSe/r$b;->e:LSe/r;

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, LZe/f;->c0(ILZe/p;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v0, p0, LSe/r$b;->c:I

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    and-int/2addr v0, v1

    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    iget v1, p0, LSe/r$b;->f:I

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, LZe/f;->Z(II)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, LSe/r$b;->b:LZe/d;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public y()LSe/r$b$c;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/r$b;->d:LSe/r$b$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public z()LSe/r;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/r$b;->e:LSe/r;

    .line 2
    .line 3
    return-object v0
.end method
