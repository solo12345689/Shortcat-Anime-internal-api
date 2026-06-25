.class public final LSe/p$c;
.super LZe/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe/p$c$b;,
        LSe/p$c$c;
    }
.end annotation


# static fields
.field private static final i:LSe/p$c;

.field public static j:LZe/r;


# instance fields
.field private final b:LZe/d;

.field private c:I

.field private d:I

.field private e:I

.field private f:LSe/p$c$c;

.field private g:B

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSe/p$c$a;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/p$c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/p$c;->j:LZe/r;

    .line 7
    .line 8
    new-instance v0, LSe/p$c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LSe/p$c;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LSe/p$c;->i:LSe/p$c;

    .line 15
    .line 16
    invoke-direct {v0}, LSe/p$c;->E()V

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
    iput-byte v0, p0, LSe/p$c;->g:B

    .line 13
    iput v0, p0, LSe/p$c;->h:I

    .line 14
    invoke-direct {p0}, LSe/p$c;->E()V

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

    const/16 v5, 0x10

    if-eq v4, v5, :cond_4

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

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    .line 19
    :cond_2
    invoke-virtual {p1}, LZe/e;->m()I

    move-result v5

    .line 20
    invoke-static {v5}, LSe/p$c$c;->a(I)LSe/p$c$c;

    move-result-object v6

    if-nez v6, :cond_3

    .line 21
    invoke-virtual {v2, v4}, LZe/f;->n0(I)V

    .line 22
    invoke-virtual {v2, v5}, LZe/f;->n0(I)V

    goto :goto_0

    .line 23
    :cond_3
    iget v4, p0, LSe/p$c;->c:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, LSe/p$c;->c:I

    .line 24
    iput-object v6, p0, LSe/p$c;->f:LSe/p$c$c;

    goto :goto_0

    .line 25
    :cond_4
    iget v4, p0, LSe/p$c;->c:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, LSe/p$c;->c:I

    .line 26
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v4

    iput v4, p0, LSe/p$c;->e:I

    goto :goto_0

    .line 27
    :cond_5
    iget v4, p0, LSe/p$c;->c:I

    or-int/2addr v4, v1

    iput v4, p0, LSe/p$c;->c:I

    .line 28
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v4

    iput v4, p0, LSe/p$c;->d:I
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 29
    :goto_1
    :try_start_1
    new-instance p2, LZe/k;

    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LZe/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1

    .line 31
    :goto_2
    invoke-virtual {p1, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :goto_3
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 33
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/p$c;->b:LZe/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/p$c;->b:LZe/d;

    .line 34
    throw p1

    .line 35
    :goto_4
    invoke-virtual {p0}, LZe/i;->l()V

    .line 36
    throw p1

    .line 37
    :cond_6
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 38
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/p$c;->b:LZe/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/p$c;->b:LZe/d;

    .line 39
    throw p1

    .line 40
    :goto_5
    invoke-virtual {p0}, LZe/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LSe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LSe/p$c;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i;-><init>(LZe/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LSe/p$c;->g:B

    .line 5
    iput v0, p0, LSe/p$c;->h:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/p$c;->b:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$b;LSe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LSe/p$c;-><init>(LZe/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LSe/p$c;->g:B

    .line 9
    iput p1, p0, LSe/p$c;->h:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LSe/p$c;->b:LZe/d;

    return-void
.end method

.method private E()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, LSe/p$c;->d:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LSe/p$c;->e:I

    .line 6
    .line 7
    sget-object v0, LSe/p$c$c;->c:LSe/p$c$c;

    .line 8
    .line 9
    iput-object v0, p0, LSe/p$c;->f:LSe/p$c$c;

    .line 10
    .line 11
    return-void
.end method

.method public static F()LSe/p$c$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/p$c$b;->m()LSe/p$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static G(LSe/p$c;)LSe/p$c$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/p$c;->F()LSe/p$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LSe/p$c$b;->t(LSe/p$c;)LSe/p$c$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic s(LSe/p$c;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/p$c;->e:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic t(LSe/p$c;LSe/p$c$c;)LSe/p$c$c;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/p$c;->f:LSe/p$c$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic u(LSe/p$c;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/p$c;->c:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic v(LSe/p$c;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/p$c;->b:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic w(LSe/p$c;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/p$c;->d:I

    .line 2
    .line 3
    return p1
.end method

.method public static x()LSe/p$c;
    .locals 1

    .line 1
    sget-object v0, LSe/p$c;->i:LSe/p$c;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()I
    .locals 1

    .line 1
    iget v0, p0, LSe/p$c;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public B()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/p$c;->c:I

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

.method public C()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/p$c;->c:I

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

.method public D()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/p$c;->c:I

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

.method public H()LSe/p$c$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/p$c;->F()LSe/p$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public I()LSe/p$c$b;
    .locals 1

    .line 1
    invoke-static {p0}, LSe/p$c;->G(LSe/p$c;)LSe/p$c$b;

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
    invoke-virtual {p0}, LSe/p$c;->H()LSe/p$c$b;

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
    iget v0, p0, LSe/p$c;->h:I

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
    iget v0, p0, LSe/p$c;->c:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, LSe/p$c;->d:I

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
    iget v1, p0, LSe/p$c;->c:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, LSe/p$c;->e:I

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
    iget v1, p0, LSe/p$c;->c:I

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    and-int/2addr v1, v2

    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    iget-object v1, p0, LSe/p$c;->f:LSe/p$c$c;

    .line 41
    .line 42
    invoke-virtual {v1}, LSe/p$c$c;->d()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-static {v2, v1}, LZe/f;->h(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    :cond_3
    iget-object v1, p0, LSe/p$c;->b:LZe/d;

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
    iput v0, p0, LSe/p$c;->h:I

    .line 60
    .line 61
    return v0
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget-byte v0, p0, LSe/p$c;->g:B

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
    invoke-virtual {p0}, LSe/p$c;->D()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, LSe/p$c;->g:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iput-byte v1, p0, LSe/p$c;->g:B

    .line 21
    .line 22
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/p$c;->I()LSe/p$c$b;

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
    invoke-virtual {p0}, LSe/p$c;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, LSe/p$c;->c:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, LSe/p$c;->d:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, LZe/f;->Z(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, LSe/p$c;->c:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, LSe/p$c;->e:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, LZe/f;->Z(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, LSe/p$c;->c:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, LSe/p$c;->f:LSe/p$c$c;

    .line 33
    .line 34
    invoke-virtual {v0}, LSe/p$c$c;->d()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x3

    .line 39
    invoke-virtual {p1, v1, v0}, LZe/f;->R(II)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, LSe/p$c;->b:LZe/d;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public y()LSe/p$c$c;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/p$c;->f:LSe/p$c$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public z()I
    .locals 1

    .line 1
    iget v0, p0, LSe/p$c;->d:I

    .line 2
    .line 3
    return v0
.end method
