.class public final LA2/P$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:LP9/w;

.field private b:Ljava/lang/Double;

.field private c:Ljava/lang/Double;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v1, v2}, LP9/w;->B(Ljava/lang/Object;Ljava/lang/Object;)LP9/w;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, LA2/P$b;->a:LP9/w;

    .line 19
    .line 20
    iput-boolean v0, p0, LA2/P$b;->d:Z

    .line 21
    .line 22
    iput-boolean v0, p0, LA2/P$b;->e:Z

    .line 23
    .line 24
    iput-boolean v0, p0, LA2/P$b;->f:Z

    .line 25
    .line 26
    iput-boolean v0, p0, LA2/P$b;->g:Z

    .line 27
    .line 28
    return-void
.end method

.method static synthetic a(LA2/P$b;)LP9/w;
    .locals 0

    .line 1
    iget-object p0, p0, LA2/P$b;->a:LP9/w;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LA2/P$b;)Ljava/lang/Double;
    .locals 0

    .line 1
    iget-object p0, p0, LA2/P$b;->b:Ljava/lang/Double;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(LA2/P$b;)Ljava/lang/Double;
    .locals 0

    .line 1
    iget-object p0, p0, LA2/P$b;->c:Ljava/lang/Double;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(LA2/P$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA2/P$b;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic e(LA2/P$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA2/P$b;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic f(LA2/P$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA2/P$b;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic g(LA2/P$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA2/P$b;->g:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public h()LA2/P;
    .locals 2

    .line 1
    new-instance v0, LA2/P;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LA2/P;-><init>(LA2/P$b;LA2/P$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public i(Z)LA2/P$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, LA2/P$b;->e:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Z)LA2/P$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, LA2/P$b;->f:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public k(Z)LA2/P$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, LA2/P$b;->d:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public l(Z)LA2/P$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, LA2/P$b;->g:Z

    .line 2
    .line 3
    return-object p0
.end method
