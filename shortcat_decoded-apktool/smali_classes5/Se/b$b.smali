.class public final LSe/b$b;
.super LZe/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe/b$b$b;,
        LSe/b$b$c;
    }
.end annotation


# static fields
.field private static final h:LSe/b$b;

.field public static i:LZe/r;


# instance fields
.field private final b:LZe/d;

.field private c:I

.field private d:I

.field private e:LSe/b$b$c;

.field private f:B

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSe/b$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/b$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/b$b;->i:LZe/r;

    .line 7
    .line 8
    new-instance v0, LSe/b$b;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LSe/b$b;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LSe/b$b;->h:LSe/b$b;

    .line 15
    .line 16
    invoke-direct {v0}, LSe/b$b;->B()V

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
    iput-byte v0, p0, LSe/b$b;->f:B

    .line 13
    iput v0, p0, LSe/b$b;->g:I

    .line 14
    invoke-direct {p0}, LSe/b$b;->B()V

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
    if-nez v3, :cond_6

    .line 17
    :try_start_0
    invoke-virtual {p1}, LZe/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_5

    const/16 v5, 0x12

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
    iget v4, p0, LSe/b$b;->c:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    .line 20
    iget-object v4, p0, LSe/b$b;->e:LSe/b$b$c;

    invoke-virtual {v4}, LSe/b$b$c;->i0()LSe/b$b$c$b;

    move-result-object v4

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 21
    :goto_1
    sget-object v6, LSe/b$b$c;->r:LZe/r;

    invoke-virtual {p1, v6, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v6

    check-cast v6, LSe/b$b$c;

    iput-object v6, p0, LSe/b$b;->e:LSe/b$b$c;

    if-eqz v4, :cond_4

    .line 22
    invoke-virtual {v4, v6}, LSe/b$b$c$b;->v(LSe/b$b$c;)LSe/b$b$c$b;

    .line 23
    invoke-virtual {v4}, LSe/b$b$c$b;->p()LSe/b$b$c;

    move-result-object v4

    iput-object v4, p0, LSe/b$b;->e:LSe/b$b$c;

    .line 24
    :cond_4
    iget v4, p0, LSe/b$b;->c:I

    or-int/2addr v4, v5

    iput v4, p0, LSe/b$b;->c:I

    goto :goto_0

    .line 25
    :cond_5
    iget v4, p0, LSe/b$b;->c:I

    or-int/2addr v4, v1

    iput v4, p0, LSe/b$b;->c:I

    .line 26
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v4

    iput v4, p0, LSe/b$b;->d:I
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 27
    :goto_2
    :try_start_1
    new-instance p2, LZe/k;

    .line 28
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LZe/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1

    .line 29
    :goto_3
    invoke-virtual {p1, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :goto_4
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 31
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/b$b;->b:LZe/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/b$b;->b:LZe/d;

    .line 32
    throw p1

    .line 33
    :goto_5
    invoke-virtual {p0}, LZe/i;->l()V

    .line 34
    throw p1

    .line 35
    :cond_6
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 36
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/b$b;->b:LZe/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/b$b;->b:LZe/d;

    .line 37
    throw p1

    .line 38
    :goto_6
    invoke-virtual {p0}, LZe/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LSe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LSe/b$b;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i;-><init>(LZe/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LSe/b$b;->f:B

    .line 5
    iput v0, p0, LSe/b$b;->g:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/b$b;->b:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$b;LSe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LSe/b$b;-><init>(LZe/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LSe/b$b;->f:B

    .line 9
    iput p1, p0, LSe/b$b;->g:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LSe/b$b;->b:LZe/d;

    return-void
.end method

.method private B()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LSe/b$b;->d:I

    .line 3
    .line 4
    invoke-static {}, LSe/b$b$c;->M()LSe/b$b$c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LSe/b$b;->e:LSe/b$b$c;

    .line 9
    .line 10
    return-void
.end method

.method public static C()LSe/b$b$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/b$b$b;->m()LSe/b$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static D(LSe/b$b;)LSe/b$b$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/b$b;->C()LSe/b$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LSe/b$b$b;->t(LSe/b$b;)LSe/b$b$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic s(LSe/b$b;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/b$b;->d:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic t(LSe/b$b;LSe/b$b$c;)LSe/b$b$c;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/b$b;->e:LSe/b$b$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic u(LSe/b$b;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/b$b;->c:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic v(LSe/b$b;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/b$b;->b:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static w()LSe/b$b;
    .locals 1

    .line 1
    sget-object v0, LSe/b$b;->h:LSe/b$b;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/b$b;->c:I

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

.method public E()LSe/b$b$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/b$b;->C()LSe/b$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public F()LSe/b$b$b;
    .locals 1

    .line 1
    invoke-static {p0}, LSe/b$b;->D(LSe/b$b;)LSe/b$b$b;

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
    invoke-virtual {p0}, LSe/b$b;->E()LSe/b$b$b;

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
    iget v0, p0, LSe/b$b;->g:I

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
    iget v0, p0, LSe/b$b;->c:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, LSe/b$b;->d:I

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
    iget v1, p0, LSe/b$b;->c:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, LSe/b$b;->e:LSe/b$b$c;

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
    iget-object v1, p0, LSe/b$b;->b:LZe/d;

    .line 35
    .line 36
    invoke-virtual {v1}, LZe/d;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v0, v1

    .line 41
    iput v0, p0, LSe/b$b;->g:I

    .line 42
    .line 43
    return v0
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget-byte v0, p0, LSe/b$b;->f:B

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
    invoke-virtual {p0}, LSe/b$b;->z()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, LSe/b$b;->f:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    invoke-virtual {p0}, LSe/b$b;->A()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    iput-byte v2, p0, LSe/b$b;->f:B

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    invoke-virtual {p0}, LSe/b$b;->y()LSe/b$b$c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, LSe/b$b$c;->e()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    iput-byte v2, p0, LSe/b$b;->f:B

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iput-byte v1, p0, LSe/b$b;->f:B

    .line 43
    .line 44
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/b$b;->F()LSe/b$b$b;

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
    invoke-virtual {p0}, LSe/b$b;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, LSe/b$b;->c:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, LSe/b$b;->d:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, LZe/f;->Z(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, LSe/b$b;->c:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, LSe/b$b;->e:LSe/b$b$c;

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, LZe/f;->c0(ILZe/p;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, LSe/b$b;->b:LZe/d;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public x()I
    .locals 1

    .line 1
    iget v0, p0, LSe/b$b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public y()LSe/b$b$c;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/b$b;->e:LSe/b$b$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public z()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/b$b;->c:I

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
