.class public final Lq2/d0$b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/d0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lq2/d0$b$a;->a:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lq2/d0$b$a;->b:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lq2/d0$b$a;->c:Z

    .line 10
    .line 11
    return-void
.end method

.method static synthetic a(Lq2/d0$b$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$b$a;->a:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic b(Lq2/d0$b$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/d0$b$a;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic c(Lq2/d0$b$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/d0$b$a;->c:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public d()Lq2/d0$b;
    .locals 2

    .line 1
    new-instance v0, Lq2/d0$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lq2/d0$b;-><init>(Lq2/d0$b$a;Lq2/d0$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public e(I)Lq2/d0$b$a;
    .locals 0

    .line 1
    iput p1, p0, Lq2/d0$b$a;->a:I

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Z)Lq2/d0$b$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/d0$b$a;->b:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public g(Z)Lq2/d0$b$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/d0$b$a;->c:Z

    .line 2
    .line 3
    return-object p0
.end method
