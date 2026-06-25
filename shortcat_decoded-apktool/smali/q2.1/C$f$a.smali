.class public final Lq2/C$f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/C$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Landroid/net/Uri;

.field private c:LP9/v;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:LP9/u;

.field private h:[B


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-static {}, LP9/v;->k()LP9/v;

    move-result-object v0

    iput-object v0, p0, Lq2/C$f$a;->c:LP9/v;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lq2/C$f$a;->e:Z

    .line 8
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/C$f$a;->g:LP9/u;

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lq2/C$f$a;-><init>()V

    .line 4
    iput-object p1, p0, Lq2/C$f$a;->a:Ljava/util/UUID;

    return-void
.end method

.method synthetic constructor <init>(Lq2/C$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq2/C$f$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lq2/C$f;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iget-object v0, p1, Lq2/C$f;->a:Ljava/util/UUID;

    iput-object v0, p0, Lq2/C$f$a;->a:Ljava/util/UUID;

    .line 11
    iget-object v0, p1, Lq2/C$f;->c:Landroid/net/Uri;

    iput-object v0, p0, Lq2/C$f$a;->b:Landroid/net/Uri;

    .line 12
    iget-object v0, p1, Lq2/C$f;->e:LP9/v;

    iput-object v0, p0, Lq2/C$f$a;->c:LP9/v;

    .line 13
    iget-boolean v0, p1, Lq2/C$f;->f:Z

    iput-boolean v0, p0, Lq2/C$f$a;->d:Z

    .line 14
    iget-boolean v0, p1, Lq2/C$f;->g:Z

    iput-boolean v0, p0, Lq2/C$f$a;->e:Z

    .line 15
    iget-boolean v0, p1, Lq2/C$f;->h:Z

    iput-boolean v0, p0, Lq2/C$f$a;->f:Z

    .line 16
    iget-object v0, p1, Lq2/C$f;->j:LP9/u;

    iput-object v0, p0, Lq2/C$f$a;->g:LP9/u;

    .line 17
    invoke-static {p1}, Lq2/C$f;->a(Lq2/C$f;)[B

    move-result-object p1

    iput-object p1, p0, Lq2/C$f$a;->h:[B

    return-void
.end method

.method synthetic constructor <init>(Lq2/C$f;Lq2/C$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lq2/C$f$a;-><init>(Lq2/C$f;)V

    return-void
.end method

.method static synthetic a(Lq2/C$f$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/C$f$a;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic b(Lq2/C$f$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/C$f$a;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic c(Lq2/C$f$a;)LP9/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$f$a;->g:LP9/u;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(Lq2/C$f$a;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$f$a;->h:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic e(Lq2/C$f$a;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$f$a;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f(Lq2/C$f$a;)Ljava/util/UUID;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$f$a;->a:Ljava/util/UUID;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic g(Lq2/C$f$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/C$f$a;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic h(Lq2/C$f$a;)LP9/v;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$f$a;->c:LP9/v;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public i()Lq2/C$f;
    .locals 2

    .line 1
    new-instance v0, Lq2/C$f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lq2/C$f;-><init>(Lq2/C$f$a;Lq2/C$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public j(Z)Lq2/C$f$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/C$f$a;->f:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public k(Ljava/util/List;)Lq2/C$f$a;
    .locals 0

    .line 1
    invoke-static {p1}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/C$f$a;->g:LP9/u;

    .line 6
    .line 7
    return-object p0
.end method

.method public l([B)Lq2/C$f$a;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    :goto_0
    iput-object p1, p0, Lq2/C$f$a;->h:[B

    .line 11
    .line 12
    return-object p0
.end method

.method public m(Ljava/util/Map;)Lq2/C$f$a;
    .locals 0

    .line 1
    invoke-static {p1}, LP9/v;->d(Ljava/util/Map;)LP9/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/C$f$a;->c:LP9/v;

    .line 6
    .line 7
    return-object p0
.end method

.method public n(Landroid/net/Uri;)Lq2/C$f$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$f$a;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public o(Ljava/lang/String;)Lq2/C$f$a;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    iput-object p1, p0, Lq2/C$f$a;->b:Landroid/net/Uri;

    .line 10
    .line 11
    return-object p0
.end method

.method public p(Z)Lq2/C$f$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/C$f$a;->d:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public q(Z)Lq2/C$f$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/C$f$a;->e:Z

    .line 2
    .line 3
    return-object p0
.end method
