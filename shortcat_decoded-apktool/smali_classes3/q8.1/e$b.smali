.class final Lq8/e$b;
.super Lq8/k$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lq8/k$b;

.field private b:Lq8/a;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq8/k$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lq8/k;
    .locals 4

    .line 1
    new-instance v0, Lq8/e;

    .line 2
    .line 3
    iget-object v1, p0, Lq8/e$b;->a:Lq8/k$b;

    .line 4
    .line 5
    iget-object v2, p0, Lq8/e$b;->b:Lq8/a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lq8/e;-><init>(Lq8/k$b;Lq8/a;Lq8/e$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b(Lq8/a;)Lq8/k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lq8/e$b;->b:Lq8/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Lq8/k$b;)Lq8/k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lq8/e$b;->a:Lq8/k$b;

    .line 2
    .line 3
    return-object p0
.end method
