.class public final LSe/h;
.super LZe/i$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe/h$b;
    }
.end annotation


# static fields
.field private static final h:LSe/h;

.field public static i:LZe/r;


# instance fields
.field private final c:LZe/d;

.field private d:I

.field private e:I

.field private f:B

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSe/h$a;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/h$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/h;->i:LZe/r;

    .line 7
    .line 8
    new-instance v0, LSe/h;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LSe/h;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LSe/h;->h:LSe/h;

    .line 15
    .line 16
    invoke-direct {v0}, LSe/h;->I()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(LZe/e;LZe/g;)V
    .locals 6

    .line 11
    invoke-direct {p0}, LZe/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LSe/h;->f:B

    .line 13
    iput v0, p0, LSe/h;->g:I

    .line 14
    invoke-direct {p0}, LSe/h;->I()V

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
    if-nez v3, :cond_3

    .line 17
    :try_start_0
    invoke-virtual {p1}, LZe/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

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

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    .line 19
    :cond_2
    iget v4, p0, LSe/h;->d:I

    or-int/2addr v4, v1

    iput v4, p0, LSe/h;->d:I

    .line 20
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v4

    iput v4, p0, LSe/h;->e:I
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 21
    :goto_1
    :try_start_1
    new-instance p2, LZe/k;

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LZe/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1

    .line 23
    :goto_2
    invoke-virtual {p1, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :goto_3
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/h;->c:LZe/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/h;->c:LZe/d;

    .line 26
    throw p1

    .line 27
    :goto_4
    invoke-virtual {p0}, LZe/i$d;->l()V

    .line 28
    throw p1

    .line 29
    :cond_3
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 30
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/h;->c:LZe/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/h;->c:LZe/d;

    .line 31
    throw p1

    .line 32
    :goto_5
    invoke-virtual {p0}, LZe/i$d;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LSe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LSe/h;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i$d;-><init>(LZe/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LSe/h;->f:B

    .line 5
    iput v0, p0, LSe/h;->g:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/h;->c:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$c;LSe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LSe/h;-><init>(LZe/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LSe/h;->f:B

    .line 9
    iput p1, p0, LSe/h;->g:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LSe/h;->c:LZe/d;

    return-void
.end method

.method static synthetic B(LSe/h;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/h;->e:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic C(LSe/h;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/h;->d:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic D(LSe/h;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/h;->c:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static E()LSe/h;
    .locals 1

    .line 1
    sget-object v0, LSe/h;->h:LSe/h;

    .line 2
    .line 3
    return-object v0
.end method

.method private I()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LSe/h;->e:I

    .line 3
    .line 4
    return-void
.end method

.method public static J()LSe/h$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/h$b;->r()LSe/h$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static K(LSe/h;)LSe/h$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/h;->J()LSe/h$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LSe/h$b;->y(LSe/h;)LSe/h$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public F()LSe/h;
    .locals 1

    .line 1
    sget-object v0, LSe/h;->h:LSe/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public G()I
    .locals 1

    .line 1
    iget v0, p0, LSe/h;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public H()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/h;->d:I

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

.method public L()LSe/h$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/h;->J()LSe/h$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public M()LSe/h$b;
    .locals 1

    .line 1
    invoke-static {p0}, LSe/h;->K(LSe/h;)LSe/h$b;

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
    invoke-virtual {p0}, LSe/h;->L()LSe/h$b;

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
    invoke-virtual {p0}, LSe/h;->F()LSe/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()I
    .locals 2

    .line 1
    iget v0, p0, LSe/h;->g:I

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
    iget v0, p0, LSe/h;->d:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, LSe/h;->e:I

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
    invoke-virtual {p0}, LZe/i$d;->u()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v0, v1

    .line 26
    iget-object v1, p0, LSe/h;->c:LZe/d;

    .line 27
    .line 28
    invoke-virtual {v1}, LZe/d;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    iput v0, p0, LSe/h;->g:I

    .line 34
    .line 35
    return v0
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget-byte v0, p0, LSe/h;->f:B

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
    invoke-virtual {p0}, LZe/i$d;->t()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, LSe/h;->f:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iput-byte v1, p0, LSe/h;->f:B

    .line 21
    .line 22
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/h;->M()LSe/h$b;

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
    invoke-virtual {p0}, LSe/h;->d()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LZe/i$d;->z()LZe/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, LSe/h;->d:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, LSe/h;->e:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, LZe/f;->Z(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/16 v1, 0xc8

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, LZe/i$d$a;->a(ILZe/f;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LSe/h;->c:LZe/d;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
