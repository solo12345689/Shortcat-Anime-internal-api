.class public final Lq2/C$k$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/C$k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lq2/C$k$a;->a:Landroid/net/Uri;

    return-void
.end method

.method private constructor <init>(Lq2/C$k;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-object v0, p1, Lq2/C$k;->a:Landroid/net/Uri;

    iput-object v0, p0, Lq2/C$k$a;->a:Landroid/net/Uri;

    .line 6
    iget-object v0, p1, Lq2/C$k;->b:Ljava/lang/String;

    iput-object v0, p0, Lq2/C$k$a;->b:Ljava/lang/String;

    .line 7
    iget-object v0, p1, Lq2/C$k;->c:Ljava/lang/String;

    iput-object v0, p0, Lq2/C$k$a;->c:Ljava/lang/String;

    .line 8
    iget v0, p1, Lq2/C$k;->d:I

    iput v0, p0, Lq2/C$k$a;->d:I

    .line 9
    iget v0, p1, Lq2/C$k;->e:I

    iput v0, p0, Lq2/C$k$a;->e:I

    .line 10
    iget-object v0, p1, Lq2/C$k;->f:Ljava/lang/String;

    iput-object v0, p0, Lq2/C$k$a;->f:Ljava/lang/String;

    .line 11
    iget-object p1, p1, Lq2/C$k;->g:Ljava/lang/String;

    iput-object p1, p0, Lq2/C$k$a;->g:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lq2/C$k;Lq2/C$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq2/C$k$a;-><init>(Lq2/C$k;)V

    return-void
.end method

.method static synthetic a(Lq2/C$k$a;)Lq2/C$j;
    .locals 0

    .line 1
    invoke-direct {p0}, Lq2/C$k$a;->j()Lq2/C$j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Lq2/C$k$a;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$k$a;->a:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(Lq2/C$k$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$k$a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(Lq2/C$k$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$k$a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic e(Lq2/C$k$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/C$k$a;->d:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic f(Lq2/C$k$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/C$k$a;->e:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic g(Lq2/C$k$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$k$a;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic h(Lq2/C$k$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$k$a;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private j()Lq2/C$j;
    .locals 2

    .line 1
    new-instance v0, Lq2/C$j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lq2/C$j;-><init>(Lq2/C$k$a;Lq2/C$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public i()Lq2/C$k;
    .locals 2

    .line 1
    new-instance v0, Lq2/C$k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lq2/C$k;-><init>(Lq2/C$k$a;Lq2/C$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public k(Ljava/lang/String;)Lq2/C$k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$k$a;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public l(Ljava/lang/String;)Lq2/C$k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$k$a;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public m(Ljava/lang/String;)Lq2/C$k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$k$a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public n(Ljava/lang/String;)Lq2/C$k$a;
    .locals 0

    .line 1
    invoke-static {p1}, Lq2/K;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/C$k$a;->b:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public o(I)Lq2/C$k$a;
    .locals 0

    .line 1
    iput p1, p0, Lq2/C$k$a;->e:I

    .line 2
    .line 3
    return-object p0
.end method

.method public p(I)Lq2/C$k$a;
    .locals 0

    .line 1
    iput p1, p0, Lq2/C$k$a;->d:I

    .line 2
    .line 3
    return-object p0
.end method
