.class public final LSe/b;
.super LZe/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe/b$c;,
        LSe/b$b;
    }
.end annotation


# static fields
.field private static final h:LSe/b;

.field public static i:LZe/r;


# instance fields
.field private final b:LZe/d;

.field private c:I

.field private d:I

.field private e:Ljava/util/List;

.field private f:B

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSe/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/b;->i:LZe/r;

    .line 7
    .line 8
    new-instance v0, LSe/b;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LSe/b;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LSe/b;->h:LSe/b;

    .line 15
    .line 16
    invoke-direct {v0}, LSe/b;->D()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(LZe/e;LZe/g;)V
    .locals 8

    .line 11
    invoke-direct {p0}, LZe/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LSe/b;->f:B

    .line 13
    iput v0, p0, LSe/b;->g:I

    .line 14
    invoke-direct {p0}, LSe/b;->D()V

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

    if-nez v3, :cond_6

    .line 17
    :try_start_0
    invoke-virtual {p1}, LZe/e;->J()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0x8

    if-eq v6, v7, :cond_4

    const/16 v7, 0x12

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

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_2
    and-int/lit8 v6, v4, 0x2

    if-eq v6, v5, :cond_3

    .line 19
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, LSe/b;->e:Ljava/util/List;

    move v4, v5

    .line 20
    :cond_3
    iget-object v6, p0, LSe/b;->e:Ljava/util/List;

    sget-object v7, LSe/b$b;->i:LZe/r;

    invoke-virtual {p1, v7, p2}, LZe/e;->t(LZe/r;LZe/g;)LZe/p;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_4
    iget v6, p0, LSe/b;->c:I

    or-int/2addr v6, v1

    iput v6, p0, LSe/b;->c:I

    .line 22
    invoke-virtual {p1}, LZe/e;->r()I

    move-result v6

    iput v6, p0, LSe/b;->d:I
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 23
    :goto_1
    :try_start_1
    new-instance p2, LZe/k;

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LZe/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1

    .line 25
    :goto_2
    invoke-virtual {p1, p0}, LZe/k;->i(LZe/p;)LZe/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_5

    .line 26
    iget-object p2, p0, LSe/b;->e:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LSe/b;->e:Ljava/util/List;

    .line 27
    :cond_5
    :try_start_2
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    :catch_2
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/b;->b:LZe/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/b;->b:LZe/d;

    .line 29
    throw p1

    .line 30
    :goto_4
    invoke-virtual {p0}, LZe/i;->l()V

    .line 31
    throw p1

    :cond_6
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_7

    .line 32
    iget-object p1, p0, LSe/b;->e:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LSe/b;->e:Ljava/util/List;

    .line 33
    :cond_7
    :try_start_3
    invoke-virtual {v2}, LZe/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 34
    :catch_3
    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/b;->b:LZe/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, LZe/d$b;->h()LZe/d;

    move-result-object p2

    iput-object p2, p0, LSe/b;->b:LZe/d;

    .line 35
    throw p1

    .line 36
    :goto_5
    invoke-virtual {p0}, LZe/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(LZe/e;LZe/g;LSe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LSe/b;-><init>(LZe/e;LZe/g;)V

    return-void
.end method

.method private constructor <init>(LZe/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, LZe/i;-><init>(LZe/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LSe/b;->f:B

    .line 5
    iput v0, p0, LSe/b;->g:I

    .line 6
    invoke-virtual {p1}, LZe/i$b;->i()LZe/d;

    move-result-object p1

    iput-object p1, p0, LSe/b;->b:LZe/d;

    return-void
.end method

.method synthetic constructor <init>(LZe/i$b;LSe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LSe/b;-><init>(LZe/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, LZe/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LSe/b;->f:B

    .line 9
    iput p1, p0, LSe/b;->g:I

    .line 10
    sget-object p1, LZe/d;->a:LZe/d;

    iput-object p1, p0, LSe/b;->b:LZe/d;

    return-void
.end method

.method public static A()LSe/b;
    .locals 1

    .line 1
    sget-object v0, LSe/b;->h:LSe/b;

    .line 2
    .line 3
    return-object v0
.end method

.method private D()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LSe/b;->d:I

    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, LSe/b;->e:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public static E()LSe/b$c;
    .locals 1

    .line 1
    invoke-static {}, LSe/b$c;->m()LSe/b$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static F(LSe/b;)LSe/b$c;
    .locals 1

    .line 1
    invoke-static {}, LSe/b;->E()LSe/b$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, LSe/b$c;->u(LSe/b;)LSe/b$c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic s(LSe/b;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/b;->d:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic t(LSe/b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/b;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic u(LSe/b;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, LSe/b;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic v(LSe/b;I)I
    .locals 0

    .line 1
    iput p1, p0, LSe/b;->c:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic w(LSe/b;)LZe/d;
    .locals 0

    .line 1
    iget-object p0, p0, LSe/b;->b:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public B()I
    .locals 1

    .line 1
    iget v0, p0, LSe/b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public C()Z
    .locals 2

    .line 1
    iget v0, p0, LSe/b;->c:I

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

.method public G()LSe/b$c;
    .locals 1

    .line 1
    invoke-static {}, LSe/b;->E()LSe/b$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public H()LSe/b$c;
    .locals 1

    .line 1
    invoke-static {p0}, LSe/b;->F(LSe/b;)LSe/b$c;

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
    invoke-virtual {p0}, LSe/b;->G()LSe/b$c;

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
    iget v0, p0, LSe/b;->g:I

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
    iget v0, p0, LSe/b;->c:I

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
    iget v0, p0, LSe/b;->d:I

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
    iget-object v1, p0, LSe/b;->e:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-ge v2, v1, :cond_2

    .line 29
    .line 30
    iget-object v1, p0, LSe/b;->e:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, LZe/p;

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    invoke-static {v3, v1}, LZe/f;->r(ILZe/p;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/2addr v0, v1

    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object v1, p0, LSe/b;->b:LZe/d;

    .line 48
    .line 49
    invoke-virtual {v1}, LZe/d;->size()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v0, v1

    .line 54
    iput v0, p0, LSe/b;->g:I

    .line 55
    .line 56
    return v0
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-byte v0, p0, LSe/b;->f:B

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
    invoke-virtual {p0}, LSe/b;->C()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, LSe/b;->f:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    move v0, v2

    .line 21
    :goto_0
    invoke-virtual {p0}, LSe/b;->y()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-ge v0, v3, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0, v0}, LSe/b;->x(I)LSe/b$b;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, LSe/b$b;->e()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    iput-byte v2, p0, LSe/b;->f:B

    .line 38
    .line 39
    return v2

    .line 40
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iput-byte v1, p0, LSe/b;->f:B

    .line 44
    .line 45
    return v1
.end method

.method public bridge synthetic f()LZe/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/b;->H()LSe/b$c;

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
    invoke-virtual {p0}, LSe/b;->d()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, LSe/b;->c:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, LSe/b;->d:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, LZe/f;->Z(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v1, p0, LSe/b;->e:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v0, v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, LSe/b;->e:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, LZe/p;

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    invoke-virtual {p1, v2, v1}, LZe/f;->c0(ILZe/p;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p0, LSe/b;->b:LZe/d;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, LZe/f;->h0(LZe/d;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public x(I)LSe/b$b;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/b;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LSe/b$b;

    .line 8
    .line 9
    return-object p1
.end method

.method public y()I
    .locals 1

    .line 1
    iget-object v0, p0, LSe/b;->e:Ljava/util/List;

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

.method public z()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LSe/b;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
